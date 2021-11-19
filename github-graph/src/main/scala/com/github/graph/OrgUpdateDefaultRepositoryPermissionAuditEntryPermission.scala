package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgUpdateDefaultRepositoryPermissionAuditEntryPermission extends scala.Product with scala.Serializable { def value: String }

object OrgUpdateDefaultRepositoryPermissionAuditEntryPermission {
  case object ADMIN extends OrgUpdateDefaultRepositoryPermissionAuditEntryPermission { val value: String = "ADMIN" }
  case object NONE extends OrgUpdateDefaultRepositoryPermissionAuditEntryPermission { val value: String = "NONE" }
  case object READ extends OrgUpdateDefaultRepositoryPermissionAuditEntryPermission { val value: String = "READ" }
  case object WRITE extends OrgUpdateDefaultRepositoryPermissionAuditEntryPermission { val value: String = "WRITE" }

  implicit val decoder: ScalarDecoder[OrgUpdateDefaultRepositoryPermissionAuditEntryPermission] = {
    case __StringValue("ADMIN") => Right(OrgUpdateDefaultRepositoryPermissionAuditEntryPermission.ADMIN)
    case __StringValue("NONE")  => Right(OrgUpdateDefaultRepositoryPermissionAuditEntryPermission.NONE)
    case __StringValue("READ")  => Right(OrgUpdateDefaultRepositoryPermissionAuditEntryPermission.READ)
    case __StringValue("WRITE") => Right(OrgUpdateDefaultRepositoryPermissionAuditEntryPermission.WRITE)
    case other                  => Left(DecodingError(s"Can't build OrgUpdateDefaultRepositoryPermissionAuditEntryPermission from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgUpdateDefaultRepositoryPermissionAuditEntryPermission] = {
    case OrgUpdateDefaultRepositoryPermissionAuditEntryPermission.ADMIN => __EnumValue("ADMIN")
    case OrgUpdateDefaultRepositoryPermissionAuditEntryPermission.NONE  => __EnumValue("NONE")
    case OrgUpdateDefaultRepositoryPermissionAuditEntryPermission.READ  => __EnumValue("READ")
    case OrgUpdateDefaultRepositoryPermissionAuditEntryPermission.WRITE => __EnumValue("WRITE")
  }

  val values: Vector[OrgUpdateDefaultRepositoryPermissionAuditEntryPermission] = Vector(ADMIN, NONE, READ, WRITE)
}

