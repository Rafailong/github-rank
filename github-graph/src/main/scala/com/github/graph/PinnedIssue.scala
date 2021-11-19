package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PinnedIssue {

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[PinnedIssue, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[PinnedIssue, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The issue that was pinned.
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[PinnedIssue, A] =
    _root_.caliban.client.SelectionBuilder.Field("issue", Obj(innerSelection))

  /** The actor that pinned this issue.
    */
  def pinnedBy[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[PinnedIssue, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pinnedBy",
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

  /** The repository that this issue was pinned to.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PinnedIssue, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))
}

