package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object FollowUserPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[FollowUserPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The user that was followed.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[FollowUserPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))
}

