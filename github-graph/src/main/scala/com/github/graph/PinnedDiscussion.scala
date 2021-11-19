package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PinnedDiscussion {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[PinnedDiscussion, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[PinnedDiscussion, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The discussion that was pinned.
    */
  def discussion[A](innerSelection: SelectionBuilder[Discussion, A]): SelectionBuilder[PinnedDiscussion, A] =
    _root_.caliban.client.SelectionBuilder.Field("discussion", Obj(innerSelection))

  /** Color stops of the chosen gradient
    */
  def gradientStopColors: SelectionBuilder[PinnedDiscussion, List[String]] =
    _root_.caliban.client.SelectionBuilder.Field("gradientStopColors", ListOf(Scalar()))
  def id: SelectionBuilder[PinnedDiscussion, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Background texture pattern
    */
  def pattern: SelectionBuilder[PinnedDiscussion, PinnedDiscussionPattern] = _root_.caliban.client.SelectionBuilder.Field("pattern", Scalar())

  /** The actor that pinned this discussion.
    */
  def pinnedBy[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[PinnedDiscussion, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Preconfigured background gradient option
    */
  def preconfiguredGradient: SelectionBuilder[PinnedDiscussion, Option[PinnedDiscussionGradient]] =
    _root_.caliban.client.SelectionBuilder.Field("preconfiguredGradient", OptionOf(Scalar()))

  /** The repository associated with this node.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PinnedDiscussion, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[PinnedDiscussion, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

