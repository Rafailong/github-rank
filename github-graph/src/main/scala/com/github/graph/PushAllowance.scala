package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PushAllowance {

  /** The actor that can push.
    */
  def actor[A](
    onApp: SelectionBuilder[App, A],
    onTeam: SelectionBuilder[Team, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[PushAllowance, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("actor", OptionOf(ChoiceOf(Map("App" -> Obj(onApp), "Team" -> Obj(onTeam), "User" -> Obj(onUser)))))

  /** Identifies the branch protection rule associated with the allowed user or team.
    */
  def branchProtectionRule[A](innerSelection: SelectionBuilder[BranchProtectionRule, A]): SelectionBuilder[PushAllowance, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("branchProtectionRule", OptionOf(Obj(innerSelection)))
  def id: SelectionBuilder[PushAllowance, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The actor that can push.
    */
  def actorOption[A](
    onApp: Option[SelectionBuilder[App, A]]   = None,
    onTeam: Option[SelectionBuilder[Team, A]] = None,
    onUser: Option[SelectionBuilder[User, A]] = None
  ): SelectionBuilder[PushAllowance, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "actor",
    OptionOf(
      ChoiceOf(
        Map(
          "App"  -> onApp.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Team" -> onTeam.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User" -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

