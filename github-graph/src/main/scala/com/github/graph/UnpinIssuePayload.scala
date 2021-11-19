package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UnpinIssuePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UnpinIssuePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The issue that was unpinned
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[UnpinIssuePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("issue", OptionOf(Obj(innerSelection)))
}

