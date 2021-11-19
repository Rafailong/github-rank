package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateCheckRunPayload {

  /** The newly created check run.
    */
  def checkRun[A](innerSelection: SelectionBuilder[CheckRun, A]): SelectionBuilder[CreateCheckRunPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("checkRun", OptionOf(Obj(innerSelection)))

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateCheckRunPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))
}

