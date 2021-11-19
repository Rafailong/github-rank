package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MergeBranchPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[MergeBranchPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The resulting merge Commit.
    */
  def mergeCommit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[MergeBranchPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("mergeCommit", OptionOf(Obj(innerSelection)))
}

