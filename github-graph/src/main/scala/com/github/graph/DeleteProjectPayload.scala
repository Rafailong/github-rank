package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeleteProjectPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[DeleteProjectPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The repository or organization the project was removed from.
    */
  def owner[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onRepository: Option[SelectionBuilder[Repository, A]]     = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[DeleteProjectPayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "owner",
    OptionOf(ChoiceOf(Map("Organization" -> onOrganization, "Repository" -> onRepository, "User" -> onUser).collect { case (k, Some(v)) =>
      k -> Obj(v)
    }))
  )
}

