package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait LockReason extends scala.Product with scala.Serializable { def value: String }

object LockReason {
  case object OFF_TOPIC extends LockReason { val value: String = "OFF_TOPIC" }
  case object RESOLVED extends LockReason { val value: String = "RESOLVED" }
  case object SPAM extends LockReason { val value: String = "SPAM" }
  case object TOO_HEATED extends LockReason { val value: String = "TOO_HEATED" }

  implicit val decoder: ScalarDecoder[LockReason] = {
    case __StringValue("OFF_TOPIC")  => Right(LockReason.OFF_TOPIC)
    case __StringValue("RESOLVED")   => Right(LockReason.RESOLVED)
    case __StringValue("SPAM")       => Right(LockReason.SPAM)
    case __StringValue("TOO_HEATED") => Right(LockReason.TOO_HEATED)
    case other                       => Left(DecodingError(s"Can't build LockReason from input $other"))
  }

  implicit val encoder: ArgEncoder[LockReason] = {
    case LockReason.OFF_TOPIC  => __EnumValue("OFF_TOPIC")
    case LockReason.RESOLVED   => __EnumValue("RESOLVED")
    case LockReason.SPAM       => __EnumValue("SPAM")
    case LockReason.TOO_HEATED => __EnumValue("TOO_HEATED")
  }

  val values: Vector[LockReason] = Vector(OFF_TOPIC, RESOLVED, SPAM, TOO_HEATED)
}

