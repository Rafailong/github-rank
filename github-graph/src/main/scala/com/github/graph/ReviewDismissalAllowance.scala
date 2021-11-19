package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReviewDismissalAllowance {

  /** The actor that can dismiss.
    */
  def actor[A](onTeam: SelectionBuilder[Team, A], onUser: SelectionBuilder[User, A]): SelectionBuilder[ReviewDismissalAllowance, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("actor", OptionOf(ChoiceOf(Map("Team" -> Obj(onTeam), "User" -> Obj(onUser)))))

  /** Identifies the branch protection rule associated with the allowed user or team.
    */
  def branchProtectionRule[A](innerSelection: SelectionBuilder[BranchProtectionRule, A]): SelectionBuilder[ReviewDismissalAllowance, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("branchProtectionRule", OptionOf(Obj(innerSelection)))
  def id: SelectionBuilder[ReviewDismissalAllowance, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The actor that can dismiss.
    */
  def actorOption[A](
    onTeam: Option[SelectionBuilder[Team, A]] = None,
    onUser: Option[SelectionBuilder[User, A]] = None
  ): SelectionBuilder[ReviewDismissalAllowance, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "actor",
    OptionOf(
      ChoiceOf(
        Map(
          "Team" -> onTeam.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User" -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

