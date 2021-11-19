package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait SubscriptionState extends scala.Product with scala.Serializable { def value: String }

object SubscriptionState {
  case object IGNORED extends SubscriptionState { val value: String = "IGNORED" }
  case object SUBSCRIBED extends SubscriptionState { val value: String = "SUBSCRIBED" }
  case object UNSUBSCRIBED extends SubscriptionState { val value: String = "UNSUBSCRIBED" }

  implicit val decoder: ScalarDecoder[SubscriptionState] = {
    case __StringValue("IGNORED")      => Right(SubscriptionState.IGNORED)
    case __StringValue("SUBSCRIBED")   => Right(SubscriptionState.SUBSCRIBED)
    case __StringValue("UNSUBSCRIBED") => Right(SubscriptionState.UNSUBSCRIBED)
    case other                         => Left(DecodingError(s"Can't build SubscriptionState from input $other"))
  }

  implicit val encoder: ArgEncoder[SubscriptionState] = {
    case SubscriptionState.IGNORED      => __EnumValue("IGNORED")
    case SubscriptionState.SUBSCRIBED   => __EnumValue("SUBSCRIBED")
    case SubscriptionState.UNSUBSCRIBED => __EnumValue("UNSUBSCRIBED")
  }

  val values: Vector[SubscriptionState] = Vector(IGNORED, SUBSCRIBED, UNSUBSCRIBED)
}

