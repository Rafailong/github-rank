package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgUpdateMemberAuditEntryPermission extends scala.Product with scala.Serializable { def value: String }

object OrgUpdateMemberAuditEntryPermission {
  case object ADMIN extends OrgUpdateMemberAuditEntryPermission { val value: String = "ADMIN" }
  case object READ extends OrgUpdateMemberAuditEntryPermission { val value: String = "READ" }

  implicit val decoder: ScalarDecoder[OrgUpdateMemberAuditEntryPermission] = {
    case __StringValue("ADMIN") => Right(OrgUpdateMemberAuditEntryPermission.ADMIN)
    case __StringValue("READ")  => Right(OrgUpdateMemberAuditEntryPermission.READ)
    case other                  => Left(DecodingError(s"Can't build OrgUpdateMemberAuditEntryPermission from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgUpdateMemberAuditEntryPermission] = {
    case OrgUpdateMemberAuditEntryPermission.ADMIN => __EnumValue("ADMIN")
    case OrgUpdateMemberAuditEntryPermission.READ  => __EnumValue("READ")
  }

  val values: Vector[OrgUpdateMemberAuditEntryPermission] = Vector(ADMIN, READ)
}

