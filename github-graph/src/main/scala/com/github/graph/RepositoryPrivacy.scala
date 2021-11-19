package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryPrivacy extends scala.Product with scala.Serializable { def value: String }

object RepositoryPrivacy {
  case object PRIVATE extends RepositoryPrivacy { val value: String = "PRIVATE" }
  case object PUBLIC extends RepositoryPrivacy { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[RepositoryPrivacy] = {
    case __StringValue("PRIVATE") => Right(RepositoryPrivacy.PRIVATE)
    case __StringValue("PUBLIC")  => Right(RepositoryPrivacy.PUBLIC)
    case other                    => Left(DecodingError(s"Can't build RepositoryPrivacy from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryPrivacy] = {
    case RepositoryPrivacy.PRIVATE => __EnumValue("PRIVATE")
    case RepositoryPrivacy.PUBLIC  => __EnumValue("PUBLIC")
  }

  val values: Vector[RepositoryPrivacy] = Vector(PRIVATE, PUBLIC)
}

