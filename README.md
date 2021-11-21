# Scalac - Scala Developer - GitHubRank Challenge

## Projects/Modules

### github-graph

[GitHub Graphql](https://docs.github.com/en/graphql) client based on [Caliban](https://ghostdogpr.github.io/caliban/docs/client.html#graphql-client).

This project hosts code generated by Caliban using [GitHub.graph](GitHub.graphql) public schema file.

Code generation is explicit, meaning that, we need to do the following:

```shell
# pwd: ~/github-rank
sbt
```
and then:

```shell
# on the SBT CLI
sbt:github-graph-client> calibanGenClient GitHub.graphql github-graph-client/src/main/scala/com/github/graph/GitHubGraphClient.scala --splitFiles true --packageName "com.github.graph"
```

---

> NOTE: Code in this module MUST NOT be manually edited/modified. 

### core

This project hosts mechanism to query GtiHub graph.

This project depends on `github-graph` project.

### api

### cli

This project is used to experiment with queries in a "real world" fashion.