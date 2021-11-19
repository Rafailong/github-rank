package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteProjectCardPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteProjectCardPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The column the deleted card was in.
    */
  def column[A](innerSelection: SelectionBuilder[ProjectColumn, A]): SelectionBuilder[DeleteProjectCardPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("column", OptionOf(Obj(innerSelection)))

  /** The deleted card ID.
    */
  def deletedCardId: SelectionBuilder[DeleteProjectCardPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("deletedCardId", OptionOf(Scalar()))
}

