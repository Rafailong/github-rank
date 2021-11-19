package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OrganizationMembersCanCreateRepositoriesSettingValue extends scala.Product with scala.Serializable { def value: String }

object OrganizationMembersCanCreateRepositoriesSettingValue {
  case object ALL extends OrganizationMembersCanCreateRepositoriesSettingValue { val value: String = "ALL" }
  case object DISABLED extends OrganizationMembersCanCreateRepositoriesSettingValue { val value: String = "DISABLED" }
  case object INTERNAL extends OrganizationMembersCanCreateRepositoriesSettingValue { val value: String = "INTERNAL" }
  case object PRIVATE extends OrganizationMembersCanCreateRepositoriesSettingValue { val value: String = "PRIVATE" }

  implicit val decoder: ScalarDecoder[OrganizationMembersCanCreateRepositoriesSettingValue] = {
    case __StringValue("ALL")      => Right(OrganizationMembersCanCreateRepositoriesSettingValue.ALL)
    case __StringValue("DISABLED") => Right(OrganizationMembersCanCreateRepositoriesSettingValue.DISABLED)
    case __StringValue("INTERNAL") => Right(OrganizationMembersCanCreateRepositoriesSettingValue.INTERNAL)
    case __StringValue("PRIVATE")  => Right(OrganizationMembersCanCreateRepositoriesSettingValue.PRIVATE)
    case other                     => Left(DecodingError(s"Can't build OrganizationMembersCanCreateRepositoriesSettingValue from input $other"))
  }

  implicit val encoder: ArgEncoder[OrganizationMembersCanCreateRepositoriesSettingValue] = {
    case OrganizationMembersCanCreateRepositoriesSettingValue.ALL      => __EnumValue("ALL")
    case OrganizationMembersCanCreateRepositoriesSettingValue.DISABLED => __EnumValue("DISABLED")
    case OrganizationMembersCanCreateRepositoriesSettingValue.INTERNAL => __EnumValue("INTERNAL")
    case OrganizationMembersCanCreateRepositoriesSettingValue.PRIVATE  => __EnumValue("PRIVATE")
  }

  val values: Vector[OrganizationMembersCanCreateRepositoriesSettingValue] = Vector(ALL, DISABLED, INTERNAL, PRIVATE)
}

