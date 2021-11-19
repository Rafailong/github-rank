package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object StatusContext {

  /** The avatar of the OAuth application or the user that created the status
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[StatusContext, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", OptionOf(Scalar()), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** This commit this status context is attached to.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[StatusContext, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("commit", OptionOf(Obj(innerSelection)))

  /** The name of this status context.
    */
  def context: SelectionBuilder[StatusContext, String] = _root_.caliban.client.SelectionBuilder.Field("context", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[StatusContext, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The actor who created this status context.
    */
  def creator[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[StatusContext, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The description for this status context.
    */
  def description: SelectionBuilder[StatusContext, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))
  def id: SelectionBuilder[StatusContext, String]                  = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether this is required to pass before merging for a specific pull request.
    */
  def isRequired(pullRequestId: Option[String] = None, pullRequestNumber: Option[Int] = None)(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[Int]]
  ): SelectionBuilder[StatusContext, Boolean] = _root_.caliban.client.SelectionBuilder.Field(
    "isRequired",
    Scalar(),
    arguments = List(Argument("pullRequestId", pullRequestId, "ID")(encoder0), Argument("pullRequestNumber", pullRequestNumber, "Int")(encoder1))
  )

  /** The state of this status context.
    */
  def state: SelectionBuilder[StatusContext, StatusState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** The URL for this status context.
    */
  def targetUrl: SelectionBuilder[StatusContext, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("targetUrl", OptionOf(Scalar()))
}

