package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamRole extends scala.Product with scala.Serializable { def value: String }

object TeamRole {
  case object ADMIN extends TeamRole { val value: String = "ADMIN" }
  case object MEMBER extends TeamRole { val value: String = "MEMBER" }

  implicit val decoder: ScalarDecoder[TeamRole] = {
    case __StringValue("ADMIN")  => Right(TeamRole.ADMIN)
    case __StringValue("MEMBER") => Right(TeamRole.MEMBER)
    case other                   => Left(DecodingError(s"Can't build TeamRole from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamRole] = {
    case TeamRole.ADMIN  => __EnumValue("ADMIN")
    case TeamRole.MEMBER => __EnumValue("MEMBER")
  }

  val values: Vector[TeamRole] = Vector(ADMIN, MEMBER)
}

