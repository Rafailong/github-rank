package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateIssuePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateIssuePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new issue.
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[CreateIssuePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("issue", OptionOf(Obj(innerSelection)))
}

