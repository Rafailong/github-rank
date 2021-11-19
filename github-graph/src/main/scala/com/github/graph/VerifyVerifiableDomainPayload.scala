package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object VerifyVerifiableDomainPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[VerifyVerifiableDomainPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The verifiable domain that was verified.
    */
  def domain[A](innerSelection: SelectionBuilder[VerifiableDomain, A]): SelectionBuilder[VerifyVerifiableDomainPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("domain", OptionOf(Obj(innerSelection)))
}

