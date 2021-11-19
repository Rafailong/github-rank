package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateSponsorshipPreferencesPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateSponsorshipPreferencesPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The sponsorship that was updated.
    */
  def sponsorship[A](innerSelection: SelectionBuilder[Sponsorship, A]): SelectionBuilder[UpdateSponsorshipPreferencesPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorship", OptionOf(Obj(innerSelection)))
}

