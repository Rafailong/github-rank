package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReferencedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ReferencedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies the commit associated with the 'referenced' event.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[ReferencedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commit", OptionOf(Obj(innerSelection)))

  /** Identifies the repository associated with the 'referenced' event.
    */
  def commitRepository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[ReferencedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("commitRepository", Obj(innerSelection))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ReferencedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[ReferencedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Reference originated in a different repository.
    */
  def isCrossRepository: SelectionBuilder[ReferencedEvent, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isCrossRepository", Scalar())

  /** Checks if the commit message itself references the subject. Can be false in the case of a commit comment reference.
    */
  def isDirectReference: SelectionBuilder[ReferencedEvent, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isDirectReference", Scalar())

  /** Object referenced by event.
    */
  def subject[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[ReferencedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("subject", ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest))))
}

