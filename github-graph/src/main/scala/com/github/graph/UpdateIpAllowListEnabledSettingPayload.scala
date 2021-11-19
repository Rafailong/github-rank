package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateIpAllowListEnabledSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateIpAllowListEnabledSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The IP allow list owner on which the setting was updated.
    */
  def owner[A](
    onApp: SelectionBuilder[App, A],
    onEnterprise: SelectionBuilder[Enterprise, A],
    onOrganization: SelectionBuilder[Organization, A]
  ): SelectionBuilder[UpdateIpAllowListEnabledSettingPayload, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("owner", OptionOf(ChoiceOf(Map("App" -> Obj(onApp), "Enterprise" -> Obj(onEnterprise), "Organization" -> Obj(onOrganization)))))

  /** The IP allow list owner on which the setting was updated.
    */
  def ownerOption[A](
    onApp: Option[SelectionBuilder[App, A]]                   = None,
    onEnterprise: Option[SelectionBuilder[Enterprise, A]]     = None,
    onOrganization: Option[SelectionBuilder[Organization, A]] = None
  ): SelectionBuilder[UpdateIpAllowListEnabledSettingPayload, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "owner",
    OptionOf(
      ChoiceOf(
        Map(
          "App"          -> onApp.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Enterprise"   -> onEnterprise.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Organization" -> onOrganization.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

