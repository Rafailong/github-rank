package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ApproveVerifiableDomainPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[ApproveVerifiableDomainPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The verifiable domain that was approved.
    */
  def domain[A](innerSelection: SelectionBuilder[VerifiableDomain, A]): SelectionBuilder[ApproveVerifiableDomainPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("domain", OptionOf(Obj(innerSelection)))
}

