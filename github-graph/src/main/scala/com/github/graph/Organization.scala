package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Organization {

  /** Determine if this repository owner has any items that can be pinned to their profile.
    */
  def anyPinnableItems(
    `type`: Option[PinnableItemType] = None
  )(implicit encoder0: ArgEncoder[Option[PinnableItemType]]): SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder
    .Field("anyPinnableItems", Scalar(), arguments = List(Argument("type", `type`, "PinnableItemType")(encoder0)))

  /** Audit log entries of the organization
    */
  def auditLog[A](
    after: Option[String]          = None,
    before: Option[String]         = None,
    first: Option[Int]             = None,
    last: Option[Int]              = None,
    orderBy: Option[AuditLogOrder] = None,
    query: Option[String]          = None
  )(innerSelection: SelectionBuilder[OrganizationAuditEntryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[AuditLogOrder]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
    "auditLog",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "AuditLogOrder")(encoder4),
      Argument("query", query, "String")(encoder5)
    )
  )

  /** A URL pointing to the organization's public avatar.
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[Organization, URI] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", Scalar(), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Organization, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Organization, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The organization's public profile description.
    */
  def description: SelectionBuilder[Organization, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** The organization's public profile description rendered to HTML.
    */
  def descriptionHTML: SelectionBuilder[Organization, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("descriptionHTML", OptionOf(Scalar()))

  /** A list of domains owned by the organization.
    */
  def domains[A](
    after: Option[String]                  = None,
    before: Option[String]                 = None,
    first: Option[Int]                     = None,
    isApproved: Option[Boolean]            = None,
    isVerified: Option[Boolean]            = None,
    last: Option[Int]                      = None,
    orderBy: Option[VerifiableDomainOrder] = None
  )(innerSelection: SelectionBuilder[VerifiableDomainConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Boolean]],
    encoder4: ArgEncoder[Option[Boolean]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[VerifiableDomainOrder]]
  ): SelectionBuilder[Organization, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "domains",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("isApproved", isApproved, "Boolean")(encoder3),
      Argument("isVerified", isVerified, "Boolean")(encoder4),
      Argument("last", last, "Int")(encoder5),
      Argument("orderBy", orderBy, "VerifiableDomainOrder")(encoder6)
    )
  )

  /** The organization's public email.
    */
  def email: SelectionBuilder[Organization, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("email", OptionOf(Scalar()))

  /** The estimated next GitHub Sponsors payout for this user/organization in cents (USD).
    */
  def estimatedNextSponsorsPayoutInCents: SelectionBuilder[Organization, Int] =
    _root_.caliban.client.SelectionBuilder.Field("estimatedNextSponsorsPayoutInCents", Scalar())

  /** True if this user/organization has a GitHub Sponsors listing.
    */
  def hasSponsorsListing: SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasSponsorsListing", Scalar())
  def id: SelectionBuilder[Organization, String]                  = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The interaction ability settings for this organization.
    */
  def interactionAbility[A](innerSelection: SelectionBuilder[RepositoryInteractionAbility, A]): SelectionBuilder[Organization, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("interactionAbility", OptionOf(Obj(innerSelection)))

  /** The setting value for whether the organization has an IP allow list enabled.
    */
  def ipAllowListEnabledSetting: SelectionBuilder[Organization, IpAllowListEnabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("ipAllowListEnabledSetting", Scalar())

  /** The IP addresses that are allowed to access resources owned by the organization.
    */
  def ipAllowListEntries[A](
    after: Option[String]                  = None,
    before: Option[String]                 = None,
    first: Option[Int]                     = None,
    last: Option[Int]                      = None,
    orderBy: Option[IpAllowListEntryOrder] = None
  )(innerSelection: SelectionBuilder[IpAllowListEntryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[IpAllowListEntryOrder]]
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
    "ipAllowListEntries",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "IpAllowListEntryOrder")(encoder4)
    )
  )

  /** The setting value for whether the organization has IP allow list configuration for installed GitHub Apps enabled.
    */
  def ipAllowListForInstalledAppsEnabledSetting: SelectionBuilder[Organization, IpAllowListForInstalledAppsEnabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("ipAllowListForInstalledAppsEnabledSetting", Scalar())

  /** Check if the given account is sponsoring this user/organization.
    */
  def isSponsoredBy(accountLogin: String)(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Organization, Boolean] =
    _root_.caliban.client.SelectionBuilder
      .Field("isSponsoredBy", Scalar(), arguments = List(Argument("accountLogin", accountLogin, "String!")(encoder0)))

  /** True if the viewer is sponsored by this user/organization.
    */
  def isSponsoringViewer: SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isSponsoringViewer", Scalar())

  /** Whether the organization has verified its profile email and website.
    */
  def isVerified: SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isVerified", Scalar())

  /** Showcases a selection of repositories and gists that the profile owner has
    * either curated or that have been selected automatically based on popularity.
    */
  def itemShowcase[A](innerSelection: SelectionBuilder[ProfileItemShowcase, A]): SelectionBuilder[Organization, A] =
    _root_.caliban.client.SelectionBuilder.Field("itemShowcase", Obj(innerSelection))

  /** The organization's public profile location.
    */
  def location: SelectionBuilder[Organization, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("location", OptionOf(Scalar()))

  /** The organization's login name.
    */
  def login: SelectionBuilder[Organization, String] = _root_.caliban.client.SelectionBuilder.Field("login", Scalar())

  /** Get the status messages members of this entity have set that are either public or visible only to the organization.
    */
  def memberStatuses[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None,
    orderBy: Option[UserStatusOrder] = None
  )(innerSelection: SelectionBuilder[UserStatusConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[UserStatusOrder]]
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
    "memberStatuses",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "UserStatusOrder")(encoder4)
    )
  )

  /** A list of users who are members of this organization.
    */
  def membersWithRole[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[OrganizationMemberConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
    "membersWithRole",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The estimated monthly GitHub Sponsors income for this user/organization in cents (USD).
    */
  def monthlyEstimatedSponsorsIncomeInCents: SelectionBuilder[Organization, Int] =
    _root_.caliban.client.SelectionBuilder.Field("monthlyEstimatedSponsorsIncomeInCents", Scalar())

  /** The organization's public profile name.
    */
  def name: SelectionBuilder[Organization, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("name", OptionOf(Scalar()))

  /** The HTTP path creating a new team
    */
  def newTeamResourcePath: SelectionBuilder[Organization, URI] = _root_.caliban.client.SelectionBuilder.Field("newTeamResourcePath", Scalar())

  /** The HTTP URL creating a new team
    */
  def newTeamUrl: SelectionBuilder[Organization, URI] = _root_.caliban.client.SelectionBuilder.Field("newTeamUrl", Scalar())

  /** Indicates if email notification delivery for this organization is restricted to verified or approved domains.
    */
  def notificationDeliveryRestrictionEnabledSetting: SelectionBuilder[Organization, NotificationRestrictionSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("notificationDeliveryRestrictionEnabledSetting", Scalar())

  /** The billing email for the organization.
    */
  def organizationBillingEmail: SelectionBuilder[Organization, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationBillingEmail", OptionOf(Scalar()))

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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** A list of users who have been invited to join this organization.
    */
  def pendingMembers[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pendingMembers",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  def pinnedItemsRemaining: SelectionBuilder[Organization, Int] = _root_.caliban.client.SelectionBuilder.Field("pinnedItemsRemaining", Scalar())

  /** Find project by number.
    */
  def project[A](number: Int)(
    innerSelection: SelectionBuilder[Project, A]
  )(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[Organization, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("project", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

  /** Find project by project next number.
    */
  def projectNext[A](number: Int)(
    innerSelection: SelectionBuilder[ProjectNext, A]
  )(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[Organization, Option[A]] = _root_.caliban.client.SelectionBuilder
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
    "projectsNext",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The HTTP path listing organization's projects
    */
  def projectsResourcePath: SelectionBuilder[Organization, URI] = _root_.caliban.client.SelectionBuilder.Field("projectsResourcePath", Scalar())

  /** The HTTP URL listing organization's projects
    */
  def projectsUrl: SelectionBuilder[Organization, URI] = _root_.caliban.client.SelectionBuilder.Field("projectsUrl", Scalar())

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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Find Repository.
    */
  def repository[A](followRenames: Option[Boolean] = None, name: String)(
    innerSelection: SelectionBuilder[Repository, A]
  )(implicit encoder0: ArgEncoder[Option[Boolean]], encoder1: ArgEncoder[String]): SelectionBuilder[Organization, Option[A]] =
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** When true the organization requires all members, billing managers, and outside
    * collaborators to enable two-factor authentication.
    */
  def requiresTwoFactorAuthentication: SelectionBuilder[Organization, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("requiresTwoFactorAuthentication", OptionOf(Scalar()))

  /** The HTTP path for this organization.
    */
  def resourcePath: SelectionBuilder[Organization, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The Organization's SAML identity providers
    */
  def samlIdentityProvider[A](innerSelection: SelectionBuilder[OrganizationIdentityProvider, A]): SelectionBuilder[Organization, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("samlIdentityProvider", OptionOf(Obj(innerSelection)))

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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  def sponsorsListing[A](innerSelection: SelectionBuilder[SponsorsListing, A]): SelectionBuilder[Organization, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorsListing", OptionOf(Obj(innerSelection)))

  /** The sponsorship from the viewer to this user/organization; that is, the
    * sponsorship where you're the sponsor. Only returns a sponsorship if it is active.
    */
  def sponsorshipForViewerAsSponsor[A](innerSelection: SelectionBuilder[Sponsorship, A]): SelectionBuilder[Organization, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorshipForViewerAsSponsor", OptionOf(Obj(innerSelection)))

  /** The sponsorship from this user/organization to the viewer; that is, the
    * sponsorship you're receiving. Only returns a sponsorship if it is active.
    */
  def sponsorshipForViewerAsSponsorable[A](innerSelection: SelectionBuilder[Sponsorship, A]): SelectionBuilder[Organization, Option[A]] =
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** Find an organization's team by its slug.
    */
  def team[A](
    slug: String
  )(innerSelection: SelectionBuilder[Team, A])(implicit encoder0: ArgEncoder[String]): SelectionBuilder[Organization, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("team", OptionOf(Obj(innerSelection)), arguments = List(Argument("slug", slug, "String!")(encoder0)))

  /** A list of teams in this organization.
    */
  def teams[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None,
    ldapMapped: Option[Boolean]      = None,
    orderBy: Option[TeamOrder]       = None,
    privacy: Option[TeamPrivacy]     = None,
    query: Option[String]            = None,
    role: Option[TeamRole]           = None,
    rootTeamsOnly: Option[Boolean]   = None,
    userLogins: Option[List[String]] = None
  )(innerSelection: SelectionBuilder[TeamConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Boolean]],
    encoder5: ArgEncoder[Option[TeamOrder]],
    encoder6: ArgEncoder[Option[TeamPrivacy]],
    encoder7: ArgEncoder[Option[String]],
    encoder8: ArgEncoder[Option[TeamRole]],
    encoder9: ArgEncoder[Option[Boolean]],
    encoder10: ArgEncoder[Option[List[String]]]
  ): SelectionBuilder[Organization, A] = _root_.caliban.client.SelectionBuilder.Field(
    "teams",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("ldapMapped", ldapMapped, "Boolean")(encoder4),
      Argument("orderBy", orderBy, "TeamOrder")(encoder5),
      Argument("privacy", privacy, "TeamPrivacy")(encoder6),
      Argument("query", query, "String")(encoder7),
      Argument("role", role, "TeamRole")(encoder8),
      Argument("rootTeamsOnly", rootTeamsOnly, "Boolean")(encoder9),
      Argument("userLogins", userLogins, "[String!]")(encoder10)
    )
  )

  /** The HTTP path listing organization's teams
    */
  def teamsResourcePath: SelectionBuilder[Organization, URI] = _root_.caliban.client.SelectionBuilder.Field("teamsResourcePath", Scalar())

  /** The HTTP URL listing organization's teams
    */
  def teamsUrl: SelectionBuilder[Organization, URI] = _root_.caliban.client.SelectionBuilder.Field("teamsUrl", Scalar())

  /** The organization's Twitter username.
    */
  def twitterUsername: SelectionBuilder[Organization, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("twitterUsername", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Organization, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this organization.
    */
  def url: SelectionBuilder[Organization, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Organization is adminable by the viewer.
    */
  def viewerCanAdminister: SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanAdminister", Scalar())

  /** Can the viewer pin repositories and gists to the profile?
    */
  def viewerCanChangePinnedItems: SelectionBuilder[Organization, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanChangePinnedItems", Scalar())

  /** Can the current viewer create new projects on this owner.
    */
  def viewerCanCreateProjects: SelectionBuilder[Organization, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanCreateProjects", Scalar())

  /** Viewer can create repositories on this organization
    */
  def viewerCanCreateRepositories: SelectionBuilder[Organization, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanCreateRepositories", Scalar())

  /** Viewer can create teams on this organization.
    */
  def viewerCanCreateTeams: SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanCreateTeams", Scalar())

  /** Whether or not the viewer is able to sponsor this user/organization.
    */
  def viewerCanSponsor: SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSponsor", Scalar())

  /** Viewer is an active member of this organization.
    */
  def viewerIsAMember: SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerIsAMember", Scalar())

  /** True if the viewer is sponsoring this user/organization.
    */
  def viewerIsSponsoring: SelectionBuilder[Organization, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerIsSponsoring", Scalar())

  /** The organization's public profile URL.
    */
  def websiteUrl: SelectionBuilder[Organization, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("websiteUrl", OptionOf(Scalar()))
}

