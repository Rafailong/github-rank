package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ConvertPullRequestToDraftPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[ConvertPullRequestToDraftPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The pull request that is now a draft.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[ConvertPullRequestToDraftPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", OptionOf(Obj(innerSelection)))
}

