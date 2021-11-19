package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseDefaultRepositoryPermissionSettingValue extends scala.Product with scala.Serializable { def value: String }

object EnterpriseDefaultRepositoryPermissionSettingValue {
  case object ADMIN extends EnterpriseDefaultRepositoryPermissionSettingValue { val value: String = "ADMIN" }
  case object NONE extends EnterpriseDefaultRepositoryPermissionSettingValue { val value: String = "NONE" }
  case object NO_POLICY extends EnterpriseDefaultRepositoryPermissionSettingValue { val value: String = "NO_POLICY" }
  case object READ extends EnterpriseDefaultRepositoryPermissionSettingValue { val value: String = "READ" }
  case object WRITE extends EnterpriseDefaultRepositoryPermissionSettingValue { val value: String = "WRITE" }

  implicit val decoder: ScalarDecoder[EnterpriseDefaultRepositoryPermissionSettingValue] = {
    case __StringValue("ADMIN")     => Right(EnterpriseDefaultRepositoryPermissionSettingValue.ADMIN)
    case __StringValue("NONE")      => Right(EnterpriseDefaultRepositoryPermissionSettingValue.NONE)
    case __StringValue("NO_POLICY") => Right(EnterpriseDefaultRepositoryPermissionSettingValue.NO_POLICY)
    case __StringValue("READ")      => Right(EnterpriseDefaultRepositoryPermissionSettingValue.READ)
    case __StringValue("WRITE")     => Right(EnterpriseDefaultRepositoryPermissionSettingValue.WRITE)
    case other                      => Left(DecodingError(s"Can't build EnterpriseDefaultRepositoryPermissionSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseDefaultRepositoryPermissionSettingValue] = {
    case EnterpriseDefaultRepositoryPermissionSettingValue.ADMIN     => __EnumValue("ADMIN")
    case EnterpriseDefaultRepositoryPermissionSettingValue.NONE      => __EnumValue("NONE")
    case EnterpriseDefaultRepositoryPermissionSettingValue.NO_POLICY => __EnumValue("NO_POLICY")
    case EnterpriseDefaultRepositoryPermissionSettingValue.READ      => __EnumValue("READ")
    case EnterpriseDefaultRepositoryPermissionSettingValue.WRITE     => __EnumValue("WRITE")
  }

  val values: Vector[EnterpriseDefaultRepositoryPermissionSettingValue] = Vector(ADMIN, NONE, NO_POLICY, READ, WRITE)
}

