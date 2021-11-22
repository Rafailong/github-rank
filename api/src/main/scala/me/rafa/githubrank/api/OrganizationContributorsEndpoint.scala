package me.rafa.githubrank.api

import eu.timepit.refined.types.numeric.NonNegInt
import eu.timepit.refined.types.string.NonEmptyString
import me.rafa.githubrank.githubrank.GitHubRank
import me.rafa.githubrank.model._
import org.http4s.HttpRoutes
import sttp.model._
import sttp.tapir.codec.refined._
import sttp.tapir.Endpoint
import sttp.tapir.ztapir._
import sttp.tapir.json.circe._
import sttp.tapir.generic.auto._
import sttp.tapir.server.http4s.ztapir.ZHttp4sServerInterpreter
import zio._
import zio.clock.Clock
import zio.blocking.Blocking

object OrganizationContributorsEndpoint {

  private val outputExample = Set(
    Contributor(
      name          = NonEmptyString.unsafeFrom("piotr"),
      contributions = NonNegInt.unsafeFrom(100)
    ),
    Contributor(
      name          = NonEmptyString.unsafeFrom("jarek"),
      contributions = NonNegInt.unsafeFrom(10)
    ),
    Contributor(name = NonEmptyString.unsafeFrom("lukasz"), contributions = NonNegInt.unsafeFrom(1))
  )

  val description: Endpoint[Unit, NonEmptyString, StatusCode, Set[Contributor], Any] =
    endpoint.get
      .name("Organization' Contributors")
      .in(
        "org" / path[NonEmptyString]("org_name").example(
          NonEmptyString.unsafeFrom("ScalaConsultants")
        ) / "contributors"
      )
      .out(
        jsonBody[Set[Contributor]]
          .description("List of contributors.")
          .example(outputExample)
      )
      .errorOut(statusCode)
      .description(
        "List of contributors of the specified organization sorted by the number of contributions."
      )

  def route(
    githubRank: GitHubRank
  ): HttpRoutes[RIO[Has[Clock.Service] with Has[Blocking.Service], *]] = {
    ZHttp4sServerInterpreter().from {
      description.zServerLogic { org =>
        githubRank
          .orgContributors(org.value)
          .orElseFail(StatusCode(500))
          .uninterruptible
      }
    }.toRoutes
  }
}
