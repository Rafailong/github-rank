package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RejectDeploymentsPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RejectDeploymentsPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The affected deployments.
    */
  def deployments[A](innerSelection: SelectionBuilder[Deployment, A]): SelectionBuilder[RejectDeploymentsPayload, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("deployments", OptionOf(ListOf(Obj(innerSelection))))
}

