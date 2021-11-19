package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestChangedFile {

  /** The number of additions to the file.
    */
  def additions: SelectionBuilder[PullRequestChangedFile, Int] = _root_.caliban.client.SelectionBuilder.Field("additions", Scalar())

  /** The number of deletions to the file.
    */
  def deletions: SelectionBuilder[PullRequestChangedFile, Int] = _root_.caliban.client.SelectionBuilder.Field("deletions", Scalar())

  /** The path of the file.
    */
  def path: SelectionBuilder[PullRequestChangedFile, String] = _root_.caliban.client.SelectionBuilder.Field("path", Scalar())

  /** The state of the file for the viewer.
    */
  def viewerViewedState: SelectionBuilder[PullRequestChangedFile, FileViewedState] =
    _root_.caliban.client.SelectionBuilder.Field("viewerViewedState", Scalar())
}

