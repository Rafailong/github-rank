package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility extends scala.Product with scala.Serializable { def value: String }

object OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility {
  case object ALL extends OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility { val value: String = "ALL" }
  case object INTERNAL extends OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility { val value: String = "INTERNAL" }
  case object NONE extends OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility { val value: String = "NONE" }
  case object PRIVATE extends OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility { val value: String = "PRIVATE" }
  case object PRIVATE_INTERNAL extends OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility { val value: String = "PRIVATE_INTERNAL" }
  case object PUBLIC extends OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility { val value: String = "PUBLIC" }
  case object PUBLIC_INTERNAL extends OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility { val value: String = "PUBLIC_INTERNAL" }
  case object PUBLIC_PRIVATE extends OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility { val value: String = "PUBLIC_PRIVATE" }

  implicit val decoder: ScalarDecoder[OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility] = {
    case __StringValue("ALL")              => Right(OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.ALL)
    case __StringValue("INTERNAL")         => Right(OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.INTERNAL)
    case __StringValue("NONE")             => Right(OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.NONE)
    case __StringValue("PRIVATE")          => Right(OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PRIVATE)
    case __StringValue("PRIVATE_INTERNAL") => Right(OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PRIVATE_INTERNAL)
    case __StringValue("PUBLIC")           => Right(OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PUBLIC)
    case __StringValue("PUBLIC_INTERNAL")  => Right(OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PUBLIC_INTERNAL)
    case __StringValue("PUBLIC_PRIVATE")   => Right(OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PUBLIC_PRIVATE)
    case other                             => Left(DecodingError(s"Can't build OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility from input $other"))
  }

  implicit val encoder: ArgEncoder[OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility] = {
    case OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.ALL              => __EnumValue("ALL")
    case OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.INTERNAL         => __EnumValue("INTERNAL")
    case OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.NONE             => __EnumValue("NONE")
    case OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PRIVATE          => __EnumValue("PRIVATE")
    case OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PRIVATE_INTERNAL => __EnumValue("PRIVATE_INTERNAL")
    case OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PUBLIC           => __EnumValue("PUBLIC")
    case OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PUBLIC_INTERNAL  => __EnumValue("PUBLIC_INTERNAL")
    case OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility.PUBLIC_PRIVATE   => __EnumValue("PUBLIC_PRIVATE")
  }

  val values: Vector[OrgUpdateMemberRepositoryCreationPermissionAuditEntryVisibility] =
    Vector(ALL, INTERNAL, NONE, PRIVATE, PRIVATE_INTERNAL, PUBLIC, PUBLIC_INTERNAL, PUBLIC_PRIVATE)
}

