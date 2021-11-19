package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateProjectColumnPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateProjectColumnPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated project column.
    */
  def projectColumn[A](innerSelection: SelectionBuilder[ProjectColumn, A]): SelectionBuilder[UpdateProjectColumnPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("projectColumn", OptionOf(Obj(innerSelection)))
}

