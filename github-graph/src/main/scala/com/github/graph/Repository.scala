package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Repository {

  /** A list of users that can be assigned to issues in this repository.
    */
  def assignableUsers[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    query: Option[String]  = None
  )(innerSelection: SelectionBuilder[UserConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[String]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "assignableUsers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("query", query, "String")(encoder4)
    )
  )

  /** Whether or not Auto-merge can be enabled on pull requests in this repository.
    */
  def autoMergeAllowed: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("autoMergeAllowed", Scalar())

  /** A list of branch protection rules for this repository.
    */
  def branchProtectionRules[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[BranchProtectionRuleConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "branchProtectionRules",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Returns the code of conduct for this repository
    */
  def codeOfConduct[A](innerSelection: SelectionBuilder[CodeOfConduct, A]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("codeOfConduct", OptionOf(Obj(innerSelection)))

  /** A list of collaborators associated with the repository.
    */
  def collaborators[A](
    affiliation: Option[CollaboratorAffiliation] = None,
    after: Option[String]                        = None,
    before: Option[String]                       = None,
    first: Option[Int]                           = None,
    last: Option[Int]                            = None,
    query: Option[String]                        = None
  )(innerSelection: SelectionBuilder[RepositoryCollaboratorConnection, A])(implicit
    encoder0: ArgEncoder[Option[CollaboratorAffiliation]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "collaborators",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("affiliation", affiliation, "CollaboratorAffiliation")(encoder0),
      Argument("after", after, "String")(encoder1),
      Argument("before", before, "String")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("query", query, "String")(encoder5)
    )
  )

  /** A list of commit comments associated with the repository.
    */
  def commitComments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[CommitCommentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "commitComments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Returns a list of contact links associated to the repository
    */
  def contactLinks[A](innerSelection: SelectionBuilder[RepositoryContactLink, A]): SelectionBuilder[Repository, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("contactLinks", OptionOf(ListOf(Obj(innerSelection))))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Repository, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Repository, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The Ref associated with the repository's default branch.
    */
  def defaultBranchRef[A](innerSelection: SelectionBuilder[Ref, A]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("defaultBranchRef", OptionOf(Obj(innerSelection)))

  /** Whether or not branches are automatically deleted when merged in this repository.
    */
  def deleteBranchOnMerge: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("deleteBranchOnMerge", Scalar())

  /** A list of dependency manifests contained in the repository
    */
  def dependencyGraphManifests[A](
    after: Option[String]             = None,
    before: Option[String]            = None,
    dependenciesAfter: Option[String] = None,
    dependenciesFirst: Option[Int]    = None,
    first: Option[Int]                = None,
    last: Option[Int]                 = None,
    withDependencies: Option[Boolean] = None
  )(innerSelection: SelectionBuilder[DependencyGraphManifestConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "dependencyGraphManifests",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("dependenciesAfter", dependenciesAfter, "String")(encoder2),
      Argument("dependenciesFirst", dependenciesFirst, "Int")(encoder3),
      Argument("first", first, "Int")(encoder4),
      Argument("last", last, "Int")(encoder5),
      Argument("withDependencies", withDependencies, "Boolean")(encoder6)
    )
  )

  /** A list of deploy keys that are on this repository.
    */
  def deployKeys[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DeployKeyConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "deployKeys",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Deployments associated with the repository
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
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "deployments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("environments", environments, "[String!]")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "DeploymentOrder")(encoder5)
    )
  )

  /** The description of the repository.
    */
  def description: SelectionBuilder[Repository, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** The description of the repository rendered to HTML.
    */
  def descriptionHTML: SelectionBuilder[Repository, HTML] = _root_.caliban.client.SelectionBuilder.Field("descriptionHTML", Scalar())

  /** Returns a single discussion from the current repository by number.
    */
  def discussion[A](number: Int)(
    innerSelection: SelectionBuilder[Discussion, A]
  )(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("discussion", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

  /** A list of discussion categories that are available in the repository.
    */
  def discussionCategories[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DiscussionCategoryConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "discussionCategories",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A list of discussions that have been opened in the repository.
    */
  def discussions[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    categoryId: Option[String]       = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None,
    orderBy: Option[DiscussionOrder] = None
  )(innerSelection: SelectionBuilder[DiscussionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[String]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[DiscussionOrder]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "discussions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("categoryId", categoryId, "ID")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "DiscussionOrder")(encoder5)
    )
  )

  /** The number of kilobytes this repository occupies on disk.
    */
  def diskUsage: SelectionBuilder[Repository, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("diskUsage", OptionOf(Scalar()))

  /** Returns a single active environment from the current repository by name.
    */
  def environment[A](name: String)(
    innerSelection: SelectionBuilder[Environment, A]
  )(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("environment", OptionOf(Obj(innerSelection)), arguments = List(Argument("name", name, "String!")(encoder0)))

  /** A list of environments that are in this repository.
    */
  def environments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[EnvironmentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "environments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Returns how many forks there are of this repository in the whole network.
    */
  def forkCount: SelectionBuilder[Repository, Int] = _root_.caliban.client.SelectionBuilder.Field("forkCount", Scalar())

  /** Whether this repository allows forks.
    */
  def forkingAllowed: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("forkingAllowed", Scalar())

  /** A list of direct forked repositories.
    */
  def forks[A](
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
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "forks",
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

  /** The funding links for this repository
    */
  def fundingLinks[A](innerSelection: SelectionBuilder[FundingLink, A]): SelectionBuilder[Repository, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("fundingLinks", ListOf(Obj(innerSelection)))

  /** Indicates if the repository has issues feature enabled.
    */
  def hasIssuesEnabled: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasIssuesEnabled", Scalar())

  /** Indicates if the repository has the Projects feature enabled.
    */
  def hasProjectsEnabled: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasProjectsEnabled", Scalar())

  /** Indicates if the repository has wiki feature enabled.
    */
  def hasWikiEnabled: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasWikiEnabled", Scalar())

  /** The repository's URL.
    */
  def homepageUrl: SelectionBuilder[Repository, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("homepageUrl", OptionOf(Scalar()))
  def id: SelectionBuilder[Repository, String]               = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The interaction ability settings for this repository.
    */
  def interactionAbility[A](innerSelection: SelectionBuilder[RepositoryInteractionAbility, A]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("interactionAbility", OptionOf(Obj(innerSelection)))

  /** Indicates if the repository is unmaintained.
    */
  def isArchived: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isArchived", Scalar())

  /** Returns true if blank issue creation is allowed
    */
  def isBlankIssuesEnabled: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isBlankIssuesEnabled", Scalar())

  /** Returns whether or not this repository disabled.
    */
  def isDisabled: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isDisabled", Scalar())

  /** Returns whether or not this repository is empty.
    */
  def isEmpty: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isEmpty", Scalar())

  /** Identifies if the repository is a fork.
    */
  def isFork: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isFork", Scalar())

  /** Indicates if a repository is either owned by an organization, or is a private fork of an organization repository.
    */
  def isInOrganization: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isInOrganization", Scalar())

  /** Indicates if the repository has been locked or not.
    */
  def isLocked: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isLocked", Scalar())

  /** Identifies if the repository is a mirror.
    */
  def isMirror: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isMirror", Scalar())

  /** Identifies if the repository is private or internal.
    */
  def isPrivate: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPrivate", Scalar())

  /** Returns true if this repository has a security policy
    */
  def isSecurityPolicyEnabled: SelectionBuilder[Repository, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("isSecurityPolicyEnabled", OptionOf(Scalar()))

  /** Identifies if the repository is a template that can be used to generate new repositories.
    */
  def isTemplate: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isTemplate", Scalar())

  /** Is this repository a user configuration repository?
    */
  def isUserConfigurationRepository: SelectionBuilder[Repository, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isUserConfigurationRepository", Scalar())

  /** Returns a single issue from the current repository by number.
    */
  def issue[A](number: Int)(innerSelection: SelectionBuilder[Issue, A])(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder
      .Field("issue", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

  /** Returns a single issue-like object from the current repository by number.
    */
  def issueOrPullRequest[A](number: Int)(onIssue: SelectionBuilder[Issue, A], onPullRequest: SelectionBuilder[PullRequest, A])(implicit
    encoder0: ArgEncoder[Int]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "issueOrPullRequest",
    OptionOf(ChoiceOf(Map("Issue" -> Obj(onIssue), "PullRequest" -> Obj(onPullRequest)))),
    arguments = List(Argument("number", number, "Int!")(encoder0))
  )

  /** Returns a list of issue templates associated to the repository
    */
  def issueTemplates[A](innerSelection: SelectionBuilder[IssueTemplate, A]): SelectionBuilder[Repository, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("issueTemplates", OptionOf(ListOf(Obj(innerSelection))))

  /** A list of issues that have been opened in the repository.
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
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Returns a single label by name
    */
  def label[A](name: String)(
    innerSelection: SelectionBuilder[Label, A]
  )(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("label", OptionOf(Obj(innerSelection)), arguments = List(Argument("name", name, "String!")(encoder0)))

  /** A list of labels associated with the repository.
    */
  def labels[A](
    after: Option[String]       = None,
    before: Option[String]      = None,
    first: Option[Int]          = None,
    last: Option[Int]           = None,
    orderBy: Option[LabelOrder] = None,
    query: Option[String]       = None
  )(innerSelection: SelectionBuilder[LabelConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[LabelOrder]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "labels",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "LabelOrder")(encoder4),
      Argument("query", query, "String")(encoder5)
    )
  )

  /** A list containing a breakdown of the language composition of the repository.
    */
  def languages[A](
    after: Option[String]          = None,
    before: Option[String]         = None,
    first: Option[Int]             = None,
    last: Option[Int]              = None,
    orderBy: Option[LanguageOrder] = None
  )(innerSelection: SelectionBuilder[LanguageConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[LanguageOrder]]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "languages",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "LanguageOrder")(encoder4)
    )
  )

  /** Get the latest release for the repository if one exists.
    */
  def latestRelease[A](innerSelection: SelectionBuilder[Release, A]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("latestRelease", OptionOf(Obj(innerSelection)))

  /** The license associated with the repository
    */
  def licenseInfo[A](innerSelection: SelectionBuilder[License, A]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("licenseInfo", OptionOf(Obj(innerSelection)))

  /** The reason the repository has been locked.
    */
  def lockReason: SelectionBuilder[Repository, Option[RepositoryLockReason]] =
    _root_.caliban.client.SelectionBuilder.Field("lockReason", OptionOf(Scalar()))

  /** A list of Users that can be mentioned in the context of the repository.
    */
  def mentionableUsers[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    query: Option[String]  = None
  )(innerSelection: SelectionBuilder[UserConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[String]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "mentionableUsers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("query", query, "String")(encoder4)
    )
  )

  /** Whether or not PRs are merged with a merge commit on this repository.
    */
  def mergeCommitAllowed: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("mergeCommitAllowed", Scalar())

  /** Returns a single milestone from the current repository by number.
    */
  def milestone[A](number: Int)(
    innerSelection: SelectionBuilder[Milestone, A]
  )(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("milestone", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

  /** A list of milestones associated with the repository.
    */
  def milestones[A](
    after: Option[String]                = None,
    before: Option[String]               = None,
    first: Option[Int]                   = None,
    last: Option[Int]                    = None,
    orderBy: Option[MilestoneOrder]      = None,
    query: Option[String]                = None,
    states: Option[List[MilestoneState]] = None
  )(innerSelection: SelectionBuilder[MilestoneConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[MilestoneOrder]],
    encoder5: ArgEncoder[Option[String]],
    encoder6: ArgEncoder[Option[List[MilestoneState]]]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "milestones",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "MilestoneOrder")(encoder4),
      Argument("query", query, "String")(encoder5),
      Argument("states", states, "[MilestoneState!]")(encoder6)
    )
  )

  /** The repository's original mirror URL.
    */
  def mirrorUrl: SelectionBuilder[Repository, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("mirrorUrl", OptionOf(Scalar()))

  /** The name of the repository.
    */
  def name: SelectionBuilder[Repository, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The repository's name with owner.
    */
  def nameWithOwner: SelectionBuilder[Repository, String] = _root_.caliban.client.SelectionBuilder.Field("nameWithOwner", Scalar())

  /** A Git object in the repository
    */
  def `object`[A](expression: Option[String]      = None, oid: Option[GitObjectID] = None)(
    onBlob: Option[SelectionBuilder[Blob, A]]     = None,
    onCommit: Option[SelectionBuilder[Commit, A]] = None,
    onTag: Option[SelectionBuilder[Tag, A]]       = None,
    onTree: Option[SelectionBuilder[Tree, A]]     = None
  )(implicit encoder0: ArgEncoder[Option[String]], encoder1: ArgEncoder[Option[GitObjectID]]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "object",
      OptionOf(ChoiceOf(Map("Blob" -> onBlob, "Commit" -> onCommit, "Tag" -> onTag, "Tree" -> onTree).collect { case (k, Some(v)) => k -> Obj(v) })),
      arguments = List(Argument("expression", expression, "String")(encoder0), Argument("oid", oid, "GitObjectID")(encoder1))
    )

  /** The image used to represent this repository in Open Graph data.
    */
  def openGraphImageUrl: SelectionBuilder[Repository, URI] = _root_.caliban.client.SelectionBuilder.Field("openGraphImageUrl", Scalar())

  /** The User owner of the repository.
    */
  def owner[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder
    .Field("owner", ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) }))

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
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The repository parent, if this is a fork.
    */
  def parent[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("parent", OptionOf(Obj(innerSelection)))

  /** A list of discussions that have been pinned in this repository.
    */
  def pinnedDiscussions[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PinnedDiscussionConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pinnedDiscussions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A list of pinned issues for this repository.
    */
  def pinnedIssues[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PinnedIssueConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "pinnedIssues",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The primary language of the repository's code.
    */
  def primaryLanguage[A](innerSelection: SelectionBuilder[Language, A]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("primaryLanguage", OptionOf(Obj(innerSelection)))

  /** Find project by number.
    */
  def project[A](number: Int)(
    innerSelection: SelectionBuilder[Project, A]
  )(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("project", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

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
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The HTTP path listing the repository's projects
    */
  def projectsResourcePath: SelectionBuilder[Repository, URI] = _root_.caliban.client.SelectionBuilder.Field("projectsResourcePath", Scalar())

  /** The HTTP URL listing the repository's projects
    */
  def projectsUrl: SelectionBuilder[Repository, URI] = _root_.caliban.client.SelectionBuilder.Field("projectsUrl", Scalar())

  /** Returns a single pull request from the current repository by number.
    */
  def pullRequest[A](number: Int)(
    innerSelection: SelectionBuilder[PullRequest, A]
  )(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("pullRequest", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

  /** Returns a list of pull request templates associated to the repository
    */
  def pullRequestTemplates[A](innerSelection: SelectionBuilder[PullRequestTemplate, A]): SelectionBuilder[Repository, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequestTemplates", OptionOf(ListOf(Obj(innerSelection))))

  /** A list of pull requests that have been opened in the repository.
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
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Identifies when the repository was last pushed to.
    */
  def pushedAt: SelectionBuilder[Repository, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("pushedAt", OptionOf(Scalar()))

  /** Whether or not rebase-merging is enabled on this repository.
    */
  def rebaseMergeAllowed: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("rebaseMergeAllowed", Scalar())

  /** Fetch a given ref from the repository
    */
  def ref[A](qualifiedName: String)(
    innerSelection: SelectionBuilder[Ref, A]
  )(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("ref", OptionOf(Obj(innerSelection)), arguments = List(Argument("qualifiedName", qualifiedName, "String!")(encoder0)))

  /** Fetch a list of refs from the repository
    */
  def refs[A](
    after: Option[String]             = None,
    before: Option[String]            = None,
    direction: Option[OrderDirection] = None,
    first: Option[Int]                = None,
    last: Option[Int]                 = None,
    orderBy: Option[RefOrder]         = None,
    query: Option[String]             = None,
    refPrefix: String
  )(innerSelection: SelectionBuilder[RefConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[OrderDirection]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[RefOrder]],
    encoder6: ArgEncoder[Option[String]],
    encoder7: ArgEncoder[String]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "refs",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("direction", direction, "OrderDirection")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "RefOrder")(encoder5),
      Argument("query", query, "String")(encoder6),
      Argument("refPrefix", refPrefix, "String!")(encoder7)
    )
  )

  /** Lookup a single release given various criteria.
    */
  def release[A](tagName: String)(
    innerSelection: SelectionBuilder[Release, A]
  )(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("release", OptionOf(Obj(innerSelection)), arguments = List(Argument("tagName", tagName, "String!")(encoder0)))

  /** List of releases which are dependent on this repository.
    */
  def releases[A](
    after: Option[String]         = None,
    before: Option[String]        = None,
    first: Option[Int]            = None,
    last: Option[Int]             = None,
    orderBy: Option[ReleaseOrder] = None
  )(innerSelection: SelectionBuilder[ReleaseConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[ReleaseOrder]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "releases",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "ReleaseOrder")(encoder4)
    )
  )

  /** A list of applied repository-topic associations for this repository.
    */
  def repositoryTopics[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[RepositoryTopicConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositoryTopics",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The HTTP path for this repository
    */
  def resourcePath: SelectionBuilder[Repository, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The security policy URL.
    */
  def securityPolicyUrl: SelectionBuilder[Repository, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("securityPolicyUrl", OptionOf(Scalar()))

  /** A description of the repository, rendered to HTML without any links in it.
    */
  def shortDescriptionHTML(limit: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[Repository, HTML] =
    _root_.caliban.client.SelectionBuilder.Field("shortDescriptionHTML", Scalar(), arguments = List(Argument("limit", limit, "Int")(encoder0)))

  /** Whether or not squash-merging is enabled on this repository.
    */
  def squashMergeAllowed: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("squashMergeAllowed", Scalar())

  /** The SSH URL to clone this repository
    */
  def sshUrl: SelectionBuilder[Repository, GitSSHRemote] = _root_.caliban.client.SelectionBuilder.Field("sshUrl", Scalar())

  /** Returns a count of how many stargazers there are on this object
    */
  def stargazerCount: SelectionBuilder[Repository, Int] = _root_.caliban.client.SelectionBuilder.Field("stargazerCount", Scalar())

  /** A list of users who have starred this starrable.
    */
  def stargazers[A](
    after: Option[String]      = None,
    before: Option[String]     = None,
    first: Option[Int]         = None,
    last: Option[Int]          = None,
    orderBy: Option[StarOrder] = None
  )(innerSelection: SelectionBuilder[StargazerConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[StarOrder]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "stargazers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "StarOrder")(encoder4)
    )
  )

  /** Returns a list of all submodules in this repository parsed from the
    * .gitmodules file as of the default branch's HEAD commit.
    */
  def submodules[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[SubmoduleConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "submodules",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Temporary authentication token for cloning this repository.
    */
  def tempCloneToken: SelectionBuilder[Repository, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("tempCloneToken", OptionOf(Scalar()))

  /** The repository from which this repository was generated, if any.
    */
  def templateRepository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Repository, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("templateRepository", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Repository, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this repository
    */
  def url: SelectionBuilder[Repository, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Whether this repository has a custom image to use with Open Graph as opposed to being represented by the owner's avatar.
    */
  def usesCustomOpenGraphImage: SelectionBuilder[Repository, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("usesCustomOpenGraphImage", Scalar())

  /** Indicates whether the viewer has admin permissions on this repository.
    */
  def viewerCanAdminister: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanAdminister", Scalar())

  /** Can the current viewer create new projects on this owner.
    */
  def viewerCanCreateProjects: SelectionBuilder[Repository, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanCreateProjects", Scalar())

  /** Check if the viewer is able to change their subscription status for the repository.
    */
  def viewerCanSubscribe: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSubscribe", Scalar())

  /** Indicates whether the viewer can update the topics of this repository.
    */
  def viewerCanUpdateTopics: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdateTopics", Scalar())

  /** The last commit email for the viewer.
    */
  def viewerDefaultCommitEmail: SelectionBuilder[Repository, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerDefaultCommitEmail", OptionOf(Scalar()))

  /** The last used merge method by the viewer or the default for the repository.
    */
  def viewerDefaultMergeMethod: SelectionBuilder[Repository, PullRequestMergeMethod] =
    _root_.caliban.client.SelectionBuilder.Field("viewerDefaultMergeMethod", Scalar())

  /** Returns a boolean indicating whether the viewing user has starred this starrable.
    */
  def viewerHasStarred: SelectionBuilder[Repository, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerHasStarred", Scalar())

  /** The users permission level on the repository. Will return null if authenticated as an GitHub App.
    */
  def viewerPermission: SelectionBuilder[Repository, Option[RepositoryPermission]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerPermission", OptionOf(Scalar()))

  /** A list of emails this viewer can commit with.
    */
  def viewerPossibleCommitEmails: SelectionBuilder[Repository, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerPossibleCommitEmails", OptionOf(ListOf(Scalar())))

  /** Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.
    */
  def viewerSubscription: SelectionBuilder[Repository, Option[SubscriptionState]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerSubscription", OptionOf(Scalar()))

  /** Indicates the repository's visibility level.
    */
  def visibility: SelectionBuilder[Repository, RepositoryVisibility] = _root_.caliban.client.SelectionBuilder.Field("visibility", Scalar())

  /** A list of vulnerability alerts that are on this repository.
    */
  def vulnerabilityAlerts[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[RepositoryVulnerabilityAlertConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "vulnerabilityAlerts",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A list of users watching the repository.
    */
  def watchers[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Repository, A] = _root_.caliban.client.SelectionBuilder.Field(
    "watchers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Returns a single issue-like object from the current repository by number.
    */
  def issueOrPullRequestOption[A](
    number: Int
  )(onIssue: Option[SelectionBuilder[Issue, A]] = None, onPullRequest: Option[SelectionBuilder[PullRequest, A]] = None)(implicit
    encoder0: ArgEncoder[Int]
  ): SelectionBuilder[Repository, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "issueOrPullRequest",
    OptionOf(
      ChoiceOf(
        Map(
          "Issue"       -> onIssue.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PullRequest" -> onPullRequest.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    ),
    arguments = List(Argument("number", number, "Int!")(encoder0))
  )
}

