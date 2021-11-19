package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteProjectNextItemPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteProjectNextItemPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The ID of the deleted item.
    */
  def deletedItemId: SelectionBuilder[DeleteProjectNextItemPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("deletedItemId", OptionOf(Scalar()))
}

