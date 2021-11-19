package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RemoveEnterpriseIdentityProviderPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RemoveEnterpriseIdentityProviderPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The identity provider that was removed from the enterprise.
    */
  def identityProvider[A](
    innerSelection: SelectionBuilder[EnterpriseIdentityProvider, A]
  ): SelectionBuilder[RemoveEnterpriseIdentityProviderPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("identityProvider", OptionOf(Obj(innerSelection)))
}

