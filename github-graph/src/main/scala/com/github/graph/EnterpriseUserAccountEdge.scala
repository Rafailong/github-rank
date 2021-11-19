package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseUserAccountEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[EnterpriseUserAccountEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[EnterpriseUserAccount, A]): SelectionBuilder[EnterpriseUserAccountEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))
}

