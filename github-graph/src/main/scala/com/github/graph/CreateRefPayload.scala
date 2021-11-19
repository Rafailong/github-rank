package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateRefPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateRefPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The newly created ref.
    */
  def ref[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[CreateRefPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("ref", OptionOf(Obj(innerSelection)))
}

