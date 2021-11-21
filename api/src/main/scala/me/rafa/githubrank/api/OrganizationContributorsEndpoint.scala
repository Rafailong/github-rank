package me.rafa.githubrank.api

import me.rafa.githubrank.gitHubClient.GitHubClient
import me.rafa.githubrank.model._
import me.rafa.githubrank.model.Contributors._
import org.http4s.HttpRoutes
import sttp.model._
import sttp.tapir.Endpoint
import sttp.tapir.ztapir._
import sttp.tapir.json.circe._
import sttp.tapir.generic.auto._
import sttp.tapir.server.http4s.ztapir.ZHttp4sServerInterpreter
import zio._
import zio.clock.Clock
import zio.blocking.Blocking

object OrganizationContributorsEndpoint {

  private val outputExample = Contributors(
    Paging(hasNext = true, Some("f36g27h8s"), None),
    total = 10,
    contributors = List(
      Contributor(name = "piotr", contributions  = 100),
      Contributor(name = "jarek", contributions  = 10),
      Contributor(name = "lukasz", contributions = 1)
    )
  )

  val description: Endpoint[Unit, String, StatusCode, Contributors, Any] =
    endpoint.get
      .name("Organization' Contributors")
      .in("org" / path[String]("org_name").example("ScalaConsultants") / "contributors")
      .out(
        jsonBody[Contributors]
          .description("List of contributors.")
          .example(outputExample)
      )
      .errorOut(statusCode)
      .description(
        "List of contributors of the specified organization sorted by the number of contributions."
      )

  def route(githubRank: GitHubClient.Service): HttpRoutes[RIO[Has[Clock.Service] with Has[Blocking.Service], *]] = {
    ZHttp4sServerInterpreter().from {
      description.zServerLogic { org =>
        githubRank
          .organizationContributors(org)
          .mapError(_ => StatusCode(500))
      }
    }.toRoutes
  }
}
