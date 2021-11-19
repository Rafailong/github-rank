package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddProjectNextItemPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddProjectNextItemPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The item added to the project.
    */
  def projectNextItem[A](innerSelection: SelectionBuilder[ProjectNextItem, A]): SelectionBuilder[AddProjectNextItemPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("projectNextItem", OptionOf(Obj(innerSelection)))
}

