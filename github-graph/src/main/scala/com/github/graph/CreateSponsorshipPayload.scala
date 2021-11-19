package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateSponsorshipPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateSponsorshipPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The sponsorship that was started.
    */
  def sponsorship[A](innerSelection: SelectionBuilder[Sponsorship, A]): SelectionBuilder[CreateSponsorshipPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorship", OptionOf(Obj(innerSelection)))
}

