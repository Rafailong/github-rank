package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestRevisionMarker {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[PullRequestRevisionMarker, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The last commit the viewer has seen.
    */
  def lastSeenCommit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[PullRequestRevisionMarker, A] =
    _root_.caliban.client.SelectionBuilder.Field("lastSeenCommit", Obj(innerSelection))

  /** The pull request to which the marker belongs.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[PullRequestRevisionMarker, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))
}

