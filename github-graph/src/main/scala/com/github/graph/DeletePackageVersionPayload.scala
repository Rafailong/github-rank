package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeletePackageVersionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeletePackageVersionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** Whether or not the operation succeeded.
    */
  def success: SelectionBuilder[DeletePackageVersionPayload, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("success", OptionOf(Scalar()))
}

