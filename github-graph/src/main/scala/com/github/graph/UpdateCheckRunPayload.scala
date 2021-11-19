package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateCheckRunPayload {

  /** The updated check run.
    */
  def checkRun[A](innerSelection: SelectionBuilder[CheckRun, A]): SelectionBuilder[UpdateCheckRunPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("checkRun", OptionOf(Obj(innerSelection)))

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateCheckRunPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))
}

