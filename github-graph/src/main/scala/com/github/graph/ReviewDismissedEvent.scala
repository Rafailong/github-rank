package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReviewDismissedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ReviewDismissedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[ReviewDismissedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ReviewDismissedEvent, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** Identifies the optional message associated with the 'review_dismissed' event.
    */
  def dismissalMessage: SelectionBuilder[ReviewDismissedEvent, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("dismissalMessage", OptionOf(Scalar()))

  /** Identifies the optional message associated with the event, rendered to HTML.
    */
  def dismissalMessageHTML: SelectionBuilder[ReviewDismissedEvent, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("dismissalMessageHTML", OptionOf(Scalar()))
  def id: SelectionBuilder[ReviewDismissedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the previous state of the review with the 'review_dismissed' event.
    */
  def previousReviewState: SelectionBuilder[ReviewDismissedEvent, PullRequestReviewState] =
    _root_.caliban.client.SelectionBuilder.Field("previousReviewState", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[ReviewDismissedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** Identifies the commit which caused the review to become stale.
    */
  def pullRequestCommit[A](innerSelection: SelectionBuilder[PullRequestCommit, A]): SelectionBuilder[ReviewDismissedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestCommit", OptionOf(Obj(innerSelection)))

  /** The HTTP path for this review dismissed event.
    */
  def resourcePath: SelectionBuilder[ReviewDismissedEvent, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the review associated with the 'review_dismissed' event.
    */
  def review[A](innerSelection: SelectionBuilder[PullRequestReview, A]): SelectionBuilder[ReviewDismissedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("review", OptionOf(Obj(innerSelection)))

  /** The HTTP URL for this review dismissed event.
    */
  def url: SelectionBuilder[ReviewDismissedEvent, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

