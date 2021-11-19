package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddProjectColumnPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddProjectColumnPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The edge from the project's column connection.
    */
  def columnEdge[A](innerSelection: SelectionBuilder[ProjectColumnEdge, A]): SelectionBuilder[AddProjectColumnPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("columnEdge", OptionOf(Obj(innerSelection)))

  /** The project
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[AddProjectColumnPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))
}

