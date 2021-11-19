package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait StarOrderField extends scala.Product with scala.Serializable { def value: String }

object StarOrderField {
  case object STARRED_AT extends StarOrderField { val value: String = "STARRED_AT" }

  implicit val decoder: ScalarDecoder[StarOrderField] = {
    case __StringValue("STARRED_AT") => Right(StarOrderField.STARRED_AT)
    case other                       => Left(DecodingError(s"Can't build StarOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[StarOrderField] = { case StarOrderField.STARRED_AT =>
    __EnumValue("STARRED_AT")
  }

  val values: Vector[StarOrderField] = Vector(STARRED_AT)
}

