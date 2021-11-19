package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateProjectNextItemFieldPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateProjectNextItemFieldPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated item.
    */
  def projectNextItem[A](innerSelection: SelectionBuilder[ProjectNextItem, A]): SelectionBuilder[UpdateProjectNextItemFieldPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("projectNextItem", OptionOf(Obj(innerSelection)))
}

