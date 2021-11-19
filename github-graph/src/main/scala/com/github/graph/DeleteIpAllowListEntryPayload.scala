package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteIpAllowListEntryPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteIpAllowListEntryPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The IP allow list entry that was deleted.
    */
  def ipAllowListEntry[A](innerSelection: SelectionBuilder[IpAllowListEntry, A]): SelectionBuilder[DeleteIpAllowListEntryPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ipAllowListEntry", OptionOf(Obj(innerSelection)))
}

