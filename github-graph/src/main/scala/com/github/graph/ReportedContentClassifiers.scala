package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait ReportedContentClassifiers extends scala.Product with scala.Serializable { def value: String }

object ReportedContentClassifiers {
  case object ABUSE extends ReportedContentClassifiers { val value: String = "ABUSE" }
  case object DUPLICATE extends ReportedContentClassifiers { val value: String = "DUPLICATE" }
  case object OFF_TOPIC extends ReportedContentClassifiers { val value: String = "OFF_TOPIC" }
  case object OUTDATED extends ReportedContentClassifiers { val value: String = "OUTDATED" }
  case object RESOLVED extends ReportedContentClassifiers { val value: String = "RESOLVED" }
  case object SPAM extends ReportedContentClassifiers { val value: String = "SPAM" }

  implicit val decoder: ScalarDecoder[ReportedContentClassifiers] = {
    case __StringValue("ABUSE")     => Right(ReportedContentClassifiers.ABUSE)
    case __StringValue("DUPLICATE") => Right(ReportedContentClassifiers.DUPLICATE)
    case __StringValue("OFF_TOPIC") => Right(ReportedContentClassifiers.OFF_TOPIC)
    case __StringValue("OUTDATED")  => Right(ReportedContentClassifiers.OUTDATED)
    case __StringValue("RESOLVED")  => Right(ReportedContentClassifiers.RESOLVED)
    case __StringValue("SPAM")      => Right(ReportedContentClassifiers.SPAM)
    case other                      => Left(DecodingError(s"Can't build ReportedContentClassifiers from input $other"))
  }

  implicit val encoder: ArgEncoder[ReportedContentClassifiers] = {
    case ReportedContentClassifiers.ABUSE     => __EnumValue("ABUSE")
    case ReportedContentClassifiers.DUPLICATE => __EnumValue("DUPLICATE")
    case ReportedContentClassifiers.OFF_TOPIC => __EnumValue("OFF_TOPIC")
    case ReportedContentClassifiers.OUTDATED  => __EnumValue("OUTDATED")
    case ReportedContentClassifiers.RESOLVED  => __EnumValue("RESOLVED")
    case ReportedContentClassifiers.SPAM      => __EnumValue("SPAM")
  }

  val values: Vector[ReportedContentClassifiers] = Vector(ABUSE, DUPLICATE, OFF_TOPIC, OUTDATED, RESOLVED, SPAM)
}

