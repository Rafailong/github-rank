package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CloneTemplateRepositoryPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CloneTemplateRepositoryPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new repository.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[CloneTemplateRepositoryPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

