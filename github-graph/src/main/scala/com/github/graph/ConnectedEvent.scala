package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ConnectedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ConnectedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ConnectedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[ConnectedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Reference originated in a different repository.
    */
  def isCrossRepository: SelectionBuilder[ConnectedEvent, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isCrossRepository", Scalar())

  /** Issue or pull request that made the reference.
    */
  def source[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[ConnectedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("source", ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest))))

  /** Issue or pull request which was connected.
    */
  def subject[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[ConnectedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("subject", ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest))))
}

