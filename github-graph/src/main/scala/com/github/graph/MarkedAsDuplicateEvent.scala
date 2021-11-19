package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MarkedAsDuplicateEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[MarkedAsDuplicateEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The authoritative issue or pull request which has been duplicated by another.
    */
  def canonical[A](
    onIssue: SelectionBuilder[Issue, A],
    onPullRequest: SelectionBuilder[PullRequest, A]
  ): SelectionBuilder[MarkedAsDuplicateEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("canonical", OptionOf(ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest)))))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[MarkedAsDuplicateEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The issue or pull request which has been marked as a duplicate of another.
    */
  def duplicate[A](
    onIssue: SelectionBuilder[Issue, A],
    onPullRequest: SelectionBuilder[PullRequest, A]
  ): SelectionBuilder[MarkedAsDuplicateEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("duplicate", OptionOf(ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest)))))
  def id: SelectionBuilder[MarkedAsDuplicateEvent, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Canonical and duplicate belong to different repositories.
    */
  def isCrossRepository: SelectionBuilder[MarkedAsDuplicateEvent, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isCrossRepository", Scalar())

  /** The authoritative issue or pull request which has been duplicated by another.
    */
  def canonicalOption[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[MarkedAsDuplicateEvent, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "canonical",
    OptionOf(
      ChoiceOf(
        Map(
          "Issue"       -> onIssue.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PullRequest" -> onPullRequest.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )

  /** The issue or pull request which has been marked as a duplicate of another.
    */
  def duplicateOption[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[MarkedAsDuplicateEvent, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
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

