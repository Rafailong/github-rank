package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateRepositoryPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateRepositoryPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new repository.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[CreateRepositoryPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

