package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteVerifiableDomainPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteVerifiableDomainPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The owning account from which the domain was deleted.
    */
  def owner[A](
    onEnterprise: SelectionBuilder[Enterprise, A],
    onOrganization: SelectionBuilder[Organization, A]
  ): SelectionBuilder[DeleteVerifiableDomainPayload, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("owner", OptionOf(ChoiceOf(Map("Enterprise" -> Obj(onEnterprise), "Organization" -> Obj(onOrganization)))))

  /** The owning account from which the domain was deleted.
    */
  def ownerOption[A](
    onEnterprise: Option[SelectionBuilder[Enterprise, A]]     = None,
    onOrganization: Option[SelectionBuilder[Organization, A]] = None
  ): SelectionBuilder[DeleteVerifiableDomainPayload, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
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

