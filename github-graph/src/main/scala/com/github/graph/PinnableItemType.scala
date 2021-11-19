package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait PinnableItemType extends scala.Product with scala.Serializable { def value: String }

object PinnableItemType {
  case object GIST extends PinnableItemType { val value: String = "GIST" }
  case object ISSUE extends PinnableItemType { val value: String = "ISSUE" }
  case object ORGANIZATION extends PinnableItemType { val value: String = "ORGANIZATION" }
  case object PROJECT extends PinnableItemType { val value: String = "PROJECT" }
  case object PULL_REQUEST extends PinnableItemType { val value: String = "PULL_REQUEST" }
  case object REPOSITORY extends PinnableItemType { val value: String = "REPOSITORY" }
  case object TEAM extends PinnableItemType { val value: String = "TEAM" }
  case object USER extends PinnableItemType { val value: String = "USER" }

  implicit val decoder: ScalarDecoder[PinnableItemType] = {
    case __StringValue("GIST")         => Right(PinnableItemType.GIST)
    case __StringValue("ISSUE")        => Right(PinnableItemType.ISSUE)
    case __StringValue("ORGANIZATION") => Right(PinnableItemType.ORGANIZATION)
    case __StringValue("PROJECT")      => Right(PinnableItemType.PROJECT)
    case __StringValue("PULL_REQUEST") => Right(PinnableItemType.PULL_REQUEST)
    case __StringValue("REPOSITORY")   => Right(PinnableItemType.REPOSITORY)
    case __StringValue("TEAM")         => Right(PinnableItemType.TEAM)
    case __StringValue("USER")         => Right(PinnableItemType.USER)
    case other                         => Left(DecodingError(s"Can't build PinnableItemType from input $other"))
  }

  implicit val encoder: ArgEncoder[PinnableItemType] = {
    case PinnableItemType.GIST         => __EnumValue("GIST")
    case PinnableItemType.ISSUE        => __EnumValue("ISSUE")
    case PinnableItemType.ORGANIZATION => __EnumValue("ORGANIZATION")
    case PinnableItemType.PROJECT      => __EnumValue("PROJECT")
    case PinnableItemType.PULL_REQUEST => __EnumValue("PULL_REQUEST")
    case PinnableItemType.REPOSITORY   => __EnumValue("REPOSITORY")
    case PinnableItemType.TEAM         => __EnumValue("TEAM")
    case PinnableItemType.USER         => __EnumValue("USER")
  }

  val values: Vector[PinnableItemType] = Vector(GIST, ISSUE, ORGANIZATION, PROJECT, PULL_REQUEST, REPOSITORY, TEAM, USER)
}

