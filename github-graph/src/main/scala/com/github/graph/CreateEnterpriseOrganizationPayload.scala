package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateEnterpriseOrganizationPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateEnterpriseOrganizationPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise that owns the created organization.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[CreateEnterpriseOrganizationPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** The organization that was created.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[CreateEnterpriseOrganizationPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))
}

