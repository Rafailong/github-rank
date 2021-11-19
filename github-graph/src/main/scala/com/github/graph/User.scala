package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object User {

  /** Determine if this repository owner has any items that can be pinned to their profile.
    */
  def anyPinnableItems(
    `type`: Option[PinnableItemType] = None
  )(implicit encoder0: ArgEncoder[Option[PinnableItemType]]): SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder
    .Field("anyPinnableItems", Scalar(), arguments = List(Argument("type", `type`, "PinnableItemType")(encoder0)))

  /** A URL pointing to the user's public avatar.
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[User, URI] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", Scalar(), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** The user's public profile bio.
    */
  def bio: SelectionBuilder[User, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("bio", OptionOf(Scalar()))

  /** The user's public profile bio as HTML.
    */
  def bioHTML: SelectionBuilder[User, HTML] = _root_.caliban.client.SelectionBuilder.Field("bioHTML", Scalar())

  /** Could this user receive email notifications, if the organization had notification restrictions enabled?
    */
  def canReceiveOrganizationEmailsWhenNotificationsRestricted(login: String)(implicit encoder0: ArgEncoder[String]): SelectionBuilder[User, Boolean] =
    _root_.caliban.client.SelectionBuilder
      .Field("canReceiveOrganizationEmailsWhenNotificationsRestricted", Scalar(), arguments = List(Argument("login", login, "String!")(encoder0)))

  /** A list of commit comments made by this user.
    */
  def commitComments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[CommitCommentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "commitComments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The user's public profile company.
    */
  def company: SelectionBuilder[User, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("company", OptionOf(Scalar()))

  /** The user's public profile company as HTML.
    */
  def companyHTML: SelectionBuilder[User, HTML] = _root_.caliban.client.SelectionBuilder.Field("companyHTML", Scalar())

  /** The collection of contributions this user has made to different repositories.
    */
  def contributionsCollection[A](from: Option[DateTime] = None, organizationID: Option[String] = None, to: Option[DateTime] = None)(
    innerSelection: SelectionBuilder[ContributionsCollection, A]
  )(implicit
    encoder0: ArgEncoder[Option[DateTime]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[DateTime]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "contributionsCollection",
    Obj(innerSelection),
    arguments = List(
      Argument("from", from, "DateTime")(encoder0),
      Argument("organizationID", organizationID, "ID")(encoder1),
      Argument("to", to, "DateTime")(encoder2)
    )
  )

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[User, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[User, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The user's publicly visible profile email.
    */
  def email: SelectionBuilder[User, String] = _root_.caliban.client.SelectionBuilder.Field("email", Scalar())

  /** The estimated next GitHub Sponsors payout for this user/organization in cents (USD).
    */
  def estimatedNextSponsorsPayoutInCents: SelectionBuilder[User, Int] =
    _root_.caliban.client.SelectionBuilder.Field("estimatedNextSponsorsPayoutInCents", Scalar())

  /** A list of users the given user is followed by.
    */
  def followers[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[FollowerConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "followers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A list of users the given user is following.
    */
  def following[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[FollowingConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "following",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Find gist by repo name.
    */
  def gist[A](name: String)(innerSelection: SelectionBuilder[Gist, A])(implicit encoder0: ArgEncoder[String]): SelectionBuilder[User, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("gist", OptionOf(Obj(innerSelection)), arguments = List(Argument("name", name, "String!")(encoder0)))

  /** A list of gist comments made by this user.
    */
  def gistComments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[GistCommentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "gistComments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A list of the Gists the user has created.
    */
  def gists[A](
    after: Option[String]        = None,
    before: Option[String]       = None,
    first: Option[Int]           = None,
    last: Option[Int]            = None,
    orderBy: Option[GistOrder]   = None,
    privacy: Option[GistPrivacy] = None
  )(innerSelection: SelectionBuilder[GistConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[GistOrder]],
    encoder5: ArgEncoder[Option[GistPrivacy]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "gists",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "GistOrder")(encoder4),
      Argument("privacy", privacy, "GistPrivacy")(encoder5)
    )
  )

  /** True if this user/organization has a GitHub Sponsors listing.
    */
  def hasSponsorsListing: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasSponsorsListing", Scalar())

  /** The hovercard information for this user in a given context
    */
  def hovercard[A](primarySubjectId: Option[String] = None)(
    innerSelection: SelectionBuilder[Hovercard, A]
  )(implicit encoder0: ArgEncoder[Option[String]]): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder
    .Field("hovercard", Obj(innerSelection), arguments = List(Argument("primarySubjectId", primarySubjectId, "ID")(encoder0)))
  def id: SelectionBuilder[User, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The interaction ability settings for this user.
    */
  def interactionAbility[A](innerSelection: SelectionBuilder[RepositoryInteractionAbility, A]): SelectionBuilder[User, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("interactionAbility", OptionOf(Obj(innerSelection)))

  /** Whether or not this user is a participant in the GitHub Security Bug Bounty.
    */
  def isBountyHunter: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isBountyHunter", Scalar())

  /** Whether or not this user is a participant in the GitHub Campus Experts Program.
    */
  def isCampusExpert: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isCampusExpert", Scalar())

  /** Whether or not this user is a GitHub Developer Program member.
    */
  def isDeveloperProgramMember: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isDeveloperProgramMember", Scalar())

  /** Whether or not this user is a GitHub employee.
    */
  def isEmployee: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isEmployee", Scalar())

  /** Whether or not this user is following the viewer. Inverse of viewer_is_following
    */
  def isFollowingViewer: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isFollowingViewer", Scalar())

  /** Whether or not this user is a member of the GitHub Stars Program.
    */
  def isGitHubStar: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isGitHubStar", Scalar())

  /** Whether or not the user has marked themselves as for hire.
    */
  def isHireable: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isHireable", Scalar())

  /** Whether or not this user is a site administrator.
    */
  def isSiteAdmin: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isSiteAdmin", Scalar())

  /** Check if the given account is sponsoring this user/organization.
    */
  def isSponsoredBy(accountLogin: String)(implicit encoder0: ArgEncoder[String]): SelectionBuilder[User, Boolean] =
    _root_.caliban.client.SelectionBuilder
      .Field("isSponsoredBy", Scalar(), arguments = List(Argument("accountLogin", accountLogin, "String!")(encoder0)))

  /** True if the viewer is sponsored by this user/organization.
    */
  def isSponsoringViewer: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isSponsoringViewer", Scalar())

  /** Whether or not this user is the viewing user.
    */
  def isViewer: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isViewer", Scalar())

  /** A list of issue comments made by this user.
    */
  def issueComments[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[IssueCommentOrder] = None
  )(innerSelection: SelectionBuilder[IssueCommentConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[IssueCommentOrder]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "issueComments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "IssueCommentOrder")(encoder4)
    )
  )

  /** A list of issues associated with this user.
    */
  def issues[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    filterBy: Option[IssueFilters]   = None,
    first: Option[Int]               = None,
    labels: Option[List[String]]     = None,
    last: Option[Int]                = None,
    orderBy: Option[IssueOrder]      = None,
    states: Option[List[IssueState]] = None
  )(innerSelection: SelectionBuilder[IssueConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[IssueFilters]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[List[String]]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[IssueOrder]],
    encoder7: ArgEncoder[Option[List[IssueState]]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "issues",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("filterBy", filterBy, "IssueFilters")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("labels", labels, "[String!]")(encoder4),
      Argument("last", last, "Int")(encoder5),
      Argument("orderBy", orderBy, "IssueOrder")(encoder6),
      Argument("states", states, "[IssueState!]")(encoder7)
    )
  )

  /** Showcases a selection of repositories and gists that the profile owner has
    * either curated or that have been selected automatically based on popularity.
    */
  def itemShowcase[A](innerSelection: SelectionBuilder[ProfileItemShowcase, A]): SelectionBuilder[User, A] =
    _root_.caliban.client.SelectionBuilder.Field("itemShowcase", Obj(innerSelection))

  /** The user's public profile location.
    */
  def location: SelectionBuilder[User, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("location", OptionOf(Scalar()))

  /** The username used to login.
    */
  def login: SelectionBuilder[User, String] = _root_.caliban.client.SelectionBuilder.Field("login", Scalar())

  /** The estimated monthly GitHub Sponsors income for this user/organization in cents (USD).
    */
  def monthlyEstimatedSponsorsIncomeInCents: SelectionBuilder[User, Int] =
    _root_.caliban.client.SelectionBuilder.Field("monthlyEstimatedSponsorsIncomeInCents", Scalar())

  /** The user's public profile name.
    */
  def name: SelectionBuilder[User, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("name", OptionOf(Scalar()))

  /** Find an organization by its login that the user belongs to.
    */
  def organization[A](login: String)(
    innerSelection: SelectionBuilder[Organization, A]
  )(implicit encoder0: ArgEncoder[String]): SelectionBuilder[User, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("organization", OptionOf(Obj(innerSelection)), arguments = List(Argument("login", login, "String!")(encoder0)))

  /** Verified email addresses that match verified domains for a specified organization the user is a member of.
    */
  def organizationVerifiedDomainEmails(login: String)(implicit encoder0: ArgEncoder[String]): SelectionBuilder[User, List[String]] =
    _root_.caliban.client.SelectionBuilder
      .Field("organizationVerifiedDomainEmails", ListOf(Scalar()), arguments = List(Argument("login", login, "String!")(encoder0)))

  /** A list of organizations the user belongs to.
    */
  def organizations[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[OrganizationConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "organizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A list of packages under the owner.
    */
  def packages[A](
    after: Option[String]               = None,
    before: Option[String]              = None,
    first: Option[Int]                  = None,
    last: Option[Int]                   = None,
    names: Option[List[Option[String]]] = None,
    orderBy: Option[PackageOrder]       = None,
    packageType: Option[PackageType]    = None,
    repositoryId: Option[String]        = None
  )(innerSelection: SelectionBuilder[PackageConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[List[Option[String]]]],
    encoder5: ArgEncoder[Option[PackageOrder]],
    encoder6: ArgEncoder[Option[PackageType]],
    encoder7: ArgEncoder[Option[String]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "packages",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("names", names, "[String]")(encoder4),
      Argument("orderBy", orderBy, "PackageOrder")(encoder5),
      Argument("packageType", packageType, "PackageType")(encoder6),
      Argument("repositoryId", repositoryId, "ID")(encoder7)
    )
  )

  /** A list of repositories and gists this profile owner can pin to their profile.
    */
  def pinnableItems[A](
    after: Option[String]                 = None,
    before: Option[String]                = None,
    first: Option[Int]                    = None,
    last: Option[Int]                     = None,
    types: Option[List[PinnableItemType]] = None
  )(innerSelection: SelectionBuilder[PinnableItemConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[List[PinnableItemType]]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pinnableItems",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("types", types, "[PinnableItemType!]")(encoder4)
    )
  )

  /** A list of repositories and gists this profile owner has pinned to their profile
    */
  def pinnedItems[A](
    after: Option[String]                 = None,
    before: Option[String]                = None,
    first: Option[Int]                    = None,
    last: Option[Int]                     = None,
    types: Option[List[PinnableItemType]] = None
  )(innerSelection: SelectionBuilder[PinnableItemConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[List[PinnableItemType]]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pinnedItems",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("types", types, "[PinnableItemType!]")(encoder4)
    )
  )

  /** Returns how many more items this profile owner can pin to their profile.
    */
  def pinnedItemsRemaining: SelectionBuilder[User, Int] = _root_.caliban.client.SelectionBuilder.Field("pinnedItemsRemaining", Scalar())

  /** Find project by number.
    */
  def project[A](number: Int)(innerSelection: SelectionBuilder[Project, A])(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[User, Option[A]] =
    _root_.caliban.client.SelectionBuilder
      .Field("project", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

  /** Find project by project next number.
    */
  def projectNext[A](number: Int)(
    innerSelection: SelectionBuilder[ProjectNext, A]
  )(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[User, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("projectNext", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

  /** A list of projects under the owner.
    */
  def projects[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[ProjectOrder]      = None,
    search: Option[String]             = None,
    states: Option[List[ProjectState]] = None
  )(innerSelection: SelectionBuilder[ProjectConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[ProjectOrder]],
    encoder5: ArgEncoder[Option[String]],
    encoder6: ArgEncoder[Option[List[ProjectState]]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "projects",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "ProjectOrder")(encoder4),
      Argument("search", search, "String")(encoder5),
      Argument("states", states, "[ProjectState!]")(encoder6)
    )
  )

  /** A list of project next items under the owner.
    */
  def projectsNext[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[ProjectNextConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "projectsNext",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The HTTP path listing user's projects
    */
  def projectsResourcePath: SelectionBuilder[User, URI] = _root_.caliban.client.SelectionBuilder.Field("projectsResourcePath", Scalar())

  /** The HTTP URL listing user's projects
    */
  def projectsUrl: SelectionBuilder[User, URI] = _root_.caliban.client.SelectionBuilder.Field("projectsUrl", Scalar())

  /** A list of public keys associated with this user.
    */
  def publicKeys[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PublicKeyConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "publicKeys",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A list of pull requests associated with this user.
    */
  def pullRequests[A](
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
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pullRequests",
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

  /** A list of repositories that the user owns.
    */
  def repositories[A](
    affiliations: Option[List[Option[RepositoryAffiliation]]]      = None,
    after: Option[String]                                          = None,
    before: Option[String]                                         = None,
    first: Option[Int]                                             = None,
    isFork: Option[Boolean]                                        = None,
    isLocked: Option[Boolean]                                      = None,
    last: Option[Int]                                              = None,
    orderBy: Option[RepositoryOrder]                               = None,
    ownerAffiliations: Option[List[Option[RepositoryAffiliation]]] = None,
    privacy: Option[RepositoryPrivacy]                             = None
  )(innerSelection: SelectionBuilder[RepositoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[List[Option[RepositoryAffiliation]]]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Boolean]],
    encoder5: ArgEncoder[Option[Boolean]],
    encoder6: ArgEncoder[Option[Int]],
    encoder7: ArgEncoder[Option[RepositoryOrder]],
    encoder8: ArgEncoder[Option[List[Option[RepositoryAffiliation]]]],
    encoder9: ArgEncoder[Option[RepositoryPrivacy]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositories",
    Obj(innerSelection),
    arguments = List(
      Argument("affiliations", affiliations, "[RepositoryAffiliation]")(encoder0),
      Argument("after", after, "String")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("isFork", isFork, "Boolean")(encoder4),
      Argument("isLocked", isLocked, "Boolean")(encoder5),
      Argument("last", last, "Int")(encoder6),
      Argument("orderBy", orderBy, "RepositoryOrder")(encoder7),
      Argument("ownerAffiliations", ownerAffiliations, "[RepositoryAffiliation]")(encoder8),
      Argument("privacy", privacy, "RepositoryPrivacy")(encoder9)
    )
  )

  /** A list of repositories that the user recently contributed to.
    */
  def repositoriesContributedTo[A](
    after: Option[String]                                               = None,
    before: Option[String]                                              = None,
    contributionTypes: Option[List[Option[RepositoryContributionType]]] = None,
    first: Option[Int]                                                  = None,
    includeUserRepositories: Option[Boolean]                            = None,
    isLocked: Option[Boolean]                                           = None,
    last: Option[Int]                                                   = None,
    orderBy: Option[RepositoryOrder]                                    = None,
    privacy: Option[RepositoryPrivacy]                                  = None
  )(innerSelection: SelectionBuilder[RepositoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[List[Option[RepositoryContributionType]]]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Boolean]],
    encoder5: ArgEncoder[Option[Boolean]],
    encoder6: ArgEncoder[Option[Int]],
    encoder7: ArgEncoder[Option[RepositoryOrder]],
    encoder8: ArgEncoder[Option[RepositoryPrivacy]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositoriesContributedTo",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("contributionTypes", contributionTypes, "[RepositoryContributionType]")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("includeUserRepositories", includeUserRepositories, "Boolean")(encoder4),
      Argument("isLocked", isLocked, "Boolean")(encoder5),
      Argument("last", last, "Int")(encoder6),
      Argument("orderBy", orderBy, "RepositoryOrder")(encoder7),
      Argument("privacy", privacy, "RepositoryPrivacy")(encoder8)
    )
  )

  /** Find Repository.
    */
  def repository[A](followRenames: Option[Boolean] = None, name: String)(
    innerSelection: SelectionBuilder[Repository, A]
  )(implicit encoder0: ArgEncoder[Option[Boolean]], encoder1: ArgEncoder[String]): SelectionBuilder[User, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "repository",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("followRenames", followRenames, "Boolean")(encoder0), Argument("name", name, "String!")(encoder1))
    )

  /** Discussion comments this user has authored.
    */
  def repositoryDiscussionComments[A](
    after: Option[String]        = None,
    before: Option[String]       = None,
    first: Option[Int]           = None,
    last: Option[Int]            = None,
    onlyAnswers: Option[Boolean] = None,
    repositoryId: Option[String] = None
  )(innerSelection: SelectionBuilder[DiscussionCommentConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Boolean]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositoryDiscussionComments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("onlyAnswers", onlyAnswers, "Boolean")(encoder4),
      Argument("repositoryId", repositoryId, "ID")(encoder5)
    )
  )

  /** Discussions this user has started.
    */
  def repositoryDiscussions[A](
    after: Option[String]            = None,
    answered: Option[Boolean]        = None,
    before: Option[String]           = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None,
    orderBy: Option[DiscussionOrder] = None,
    repositoryId: Option[String]     = None
  )(innerSelection: SelectionBuilder[DiscussionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[Boolean]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[DiscussionOrder]],
    encoder6: ArgEncoder[Option[String]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositoryDiscussions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("answered", answered, "Boolean")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "DiscussionOrder")(encoder5),
      Argument("repositoryId", repositoryId, "ID")(encoder6)
    )
  )

  /** The HTTP path for this user
    */
  def resourcePath: SelectionBuilder[User, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Replies this user has saved
    */
  def savedReplies[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None,
    orderBy: Option[SavedReplyOrder] = None
  )(innerSelection: SelectionBuilder[SavedReplyConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[SavedReplyOrder]]
  ): SelectionBuilder[User, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "savedReplies",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "SavedReplyOrder")(encoder4)
    )
  )

  /** List of users and organizations this entity is sponsoring.
    */
  def sponsoring[A](
    after: Option[String]         = None,
    before: Option[String]        = None,
    first: Option[Int]            = None,
    last: Option[Int]             = None,
    orderBy: Option[SponsorOrder] = None
  )(innerSelection: SelectionBuilder[SponsorConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[SponsorOrder]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsoring",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "SponsorOrder")(encoder4)
    )
  )

  /** List of sponsors for this user or organization.
    */
  def sponsors[A](
    after: Option[String]         = None,
    before: Option[String]        = None,
    first: Option[Int]            = None,
    last: Option[Int]             = None,
    orderBy: Option[SponsorOrder] = None,
    tierId: Option[String]        = None
  )(innerSelection: SelectionBuilder[SponsorConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[SponsorOrder]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsors",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "SponsorOrder")(encoder4),
      Argument("tierId", tierId, "ID")(encoder5)
    )
  )

  /** Events involving this sponsorable, such as new sponsorships.
    */
  def sponsorsActivities[A](
    after: Option[String]                  = None,
    before: Option[String]                 = None,
    first: Option[Int]                     = None,
    last: Option[Int]                      = None,
    orderBy: Option[SponsorsActivityOrder] = None,
    period: Option[SponsorsActivityPeriod] = None
  )(innerSelection: SelectionBuilder[SponsorsActivityConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[SponsorsActivityOrder]],
    encoder5: ArgEncoder[Option[SponsorsActivityPeriod]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsorsActivities",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "SponsorsActivityOrder")(encoder4),
      Argument("period", period, "SponsorsActivityPeriod")(encoder5)
    )
  )

  /** The GitHub Sponsors listing for this user or organization.
    */
  def sponsorsListing[A](innerSelection: SelectionBuilder[SponsorsListing, A]): SelectionBuilder[User, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorsListing", OptionOf(Obj(innerSelection)))

  /** The sponsorship from the viewer to this user/organization; that is, the
    * sponsorship where you're the sponsor. Only returns a sponsorship if it is active.
    */
  def sponsorshipForViewerAsSponsor[A](innerSelection: SelectionBuilder[Sponsorship, A]): SelectionBuilder[User, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorshipForViewerAsSponsor", OptionOf(Obj(innerSelection)))

  /** The sponsorship from this user/organization to the viewer; that is, the
    * sponsorship you're receiving. Only returns a sponsorship if it is active.
    */
  def sponsorshipForViewerAsSponsorable[A](innerSelection: SelectionBuilder[Sponsorship, A]): SelectionBuilder[User, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorshipForViewerAsSponsorable", OptionOf(Obj(innerSelection)))

  /** List of sponsorship updates sent from this sponsorable to sponsors.
    */
  def sponsorshipNewsletters[A](
    after: Option[String]                       = None,
    before: Option[String]                      = None,
    first: Option[Int]                          = None,
    last: Option[Int]                           = None,
    orderBy: Option[SponsorshipNewsletterOrder] = None
  )(innerSelection: SelectionBuilder[SponsorshipNewsletterConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[SponsorshipNewsletterOrder]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsorshipNewsletters",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "SponsorshipNewsletterOrder")(encoder4)
    )
  )

  /** This object's sponsorships as the maintainer.
    */
  def sponsorshipsAsMaintainer[A](
    after: Option[String]             = None,
    before: Option[String]            = None,
    first: Option[Int]                = None,
    includePrivate: Option[Boolean]   = None,
    last: Option[Int]                 = None,
    orderBy: Option[SponsorshipOrder] = None
  )(innerSelection: SelectionBuilder[SponsorshipConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Boolean]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[SponsorshipOrder]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsorshipsAsMaintainer",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("includePrivate", includePrivate, "Boolean")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "SponsorshipOrder")(encoder5)
    )
  )

  /** This object's sponsorships as the sponsor.
    */
  def sponsorshipsAsSponsor[A](
    after: Option[String]             = None,
    before: Option[String]            = None,
    first: Option[Int]                = None,
    last: Option[Int]                 = None,
    orderBy: Option[SponsorshipOrder] = None
  )(innerSelection: SelectionBuilder[SponsorshipConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[SponsorshipOrder]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsorshipsAsSponsor",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "SponsorshipOrder")(encoder4)
    )
  )

  /** Repositories the user has starred.
    */
  def starredRepositories[A](
    after: Option[String]          = None,
    before: Option[String]         = None,
    first: Option[Int]             = None,
    last: Option[Int]              = None,
    orderBy: Option[StarOrder]     = None,
    ownedByViewer: Option[Boolean] = None
  )(innerSelection: SelectionBuilder[StarredRepositoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[StarOrder]],
    encoder5: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "starredRepositories",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "StarOrder")(encoder4),
      Argument("ownedByViewer", ownedByViewer, "Boolean")(encoder5)
    )
  )

  /** The user's description of what they're currently doing.
    */
  def status[A](innerSelection: SelectionBuilder[UserStatus, A]): SelectionBuilder[User, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("status", OptionOf(Obj(innerSelection)))

  /** Repositories the user has contributed to, ordered by contribution rank, plus repositories the user has created
    */
  def topRepositories[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    orderBy: RepositoryOrder,
    since: Option[DateTime] = None
  )(innerSelection: SelectionBuilder[RepositoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[RepositoryOrder],
    encoder5: ArgEncoder[Option[DateTime]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "topRepositories",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "RepositoryOrder!")(encoder4),
      Argument("since", since, "DateTime")(encoder5)
    )
  )

  /** The user's Twitter username.
    */
  def twitterUsername: SelectionBuilder[User, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("twitterUsername", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[User, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this user
    */
  def url: SelectionBuilder[User, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Can the viewer pin repositories and gists to the profile?
    */
  def viewerCanChangePinnedItems: SelectionBuilder[User, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanChangePinnedItems", Scalar())

  /** Can the current viewer create new projects on this owner.
    */
  def viewerCanCreateProjects: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanCreateProjects", Scalar())

  /** Whether or not the viewer is able to follow the user.
    */
  def viewerCanFollow: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanFollow", Scalar())

  /** Whether or not the viewer is able to sponsor this user/organization.
    */
  def viewerCanSponsor: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSponsor", Scalar())

  /** Whether or not this user is followed by the viewer. Inverse of is_following_viewer.
    */
  def viewerIsFollowing: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerIsFollowing", Scalar())

  /** True if the viewer is sponsoring this user/organization.
    */
  def viewerIsSponsoring: SelectionBuilder[User, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerIsSponsoring", Scalar())

  /** A list of repositories the given user is watching.
    */
  def watching[A](
    affiliations: Option[List[Option[RepositoryAffiliation]]]      = None,
    after: Option[String]                                          = None,
    before: Option[String]                                         = None,
    first: Option[Int]                                             = None,
    isLocked: Option[Boolean]                                      = None,
    last: Option[Int]                                              = None,
    orderBy: Option[RepositoryOrder]                               = None,
    ownerAffiliations: Option[List[Option[RepositoryAffiliation]]] = None,
    privacy: Option[RepositoryPrivacy]                             = None
  )(innerSelection: SelectionBuilder[RepositoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[List[Option[RepositoryAffiliation]]]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Boolean]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[RepositoryOrder]],
    encoder7: ArgEncoder[Option[List[Option[RepositoryAffiliation]]]],
    encoder8: ArgEncoder[Option[RepositoryPrivacy]]
  ): SelectionBuilder[User, A] = _root_.caliban.client.SelectionBuilder.Field(
    "watching",
    Obj(innerSelection),
    arguments = List(
      Argument("affiliations", affiliations, "[RepositoryAffiliation]")(encoder0),
      Argument("after", after, "String")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("isLocked", isLocked, "Boolean")(encoder4),
      Argument("last", last, "Int")(encoder5),
      Argument("orderBy", orderBy, "RepositoryOrder")(encoder6),
      Argument("ownerAffiliations", ownerAffiliations, "[RepositoryAffiliation]")(encoder7),
      Argument("privacy", privacy, "RepositoryPrivacy")(encoder8)
    )
  )

  /** A URL pointing to the user's public website/blog.
    */
  def websiteUrl: SelectionBuilder[User, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("websiteUrl", OptionOf(Scalar()))
}

