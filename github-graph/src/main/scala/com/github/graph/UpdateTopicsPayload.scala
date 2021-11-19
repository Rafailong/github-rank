package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateTopicsPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateTopicsPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** Names of the provided topics that are not valid.
    */
  def invalidTopicNames: SelectionBuilder[UpdateTopicsPayload, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("invalidTopicNames", OptionOf(ListOf(Scalar())))

  /** The updated repository.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[UpdateTopicsPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

