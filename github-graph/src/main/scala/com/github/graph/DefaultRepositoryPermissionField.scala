package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait DefaultRepositoryPermissionField extends scala.Product with scala.Serializable { def value: String }

object DefaultRepositoryPermissionField {
  case object ADMIN extends DefaultRepositoryPermissionField { val value: String = "ADMIN" }
  case object NONE extends DefaultRepositoryPermissionField { val value: String = "NONE" }
  case object READ extends DefaultRepositoryPermissionField { val value: String = "READ" }
  case object WRITE extends DefaultRepositoryPermissionField { val value: String = "WRITE" }

  implicit val decoder: ScalarDecoder[DefaultRepositoryPermissionField] = {
    case __StringValue("ADMIN") => Right(DefaultRepositoryPermissionField.ADMIN)
    case __StringValue("NONE")  => Right(DefaultRepositoryPermissionField.NONE)
    case __StringValue("READ")  => Right(DefaultRepositoryPermissionField.READ)
    case __StringValue("WRITE") => Right(DefaultRepositoryPermissionField.WRITE)
    case other                  => Left(DecodingError(s"Can't build DefaultRepositoryPermissionField from input $other"))
  }

  implicit val encoder: ArgEncoder[DefaultRepositoryPermissionField] = {
    case DefaultRepositoryPermissionField.ADMIN => __EnumValue("ADMIN")
    case DefaultRepositoryPermissionField.NONE  => __EnumValue("NONE")
    case DefaultRepositoryPermissionField.READ  => __EnumValue("READ")
    case DefaultRepositoryPermissionField.WRITE => __EnumValue("WRITE")
  }

  val values: Vector[DefaultRepositoryPermissionField] = Vector(ADMIN, NONE, READ, WRITE)
}

