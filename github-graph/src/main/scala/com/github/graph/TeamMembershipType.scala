package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamMembershipType extends scala.Product with scala.Serializable { def value: String }

object TeamMembershipType {
  case object ALL extends TeamMembershipType { val value: String = "ALL" }
  case object CHILD_TEAM extends TeamMembershipType { val value: String = "CHILD_TEAM" }
  case object IMMEDIATE extends TeamMembershipType { val value: String = "IMMEDIATE" }

  implicit val decoder: ScalarDecoder[TeamMembershipType] = {
    case __StringValue("ALL")        => Right(TeamMembershipType.ALL)
    case __StringValue("CHILD_TEAM") => Right(TeamMembershipType.CHILD_TEAM)
    case __StringValue("IMMEDIATE")  => Right(TeamMembershipType.IMMEDIATE)
    case other                       => Left(DecodingError(s"Can't build TeamMembershipType from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamMembershipType] = {
    case TeamMembershipType.ALL        => __EnumValue("ALL")
    case TeamMembershipType.CHILD_TEAM => __EnumValue("CHILD_TEAM")
    case TeamMembershipType.IMMEDIATE  => __EnumValue("IMMEDIATE")
  }

  val values: Vector[TeamMembershipType] = Vector(ALL, CHILD_TEAM, IMMEDIATE)
}

