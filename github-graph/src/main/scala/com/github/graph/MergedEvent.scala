package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MergedEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[MergedEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies the commit associated with the `merge` event.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[MergedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commit", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[MergedEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[MergedEvent, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the Ref associated with the `merge` event.
    */
  def mergeRef[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[MergedEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("mergeRef", OptionOf(Obj(innerSelection)))

  /** Identifies the name of the Ref associated with the `merge` event.
    */
  def mergeRefName: SelectionBuilder[MergedEvent, String] = _root_.caliban.client.SelectionBuilder.Field("mergeRefName", Scalar())

  /** PullRequest referenced by event.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[MergedEvent, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** The HTTP path for this merged event.
    */
  def resourcePath: SelectionBuilder[MergedEvent, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP URL for this merged event.
    */
  def url: SelectionBuilder[MergedEvent, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

