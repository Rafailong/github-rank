package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UnlinkRepositoryFromProjectPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UnlinkRepositoryFromProjectPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The linked Project.
    */
  def project[A](innerSelection: SelectionBuilder[Project, A]): SelectionBuilder[UnlinkRepositoryFromProjectPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("project", OptionOf(Obj(innerSelection)))

  /** The linked Repository.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[UnlinkRepositoryFromProjectPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

