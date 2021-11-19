package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TransferIssuePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[TransferIssuePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The issue that was transferred
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[TransferIssuePayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("issue", OptionOf(Obj(innerSelection)))
}

