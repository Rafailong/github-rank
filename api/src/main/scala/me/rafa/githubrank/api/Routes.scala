package me.rafa.githubrank.api

import org.http4s.HttpRoutes
import cats.syntax.all._
import sttp.tapir.docs.openapi.OpenAPIDocsInterpreter
import sttp.tapir.openapi._
import sttp.tapir.openapi.circe.yaml._
import sttp.tapir.redoc.Redoc
import sttp.tapir.server.http4s.ztapir.ZHttp4sServerInterpreter
import zio._
import zio.interop.catz._
import zio.blocking.Blocking
import zio.clock.Clock

object Routes {

  val routes: HttpRoutes[ZIO[Has[Clock.Service] with Has[Blocking.Service], Throwable, *]] =
    ZHttp4sServerInterpreter()
      .from(OrganizationContributorsEndpoint.zerverEndpoint)
      .toRoutes

  val docsRoutes: HttpRoutes[ZIO[Has[Clock.Service] with Has[Blocking.Service], Throwable, *]] = {
    val openApiDocs: OpenAPI =
      OpenAPIDocsInterpreter()
        .toOpenAPI(
          es      = List(OrganizationContributorsEndpoint.description),
          title   = "Scalac - GitHub Rank Challenge",
          version = "1.0"
        )
    ZHttp4sServerInterpreter().from(
      Redoc[Task](
        title = "Scalac - GitHub Rank Challenge",
        yaml  = openApiDocs.toYaml
      )
    ).toRoutes
  }

  val all = routes <+> docsRoutes
}
