package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnvironmentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnvironmentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated environment.
    */
  def environment[A](innerSelection: SelectionBuilder[Environment, A]): SelectionBuilder[UpdateEnvironmentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("environment", OptionOf(Obj(innerSelection)))
}

