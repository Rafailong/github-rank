package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object StatusCheckRollupContextEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[StatusCheckRollupContextEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](
    onCheckRun: SelectionBuilder[CheckRun, A],
    onStatusContext: SelectionBuilder[StatusContext, A]
  ): SelectionBuilder[StatusCheckRollupContextEdge, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("node", OptionOf(ChoiceOf(Map("CheckRun" -> Obj(onCheckRun), "StatusContext" -> Obj(onStatusContext)))))

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onCheckRun: Option[SelectionBuilder[CheckRun, A]]           = None,
    onStatusContext: Option[SelectionBuilder[StatusContext, A]] = None
  ): SelectionBuilder[StatusCheckRollupContextEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "CheckRun"      -> onCheckRun.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "StatusContext" -> onStatusContext.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

