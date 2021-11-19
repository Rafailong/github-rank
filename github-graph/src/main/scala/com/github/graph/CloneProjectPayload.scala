package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CloneProjectPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CloneProjectPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The id of the JobStatus for populating cloned fields.
    */
  def jobStatusId: SelectionBuilder[CloneProjectPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("jobStatusId", OptionOf(Scalar()))

  /** The new cloned project.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[CloneProjectPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))
}

