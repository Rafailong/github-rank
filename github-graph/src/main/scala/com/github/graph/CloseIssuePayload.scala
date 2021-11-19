package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CloseIssuePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CloseIssuePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The issue that was closed.
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[CloseIssuePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("issue", OptionOf(Obj(innerSelection)))
}

