package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RemoveEnterpriseOrganizationPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RemoveEnterpriseOrganizationPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated enterprise.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[RemoveEnterpriseOrganizationPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** The organization that was removed from the enterprise.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[RemoveEnterpriseOrganizationPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))

  /** The viewer performing the mutation.
    */
  def viewer[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[RemoveEnterpriseOrganizationPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("viewer", OptionOf(Obj(innerSelection)))
}

