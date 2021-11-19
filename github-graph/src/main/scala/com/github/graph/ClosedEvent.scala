package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ClosedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ClosedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Object that was closed.
    */
  def closable[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onMilestone: Option[SelectionBuilder[Milestone, A]]     = None,
    onProject: Option[SelectionBuilder[Project, A]]         = None,
    onProjectNext: Option[SelectionBuilder[ProjectNext, A]] = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[ClosedEvent, A] = _root_.caliban.client.SelectionBuilder.Field(
    "closable",
    ChoiceOf(
      Map("Issue" -> onIssue, "Milestone" -> onMilestone, "Project" -> onProject, "ProjectNext" -> onProjectNext, "PullRequest" -> onPullRequest)
        .collect { case (k, Some(v)) => k -> Obj(v) }
    )
  )

  /** Object which triggered the creation of this event.
    */
  def closer[A](onCommit: SelectionBuilder[Commit, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[ClosedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("closer", OptionOf(ChoiceOf(Map("Commit" -> Obj(onCommit), "PullRequest" -> Obj(onPullRequest)))))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ClosedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[ClosedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The HTTP path for this closed event.
    */
  def resourcePath: SelectionBuilder[ClosedEvent, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP URL for this closed event.
    */
  def url: SelectionBuilder[ClosedEvent, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Object which triggered the creation of this event.
    */
  def closerOption[A](
    onCommit: Option[SelectionBuilder[Commit, A]]           = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[ClosedEvent, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "closer",
    OptionOf(
      ChoiceOf(
        Map(
          "Commit"      -> onCommit.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PullRequest" -> onPullRequest.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

