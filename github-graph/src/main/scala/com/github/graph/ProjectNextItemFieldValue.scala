package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProjectNextItemFieldValue {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ProjectNextItemFieldValue, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The actor who created the item.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ProjectNextItemFieldValue, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def databaseId: SelectionBuilder[ProjectNextItemFieldValue, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[ProjectNextItemFieldValue, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The project field that contains this value.
    */
  def projectField[A](innerSelection: SelectionBuilder[ProjectNextField, A]): SelectionBuilder[ProjectNextItemFieldValue, A] =
    _root_.caliban.client.SelectionBuilder.Field("projectField", Obj(innerSelection))

  /** The project item that contains this value.
    */
  def projectItem[A](innerSelection: SelectionBuilder[ProjectNextItem, A]): SelectionBuilder[ProjectNextItemFieldValue, A] =
    _root_.caliban.client.SelectionBuilder.Field("projectItem", Obj(innerSelection))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[ProjectNextItemFieldValue, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The value of a field
    */
  def value: SelectionBuilder[ProjectNextItemFieldValue, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("value", OptionOf(Scalar()))
}

