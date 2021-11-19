package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateDeploymentStatusPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateDeploymentStatusPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new deployment status.
    */
  def deploymentStatus[A](innerSelection: SelectionBuilder[DeploymentStatus, A]): SelectionBuilder[CreateDeploymentStatusPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("deploymentStatus", OptionOf(Obj(innerSelection)))
}

