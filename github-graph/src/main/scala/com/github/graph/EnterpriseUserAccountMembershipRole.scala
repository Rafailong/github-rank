package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseUserAccountMembershipRole extends scala.Product with scala.Serializable { def value: String }

object EnterpriseUserAccountMembershipRole {
  case object MEMBER extends EnterpriseUserAccountMembershipRole { val value: String = "MEMBER" }
  case object OWNER extends EnterpriseUserAccountMembershipRole { val value: String = "OWNER" }

  implicit val decoder: ScalarDecoder[EnterpriseUserAccountMembershipRole] = {
    case __StringValue("MEMBER") => Right(EnterpriseUserAccountMembershipRole.MEMBER)
    case __StringValue("OWNER")  => Right(EnterpriseUserAccountMembershipRole.OWNER)
    case other                   => Left(DecodingError(s"Can't build EnterpriseUserAccountMembershipRole from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseUserAccountMembershipRole] = {
    case EnterpriseUserAccountMembershipRole.MEMBER => __EnumValue("MEMBER")
    case EnterpriseUserAccountMembershipRole.OWNER  => __EnumValue("OWNER")
  }

  val values: Vector[EnterpriseUserAccountMembershipRole] = Vector(MEMBER, OWNER)
}

