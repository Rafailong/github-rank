package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait TeamRepositoryOrderField extends scala.Product with scala.Serializable { def value: String }

object TeamRepositoryOrderField {
  case object CREATED_AT extends TeamRepositoryOrderField { val value: String = "CREATED_AT" }
  case object NAME extends TeamRepositoryOrderField { val value: String = "NAME" }
  case object PERMISSION extends TeamRepositoryOrderField { val value: String = "PERMISSION" }
  case object PUSHED_AT extends TeamRepositoryOrderField { val value: String = "PUSHED_AT" }
  case object STARGAZERS extends TeamRepositoryOrderField { val value: String = "STARGAZERS" }
  case object UPDATED_AT extends TeamRepositoryOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[TeamRepositoryOrderField] = {
    case __StringValue("CREATED_AT") => Right(TeamRepositoryOrderField.CREATED_AT)
    case __StringValue("NAME")       => Right(TeamRepositoryOrderField.NAME)
    case __StringValue("PERMISSION") => Right(TeamRepositoryOrderField.PERMISSION)
    case __StringValue("PUSHED_AT")  => Right(TeamRepositoryOrderField.PUSHED_AT)
    case __StringValue("STARGAZERS") => Right(TeamRepositoryOrderField.STARGAZERS)
    case __StringValue("UPDATED_AT") => Right(TeamRepositoryOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build TeamRepositoryOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[TeamRepositoryOrderField] = {
    case TeamRepositoryOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case TeamRepositoryOrderField.NAME       => __EnumValue("NAME")
    case TeamRepositoryOrderField.PERMISSION => __EnumValue("PERMISSION")
    case TeamRepositoryOrderField.PUSHED_AT  => __EnumValue("PUSHED_AT")
    case TeamRepositoryOrderField.STARGAZERS => __EnumValue("STARGAZERS")
    case TeamRepositoryOrderField.UPDATED_AT => __EnumValue("UPDATED_AT")
  }

  val values: Vector[TeamRepositoryOrderField] = Vector(CREATED_AT, NAME, PERMISSION, PUSHED_AT, STARGAZERS, UPDATED_AT)
}

