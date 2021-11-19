package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SetOrganizationInteractionLimitPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[SetOrganizationInteractionLimitPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The organization that the interaction limit was set for.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[SetOrganizationInteractionLimitPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))
}

