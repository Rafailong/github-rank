package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseServerUserAccountEmailEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[EnterpriseServerUserAccountEmailEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](
    innerSelection: SelectionBuilder[EnterpriseServerUserAccountEmail, A]
  ): SelectionBuilder[EnterpriseServerUserAccountEmailEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))
}

