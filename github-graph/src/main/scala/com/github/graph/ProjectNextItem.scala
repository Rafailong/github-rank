package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProjectNextItem {

  /** The content of the referenced issue or pull request
    */
  def content[A](onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A]): SelectionBuilder[ProjectNextItem, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("content", OptionOf(ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest)))))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ProjectNextItem, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The actor who created the item.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[ProjectNextItem, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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
  def databaseId: SelectionBuilder[ProjectNextItem, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** List of field values
    */
  def fieldValues[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ProjectNextItemFieldValueConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ProjectNextItem, A] = _root_.caliban.client.SelectionBuilder.Field(
    "fieldValues",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )
  def id: SelectionBuilder[ProjectNextItem, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The project that contains this item.
    */
  def project[A](innerSelection: SelectionBuilder[ProjectNext, A]): SelectionBuilder[ProjectNextItem, A] =
    _root_.caliban.client.SelectionBuilder.Field("project", Obj(innerSelection))

  /** The title of the item
    */
  def title: SelectionBuilder[ProjectNextItem, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("title", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[ProjectNextItem, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The content of the referenced issue or pull request
    */
  def contentOption[A](
    onIssue: Option[SelectionBuilder[Issue, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None
  ): SelectionBuilder[ProjectNextItem, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
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

