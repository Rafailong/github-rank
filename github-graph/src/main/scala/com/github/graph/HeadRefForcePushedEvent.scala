package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object HeadRefForcePushedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[HeadRefForcePushedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies the after commit SHA for the 'head_ref_force_pushed' event.
    */
  def afterCommit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[HeadRefForcePushedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("afterCommit", OptionOf(Obj(innerSelection)))

  /** Identifies the before commit SHA for the 'head_ref_force_pushed' event.
    */
  def beforeCommit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[HeadRefForcePushedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("beforeCommit", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[HeadRefForcePushedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[HeadRefForcePushedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[HeadRefForcePushedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** Identifies the fully qualified ref name for the 'head_ref_force_pushed' event.
    */
  def ref[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[HeadRefForcePushedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ref", OptionOf(Obj(innerSelection)))
}

