package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PinIssuePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[PinIssuePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The issue that was pinned
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[PinIssuePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("issue", OptionOf(Obj(innerSelection)))
}

