package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MoveProjectColumnPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[MoveProjectColumnPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new edge of the moved column.
    */
  def columnEdge[A](innerSelection: SelectionBuilder[ProjectColumnEdge, A]): SelectionBuilder[MoveProjectColumnPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("columnEdge", OptionOf(Obj(innerSelection)))
}

