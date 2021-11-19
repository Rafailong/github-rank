package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestReviewThread {

  /** A list of pull request comments associated with the thread.
    */
  def comments[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    skip: Option[Int]      = None
  )(innerSelection: SelectionBuilder[PullRequestReviewCommentConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequestReviewThread, A] = _root_.caliban.client.SelectionBuilder.Field(
    "comments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("skip", skip, "Int")(encoder4)
    )
  )

  /** The side of the diff on which this thread was placed.
    */
  def diffSide: SelectionBuilder[PullRequestReviewThread, DiffSide] = _root_.caliban.client.SelectionBuilder.Field("diffSide", Scalar())
  def id: SelectionBuilder[PullRequestReviewThread, String]         = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether or not the thread has been collapsed (resolved)
    */
  def isCollapsed: SelectionBuilder[PullRequestReviewThread, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isCollapsed", Scalar())

  /** Indicates whether this thread was outdated by newer changes.
    */
  def isOutdated: SelectionBuilder[PullRequestReviewThread, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isOutdated", Scalar())

  /** Whether this thread has been resolved
    */
  def isResolved: SelectionBuilder[PullRequestReviewThread, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isResolved", Scalar())

  /** The line in the file to which this thread refers
    */
  def line: SelectionBuilder[PullRequestReviewThread, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("line", OptionOf(Scalar()))

  /** The original line in the file to which this thread refers.
    */
  def originalLine: SelectionBuilder[PullRequestReviewThread, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("originalLine", OptionOf(Scalar()))

  /** The original start line in the file to which this thread refers (multi-line only).
    */
  def originalStartLine: SelectionBuilder[PullRequestReviewThread, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("originalStartLine", OptionOf(Scalar()))

  /** Identifies the file path of this thread.
    */
  def path: SelectionBuilder[PullRequestReviewThread, String] = _root_.caliban.client.SelectionBuilder.Field("path", Scalar())

  /** Identifies the pull request associated with this thread.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[PullRequestReviewThread, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** Identifies the repository associated with this thread.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PullRequestReviewThread, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The user who resolved this thread
    */
  def resolvedBy[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[PullRequestReviewThread, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("resolvedBy", OptionOf(Obj(innerSelection)))

  /** The side of the diff that the first line of the thread starts on (multi-line only)
    */
  def startDiffSide: SelectionBuilder[PullRequestReviewThread, Option[DiffSide]] =
    _root_.caliban.client.SelectionBuilder.Field("startDiffSide", OptionOf(Scalar()))

  /** The start line in the file to which this thread refers (multi-line only)
    */
  def startLine: SelectionBuilder[PullRequestReviewThread, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("startLine", OptionOf(Scalar()))

  /** Indicates whether the current viewer can reply to this thread.
    */
  def viewerCanReply: SelectionBuilder[PullRequestReviewThread, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReply", Scalar())

  /** Whether or not the viewer can resolve this thread
    */
  def viewerCanResolve: SelectionBuilder[PullRequestReviewThread, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanResolve", Scalar())

  /** Whether or not the viewer can unresolve this thread
    */
  def viewerCanUnresolve: SelectionBuilder[PullRequestReviewThread, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanUnresolve", Scalar())
}

