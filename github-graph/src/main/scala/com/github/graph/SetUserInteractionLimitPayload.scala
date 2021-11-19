package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SetUserInteractionLimitPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[SetUserInteractionLimitPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The user that the interaction limit was set for.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[SetUserInteractionLimitPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))
}

