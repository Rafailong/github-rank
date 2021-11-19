package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateCommitOnBranchPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateCommitOnBranchPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new commit.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[CreateCommitOnBranchPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commit", OptionOf(Obj(innerSelection)))

  /** The ref which has been updated to point to the new commit.
    */
  def ref[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[CreateCommitOnBranchPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ref", OptionOf(Obj(innerSelection)))
}

