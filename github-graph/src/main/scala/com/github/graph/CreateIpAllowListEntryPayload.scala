package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateIpAllowListEntryPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateIpAllowListEntryPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The IP allow list entry that was created.
    */
  def ipAllowListEntry[A](innerSelection: SelectionBuilder[IpAllowListEntry, A]): SelectionBuilder[CreateIpAllowListEntryPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ipAllowListEntry", OptionOf(Obj(innerSelection)))
}

