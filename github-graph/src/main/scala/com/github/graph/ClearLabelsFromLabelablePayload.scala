package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ClearLabelsFromLabelablePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[ClearLabelsFromLabelablePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The item that was unlabeled.
    */
  def labelable[A](
    onDiscussion: Option[SelectionBuilder[Discussion, A]]   = None,
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[ClearLabelsFromLabelablePayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "labelable",
    OptionOf(ChoiceOf(Map("Discussion" -> onDiscussion, "Issue" -> onIssue, "PullRequest" -> onPullRequest).collect { case (k, Some(v)) =>
      k -> Obj(v)
    }))
  )
}

