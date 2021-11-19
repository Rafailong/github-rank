package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RemoveOutsideCollaboratorPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RemoveOutsideCollaboratorPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The user that was removed as an outside collaborator.
    */
  def removedUser[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[RemoveOutsideCollaboratorPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("removedUser", OptionOf(Obj(innerSelection)))
}

