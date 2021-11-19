package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CancelSponsorshipPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CancelSponsorshipPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The tier that was being used at the time of cancellation.
    */
  def sponsorsTier[A](innerSelection: SelectionBuilder[SponsorsTier, A]): SelectionBuilder[CancelSponsorshipPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorsTier", OptionOf(Obj(innerSelection)))
}

