package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RequestReviewsPayload {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[RequestReviewsPayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "actor",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"                   -> onBot,
          "EnterpriseUserAccount" -> onEnterpriseUserAccount,
          "Mannequin"             -> onMannequin,
          "Organization"          -> onOrganization,
          "User"                  -> onUser
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RequestReviewsPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The pull request that is getting requests.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[RequestReviewsPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", OptionOf(Obj(innerSelection)))

  /** The edge from the pull request to the requested reviewers.
    */
  def requestedReviewersEdge[A](innerSelection: SelectionBuilder[UserEdge, A]): SelectionBuilder[RequestReviewsPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("requestedReviewersEdge", OptionOf(Obj(innerSelection)))
}

