package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateLabelPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateLabelPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated label.
    */
  def label[A](innerSelection: SelectionBuilder[Label, A]): SelectionBuilder[UpdateLabelPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("label", OptionOf(Obj(innerSelection)))
}

