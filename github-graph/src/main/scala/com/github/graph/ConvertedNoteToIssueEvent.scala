package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ConvertedNoteToIssueEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ConvertedNoteToIssueEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[ConvertedNoteToIssueEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ConvertedNoteToIssueEvent, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[ConvertedNoteToIssueEvent, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Project referenced by event.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[ConvertedNoteToIssueEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))

  /** Project card referenced by this project event.
    */
  def projectCard[A](innerSelection: SelectionBuilder[ProjectCard, A]): SelectionBuilder[ConvertedNoteToIssueEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("projectCard", OptionOf(Obj(innerSelection)))

  /** Column name referenced by this project event.
    */
  def projectColumnName: SelectionBuilder[ConvertedNoteToIssueEvent, String] =
    _root_.caliban.client.SelectionBuilder.Field("projectColumnName", Scalar())
}

