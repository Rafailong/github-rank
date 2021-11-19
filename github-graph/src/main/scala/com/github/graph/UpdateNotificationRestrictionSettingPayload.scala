package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateNotificationRestrictionSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateNotificationRestrictionSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The owner on which the setting was updated.
    */
  def owner[A](
    onEnterprise: SelectionBuilder[Enterprise, A],
    onOrganization: SelectionBuilder[Organization, A]
  ): SelectionBuilder[UpdateNotificationRestrictionSettingPayload, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("owner", OptionOf(ChoiceOf(Map("Enterprise" -> Obj(onEnterprise), "Organization" -> Obj(onOrganization)))))

  /** The owner on which the setting was updated.
    */
  def ownerOption[A](
    onEnterprise: Option[SelectionBuilder[Enterprise, A]]     = None,
    onOrganization: Option[SelectionBuilder[Organization, A]] = None
  ): SelectionBuilder[UpdateNotificationRestrictionSettingPayload, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "owner",
    OptionOf(
      ChoiceOf(
        Map(
          "Enterprise"   -> onEnterprise.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Organization" -> onOrganization.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

