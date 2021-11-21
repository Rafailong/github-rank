I am using following caliban:

```scala
// plugins.sbt
addSbtPlugin("com.github.ghostdogpr" % "caliban-codegen-sbt" % "1.2.4")
```

Project configuration:

```scala
lazy val `github-graph` = (project in file("github-graph"))
  .enablePlugins(CalibanPlugin)
  .settings(
    organization := "me.rafa",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.6",
    name := "github-graph",
    libraryDependencies ++= Seq(
      "com.github.ghostdogpr" %% "caliban-client" % "1.2.4"
    )
  )
```

In my project I used caliban code generation using [this schema](https://docs.github.com/public/schema.docs.graphql)

```shell
calibanGenClient GitHub.graphql github-graph-client/src/main/scala/com/github/graph/GitHubGraphClient.scala --splitFiles true --packageName "com.github.graph"
```

I am querying organizations:

```
query {
  organization(login:"47deg") {
    membersWithRole(first: 3) {
      pageInfo {
        hasNextPage
        startCursor
        endCursor
      }
      totalCount
      nodes {
        login
        contributionsCollection {
          contributionCalendar {
            totalContributions
          }
        }
      }
    }
  }
}
```

Notice that in the query above I am using a valid organization login: `47deg`
Response is:

```json
{
  "data": {
    "organization": {
      "membersWithRole": {
        "pageInfo": {
          "hasNextPage": true,
          "startCursor": "Y3Vyc29yOnYyOpHOAAGd9g==",
          "endCursor": "Y3Vyc29yOnYyOpHOAAMjMQ=="
        },
        "totalCount": 17,
        "nodes": [
          {
            "login": "jorgegalindocruces",
            "contributionsCollection": {
              "contributionCalendar": {
                "totalContributions": 147
              }
            }
          },
          {
            "login": "cb372",
            "contributionsCollection": {
              "contributionCalendar": {
                "totalContributions": 246
              }
            }
          },
          {
            "login": "justinelsberry",
            "contributionsCollection": {
              "contributionCalendar": {
                "totalContributions": 0
              }
            }
          }
        ]
      }
    }
  }
}
```

And whenever I use an invalid organization login like `querty` response is:

```json
{
  "data": {
    "organization": null
  },
  "errors": [
    {
      "type": "NOT_FOUND",
      "path": [
        "organization"
      ],
      "locations": [
        {
          "line": 7,
          "column": 3
        }
      ],
      "message": "Could not resolve to an Organization with the login of 'qwerty'."
    }
  ]
}
```

Given the response above it seems to that the result would be `caliban.client.ServerError` given that
`caliban.client.SelectionBuilder.decode` does something like:

```scala
// line 61
   data <- if (parsed.errors.nonEmpty && parsed.data.forall(_ == __Value.__NullValue))
             Left(ServerError(parsed.errors))
           else Right(parsed.data)
```

I did debug the `decode` method and found that:

- `parsed.error.nonEmpty === true` and
- `parsed.data.forall(_ == __Value.__NullValue) === false` and here is where the possible bug arises.  