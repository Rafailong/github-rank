package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Commit {

  /** An abbreviated version of the Git object ID
    */
  def abbreviatedOid: SelectionBuilder[Commit, String] = _root_.caliban.client.SelectionBuilder.Field("abbreviatedOid", Scalar())

  /** The number of additions in this commit.
    */
  def additions: SelectionBuilder[Commit, Int] = _root_.caliban.client.SelectionBuilder.Field("additions", Scalar())

  /** The merged Pull Request that introduced the commit to the repository. If the
    * commit is not present in the default branch, additionally returns open Pull
    * Requests associated with the commit
    */
  def associatedPullRequests[A](
    after: Option[String]             = None,
    before: Option[String]            = None,
    first: Option[Int]                = None,
    last: Option[Int]                 = None,
    orderBy: Option[PullRequestOrder] = None
  )(innerSelection: SelectionBuilder[PullRequestConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[PullRequestOrder]]
  ): SelectionBuilder[Commit, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "associatedPullRequests",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "PullRequestOrder")(encoder4)
    )
  )

  /** Authorship details of the commit.
    */
  def author[A](innerSelection: SelectionBuilder[GitActor, A]): SelectionBuilder[Commit, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("author", OptionOf(Obj(innerSelection)))

  /** Check if the committer and the author match.
    */
  def authoredByCommitter: SelectionBuilder[Commit, Boolean] = _root_.caliban.client.SelectionBuilder.Field("authoredByCommitter", Scalar())

  /** The datetime when this commit was authored.
    */
  def authoredDate: SelectionBuilder[Commit, DateTime] = _root_.caliban.client.SelectionBuilder.Field("authoredDate", Scalar())

  /** The list of authors for this commit based on the git author and the Co-authored-by
    * message trailer. The git author will always be first.
    */
  def authors[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[GitActorConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Commit, A] = _root_.caliban.client.SelectionBuilder.Field(
    "authors",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Fetches `git blame` information.
    */
  def blame[A](path: String)(innerSelection: SelectionBuilder[Blame, A])(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Commit, A] =
    _root_.caliban.client.SelectionBuilder.Field("blame", Obj(innerSelection), arguments = List(Argument("path", path, "String!")(encoder0)))

  /** The number of changed files in this commit.
    */
  def changedFiles: SelectionBuilder[Commit, Int] = _root_.caliban.client.SelectionBuilder.Field("changedFiles", Scalar())

  /** The check suites associated with a commit.
    */
  def checkSuites[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    filterBy: Option[CheckSuiteFilter] = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None
  )(innerSelection: SelectionBuilder[CheckSuiteConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[CheckSuiteFilter]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Commit, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "checkSuites",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("filterBy", filterBy, "CheckSuiteFilter")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4)
    )
  )

  /** Comments made on the commit.
    */
  def comments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[CommitCommentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Commit, A] = _root_.caliban.client.SelectionBuilder.Field(
    "comments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The HTTP path for this Git object
    */
  def commitResourcePath: SelectionBuilder[Commit, URI] = _root_.caliban.client.SelectionBuilder.Field("commitResourcePath", Scalar())

  /** The HTTP URL for this Git object
    */
  def commitUrl: SelectionBuilder[Commit, URI] = _root_.caliban.client.SelectionBuilder.Field("commitUrl", Scalar())

  /** The datetime when this commit was committed.
    */
  def committedDate: SelectionBuilder[Commit, DateTime] = _root_.caliban.client.SelectionBuilder.Field("committedDate", Scalar())

  /** Check if committed via GitHub web UI.
    */
  def committedViaWeb: SelectionBuilder[Commit, Boolean] = _root_.caliban.client.SelectionBuilder.Field("committedViaWeb", Scalar())

  /** Committer details of the commit.
    */
  def committer[A](innerSelection: SelectionBuilder[GitActor, A]): SelectionBuilder[Commit, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("committer", OptionOf(Obj(innerSelection)))

  /** The number of deletions in this commit.
    */
  def deletions: SelectionBuilder[Commit, Int] = _root_.caliban.client.SelectionBuilder.Field("deletions", Scalar())

  /** The deployments associated with a commit.
    */
  def deployments[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    environments: Option[List[String]] = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[DeploymentOrder]   = None
  )(innerSelection: SelectionBuilder[DeploymentConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[List[String]]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[DeploymentOrder]]
  ): SelectionBuilder[Commit, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "deployments",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("environments", environments, "[String!]")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "DeploymentOrder")(encoder5)
    )
  )

  /** The tree entry representing the file located at the given path.
    */
  def file[A](
    path: String
  )(innerSelection: SelectionBuilder[TreeEntry, A])(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Commit, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("file", OptionOf(Obj(innerSelection)), arguments = List(Argument("path", path, "String!")(encoder0)))

  /** The linear commit history starting from (and including) this commit, in the same order as `git log`.
    */
  def history[A](
    after: Option[String]        = None,
    author: Option[CommitAuthor] = None,
    before: Option[String]       = None,
    first: Option[Int]           = None,
    last: Option[Int]            = None,
    path: Option[String]         = None,
    since: Option[GitTimestamp]  = None,
    until: Option[GitTimestamp]  = None
  )(innerSelection: SelectionBuilder[CommitHistoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[CommitAuthor]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[String]],
    encoder6: ArgEncoder[Option[GitTimestamp]],
    encoder7: ArgEncoder[Option[GitTimestamp]]
  ): SelectionBuilder[Commit, A] = _root_.caliban.client.SelectionBuilder.Field(
    "history",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("author", author, "CommitAuthor")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("path", path, "String")(encoder5),
      Argument("since", since, "GitTimestamp")(encoder6),
      Argument("until", until, "GitTimestamp")(encoder7)
    )
  )
  def id: SelectionBuilder[Commit, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The Git commit message
    */
  def message: SelectionBuilder[Commit, String] = _root_.caliban.client.SelectionBuilder.Field("message", Scalar())

  /** The Git commit message body
    */
  def messageBody: SelectionBuilder[Commit, String] = _root_.caliban.client.SelectionBuilder.Field("messageBody", Scalar())

  /** The commit message body rendered to HTML.
    */
  def messageBodyHTML: SelectionBuilder[Commit, HTML] = _root_.caliban.client.SelectionBuilder.Field("messageBodyHTML", Scalar())

  /** The Git commit message headline
    */
  def messageHeadline: SelectionBuilder[Commit, String] = _root_.caliban.client.SelectionBuilder.Field("messageHeadline", Scalar())

  /** The commit message headline rendered to HTML.
    */
  def messageHeadlineHTML: SelectionBuilder[Commit, HTML] = _root_.caliban.client.SelectionBuilder.Field("messageHeadlineHTML", Scalar())

  /** The Git object ID
    */
  def oid: SelectionBuilder[Commit, GitObjectID] = _root_.caliban.client.SelectionBuilder.Field("oid", Scalar())

  /** The organization this commit was made on behalf of.
    */
  def onBehalfOf[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[Commit, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("onBehalfOf", OptionOf(Obj(innerSelection)))

  /** The parents of a commit.
    */
  def parents[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[CommitConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Commit, A] = _root_.caliban.client.SelectionBuilder.Field(
    "parents",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The datetime when this commit was pushed.
    */
  def pushedDate: SelectionBuilder[Commit, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("pushedDate", OptionOf(Scalar()))

  /** The Repository this commit belongs to
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Commit, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this commit
    */
  def resourcePath: SelectionBuilder[Commit, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Commit signing information, if present.
    */
  def signature[A](
    onGpgSignature: Option[SelectionBuilder[GpgSignature, A]]         = None,
    onSmimeSignature: Option[SelectionBuilder[SmimeSignature, A]]     = None,
    onUnknownSignature: Option[SelectionBuilder[UnknownSignature, A]] = None
  ): SelectionBuilder[Commit, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "signature",
    OptionOf(ChoiceOf(Map("GpgSignature" -> onGpgSignature, "SmimeSignature" -> onSmimeSignature, "UnknownSignature" -> onUnknownSignature).collect {
      case (k, Some(v)) => k -> Obj(v)
    }))
  )

  /** Status information for this commit
    */
  def status[A](innerSelection: SelectionBuilder[Status, A]): SelectionBuilder[Commit, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("status", OptionOf(Obj(innerSelection)))

  /** Check and Status rollup information for this commit.
    */
  def statusCheckRollup[A](innerSelection: SelectionBuilder[StatusCheckRollup, A]): SelectionBuilder[Commit, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("statusCheckRollup", OptionOf(Obj(innerSelection)))

  /** Returns a list of all submodules in this repository as of this Commit parsed from the .gitmodules file.
    */
  def submodules[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[SubmoduleConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Commit, A] = _root_.caliban.client.SelectionBuilder.Field(
    "submodules",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Returns a URL to download a tarball archive for a repository.
    * Note: For private repositories, these links are temporary and expire after five minutes.
    */
  def tarballUrl: SelectionBuilder[Commit, URI] = _root_.caliban.client.SelectionBuilder.Field("tarballUrl", Scalar())

  /** Commit's root Tree
    */
  def tree[A](innerSelection: SelectionBuilder[Tree, A]): SelectionBuilder[Commit, A] =
    _root_.caliban.client.SelectionBuilder.Field("tree", Obj(innerSelection))

  /** The HTTP path for the tree of this commit
    */
  def treeResourcePath: SelectionBuilder[Commit, URI] = _root_.caliban.client.SelectionBuilder.Field("treeResourcePath", Scalar())

  /** The HTTP URL for the tree of this commit
    */
  def treeUrl: SelectionBuilder[Commit, URI] = _root_.caliban.client.SelectionBuilder.Field("treeUrl", Scalar())

  /** The HTTP URL for this commit
    */
  def url: SelectionBuilder[Commit, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Check if the viewer is able to change their subscription status for the repository.
    */
  def viewerCanSubscribe: SelectionBuilder[Commit, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSubscribe", Scalar())

  /** Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.
    */
  def viewerSubscription: SelectionBuilder[Commit, Option[SubscriptionState]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerSubscription", OptionOf(Scalar()))

  /** Returns a URL to download a zipball archive for a repository.
    * Note: For private repositories, these links are temporary and expire after five minutes.
    */
  def zipballUrl: SelectionBuilder[Commit, URI] = _root_.caliban.client.SelectionBuilder.Field("zipballUrl", Scalar())
}

