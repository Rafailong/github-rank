package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ArchiveRepositoryPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[ArchiveRepositoryPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The repository that was marked as archived.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[ArchiveRepositoryPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

