package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SetRepositoryInteractionLimitPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[SetRepositoryInteractionLimitPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The repository that the interaction limit was set for.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[SetRepositoryInteractionLimitPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

