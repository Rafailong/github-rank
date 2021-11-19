package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteIssuePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteIssuePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The repository the issue belonged to
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[DeleteIssuePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

