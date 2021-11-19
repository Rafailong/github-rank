package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryPermission extends scala.Product with scala.Serializable { def value: String }

object RepositoryPermission {
  case object ADMIN extends RepositoryPermission { val value: String = "ADMIN" }
  case object MAINTAIN extends RepositoryPermission { val value: String = "MAINTAIN" }
  case object READ extends RepositoryPermission { val value: String = "READ" }
  case object TRIAGE extends RepositoryPermission { val value: String = "TRIAGE" }
  case object WRITE extends RepositoryPermission { val value: String = "WRITE" }

  implicit val decoder: ScalarDecoder[RepositoryPermission] = {
    case __StringValue("ADMIN")    => Right(RepositoryPermission.ADMIN)
    case __StringValue("MAINTAIN") => Right(RepositoryPermission.MAINTAIN)
    case __StringValue("READ")     => Right(RepositoryPermission.READ)
    case __StringValue("TRIAGE")   => Right(RepositoryPermission.TRIAGE)
    case __StringValue("WRITE")    => Right(RepositoryPermission.WRITE)
    case other                     => Left(DecodingError(s"Can't build RepositoryPermission from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryPermission] = {
    case RepositoryPermission.ADMIN    => __EnumValue("ADMIN")
    case RepositoryPermission.MAINTAIN => __EnumValue("MAINTAIN")
    case RepositoryPermission.READ     => __EnumValue("READ")
    case RepositoryPermission.TRIAGE   => __EnumValue("TRIAGE")
    case RepositoryPermission.WRITE    => __EnumValue("WRITE")
  }

  val values: Vector[RepositoryPermission] = Vector(ADMIN, MAINTAIN, READ, TRIAGE, WRITE)
}

