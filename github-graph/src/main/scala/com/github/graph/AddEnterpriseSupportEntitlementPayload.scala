package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddEnterpriseSupportEntitlementPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddEnterpriseSupportEntitlementPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** A message confirming the result of adding the support entitlement.
    */
  def message: SelectionBuilder[AddEnterpriseSupportEntitlementPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

