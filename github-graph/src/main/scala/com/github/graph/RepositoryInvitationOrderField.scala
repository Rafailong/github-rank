package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait RepositoryInvitationOrderField extends scala.Product with scala.Serializable { def value: String }

object RepositoryInvitationOrderField {
  case object CREATED_AT extends RepositoryInvitationOrderField { val value: String = "CREATED_AT" }
  case object INVITEE_LOGIN extends RepositoryInvitationOrderField { val value: String = "INVITEE_LOGIN" }

  implicit val decoder: ScalarDecoder[RepositoryInvitationOrderField] = {
    case __StringValue("CREATED_AT")    => Right(RepositoryInvitationOrderField.CREATED_AT)
    case __StringValue("INVITEE_LOGIN") => Right(RepositoryInvitationOrderField.INVITEE_LOGIN)
    case other                          => Left(DecodingError(s"Can't build RepositoryInvitationOrderField from input $other"))
  }

  implicit val encoder: ArgEncoder[RepositoryInvitationOrderField] = {
    case RepositoryInvitationOrderField.CREATED_AT    => __EnumValue("CREATED_AT")
    case RepositoryInvitationOrderField.INVITEE_LOGIN => __EnumValue("INVITEE_LOGIN")
  }

  val values: Vector[RepositoryInvitationOrderField] = Vector(CREATED_AT, INVITEE_LOGIN)
}

