package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateDeploymentPayload {

  /** True if the default branch has been auto-merged into the deployment ref.
    */
  def autoMerged: SelectionBuilder[CreateDeploymentPayload, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("autoMerged", OptionOf(Scalar()))

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateDeploymentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The new deployment.
    */
  def deployment[A](innerSelection: SelectionBuilder[Deployment, A]): SelectionBuilder[CreateDeploymentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("deployment", OptionOf(Obj(innerSelection)))
}

