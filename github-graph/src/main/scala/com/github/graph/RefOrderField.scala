package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RefOrderField extends scala.Product with scala.Serializable { def value: String }

object RefOrderField {
  case object ALPHABETICAL extends RefOrderField { val value: String = "ALPHABETICAL" }
  case object TAG_COMMIT_DATE extends RefOrderField { val value: String = "TAG_COMMIT_DATE" }

  implicit val decoder: ScalarDecoder[RefOrderField] = {
    case __StringValue("ALPHABETICAL")    => Right(RefOrderField.ALPHABETICAL)
    case __StringValue("TAG_COMMIT_DATE") => Right(RefOrderField.TAG_COMMIT_DATE)
    case other                            => Left(DecodingError(s"Can't build RefOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[RefOrderField] = {
    case RefOrderField.ALPHABETICAL    => __EnumValue("ALPHABETICAL")
    case RefOrderField.TAG_COMMIT_DATE => __EnumValue("TAG_COMMIT_DATE")
  }

  val values: Vector[RefOrderField] = Vector(ALPHABETICAL, TAG_COMMIT_DATE)
}

