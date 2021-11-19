package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Push {
  def id: SelectionBuilder[Push, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The SHA after the push
    */
  def nextSha: SelectionBuilder[Push, Option[GitObjectID]] = _root_.caliban.client.SelectionBuilder.Field("nextSha", OptionOf(Scalar()))

  /** The permalink for this push.
    */
  def permalink: SelectionBuilder[Push, URI] = _root_.caliban.client.SelectionBuilder.Field("permalink", Scalar())

  /** The SHA before the push
    */
  def previousSha: SelectionBuilder[Push, Option[GitObjectID]] = _root_.caliban.client.SelectionBuilder.Field("previousSha", OptionOf(Scalar()))

  /** The user who pushed
    */
  def pusher[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[Push, A] =
    _root_.caliban.client.SelectionBuilder.Field("pusher", Obj(innerSelection))

  /** The repository that was pushed to
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Push, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))
}

