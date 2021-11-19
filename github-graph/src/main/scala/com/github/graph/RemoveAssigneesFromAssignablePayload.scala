package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RemoveAssigneesFromAssignablePayload {

  /** The item that was unassigned.
    */
  def assignable[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[RemoveAssigneesFromAssignablePayload, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("assignable", OptionOf(ChoiceOf(Map("Issue" -> onIssue, "PullRequest" -> onPullRequest).collect { case (k, Some(v)) => k -> Obj(v) })))

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RemoveAssigneesFromAssignablePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))
}

