package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProjectCard {

  /** The project column this card is associated under. A card may only belong to one
    * project column at a time. The column field will be null if the card is created
    * in a pending state and has yet to be associated with a column. Once cards are
    * associated with a column, they will not become pending in the future.
    */
  def column[A](innerSelection: SelectionBuilder[ProjectColumn, A]): SelectionBuilder[ProjectCard, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("column", OptionOf(Obj(innerSelection)))

  /** The card content item
    */
  def content[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[ProjectCard, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("content", OptionOf(ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest)))))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ProjectCard, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The actor who created this card
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ProjectCard, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "creator",
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

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ProjectCard, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[ProjectCard, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether the card is archived
    */
  def isArchived: SelectionBuilder[ProjectCard, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isArchived", Scalar())

  /** The card note
    */
  def note: SelectionBuilder[ProjectCard, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("note", OptionOf(Scalar()))

  /** The project that contains this card.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[ProjectCard, A] =
    _root_.caliban.client.SelectionBuilder.Field("project", Obj(innerSelection))

  /** The HTTP path for this card
    */
  def resourcePath: SelectionBuilder[ProjectCard, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The state of ProjectCard
    */
  def state: SelectionBuilder[ProjectCard, Option[ProjectCardState]] = _root_.caliban.client.SelectionBuilder.Field("state", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[ProjectCard, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this card
    */
  def url: SelectionBuilder[ProjectCard, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** The card content item
    */
  def contentOption[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[ProjectCard, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "content",
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

