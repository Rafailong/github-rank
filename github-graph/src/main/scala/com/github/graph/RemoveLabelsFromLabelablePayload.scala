package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RemoveLabelsFromLabelablePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RemoveLabelsFromLabelablePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The Labelable the labels were removed from.
    */
  def labelable[A](
    onDiscussion: Option[SelectionBuilder[Discussion, A]]   = None,
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[RemoveLabelsFromLabelablePayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "labelable",
    OptionOf(ChoiceOf(Map("Discussion" -> onDiscussion, "Issue" -> onIssue, "PullRequest" -> onPullRequest).collect { case (k, Some(v)) =>
      k -> Obj(v)
    }))
  )
}

