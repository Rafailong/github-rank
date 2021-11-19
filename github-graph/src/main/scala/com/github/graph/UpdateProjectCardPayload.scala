package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateProjectCardPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateProjectCardPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated ProjectCard.
    */
  def projectCard[A](innerSelection: SelectionBuilder[ProjectCard, A]): SelectionBuilder[UpdateProjectCardPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("projectCard", OptionOf(Obj(innerSelection)))
}

