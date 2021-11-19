package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateProjectPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateProjectPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new project.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[CreateProjectPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))
}

