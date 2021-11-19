package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SavedReply {

  /** The body of the saved reply.
    */
  def body: SelectionBuilder[SavedReply, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The saved reply body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[SavedReply, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[SavedReply, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[SavedReply, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The title of the saved reply.
    */
  def title: SelectionBuilder[SavedReply, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())

  /** The user that saved this reply.
    */
  def user[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[SavedReply, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "user",
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
}

