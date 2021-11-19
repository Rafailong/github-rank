package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait CommentCannotUpdateReason extends scala.Product with scala.Serializable { def value: String }

object CommentCannotUpdateReason {
  case object ARCHIVED extends CommentCannotUpdateReason { val value: String = "ARCHIVED" }
  case object DENIED extends CommentCannotUpdateReason { val value: String = "DENIED" }
  case object INSUFFICIENT_ACCESS extends CommentCannotUpdateReason { val value: String = "INSUFFICIENT_ACCESS" }
  case object LOCKED extends CommentCannotUpdateReason { val value: String = "LOCKED" }
  case object LOGIN_REQUIRED extends CommentCannotUpdateReason { val value: String = "LOGIN_REQUIRED" }
  case object MAINTENANCE extends CommentCannotUpdateReason { val value: String = "MAINTENANCE" }
  case object VERIFIED_EMAIL_REQUIRED extends CommentCannotUpdateReason { val value: String = "VERIFIED_EMAIL_REQUIRED" }

  implicit val decoder: ScalarDecoder[CommentCannotUpdateReason] = {
    case __StringValue("ARCHIVED")                => Right(CommentCannotUpdateReason.ARCHIVED)
    case __StringValue("DENIED")                  => Right(CommentCannotUpdateReason.DENIED)
    case __StringValue("INSUFFICIENT_ACCESS")     => Right(CommentCannotUpdateReason.INSUFFICIENT_ACCESS)
    case __StringValue("LOCKED")                  => Right(CommentCannotUpdateReason.LOCKED)
    case __StringValue("LOGIN_REQUIRED")          => Right(CommentCannotUpdateReason.LOGIN_REQUIRED)
    case __StringValue("MAINTENANCE")             => Right(CommentCannotUpdateReason.MAINTENANCE)
    case __StringValue("VERIFIED_EMAIL_REQUIRED") => Right(CommentCannotUpdateReason.VERIFIED_EMAIL_REQUIRED)
    case other                                    => Left(DecodingError(s"Can't build CommentCannotUpdateReason from input $other"))
  }

  implicit val encoder: ArgEncoder[CommentCannotUpdateReason] = {
    case CommentCannotUpdateReason.ARCHIVED                => __EnumValue("ARCHIVED")
    case CommentCannotUpdateReason.DENIED                  => __EnumValue("DENIED")
    case CommentCannotUpdateReason.INSUFFICIENT_ACCESS     => __EnumValue("INSUFFICIENT_ACCESS")
    case CommentCannotUpdateReason.LOCKED                  => __EnumValue("LOCKED")
    case CommentCannotUpdateReason.LOGIN_REQUIRED          => __EnumValue("LOGIN_REQUIRED")
    case CommentCannotUpdateReason.MAINTENANCE             => __EnumValue("MAINTENANCE")
    case CommentCannotUpdateReason.VERIFIED_EMAIL_REQUIRED => __EnumValue("VERIFIED_EMAIL_REQUIRED")
  }

  val values: Vector[CommentCannotUpdateReason] =
    Vector(ARCHIVED, DENIED, INSUFFICIENT_ACCESS, LOCKED, LOGIN_REQUIRED, MAINTENANCE, VERIFIED_EMAIL_REQUIRED)
}

