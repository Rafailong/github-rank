package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Ref {

  /** A list of pull requests with this ref as the head ref.
    */
  def associatedPullRequests[A](
    after: Option[String]                  = None,
    baseRefName: Option[String]            = None,
    before: Option[String]                 = None,
    first: Option[Int]                     = None,
    headRefName: Option[String]            = None,
    labels: Option[List[String]]           = None,
    last: Option[Int]                      = None,
    orderBy: Option[IssueOrder]            = None,
    states: Option[List[PullRequestState]] = None
  )(innerSelection: SelectionBuilder[PullRequestConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[String]],
    encoder5: ArgEncoder[Option[List[String]]],
    encoder6: ArgEncoder[Option[Int]],
    encoder7: ArgEncoder[Option[IssueOrder]],
    encoder8: ArgEncoder[Option[List[PullRequestState]]]
  ): SelectionBuilder[Ref, A] = _root_.caliban.client.SelectionBuilder.Field(
    "associatedPullRequests",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("baseRefName", baseRefName, "String")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("headRefName", headRefName, "String")(encoder4),
      Argument("labels", labels, "[String!]")(encoder5),
      Argument("last", last, "Int")(encoder6),
      Argument("orderBy", orderBy, "IssueOrder")(encoder7),
      Argument("states", states, "[PullRequestState!]")(encoder8)
    )
  )

  /** Branch protection rules for this ref
    */
  def branchProtectionRule[A](innerSelection: SelectionBuilder[BranchProtectionRule, A]): SelectionBuilder[Ref, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("branchProtectionRule", OptionOf(Obj(innerSelection)))
  def id: SelectionBuilder[Ref, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The ref name.
    */
  def name: SelectionBuilder[Ref, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The ref's prefix, such as `refs/heads/` or `refs/tags/`.
    */
  def prefix: SelectionBuilder[Ref, String] = _root_.caliban.client.SelectionBuilder.Field("prefix", Scalar())

  /** Branch protection rules that are viewable by non-admins
    */
  def refUpdateRule[A](innerSelection: SelectionBuilder[RefUpdateRule, A]): SelectionBuilder[Ref, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("refUpdateRule", OptionOf(Obj(innerSelection)))

  /** The repository the ref belongs to.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Ref, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The object the ref points to. Returns null when object does not exist.
    */
  def target[A](
    onBlob: Option[SelectionBuilder[Blob, A]]     = None,
    onCommit: Option[SelectionBuilder[Commit, A]] = None,
    onTag: Option[SelectionBuilder[Tag, A]]       = None,
    onTree: Option[SelectionBuilder[Tree, A]]     = None
  ): SelectionBuilder[Ref, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "target",
    OptionOf(ChoiceOf(Map("Blob" -> onBlob, "Commit" -> onCommit, "Tag" -> onTag, "Tree" -> onTree).collect { case (k, Some(v)) => k -> Obj(v) }))
  )
}

