package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UnfollowUserPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UnfollowUserPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The user that was unfollowed.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[UnfollowUserPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))
}

