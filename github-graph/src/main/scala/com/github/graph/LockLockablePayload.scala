package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object LockLockablePayload {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[LockLockablePayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def clientMutationId: SelectionBuilder[LockLockablePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The item that was locked.
    */
  def lockedRecord[A](
    onDiscussion: Option[SelectionBuilder[Discussion, A]]   = None,
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[LockLockablePayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "lockedRecord",
    OptionOf(ChoiceOf(Map("Discussion" -> onDiscussion, "Issue" -> onIssue, "PullRequest" -> onPullRequest).collect { case (k, Some(v)) =>
      k -> Obj(v)
    }))
  )
}

