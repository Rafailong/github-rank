package me.rafa.githubrank.githubclient

import com.typesafe.config.ConfigFactory
import sttp.capabilities
import sttp.capabilities.zio.ZioStreams
import sttp.client3.SttpBackend
import sttp.client3.asynchttpclient.zio.AsyncHttpClientZioBackend
import sttp.model.Method.POST
import zio._
import zio.clock.Clock
import zio.console.Console
import zio.logging.Logging
import zio.magic._
import zio.random.Random
import zio.test._

object GitHubClientSpec extends DefaultRunnableSpec {

  private val loggingLayer = Logging.console()

  private val configLayer = ZIO.effect(ConfigFactory.load()).toLayer

  private val sttpBackendStub: SttpBackend[Task, ZioStreams with capabilities.WebSockets] =
    AsyncHttpClientZioBackend.stub
      .whenRequestMatches { req =>
        (req.method == POST) &&
        req.body.show.contains("qwerty")
      }
      .thenRespond(GitHubResponses.orgNotFound)
      .whenRequestMatches { req =>
        (req.method == POST) &&
        req.body.show.contains("ScalaConsultants")
      }
      .thenRespond(GitHubResponses.scalacContributors)

  private val sttpBackendStubLayer =
    ZLayer.succeed(sttpBackendStub)

  def spec = {

    suite("GitHubClient")(
      testM("happy path - scalac contributors") {
        GitHubClient
          .organizationContributors("ScalaConsultants", None)
          .map { contributors =>
            assertTrue(contributors.elem.size == 9)
          }
          .injectSome[Clock with Random with Console](
            loggingLayer,
            configLayer,
            sttpBackendStubLayer,
            GitHubGraphClient.live
          )
      },
      testM("no contributors when org is not found") {
        GitHubClient
          .organizationContributors("qwerty", None)
          .map { contributors =>
            assertTrue(contributors.elem.isEmpty)
          }
          .injectSome[Clock with Random with Console](
            loggingLayer,
            configLayer,
            sttpBackendStubLayer,
            GitHubGraphClient.live
          )
      }
    )
  }
}

private object GitHubResponses {

  val orgNotFound: String = """{
                      |  "data": {
                      |    "organization": null
                      |  },
                      |  "errors": [
                      |    {
                      |      "type": "NOT_FOUND",
                      |      "path": [
                      |        "organization"
                      |      ],
                      |      "locations": [
                      |        {
                      |          "line": 7,
                      |          "column": 5
                      |        }
                      |      ],
                      |      "message": "Could not resolve to an Organization with the login of 'qwerty'."
                      |    }
                      |  ]
                      |}""".stripMargin

  val scalacContributors: String = """{
                             |  "data": {
                             |    "organization": {
                             |      "membersWithRole": {
                             |        "pageInfo": {
                             |          "hasNextPage": false,
                             |          "startCursor": "Y3Vyc29yOnYyOpHOAAHKhg==",
                             |          "endCursor": "Y3Vyc29yOnYyOpHOBHRa5A=="
                             |        },
                             |        "totalCount": 9,
                             |        "nodes": [
                             |          {
                             |            "login": "marioosh",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 0
                             |              }
                             |            }
                             |          },
                             |          {
                             |            "login": "lkuczera",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 0
                             |              }
                             |            }
                             |          },
                             |          {
                             |            "login": "molowny",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 1
                             |              }
                             |            }
                             |          },
                             |          {
                             |            "login": "marekklis",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 7
                             |              }
                             |            }
                             |          },
                             |          {
                             |            "login": "jczuchnowski",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 1024
                             |              }
                             |            }
                             |          },
                             |          {
                             |            "login": "tues",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 202
                             |              }
                             |            }
                             |          },
                             |          {
                             |            "login": "danieletorelli",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 298
                             |              }
                             |            }
                             |          },
                             |          {
                             |            "login": "ernestochero",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 44
                             |              }
                             |            }
                             |          },
                             |          {
                             |            "login": "lkff",
                             |            "contributionsCollection": {
                             |              "contributionCalendar": {
                             |                "totalContributions": 631
                             |              }
                             |            }
                             |          }
                             |        ]
                             |      }
                             |    }
                             |  }
                             |}""".stripMargin
}
