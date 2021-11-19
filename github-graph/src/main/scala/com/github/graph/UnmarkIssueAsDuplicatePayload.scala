package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UnmarkIssueAsDuplicatePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UnmarkIssueAsDuplicatePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The issue or pull request that was marked as a duplicate.
    */
  def duplicate[A](
    onIssue: SelectionBuilder[Issue, A],
    onPullRequest: SelectionBuilder[PullRequest, A]
  ): SelectionBuilder[UnmarkIssueAsDuplicatePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("duplicate", OptionOf(ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest)))))

  /** The issue or pull request that was marked as a duplicate.
    */
  def duplicateOption[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[UnmarkIssueAsDuplicatePayload, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "duplicate",
    OptionOf(
      ChoiceOf(
        Map(
          "Issue"       -> onIssue.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PullRequest" -> onPullRequest.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

