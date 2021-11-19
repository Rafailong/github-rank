package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryOrderField extends scala.Product with scala.Serializable { def value: String }

object RepositoryOrderField {
  case object CREATED_AT extends RepositoryOrderField { val value: String = "CREATED_AT" }
  case object NAME extends RepositoryOrderField { val value: String = "NAME" }
  case object PUSHED_AT extends RepositoryOrderField { val value: String = "PUSHED_AT" }
  case object STARGAZERS extends RepositoryOrderField { val value: String = "STARGAZERS" }
  case object UPDATED_AT extends RepositoryOrderField { val value: String = "UPDATED_AT" }

  implicit val decoder: ScalarDecoder[RepositoryOrderField] = {
    case __StringValue("CREATED_AT") => Right(RepositoryOrderField.CREATED_AT)
    case __StringValue("NAME")       => Right(RepositoryOrderField.NAME)
    case __StringValue("PUSHED_AT")  => Right(RepositoryOrderField.PUSHED_AT)
    case __StringValue("STARGAZERS") => Right(RepositoryOrderField.STARGAZERS)
    case __StringValue("UPDATED_AT") => Right(RepositoryOrderField.UPDATED_AT)
    case other                       => Left(DecodingError(s"Can't build RepositoryOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryOrderField] = {
    case RepositoryOrderField.CREATED_AT => __EnumValue("CREATED_AT")
    case RepositoryOrderField.NAME       => __EnumValue("NAME")
    case RepositoryOrderField.PUSHED_AT  => __EnumValue("PUSHED_AT")
    case RepositoryOrderField.STARGAZERS => __EnumValue("STARGAZERS")
    case RepositoryOrderField.UPDATED_AT => __EnumValue("UPDATED_AT")
  }

  val values: Vector[RepositoryOrderField] = Vector(CREATED_AT, NAME, PUSHED_AT, STARGAZERS, UPDATED_AT)
}

