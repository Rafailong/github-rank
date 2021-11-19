package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryVisibility extends scala.Product with scala.Serializable { def value: String }

object RepositoryVisibility {
  case object INTERNAL extends RepositoryVisibility { val value: String = "INTERNAL" }
  case object PRIVATE extends RepositoryVisibility { val value: String = "PRIVATE" }
  case object PUBLIC extends RepositoryVisibility { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[RepositoryVisibility] = {
    case __StringValue("INTERNAL") => Right(RepositoryVisibility.INTERNAL)
    case __StringValue("PRIVATE")  => Right(RepositoryVisibility.PRIVATE)
    case __StringValue("PUBLIC")   => Right(RepositoryVisibility.PUBLIC)
    case other                     => Left(DecodingError(s"Can't build RepositoryVisibility from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryVisibility] = {
    case RepositoryVisibility.INTERNAL => __EnumValue("INTERNAL")
    case RepositoryVisibility.PRIVATE  => __EnumValue("PRIVATE")
    case RepositoryVisibility.PUBLIC   => __EnumValue("PUBLIC")
  }

  val values: Vector[RepositoryVisibility] = Vector(INTERNAL, PRIVATE, PUBLIC)
}

