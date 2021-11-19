package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteRefPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteRefPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))
}

