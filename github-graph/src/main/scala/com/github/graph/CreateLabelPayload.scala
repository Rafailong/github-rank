package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateLabelPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateLabelPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new label.
    */
  def label[A](innerSelection: SelectionBuilder[Label, A]): SelectionBuilder[CreateLabelPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("label", OptionOf(Obj(innerSelection)))
}

