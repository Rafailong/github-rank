package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteProjectColumnPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteProjectColumnPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The deleted column ID.
    */
  def deletedColumnId: SelectionBuilder[DeleteProjectColumnPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("deletedColumnId", OptionOf(Scalar()))

  /** The project the deleted column was in.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[DeleteProjectColumnPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))
}

