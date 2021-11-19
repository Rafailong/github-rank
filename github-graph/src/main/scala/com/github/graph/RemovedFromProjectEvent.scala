package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RemovedFromProjectEvent {

  /** Identifies the actor who performed the event.
    */
  def actor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[RemovedFromProjectEvent, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def createdAt: SelectionBuilder[RemovedFromProjectEvent, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[RemovedFromProjectEvent, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[RemovedFromProjectEvent, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Project referenced by event.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[RemovedFromProjectEvent, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))

  /** Column name referenced by this project event.
    */
  def projectColumnName: SelectionBuilder[RemovedFromProjectEvent, String] =
    _root_.caliban.client.SelectionBuilder.Field("projectColumnName", Scalar())
}

