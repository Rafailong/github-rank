package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReviewRequest {

  /** Whether this request was created for a code owner
    */
  def asCodeOwner: SelectionBuilder[ReviewRequest, Boolean] = _root_.caliban.client.SelectionBuilder.Field("asCodeOwner", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ReviewRequest, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[ReviewRequest, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the pull request associated with this review request.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[ReviewRequest, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** The reviewer that is requested.
    */
  def requestedReviewer[A](
    onMannequin: SelectionBuilder[Mannequin, A],
    onTeam: SelectionBuilder[Team, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[ReviewRequest, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("requestedReviewer", OptionOf(ChoiceOf(Map("Mannequin" -> Obj(onMannequin), "Team" -> Obj(onTeam), "User" -> Obj(onUser)))))

  /** The reviewer that is requested.
    */
  def requestedReviewerOption[A](
    onMannequin: Option[SelectionBuilder[Mannequin, A]] = None,
    onTeam: Option[SelectionBuilder[Team, A]]           = None,
    onUser: Option[SelectionBuilder[User, A]]           = None
  ): SelectionBuilder[ReviewRequest, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "requestedReviewer",
    OptionOf(
      ChoiceOf(
        Map(
          "Mannequin" -> onMannequin.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Team"      -> onTeam.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User"      -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

