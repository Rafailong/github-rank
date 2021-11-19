package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseMemberEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[EnterpriseMemberEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** Whether the user does not have a license for the enterprise.
    */
  @deprecated("All members consume a license Removal on 2021-01-01 UTC.", "")
  def isUnlicensed: SelectionBuilder[EnterpriseMemberEdge, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isUnlicensed", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](
    onEnterpriseUserAccount: SelectionBuilder[EnterpriseUserAccount, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[EnterpriseMemberEdge, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("node", OptionOf(ChoiceOf(Map("EnterpriseUserAccount" -> Obj(onEnterpriseUserAccount), "User" -> Obj(onUser)))))

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[EnterpriseMemberEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "EnterpriseUserAccount" -> onEnterpriseUserAccount.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User"                  -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

