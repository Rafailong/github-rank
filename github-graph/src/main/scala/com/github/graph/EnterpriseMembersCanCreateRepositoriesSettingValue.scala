package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseMembersCanCreateRepositoriesSettingValue extends scala.Product with scala.Serializable { def value: String }

object EnterpriseMembersCanCreateRepositoriesSettingValue {
  case object ALL extends EnterpriseMembersCanCreateRepositoriesSettingValue { val value: String = "ALL" }
  case object DISABLED extends EnterpriseMembersCanCreateRepositoriesSettingValue { val value: String = "DISABLED" }
  case object NO_POLICY extends EnterpriseMembersCanCreateRepositoriesSettingValue { val value: String = "NO_POLICY" }
  case object PRIVATE extends EnterpriseMembersCanCreateRepositoriesSettingValue { val value: String = "PRIVATE" }
  case object PUBLIC extends EnterpriseMembersCanCreateRepositoriesSettingValue { val value: String = "PUBLIC" }

  implicit val decoder: ScalarDecoder[EnterpriseMembersCanCreateRepositoriesSettingValue] = {
    case __StringValue("ALL")       => Right(EnterpriseMembersCanCreateRepositoriesSettingValue.ALL)
    case __StringValue("DISABLED")  => Right(EnterpriseMembersCanCreateRepositoriesSettingValue.DISABLED)
    case __StringValue("NO_POLICY") => Right(EnterpriseMembersCanCreateRepositoriesSettingValue.NO_POLICY)
    case __StringValue("PRIVATE")   => Right(EnterpriseMembersCanCreateRepositoriesSettingValue.PRIVATE)
    case __StringValue("PUBLIC")    => Right(EnterpriseMembersCanCreateRepositoriesSettingValue.PUBLIC)
    case other                      => Left(DecodingError(s"Can't build EnterpriseMembersCanCreateRepositoriesSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseMembersCanCreateRepositoriesSettingValue] = {
    case EnterpriseMembersCanCreateRepositoriesSettingValue.ALL       => __EnumValue("ALL")
    case EnterpriseMembersCanCreateRepositoriesSettingValue.DISABLED  => __EnumValue("DISABLED")
    case EnterpriseMembersCanCreateRepositoriesSettingValue.NO_POLICY => __EnumValue("NO_POLICY")
    case EnterpriseMembersCanCreateRepositoriesSettingValue.PRIVATE   => __EnumValue("PRIVATE")
    case EnterpriseMembersCanCreateRepositoriesSettingValue.PUBLIC    => __EnumValue("PUBLIC")
  }

  val values: Vector[EnterpriseMembersCanCreateRepositoriesSettingValue] = Vector(ALL, DISABLED, NO_POLICY, PRIVATE, PUBLIC)
}

