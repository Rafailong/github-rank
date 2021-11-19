package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateEnvironmentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateEnvironmentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new or existing environment.
    */
  def environment[A](innerSelection: SelectionBuilder[Environment, A]): SelectionBuilder[CreateEnvironmentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("environment", OptionOf(Obj(innerSelection)))
}

