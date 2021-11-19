package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateNotificationRestrictionSettingInput(
  clientMutationId: Option[String] = None,
  ownerId: String,
  settingValue: NotificationRestrictionSettingValue
)

object UpdateNotificationRestrictionSettingInput {

  implicit val encoder: ArgEncoder[UpdateNotificationRestrictionSettingInput] = new ArgEncoder[UpdateNotificationRestrictionSettingInput] {

    override def encode(value: UpdateNotificationRestrictionSettingInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "ownerId"          -> implicitly[ArgEncoder[String]].encode(value.ownerId),
          "settingValue"     -> implicitly[ArgEncoder[NotificationRestrictionSettingValue]].encode(value.settingValue)
        )
      )
  }
}

