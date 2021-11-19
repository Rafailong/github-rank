package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgAddMemberAuditEntryPermission extends scala.Product with scala.Serializable { def value: String }

object OrgAddMemberAuditEntryPermission {
  case object ADMIN extends OrgAddMemberAuditEntryPermission { val value: String = "ADMIN" }
  case object READ extends OrgAddMemberAuditEntryPermission { val value: String = "READ" }

  implicit val decoder: ScalarDecoder[OrgAddMemberAuditEntryPermission] = {
    case __StringValue("ADMIN") => Right(OrgAddMemberAuditEntryPermission.ADMIN)
    case __StringValue("READ")  => Right(OrgAddMemberAuditEntryPermission.READ)
    case other                  => Left(DecodingError(s"Can't build OrgAddMemberAuditEntryPermission from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgAddMemberAuditEntryPermission] = {
    case OrgAddMemberAuditEntryPermission.ADMIN => __EnumValue("ADMIN")
    case OrgAddMemberAuditEntryPermission.READ  => __EnumValue("READ")
  }

  val values: Vector[OrgAddMemberAuditEntryPermission] = Vector(ADMIN, READ)
}

