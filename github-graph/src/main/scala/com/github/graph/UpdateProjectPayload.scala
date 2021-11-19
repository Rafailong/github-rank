package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateProjectPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateProjectPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated project.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[UpdateProjectPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))
}

