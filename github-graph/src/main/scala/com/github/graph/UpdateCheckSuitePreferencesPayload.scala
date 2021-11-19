package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateCheckSuitePreferencesPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateCheckSuitePreferencesPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The updated repository.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[UpdateCheckSuitePreferencesPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))
}

