package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SearchType extends scala.Product with scala.Serializable { def value: String }

object SearchType {
  case object DISCUSSION extends SearchType { val value: String = "DISCUSSION" }
  case object ISSUE extends SearchType { val value: String = "ISSUE" }
  case object REPOSITORY extends SearchType { val value: String = "REPOSITORY" }
  case object USER extends SearchType { val value: String = "USER" }

  implicit val decoder: ScalarDecoder[SearchType] = {
    case __StringValue("DISCUSSION") => Right(SearchType.DISCUSSION)
    case __StringValue("ISSUE")      => Right(SearchType.ISSUE)
    case __StringValue("REPOSITORY") => Right(SearchType.REPOSITORY)
    case __StringValue("USER")       => Right(SearchType.USER)
    case other                       => Left(DecodingError(s"Can't build SearchType from input $other"))
  }

  implicit val encoder: ArgEncoder[SearchType] = {
    case SearchType.DISCUSSION => __EnumValue("DISCUSSION")
    case SearchType.ISSUE      => __EnumValue("ISSUE")
    case SearchType.REPOSITORY => __EnumValue("REPOSITORY")
    case SearchType.USER       => __EnumValue("USER")
  }

  val values: Vector[SearchType] = Vector(DISCUSSION, ISSUE, REPOSITORY, USER)
}

