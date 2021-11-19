package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ImportProjectPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[ImportProjectPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new Project!
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[ImportProjectPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))
}

