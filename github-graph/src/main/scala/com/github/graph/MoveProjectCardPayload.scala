package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MoveProjectCardPayload {

  /** The new edge of the moved card.
    */
  def cardEdge[A](innerSelection: SelectionBuilder[ProjectCardEdge, A]): SelectionBuilder[MoveProjectCardPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("cardEdge", OptionOf(Obj(innerSelection)))

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[MoveProjectCardPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))
}

