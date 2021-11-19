package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UnarchiveRepositoryPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UnarchiveRepositoryPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The repository that was unarchived.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[UnarchiveRepositoryPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

