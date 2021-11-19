package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object AddStarPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[AddStarPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The starrable.
    */
  def starrable[A](
    onGist: Option[SelectionBuilder[Gist, A]]             = None,
    onRepository: Option[SelectionBuilder[Repository, A]] = None,
    onTopic: Option[SelectionBuilder[Topic, A]]           = None
  ): SelectionBuilder[AddStarPayload, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "starrable",
    OptionOf(ChoiceOf(Map("Gist" -> onGist, "Repository" -> onRepository, "Topic" -> onTopic).collect { case (k, Some(v)) => k -> Obj(v) }))
  )
}

