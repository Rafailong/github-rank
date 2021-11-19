package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RepositoryInteractionAbility {

  /** The time the currently active limit expires.
    */
  def expiresAt: SelectionBuilder[RepositoryInteractionAbility, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("expiresAt", OptionOf(Scalar()))

  /** The current limit that is enabled on this object.
    */
  def limit: SelectionBuilder[RepositoryInteractionAbility, RepositoryInteractionLimit] =
    _root_.caliban.client.SelectionBuilder.Field("limit", Scalar())

  /** The origin of the currently active interaction limit.
    */
  def origin: SelectionBuilder[RepositoryInteractionAbility, RepositoryInteractionLimitOrigin] =
    _root_.caliban.client.SelectionBuilder.Field("origin", Scalar())
}

