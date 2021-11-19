package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateSubscriptionPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateSubscriptionPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The input subscribable entity.
    */
  def subscribable[A](
    onCommit: Option[SelectionBuilder[Commit, A]]                 = None,
    onDiscussion: Option[SelectionBuilder[Discussion, A]]         = None,
    onIssue: Option[SelectionBuilder[Issue, A]]                   = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]]       = None,
    onRepository: Option[SelectionBuilder[Repository, A]]         = None,
    onTeam: Option[SelectionBuilder[Team, A]]                     = None,
    onTeamDiscussion: Option[SelectionBuilder[TeamDiscussion, A]] = None
  ): SelectionBuilder[UpdateSubscriptionPayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "subscribable",
    OptionOf(
      ChoiceOf(
        Map(
          "Commit"         -> onCommit,
          "Discussion"     -> onDiscussion,
          "Issue"          -> onIssue,
          "PullRequest"    -> onPullRequest,
          "Repository"     -> onRepository,
          "Team"           -> onTeam,
          "TeamDiscussion" -> onTeamDiscussion
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )
}

