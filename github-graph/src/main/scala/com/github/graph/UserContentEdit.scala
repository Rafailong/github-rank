package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UserContentEdit {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[UserContentEdit, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the date and time when the object was deleted.
    */
  def deletedAt: SelectionBuilder[UserContentEdit, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("deletedAt", OptionOf(Scalar()))

  /** The actor who deleted this content
    */
  def deletedBy[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[UserContentEdit, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "deletedBy",
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

  /** A summary of the changes for this edit
    */
  def diff: SelectionBuilder[UserContentEdit, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("diff", OptionOf(Scalar()))

  /** When this content was edited
    */
  def editedAt: SelectionBuilder[UserContentEdit, DateTime] = _root_.caliban.client.SelectionBuilder.Field("editedAt", Scalar())

  /** The actor who edited this content
    */
  def editor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[UserContentEdit, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "editor",
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
  def id: SelectionBuilder[UserContentEdit, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[UserContentEdit, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

