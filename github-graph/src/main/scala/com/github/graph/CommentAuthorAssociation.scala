package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait CommentAuthorAssociation extends scala.Product with scala.Serializable { def value: String }

object CommentAuthorAssociation {
  case object COLLABORATOR extends CommentAuthorAssociation { val value: String = "COLLABORATOR" }
  case object CONTRIBUTOR extends CommentAuthorAssociation { val value: String = "CONTRIBUTOR" }
  case object FIRST_TIMER extends CommentAuthorAssociation { val value: String = "FIRST_TIMER" }
  case object FIRST_TIME_CONTRIBUTOR extends CommentAuthorAssociation { val value: String = "FIRST_TIME_CONTRIBUTOR" }
  case object MANNEQUIN extends CommentAuthorAssociation { val value: String = "MANNEQUIN" }
  case object MEMBER extends CommentAuthorAssociation { val value: String = "MEMBER" }
  case object NONE extends CommentAuthorAssociation { val value: String = "NONE" }
  case object OWNER extends CommentAuthorAssociation { val value: String = "OWNER" }

  implicit val decoder: ScalarDecoder[CommentAuthorAssociation] = {
    case __StringValue("COLLABORATOR")           => Right(CommentAuthorAssociation.COLLABORATOR)
    case __StringValue("CONTRIBUTOR")            => Right(CommentAuthorAssociation.CONTRIBUTOR)
    case __StringValue("FIRST_TIMER")            => Right(CommentAuthorAssociation.FIRST_TIMER)
    case __StringValue("FIRST_TIME_CONTRIBUTOR") => Right(CommentAuthorAssociation.FIRST_TIME_CONTRIBUTOR)
    case __StringValue("MANNEQUIN")              => Right(CommentAuthorAssociation.MANNEQUIN)
    case __StringValue("MEMBER")                 => Right(CommentAuthorAssociation.MEMBER)
    case __StringValue("NONE")                   => Right(CommentAuthorAssociation.NONE)
    case __StringValue("OWNER")                  => Right(CommentAuthorAssociation.OWNER)
    case other                                   => Left(DecodingError(s"Can't build CommentAuthorAssociation from input $other"))
  }

  implicit val encoder: ArgEncoder[CommentAuthorAssociation] = {
    case CommentAuthorAssociation.COLLABORATOR           => __EnumValue("COLLABORATOR")
    case CommentAuthorAssociation.CONTRIBUTOR            => __EnumValue("CONTRIBUTOR")
    case CommentAuthorAssociation.FIRST_TIMER            => __EnumValue("FIRST_TIMER")
    case CommentAuthorAssociation.FIRST_TIME_CONTRIBUTOR => __EnumValue("FIRST_TIME_CONTRIBUTOR")
    case CommentAuthorAssociation.MANNEQUIN              => __EnumValue("MANNEQUIN")
    case CommentAuthorAssociation.MEMBER                 => __EnumValue("MEMBER")
    case CommentAuthorAssociation.NONE                   => __EnumValue("NONE")
    case CommentAuthorAssociation.OWNER                  => __EnumValue("OWNER")
  }

  val values: Vector[CommentAuthorAssociation] =
    Vector(COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER)
}

