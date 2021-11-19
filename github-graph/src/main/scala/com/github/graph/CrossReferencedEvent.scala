package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CrossReferencedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[CrossReferencedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[CrossReferencedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[CrossReferencedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Reference originated in a different repository.
    */
  def isCrossRepository: SelectionBuilder[CrossReferencedEvent, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isCrossRepository", Scalar())

  /** Identifies when the reference was made.
    */
  def referencedAt: SelectionBuilder[CrossReferencedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("referencedAt", Scalar())

  /** The HTTP path for this pull request.
    */
  def resourcePath: SelectionBuilder[CrossReferencedEvent, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Issue or pull request that made the reference.
    */
  def source[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[CrossReferencedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("source", ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest))))

  /** Issue or pull request to which the reference was made.
    */
  def target[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[CrossReferencedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("target", ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest))))

  /** The HTTP URL for this pull request.
    */
  def url: SelectionBuilder[CrossReferencedEvent, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Checks if the target will be closed when the source is merged.
    */
  def willCloseTarget: SelectionBuilder[CrossReferencedEvent, Boolean] = _root_.caliban.client.SelectionBuilder.Field("willCloseTarget", Scalar())
}

