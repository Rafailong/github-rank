package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddVerifiableDomainPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddVerifiableDomainPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The verifiable domain that was added.
    */
  def domain[A](innerSelection: SelectionBuilder[VerifiableDomain, A]): SelectionBuilder[AddVerifiableDomainPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("domain", OptionOf(Obj(innerSelection)))
}

