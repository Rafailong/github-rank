package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ChangeUserStatusPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[ChangeUserStatusPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** Your updated status.
    */
  def status[A](innerSelection: SelectionBuilder[UserStatus, A]): SelectionBuilder[ChangeUserStatusPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("status", OptionOf(Obj(innerSelection)))
}

