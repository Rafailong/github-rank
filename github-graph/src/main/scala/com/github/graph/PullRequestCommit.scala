package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestCommit {

  /** The Git commit object
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[PullRequestCommit, A] =
    _root_.caliban.client.SelectionBuilder.Field("commit", Obj(innerSelection))
  def id: SelectionBuilder[PullRequestCommit, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The pull request this commit belongs to
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[PullRequestCommit, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** The HTTP path for this pull request commit
    */
  def resourcePath: SelectionBuilder[PullRequestCommit, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP URL for this pull request commit
    */
  def url: SelectionBuilder[PullRequestCommit, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

