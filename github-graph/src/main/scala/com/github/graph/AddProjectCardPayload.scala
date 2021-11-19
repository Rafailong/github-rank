package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddProjectCardPayload {

  /** The edge from the ProjectColumn's card connection.
    */
  def cardEdge[A](innerSelection: SelectionBuilder[ProjectCardEdge, A]): SelectionBuilder[AddProjectCardPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("cardEdge", OptionOf(Obj(innerSelection)))

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddProjectCardPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The ProjectColumn
    */
  def projectColumn[A](innerSelection: SelectionBuilder[ProjectColumn, A]): SelectionBuilder[AddProjectCardPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("projectColumn", OptionOf(Obj(innerSelection)))
}

