package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestCommitCommentThread {

  /** The comments that exist in this thread.
    */
  def comments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[CommitCommentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[PullRequestCommitCommentThread, A] = _root_.caliban.client.SelectionBuilder.Field(
    "comments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The commit the comments were made on.
    */
  def commit[A](innerSelection: SelectionBuilder[Commit, A]): SelectionBuilder[PullRequestCommitCommentThread, A] =
    _root_.caliban.client.SelectionBuilder.Field("commit", Obj(innerSelection))
  def id: SelectionBuilder[PullRequestCommitCommentThread, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The file the comments were made on.
    */
  def path: SelectionBuilder[PullRequestCommitCommentThread, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("path", OptionOf(Scalar()))

  /** The position in the diff for the commit that the comment was made on.
    */
  def position: SelectionBuilder[PullRequestCommitCommentThread, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("position", OptionOf(Scalar()))

  /** The pull request this commit comment thread belongs to
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[PullRequestCommitCommentThread, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** The repository associated with this node.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PullRequestCommitCommentThread, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))
}

