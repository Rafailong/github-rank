package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReopenIssuePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[ReopenIssuePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The issue that was opened.
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[ReopenIssuePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("issue", OptionOf(Obj(innerSelection)))
}

