package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait GistPrivacy extends scala.Product with scala.Serializable { def value: String }

object GistPrivacy {
  case object ALL extends GistPrivacy { val value: String = "ALL" }
  case object PUBLIC extends GistPrivacy { val value: String = "PUBLIC" }
  case object SECRET extends GistPrivacy { val value: String = "SECRET" }

  implicit val decoder: ScalarDecoder[GistPrivacy] = {
    case __StringValue("ALL")    => Right(GistPrivacy.ALL)
    case __StringValue("PUBLIC") => Right(GistPrivacy.PUBLIC)
    case __StringValue("SECRET") => Right(GistPrivacy.SECRET)
    case other                   => Left(DecodingError(s"Can't build GistPrivacy from input $other"))
  }

  implicit val encoder: ArgEncoder[GistPrivacy] = {
    case GistPrivacy.ALL    => __EnumValue("ALL")
    case GistPrivacy.PUBLIC => __EnumValue("PUBLIC")
    case GistPrivacy.SECRET => __EnumValue("SECRET")
  }

  val values: Vector[GistPrivacy] = Vector(ALL, PUBLIC, SECRET)
}

