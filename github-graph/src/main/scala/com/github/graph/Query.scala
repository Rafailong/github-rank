package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Query {

  /** Look up a code of conduct by its key
    */
  def codeOfConduct[A](key: String)(innerSelection: SelectionBuilder[CodeOfConduct, A])(implicit
    encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("codeOfConduct", OptionOf(Obj(innerSelection)), arguments = List(Argument("key", key, "String!")(encoder0)))

  /** Look up a code of conduct by its key
    */
  def codesOfConduct[A](
    innerSelection: SelectionBuilder[CodeOfConduct, A]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("codesOfConduct", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** Look up an enterprise by URL slug.
    */
  def enterprise[A](invitationToken: Option[String] = None, slug: String)(innerSelection: SelectionBuilder[Enterprise, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "enterprise",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("invitationToken", invitationToken, "String")(encoder0), Argument("slug", slug, "String!")(encoder1))
  )

  /** Look up a pending enterprise administrator invitation by invitee, enterprise and role.
    */
  def enterpriseAdministratorInvitation[A](enterpriseSlug: String, role: EnterpriseAdministratorRole, userLogin: String)(
    innerSelection: SelectionBuilder[EnterpriseAdministratorInvitation, A]
  )(implicit
    encoder0: ArgEncoder[String],
    encoder1: ArgEncoder[EnterpriseAdministratorRole],
    encoder2: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "enterpriseAdministratorInvitation",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("enterpriseSlug", enterpriseSlug, "String!")(encoder0),
      Argument("role", role, "EnterpriseAdministratorRole!")(encoder1),
      Argument("userLogin", userLogin, "String!")(encoder2)
    )
  )

  /** Look up a pending enterprise administrator invitation by invitation token.
    */
  def enterpriseAdministratorInvitationByToken[A](invitationToken: String)(innerSelection: SelectionBuilder[EnterpriseAdministratorInvitation, A])(
    implicit encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "enterpriseAdministratorInvitationByToken",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("invitationToken", invitationToken, "String!")(encoder0))
  )

  /** Look up an open source license by its key
    */
  def license[A](key: String)(innerSelection: SelectionBuilder[License, A])(implicit
    encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("license", OptionOf(Obj(innerSelection)), arguments = List(Argument("key", key, "String!")(encoder0)))

  /** Return a list of known open source licenses
    */
  def licenses[A](innerSelection: SelectionBuilder[License, A]): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, List[Option[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("licenses", ListOf(OptionOf(Obj(innerSelection))))

  /** Get alphabetically sorted list of Marketplace categories
    */
  def marketplaceCategories[A](
    excludeEmpty: Option[Boolean]           = None,
    excludeSubcategories: Option[Boolean]   = None,
    includeCategories: Option[List[String]] = None
  )(innerSelection: SelectionBuilder[MarketplaceCategory, A])(implicit
    encoder0: ArgEncoder[Option[Boolean]],
    encoder1: ArgEncoder[Option[Boolean]],
    encoder2: ArgEncoder[Option[List[String]]]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, List[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "marketplaceCategories",
    ListOf(Obj(innerSelection)),
    arguments = List(
      Argument("excludeEmpty", excludeEmpty, "Boolean")(encoder0),
      Argument("excludeSubcategories", excludeSubcategories, "Boolean")(encoder1),
      Argument("includeCategories", includeCategories, "[String!]")(encoder2)
    )
  )

  /** Look up a Marketplace category by its slug.
    */
  def marketplaceCategory[A](slug: String, useTopicAliases: Option[Boolean] = None)(innerSelection: SelectionBuilder[MarketplaceCategory, A])(implicit
    encoder0: ArgEncoder[String],
    encoder1: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "marketplaceCategory",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("slug", slug, "String!")(encoder0), Argument("useTopicAliases", useTopicAliases, "Boolean")(encoder1))
  )

  /** Look up a single Marketplace listing
    */
  def marketplaceListing[A](slug: String)(innerSelection: SelectionBuilder[MarketplaceListing, A])(implicit
    encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("marketplaceListing", OptionOf(Obj(innerSelection)), arguments = List(Argument("slug", slug, "String!")(encoder0)))

  /** Look up Marketplace listings
    */
  def marketplaceListings[A](
    adminId: Option[String]              = None,
    after: Option[String]                = None,
    allStates: Option[Boolean]           = None,
    before: Option[String]               = None,
    categorySlug: Option[String]         = None,
    first: Option[Int]                   = None,
    last: Option[Int]                    = None,
    organizationId: Option[String]       = None,
    primaryCategoryOnly: Option[Boolean] = None,
    slugs: Option[List[Option[String]]]  = None,
    useTopicAliases: Option[Boolean]     = None,
    viewerCanAdmin: Option[Boolean]      = None,
    withFreeTrialsOnly: Option[Boolean]  = None
  )(innerSelection: SelectionBuilder[MarketplaceListingConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Boolean]],
    encoder3: ArgEncoder[Option[String]],
    encoder4: ArgEncoder[Option[String]],
    encoder5: ArgEncoder[Option[Int]],
    encoder6: ArgEncoder[Option[Int]],
    encoder7: ArgEncoder[Option[String]],
    encoder8: ArgEncoder[Option[Boolean]],
    encoder9: ArgEncoder[Option[List[Option[String]]]],
    encoder10: ArgEncoder[Option[Boolean]],
    encoder11: ArgEncoder[Option[Boolean]],
    encoder12: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, A] = _root_.caliban.client.SelectionBuilder.Field(
    "marketplaceListings",
    Obj(innerSelection),
    arguments = List(
      Argument("adminId", adminId, "ID")(encoder0),
      Argument("after", after, "String")(encoder1),
      Argument("allStates", allStates, "Boolean")(encoder2),
      Argument("before", before, "String")(encoder3),
      Argument("categorySlug", categorySlug, "String")(encoder4),
      Argument("first", first, "Int")(encoder5),
      Argument("last", last, "Int")(encoder6),
      Argument("organizationId", organizationId, "ID")(encoder7),
      Argument("primaryCategoryOnly", primaryCategoryOnly, "Boolean")(encoder8),
      Argument("slugs", slugs, "[String]")(encoder9),
      Argument("useTopicAliases", useTopicAliases, "Boolean")(encoder10),
      Argument("viewerCanAdmin", viewerCanAdmin, "Boolean")(encoder11),
      Argument("withFreeTrialsOnly", withFreeTrialsOnly, "Boolean")(encoder12)
    )
  )

  /** Return information about the GitHub instance
    */
  def meta[A](innerSelection: SelectionBuilder[GitHubMetadata, A]): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, A] =
    _root_.caliban.client.SelectionBuilder.Field("meta", Obj(innerSelection))

  /** Fetches an object given its ID.
    */
  def node[A](id: String)(
    onAddedToProjectEvent: Option[SelectionBuilder[AddedToProjectEvent, A]]                                                       = None,
    onApp: Option[SelectionBuilder[App, A]]                                                                                       = None,
    onAssignedEvent: Option[SelectionBuilder[AssignedEvent, A]]                                                                   = None,
    onAutoMergeDisabledEvent: Option[SelectionBuilder[AutoMergeDisabledEvent, A]]                                                 = None,
    onAutoMergeEnabledEvent: Option[SelectionBuilder[AutoMergeEnabledEvent, A]]                                                   = None,
    onAutoRebaseEnabledEvent: Option[SelectionBuilder[AutoRebaseEnabledEvent, A]]                                                 = None,
    onAutoSquashEnabledEvent: Option[SelectionBuilder[AutoSquashEnabledEvent, A]]                                                 = None,
    onAutomaticBaseChangeFailedEvent: Option[SelectionBuilder[AutomaticBaseChangeFailedEvent, A]]                                 = None,
    onAutomaticBaseChangeSucceededEvent: Option[SelectionBuilder[AutomaticBaseChangeSucceededEvent, A]]                           = None,
    onBaseRefChangedEvent: Option[SelectionBuilder[BaseRefChangedEvent, A]]                                                       = None,
    onBaseRefDeletedEvent: Option[SelectionBuilder[BaseRefDeletedEvent, A]]                                                       = None,
    onBaseRefForcePushedEvent: Option[SelectionBuilder[BaseRefForcePushedEvent, A]]                                               = None,
    onBlob: Option[SelectionBuilder[Blob, A]]                                                                                     = None,
    onBot: Option[SelectionBuilder[Bot, A]]                                                                                       = None,
    onBranchProtectionRule: Option[SelectionBuilder[BranchProtectionRule, A]]                                                     = None,
    onCWE: Option[SelectionBuilder[CWE, A]]                                                                                       = None,
    onCheckRun: Option[SelectionBuilder[CheckRun, A]]                                                                             = None,
    onCheckSuite: Option[SelectionBuilder[CheckSuite, A]]                                                                         = None,
    onClosedEvent: Option[SelectionBuilder[ClosedEvent, A]]                                                                       = None,
    onCodeOfConduct: Option[SelectionBuilder[CodeOfConduct, A]]                                                                   = None,
    onCommentDeletedEvent: Option[SelectionBuilder[CommentDeletedEvent, A]]                                                       = None,
    onCommit: Option[SelectionBuilder[Commit, A]]                                                                                 = None,
    onCommitComment: Option[SelectionBuilder[CommitComment, A]]                                                                   = None,
    onCommitCommentThread: Option[SelectionBuilder[CommitCommentThread, A]]                                                       = None,
    onConnectedEvent: Option[SelectionBuilder[ConnectedEvent, A]]                                                                 = None,
    onConvertToDraftEvent: Option[SelectionBuilder[ConvertToDraftEvent, A]]                                                       = None,
    onConvertedNoteToIssueEvent: Option[SelectionBuilder[ConvertedNoteToIssueEvent, A]]                                           = None,
    onCrossReferencedEvent: Option[SelectionBuilder[CrossReferencedEvent, A]]                                                     = None,
    onDemilestonedEvent: Option[SelectionBuilder[DemilestonedEvent, A]]                                                           = None,
    onDependencyGraphManifest: Option[SelectionBuilder[DependencyGraphManifest, A]]                                               = None,
    onDeployKey: Option[SelectionBuilder[DeployKey, A]]                                                                           = None,
    onDeployedEvent: Option[SelectionBuilder[DeployedEvent, A]]                                                                   = None,
    onDeployment: Option[SelectionBuilder[Deployment, A]]                                                                         = None,
    onDeploymentEnvironmentChangedEvent: Option[SelectionBuilder[DeploymentEnvironmentChangedEvent, A]]                           = None,
    onDeploymentReview: Option[SelectionBuilder[DeploymentReview, A]]                                                             = None,
    onDeploymentStatus: Option[SelectionBuilder[DeploymentStatus, A]]                                                             = None,
    onDisconnectedEvent: Option[SelectionBuilder[DisconnectedEvent, A]]                                                           = None,
    onDiscussion: Option[SelectionBuilder[Discussion, A]]                                                                         = None,
    onDiscussionCategory: Option[SelectionBuilder[DiscussionCategory, A]]                                                         = None,
    onDiscussionComment: Option[SelectionBuilder[DiscussionComment, A]]                                                           = None,
    onEnterprise: Option[SelectionBuilder[Enterprise, A]]                                                                         = None,
    onEnterpriseAdministratorInvitation: Option[SelectionBuilder[EnterpriseAdministratorInvitation, A]]                           = None,
    onEnterpriseIdentityProvider: Option[SelectionBuilder[EnterpriseIdentityProvider, A]]                                         = None,
    onEnterpriseRepositoryInfo: Option[SelectionBuilder[EnterpriseRepositoryInfo, A]]                                             = None,
    onEnterpriseServerInstallation: Option[SelectionBuilder[EnterpriseServerInstallation, A]]                                     = None,
    onEnterpriseServerUserAccount: Option[SelectionBuilder[EnterpriseServerUserAccount, A]]                                       = None,
    onEnterpriseServerUserAccountEmail: Option[SelectionBuilder[EnterpriseServerUserAccountEmail, A]]                             = None,
    onEnterpriseServerUserAccountsUpload: Option[SelectionBuilder[EnterpriseServerUserAccountsUpload, A]]                         = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]]                                                   = None,
    onEnvironment: Option[SelectionBuilder[Environment, A]]                                                                       = None,
    onExternalIdentity: Option[SelectionBuilder[ExternalIdentity, A]]                                                             = None,
    onGist: Option[SelectionBuilder[Gist, A]]                                                                                     = None,
    onGistComment: Option[SelectionBuilder[GistComment, A]]                                                                       = None,
    onHeadRefDeletedEvent: Option[SelectionBuilder[HeadRefDeletedEvent, A]]                                                       = None,
    onHeadRefForcePushedEvent: Option[SelectionBuilder[HeadRefForcePushedEvent, A]]                                               = None,
    onHeadRefRestoredEvent: Option[SelectionBuilder[HeadRefRestoredEvent, A]]                                                     = None,
    onIpAllowListEntry: Option[SelectionBuilder[IpAllowListEntry, A]]                                                             = None,
    onIssue: Option[SelectionBuilder[Issue, A]]                                                                                   = None,
    onIssueComment: Option[SelectionBuilder[IssueComment, A]]                                                                     = None,
    onLabel: Option[SelectionBuilder[Label, A]]                                                                                   = None,
    onLabeledEvent: Option[SelectionBuilder[LabeledEvent, A]]                                                                     = None,
    onLanguage: Option[SelectionBuilder[Language, A]]                                                                             = None,
    onLicense: Option[SelectionBuilder[License, A]]                                                                               = None,
    onLockedEvent: Option[SelectionBuilder[LockedEvent, A]]                                                                       = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                                                                           = None,
    onMarkedAsDuplicateEvent: Option[SelectionBuilder[MarkedAsDuplicateEvent, A]]                                                 = None,
    onMarketplaceCategory: Option[SelectionBuilder[MarketplaceCategory, A]]                                                       = None,
    onMarketplaceListing: Option[SelectionBuilder[MarketplaceListing, A]]                                                         = None,
    onMembersCanDeleteReposClearAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposClearAuditEntry, A]]                     = None,
    onMembersCanDeleteReposDisableAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposDisableAuditEntry, A]]                 = None,
    onMembersCanDeleteReposEnableAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposEnableAuditEntry, A]]                   = None,
    onMentionedEvent: Option[SelectionBuilder[MentionedEvent, A]]                                                                 = None,
    onMergedEvent: Option[SelectionBuilder[MergedEvent, A]]                                                                       = None,
    onMilestone: Option[SelectionBuilder[Milestone, A]]                                                                           = None,
    onMilestonedEvent: Option[SelectionBuilder[MilestonedEvent, A]]                                                               = None,
    onMovedColumnsInProjectEvent: Option[SelectionBuilder[MovedColumnsInProjectEvent, A]]                                         = None,
    onOIDCProvider: Option[SelectionBuilder[OIDCProvider, A]]                                                                     = None,
    onOauthApplicationCreateAuditEntry: Option[SelectionBuilder[OauthApplicationCreateAuditEntry, A]]                             = None,
    onOrgAddBillingManagerAuditEntry: Option[SelectionBuilder[OrgAddBillingManagerAuditEntry, A]]                                 = None,
    onOrgAddMemberAuditEntry: Option[SelectionBuilder[OrgAddMemberAuditEntry, A]]                                                 = None,
    onOrgBlockUserAuditEntry: Option[SelectionBuilder[OrgBlockUserAuditEntry, A]]                                                 = None,
    onOrgConfigDisableCollaboratorsOnlyAuditEntry: Option[SelectionBuilder[OrgConfigDisableCollaboratorsOnlyAuditEntry, A]]       = None,
    onOrgConfigEnableCollaboratorsOnlyAuditEntry: Option[SelectionBuilder[OrgConfigEnableCollaboratorsOnlyAuditEntry, A]]         = None,
    onOrgCreateAuditEntry: Option[SelectionBuilder[OrgCreateAuditEntry, A]]                                                       = None,
    onOrgDisableOauthAppRestrictionsAuditEntry: Option[SelectionBuilder[OrgDisableOauthAppRestrictionsAuditEntry, A]]             = None,
    onOrgDisableSamlAuditEntry: Option[SelectionBuilder[OrgDisableSamlAuditEntry, A]]                                             = None,
    onOrgDisableTwoFactorRequirementAuditEntry: Option[SelectionBuilder[OrgDisableTwoFactorRequirementAuditEntry, A]]             = None,
    onOrgEnableOauthAppRestrictionsAuditEntry: Option[SelectionBuilder[OrgEnableOauthAppRestrictionsAuditEntry, A]]               = None,
    onOrgEnableSamlAuditEntry: Option[SelectionBuilder[OrgEnableSamlAuditEntry, A]]                                               = None,
    onOrgEnableTwoFactorRequirementAuditEntry: Option[SelectionBuilder[OrgEnableTwoFactorRequirementAuditEntry, A]]               = None,
    onOrgInviteMemberAuditEntry: Option[SelectionBuilder[OrgInviteMemberAuditEntry, A]]                                           = None,
    onOrgInviteToBusinessAuditEntry: Option[SelectionBuilder[OrgInviteToBusinessAuditEntry, A]]                                   = None,
    onOrgOauthAppAccessApprovedAuditEntry: Option[SelectionBuilder[OrgOauthAppAccessApprovedAuditEntry, A]]                       = None,
    onOrgOauthAppAccessDeniedAuditEntry: Option[SelectionBuilder[OrgOauthAppAccessDeniedAuditEntry, A]]                           = None,
    onOrgOauthAppAccessRequestedAuditEntry: Option[SelectionBuilder[OrgOauthAppAccessRequestedAuditEntry, A]]                     = None,
    onOrgRemoveBillingManagerAuditEntry: Option[SelectionBuilder[OrgRemoveBillingManagerAuditEntry, A]]                           = None,
    onOrgRemoveMemberAuditEntry: Option[SelectionBuilder[OrgRemoveMemberAuditEntry, A]]                                           = None,
    onOrgRemoveOutsideCollaboratorAuditEntry: Option[SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, A]]                 = None,
    onOrgRestoreMemberAuditEntry: Option[SelectionBuilder[OrgRestoreMemberAuditEntry, A]]                                         = None,
    onOrgUnblockUserAuditEntry: Option[SelectionBuilder[OrgUnblockUserAuditEntry, A]]                                             = None,
    onOrgUpdateDefaultRepositoryPermissionAuditEntry: Option[SelectionBuilder[OrgUpdateDefaultRepositoryPermissionAuditEntry, A]] = None,
    onOrgUpdateMemberAuditEntry: Option[SelectionBuilder[OrgUpdateMemberAuditEntry, A]]                                           = None,
    onOrgUpdateMemberRepositoryCreationPermissionAuditEntry: Option[SelectionBuilder[OrgUpdateMemberRepositoryCreationPermissionAuditEntry, A]] =
      None,
    onOrgUpdateMemberRepositoryInvitationPermissionAuditEntry: Option[SelectionBuilder[OrgUpdateMemberRepositoryInvitationPermissionAuditEntry, A]] =
      None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                                                                       = None,
    onOrganizationIdentityProvider: Option[SelectionBuilder[OrganizationIdentityProvider, A]]                                       = None,
    onOrganizationInvitation: Option[SelectionBuilder[OrganizationInvitation, A]]                                                   = None,
    onPackage: Option[SelectionBuilder[Package_1, A]]                                                                               = None,
    onPackageFile: Option[SelectionBuilder[PackageFile, A]]                                                                         = None,
    onPackageTag: Option[SelectionBuilder[PackageTag, A]]                                                                           = None,
    onPackageVersion: Option[SelectionBuilder[PackageVersion, A]]                                                                   = None,
    onPinnedDiscussion: Option[SelectionBuilder[PinnedDiscussion, A]]                                                               = None,
    onPinnedEvent: Option[SelectionBuilder[PinnedEvent, A]]                                                                         = None,
    onPinnedIssue: Option[SelectionBuilder[PinnedIssue, A]]                                                                         = None,
    onPrivateRepositoryForkingDisableAuditEntry: Option[SelectionBuilder[PrivateRepositoryForkingDisableAuditEntry, A]]             = None,
    onPrivateRepositoryForkingEnableAuditEntry: Option[SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, A]]               = None,
    onProject: Option[SelectionBuilder[Project, A]]                                                                                 = None,
    onProjectCard: Option[SelectionBuilder[ProjectCard, A]]                                                                         = None,
    onProjectColumn: Option[SelectionBuilder[ProjectColumn, A]]                                                                     = None,
    onProjectNext: Option[SelectionBuilder[ProjectNext, A]]                                                                         = None,
    onProjectNextItem: Option[SelectionBuilder[ProjectNextItem, A]]                                                                 = None,
    onProjectNextItemFieldValue: Option[SelectionBuilder[ProjectNextItemFieldValue, A]]                                             = None,
    onPublicKey: Option[SelectionBuilder[PublicKey, A]]                                                                             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]]                                                                         = None,
    onPullRequestCommit: Option[SelectionBuilder[PullRequestCommit, A]]                                                             = None,
    onPullRequestCommitCommentThread: Option[SelectionBuilder[PullRequestCommitCommentThread, A]]                                   = None,
    onPullRequestReview: Option[SelectionBuilder[PullRequestReview, A]]                                                             = None,
    onPullRequestReviewComment: Option[SelectionBuilder[PullRequestReviewComment, A]]                                               = None,
    onPullRequestReviewThread: Option[SelectionBuilder[PullRequestReviewThread, A]]                                                 = None,
    onPush: Option[SelectionBuilder[Push, A]]                                                                                       = None,
    onPushAllowance: Option[SelectionBuilder[PushAllowance, A]]                                                                     = None,
    onReaction: Option[SelectionBuilder[Reaction, A]]                                                                               = None,
    onReadyForReviewEvent: Option[SelectionBuilder[ReadyForReviewEvent, A]]                                                         = None,
    onRef: Option[SelectionBuilder[Ref, A]]                                                                                         = None,
    onReferencedEvent: Option[SelectionBuilder[ReferencedEvent, A]]                                                                 = None,
    onRelease: Option[SelectionBuilder[Release, A]]                                                                                 = None,
    onReleaseAsset: Option[SelectionBuilder[ReleaseAsset, A]]                                                                       = None,
    onRemovedFromProjectEvent: Option[SelectionBuilder[RemovedFromProjectEvent, A]]                                                 = None,
    onRenamedTitleEvent: Option[SelectionBuilder[RenamedTitleEvent, A]]                                                             = None,
    onReopenedEvent: Option[SelectionBuilder[ReopenedEvent, A]]                                                                     = None,
    onRepoAccessAuditEntry: Option[SelectionBuilder[RepoAccessAuditEntry, A]]                                                       = None,
    onRepoAddMemberAuditEntry: Option[SelectionBuilder[RepoAddMemberAuditEntry, A]]                                                 = None,
    onRepoAddTopicAuditEntry: Option[SelectionBuilder[RepoAddTopicAuditEntry, A]]                                                   = None,
    onRepoArchivedAuditEntry: Option[SelectionBuilder[RepoArchivedAuditEntry, A]]                                                   = None,
    onRepoChangeMergeSettingAuditEntry: Option[SelectionBuilder[RepoChangeMergeSettingAuditEntry, A]]                               = None,
    onRepoConfigDisableAnonymousGitAccessAuditEntry: Option[SelectionBuilder[RepoConfigDisableAnonymousGitAccessAuditEntry, A]]     = None,
    onRepoConfigDisableCollaboratorsOnlyAuditEntry: Option[SelectionBuilder[RepoConfigDisableCollaboratorsOnlyAuditEntry, A]]       = None,
    onRepoConfigDisableContributorsOnlyAuditEntry: Option[SelectionBuilder[RepoConfigDisableContributorsOnlyAuditEntry, A]]         = None,
    onRepoConfigDisableSockpuppetDisallowedAuditEntry: Option[SelectionBuilder[RepoConfigDisableSockpuppetDisallowedAuditEntry, A]] = None,
    onRepoConfigEnableAnonymousGitAccessAuditEntry: Option[SelectionBuilder[RepoConfigEnableAnonymousGitAccessAuditEntry, A]]       = None,
    onRepoConfigEnableCollaboratorsOnlyAuditEntry: Option[SelectionBuilder[RepoConfigEnableCollaboratorsOnlyAuditEntry, A]]         = None,
    onRepoConfigEnableContributorsOnlyAuditEntry: Option[SelectionBuilder[RepoConfigEnableContributorsOnlyAuditEntry, A]]           = None,
    onRepoConfigEnableSockpuppetDisallowedAuditEntry: Option[SelectionBuilder[RepoConfigEnableSockpuppetDisallowedAuditEntry, A]]   = None,
    onRepoConfigLockAnonymousGitAccessAuditEntry: Option[SelectionBuilder[RepoConfigLockAnonymousGitAccessAuditEntry, A]]           = None,
    onRepoConfigUnlockAnonymousGitAccessAuditEntry: Option[SelectionBuilder[RepoConfigUnlockAnonymousGitAccessAuditEntry, A]]       = None,
    onRepoCreateAuditEntry: Option[SelectionBuilder[RepoCreateAuditEntry, A]]                                                       = None,
    onRepoDestroyAuditEntry: Option[SelectionBuilder[RepoDestroyAuditEntry, A]]                                                     = None,
    onRepoRemoveMemberAuditEntry: Option[SelectionBuilder[RepoRemoveMemberAuditEntry, A]]                                           = None,
    onRepoRemoveTopicAuditEntry: Option[SelectionBuilder[RepoRemoveTopicAuditEntry, A]]                                             = None,
    onRepository: Option[SelectionBuilder[Repository, A]]                                                                           = None,
    onRepositoryInvitation: Option[SelectionBuilder[RepositoryInvitation, A]]                                                       = None,
    onRepositoryTopic: Option[SelectionBuilder[RepositoryTopic, A]]                                                                 = None,
    onRepositoryVisibilityChangeDisableAuditEntry: Option[SelectionBuilder[RepositoryVisibilityChangeDisableAuditEntry, A]]         = None,
    onRepositoryVisibilityChangeEnableAuditEntry: Option[SelectionBuilder[RepositoryVisibilityChangeEnableAuditEntry, A]]           = None,
    onRepositoryVulnerabilityAlert: Option[SelectionBuilder[RepositoryVulnerabilityAlert, A]]                                       = None,
    onReviewDismissalAllowance: Option[SelectionBuilder[ReviewDismissalAllowance, A]]                                               = None,
    onReviewDismissedEvent: Option[SelectionBuilder[ReviewDismissedEvent, A]]                                                       = None,
    onReviewRequest: Option[SelectionBuilder[ReviewRequest, A]]                                                                     = None,
    onReviewRequestRemovedEvent: Option[SelectionBuilder[ReviewRequestRemovedEvent, A]]                                             = None,
    onReviewRequestedEvent: Option[SelectionBuilder[ReviewRequestedEvent, A]]                                                       = None,
    onSavedReply: Option[SelectionBuilder[SavedReply, A]]                                                                           = None,
    onSecurityAdvisory: Option[SelectionBuilder[SecurityAdvisory, A]]                                                               = None,
    onSponsorsActivity: Option[SelectionBuilder[SponsorsActivity, A]]                                                               = None,
    onSponsorsListing: Option[SelectionBuilder[SponsorsListing, A]]                                                                 = None,
    onSponsorsTier: Option[SelectionBuilder[SponsorsTier, A]]                                                                       = None,
    onSponsorship: Option[SelectionBuilder[Sponsorship, A]]                                                                         = None,
    onSponsorshipNewsletter: Option[SelectionBuilder[SponsorshipNewsletter, A]]                                                     = None,
    onStatus: Option[SelectionBuilder[Status, A]]                                                                                   = None,
    onStatusCheckRollup: Option[SelectionBuilder[StatusCheckRollup, A]]                                                             = None,
    onStatusContext: Option[SelectionBuilder[StatusContext, A]]                                                                     = None,
    onSubscribedEvent: Option[SelectionBuilder[SubscribedEvent, A]]                                                                 = None,
    onTag: Option[SelectionBuilder[Tag, A]]                                                                                         = None,
    onTeam: Option[SelectionBuilder[Team, A]]                                                                                       = None,
    onTeamAddMemberAuditEntry: Option[SelectionBuilder[TeamAddMemberAuditEntry, A]]                                                 = None,
    onTeamAddRepositoryAuditEntry: Option[SelectionBuilder[TeamAddRepositoryAuditEntry, A]]                                         = None,
    onTeamChangeParentTeamAuditEntry: Option[SelectionBuilder[TeamChangeParentTeamAuditEntry, A]]                                   = None,
    onTeamDiscussion: Option[SelectionBuilder[TeamDiscussion, A]]                                                                   = None,
    onTeamDiscussionComment: Option[SelectionBuilder[TeamDiscussionComment, A]]                                                     = None,
    onTeamRemoveMemberAuditEntry: Option[SelectionBuilder[TeamRemoveMemberAuditEntry, A]]                                           = None,
    onTeamRemoveRepositoryAuditEntry: Option[SelectionBuilder[TeamRemoveRepositoryAuditEntry, A]]                                   = None,
    onTopic: Option[SelectionBuilder[Topic, A]]                                                                                     = None,
    onTransferredEvent: Option[SelectionBuilder[TransferredEvent, A]]                                                               = None,
    onTree: Option[SelectionBuilder[Tree, A]]                                                                                       = None,
    onUnassignedEvent: Option[SelectionBuilder[UnassignedEvent, A]]                                                                 = None,
    onUnlabeledEvent: Option[SelectionBuilder[UnlabeledEvent, A]]                                                                   = None,
    onUnlockedEvent: Option[SelectionBuilder[UnlockedEvent, A]]                                                                     = None,
    onUnmarkedAsDuplicateEvent: Option[SelectionBuilder[UnmarkedAsDuplicateEvent, A]]                                               = None,
    onUnpinnedEvent: Option[SelectionBuilder[UnpinnedEvent, A]]                                                                     = None,
    onUnsubscribedEvent: Option[SelectionBuilder[UnsubscribedEvent, A]]                                                             = None,
    onUser: Option[SelectionBuilder[User, A]]                                                                                       = None,
    onUserBlockedEvent: Option[SelectionBuilder[UserBlockedEvent, A]]                                                               = None,
    onUserContentEdit: Option[SelectionBuilder[UserContentEdit, A]]                                                                 = None,
    onUserStatus: Option[SelectionBuilder[UserStatus, A]]                                                                           = None,
    onVerifiableDomain: Option[SelectionBuilder[VerifiableDomain, A]]                                                               = None,
    onWorkflow: Option[SelectionBuilder[Workflow, A]]                                                                               = None,
    onWorkflowRun: Option[SelectionBuilder[WorkflowRun, A]]                                                                         = None
  )(implicit encoder0: ArgEncoder[String]): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "node",
      OptionOf(
        ChoiceOf(
          Map(
            "AddedToProjectEvent"                                     -> onAddedToProjectEvent,
            "App"                                                     -> onApp,
            "AssignedEvent"                                           -> onAssignedEvent,
            "AutoMergeDisabledEvent"                                  -> onAutoMergeDisabledEvent,
            "AutoMergeEnabledEvent"                                   -> onAutoMergeEnabledEvent,
            "AutoRebaseEnabledEvent"                                  -> onAutoRebaseEnabledEvent,
            "AutoSquashEnabledEvent"                                  -> onAutoSquashEnabledEvent,
            "AutomaticBaseChangeFailedEvent"                          -> onAutomaticBaseChangeFailedEvent,
            "AutomaticBaseChangeSucceededEvent"                       -> onAutomaticBaseChangeSucceededEvent,
            "BaseRefChangedEvent"                                     -> onBaseRefChangedEvent,
            "BaseRefDeletedEvent"                                     -> onBaseRefDeletedEvent,
            "BaseRefForcePushedEvent"                                 -> onBaseRefForcePushedEvent,
            "Blob"                                                    -> onBlob,
            "Bot"                                                     -> onBot,
            "BranchProtectionRule"                                    -> onBranchProtectionRule,
            "CWE"                                                     -> onCWE,
            "CheckRun"                                                -> onCheckRun,
            "CheckSuite"                                              -> onCheckSuite,
            "ClosedEvent"                                             -> onClosedEvent,
            "CodeOfConduct"                                           -> onCodeOfConduct,
            "CommentDeletedEvent"                                     -> onCommentDeletedEvent,
            "Commit"                                                  -> onCommit,
            "CommitComment"                                           -> onCommitComment,
            "CommitCommentThread"                                     -> onCommitCommentThread,
            "ConnectedEvent"                                          -> onConnectedEvent,
            "ConvertToDraftEvent"                                     -> onConvertToDraftEvent,
            "ConvertedNoteToIssueEvent"                               -> onConvertedNoteToIssueEvent,
            "CrossReferencedEvent"                                    -> onCrossReferencedEvent,
            "DemilestonedEvent"                                       -> onDemilestonedEvent,
            "DependencyGraphManifest"                                 -> onDependencyGraphManifest,
            "DeployKey"                                               -> onDeployKey,
            "DeployedEvent"                                           -> onDeployedEvent,
            "Deployment"                                              -> onDeployment,
            "DeploymentEnvironmentChangedEvent"                       -> onDeploymentEnvironmentChangedEvent,
            "DeploymentReview"                                        -> onDeploymentReview,
            "DeploymentStatus"                                        -> onDeploymentStatus,
            "DisconnectedEvent"                                       -> onDisconnectedEvent,
            "Discussion"                                              -> onDiscussion,
            "DiscussionCategory"                                      -> onDiscussionCategory,
            "DiscussionComment"                                       -> onDiscussionComment,
            "Enterprise"                                              -> onEnterprise,
            "EnterpriseAdministratorInvitation"                       -> onEnterpriseAdministratorInvitation,
            "EnterpriseIdentityProvider"                              -> onEnterpriseIdentityProvider,
            "EnterpriseRepositoryInfo"                                -> onEnterpriseRepositoryInfo,
            "EnterpriseServerInstallation"                            -> onEnterpriseServerInstallation,
            "EnterpriseServerUserAccount"                             -> onEnterpriseServerUserAccount,
            "EnterpriseServerUserAccountEmail"                        -> onEnterpriseServerUserAccountEmail,
            "EnterpriseServerUserAccountsUpload"                      -> onEnterpriseServerUserAccountsUpload,
            "EnterpriseUserAccount"                                   -> onEnterpriseUserAccount,
            "Environment"                                             -> onEnvironment,
            "ExternalIdentity"                                        -> onExternalIdentity,
            "Gist"                                                    -> onGist,
            "GistComment"                                             -> onGistComment,
            "HeadRefDeletedEvent"                                     -> onHeadRefDeletedEvent,
            "HeadRefForcePushedEvent"                                 -> onHeadRefForcePushedEvent,
            "HeadRefRestoredEvent"                                    -> onHeadRefRestoredEvent,
            "IpAllowListEntry"                                        -> onIpAllowListEntry,
            "Issue"                                                   -> onIssue,
            "IssueComment"                                            -> onIssueComment,
            "Label"                                                   -> onLabel,
            "LabeledEvent"                                            -> onLabeledEvent,
            "Language"                                                -> onLanguage,
            "License"                                                 -> onLicense,
            "LockedEvent"                                             -> onLockedEvent,
            "Mannequin"                                               -> onMannequin,
            "MarkedAsDuplicateEvent"                                  -> onMarkedAsDuplicateEvent,
            "MarketplaceCategory"                                     -> onMarketplaceCategory,
            "MarketplaceListing"                                      -> onMarketplaceListing,
            "MembersCanDeleteReposClearAuditEntry"                    -> onMembersCanDeleteReposClearAuditEntry,
            "MembersCanDeleteReposDisableAuditEntry"                  -> onMembersCanDeleteReposDisableAuditEntry,
            "MembersCanDeleteReposEnableAuditEntry"                   -> onMembersCanDeleteReposEnableAuditEntry,
            "MentionedEvent"                                          -> onMentionedEvent,
            "MergedEvent"                                             -> onMergedEvent,
            "Milestone"                                               -> onMilestone,
            "MilestonedEvent"                                         -> onMilestonedEvent,
            "MovedColumnsInProjectEvent"                              -> onMovedColumnsInProjectEvent,
            "OIDCProvider"                                            -> onOIDCProvider,
            "OauthApplicationCreateAuditEntry"                        -> onOauthApplicationCreateAuditEntry,
            "OrgAddBillingManagerAuditEntry"                          -> onOrgAddBillingManagerAuditEntry,
            "OrgAddMemberAuditEntry"                                  -> onOrgAddMemberAuditEntry,
            "OrgBlockUserAuditEntry"                                  -> onOrgBlockUserAuditEntry,
            "OrgConfigDisableCollaboratorsOnlyAuditEntry"             -> onOrgConfigDisableCollaboratorsOnlyAuditEntry,
            "OrgConfigEnableCollaboratorsOnlyAuditEntry"              -> onOrgConfigEnableCollaboratorsOnlyAuditEntry,
            "OrgCreateAuditEntry"                                     -> onOrgCreateAuditEntry,
            "OrgDisableOauthAppRestrictionsAuditEntry"                -> onOrgDisableOauthAppRestrictionsAuditEntry,
            "OrgDisableSamlAuditEntry"                                -> onOrgDisableSamlAuditEntry,
            "OrgDisableTwoFactorRequirementAuditEntry"                -> onOrgDisableTwoFactorRequirementAuditEntry,
            "OrgEnableOauthAppRestrictionsAuditEntry"                 -> onOrgEnableOauthAppRestrictionsAuditEntry,
            "OrgEnableSamlAuditEntry"                                 -> onOrgEnableSamlAuditEntry,
            "OrgEnableTwoFactorRequirementAuditEntry"                 -> onOrgEnableTwoFactorRequirementAuditEntry,
            "OrgInviteMemberAuditEntry"                               -> onOrgInviteMemberAuditEntry,
            "OrgInviteToBusinessAuditEntry"                           -> onOrgInviteToBusinessAuditEntry,
            "OrgOauthAppAccessApprovedAuditEntry"                     -> onOrgOauthAppAccessApprovedAuditEntry,
            "OrgOauthAppAccessDeniedAuditEntry"                       -> onOrgOauthAppAccessDeniedAuditEntry,
            "OrgOauthAppAccessRequestedAuditEntry"                    -> onOrgOauthAppAccessRequestedAuditEntry,
            "OrgRemoveBillingManagerAuditEntry"                       -> onOrgRemoveBillingManagerAuditEntry,
            "OrgRemoveMemberAuditEntry"                               -> onOrgRemoveMemberAuditEntry,
            "OrgRemoveOutsideCollaboratorAuditEntry"                  -> onOrgRemoveOutsideCollaboratorAuditEntry,
            "OrgRestoreMemberAuditEntry"                              -> onOrgRestoreMemberAuditEntry,
            "OrgUnblockUserAuditEntry"                                -> onOrgUnblockUserAuditEntry,
            "OrgUpdateDefaultRepositoryPermissionAuditEntry"          -> onOrgUpdateDefaultRepositoryPermissionAuditEntry,
            "OrgUpdateMemberAuditEntry"                               -> onOrgUpdateMemberAuditEntry,
            "OrgUpdateMemberRepositoryCreationPermissionAuditEntry"   -> onOrgUpdateMemberRepositoryCreationPermissionAuditEntry,
            "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry" -> onOrgUpdateMemberRepositoryInvitationPermissionAuditEntry,
            "Organization"                                            -> onOrganization,
            "OrganizationIdentityProvider"                            -> onOrganizationIdentityProvider,
            "OrganizationInvitation"                                  -> onOrganizationInvitation,
            "Package"                                                 -> onPackage,
            "PackageFile"                                             -> onPackageFile,
            "PackageTag"                                              -> onPackageTag,
            "PackageVersion"                                          -> onPackageVersion,
            "PinnedDiscussion"                                        -> onPinnedDiscussion,
            "PinnedEvent"                                             -> onPinnedEvent,
            "PinnedIssue"                                             -> onPinnedIssue,
            "PrivateRepositoryForkingDisableAuditEntry"               -> onPrivateRepositoryForkingDisableAuditEntry,
            "PrivateRepositoryForkingEnableAuditEntry"                -> onPrivateRepositoryForkingEnableAuditEntry,
            "Project"                                                 -> onProject,
            "ProjectCard"                                             -> onProjectCard,
            "ProjectColumn"                                           -> onProjectColumn,
            "ProjectNext"                                             -> onProjectNext,
            "ProjectNextItem"                                         -> onProjectNextItem,
            "ProjectNextItemFieldValue"                               -> onProjectNextItemFieldValue,
            "PublicKey"                                               -> onPublicKey,
            "PullRequest"                                             -> onPullRequest,
            "PullRequestCommit"                                       -> onPullRequestCommit,
            "PullRequestCommitCommentThread"                          -> onPullRequestCommitCommentThread,
            "PullRequestReview"                                       -> onPullRequestReview,
            "PullRequestReviewComment"                                -> onPullRequestReviewComment,
            "PullRequestReviewThread"                                 -> onPullRequestReviewThread,
            "Push"                                                    -> onPush,
            "PushAllowance"                                           -> onPushAllowance,
            "Reaction"                                                -> onReaction,
            "ReadyForReviewEvent"                                     -> onReadyForReviewEvent,
            "Ref"                                                     -> onRef,
            "ReferencedEvent"                                         -> onReferencedEvent,
            "Release"                                                 -> onRelease,
            "ReleaseAsset"                                            -> onReleaseAsset,
            "RemovedFromProjectEvent"                                 -> onRemovedFromProjectEvent,
            "RenamedTitleEvent"                                       -> onRenamedTitleEvent,
            "ReopenedEvent"                                           -> onReopenedEvent,
            "RepoAccessAuditEntry"                                    -> onRepoAccessAuditEntry,
            "RepoAddMemberAuditEntry"                                 -> onRepoAddMemberAuditEntry,
            "RepoAddTopicAuditEntry"                                  -> onRepoAddTopicAuditEntry,
            "RepoArchivedAuditEntry"                                  -> onRepoArchivedAuditEntry,
            "RepoChangeMergeSettingAuditEntry"                        -> onRepoChangeMergeSettingAuditEntry,
            "RepoConfigDisableAnonymousGitAccessAuditEntry"           -> onRepoConfigDisableAnonymousGitAccessAuditEntry,
            "RepoConfigDisableCollaboratorsOnlyAuditEntry"            -> onRepoConfigDisableCollaboratorsOnlyAuditEntry,
            "RepoConfigDisableContributorsOnlyAuditEntry"             -> onRepoConfigDisableContributorsOnlyAuditEntry,
            "RepoConfigDisableSockpuppetDisallowedAuditEntry"         -> onRepoConfigDisableSockpuppetDisallowedAuditEntry,
            "RepoConfigEnableAnonymousGitAccessAuditEntry"            -> onRepoConfigEnableAnonymousGitAccessAuditEntry,
            "RepoConfigEnableCollaboratorsOnlyAuditEntry"             -> onRepoConfigEnableCollaboratorsOnlyAuditEntry,
            "RepoConfigEnableContributorsOnlyAuditEntry"              -> onRepoConfigEnableContributorsOnlyAuditEntry,
            "RepoConfigEnableSockpuppetDisallowedAuditEntry"          -> onRepoConfigEnableSockpuppetDisallowedAuditEntry,
            "RepoConfigLockAnonymousGitAccessAuditEntry"              -> onRepoConfigLockAnonymousGitAccessAuditEntry,
            "RepoConfigUnlockAnonymousGitAccessAuditEntry"            -> onRepoConfigUnlockAnonymousGitAccessAuditEntry,
            "RepoCreateAuditEntry"                                    -> onRepoCreateAuditEntry,
            "RepoDestroyAuditEntry"                                   -> onRepoDestroyAuditEntry,
            "RepoRemoveMemberAuditEntry"                              -> onRepoRemoveMemberAuditEntry,
            "RepoRemoveTopicAuditEntry"                               -> onRepoRemoveTopicAuditEntry,
            "Repository"                                              -> onRepository,
            "RepositoryInvitation"                                    -> onRepositoryInvitation,
            "RepositoryTopic"                                         -> onRepositoryTopic,
            "RepositoryVisibilityChangeDisableAuditEntry"             -> onRepositoryVisibilityChangeDisableAuditEntry,
            "RepositoryVisibilityChangeEnableAuditEntry"              -> onRepositoryVisibilityChangeEnableAuditEntry,
            "RepositoryVulnerabilityAlert"                            -> onRepositoryVulnerabilityAlert,
            "ReviewDismissalAllowance"                                -> onReviewDismissalAllowance,
            "ReviewDismissedEvent"                                    -> onReviewDismissedEvent,
            "ReviewRequest"                                           -> onReviewRequest,
            "ReviewRequestRemovedEvent"                               -> onReviewRequestRemovedEvent,
            "ReviewRequestedEvent"                                    -> onReviewRequestedEvent,
            "SavedReply"                                              -> onSavedReply,
            "SecurityAdvisory"                                        -> onSecurityAdvisory,
            "SponsorsActivity"                                        -> onSponsorsActivity,
            "SponsorsListing"                                         -> onSponsorsListing,
            "SponsorsTier"                                            -> onSponsorsTier,
            "Sponsorship"                                             -> onSponsorship,
            "SponsorshipNewsletter"                                   -> onSponsorshipNewsletter,
            "Status"                                                  -> onStatus,
            "StatusCheckRollup"                                       -> onStatusCheckRollup,
            "StatusContext"                                           -> onStatusContext,
            "SubscribedEvent"                                         -> onSubscribedEvent,
            "Tag"                                                     -> onTag,
            "Team"                                                    -> onTeam,
            "TeamAddMemberAuditEntry"                                 -> onTeamAddMemberAuditEntry,
            "TeamAddRepositoryAuditEntry"                             -> onTeamAddRepositoryAuditEntry,
            "TeamChangeParentTeamAuditEntry"                          -> onTeamChangeParentTeamAuditEntry,
            "TeamDiscussion"                                          -> onTeamDiscussion,
            "TeamDiscussionComment"                                   -> onTeamDiscussionComment,
            "TeamRemoveMemberAuditEntry"                              -> onTeamRemoveMemberAuditEntry,
            "TeamRemoveRepositoryAuditEntry"                          -> onTeamRemoveRepositoryAuditEntry,
            "Topic"                                                   -> onTopic,
            "TransferredEvent"                                        -> onTransferredEvent,
            "Tree"                                                    -> onTree,
            "UnassignedEvent"                                         -> onUnassignedEvent,
            "UnlabeledEvent"                                          -> onUnlabeledEvent,
            "UnlockedEvent"                                           -> onUnlockedEvent,
            "UnmarkedAsDuplicateEvent"                                -> onUnmarkedAsDuplicateEvent,
            "UnpinnedEvent"                                           -> onUnpinnedEvent,
            "UnsubscribedEvent"                                       -> onUnsubscribedEvent,
            "User"                                                    -> onUser,
            "UserBlockedEvent"                                        -> onUserBlockedEvent,
            "UserContentEdit"                                         -> onUserContentEdit,
            "UserStatus"                                              -> onUserStatus,
            "VerifiableDomain"                                        -> onVerifiableDomain,
            "Workflow"                                                -> onWorkflow,
            "WorkflowRun"                                             -> onWorkflowRun
          ).collect { case (k, Some(v)) => k -> Obj(v) }
        )
      ),
      arguments = List(Argument("id", id, "ID!")(encoder0))
    )

  /** Lookup nodes by a list of IDs.
    */
  def nodes[A](ids: List[String]                                                                                                  = Nil)(
    onAddedToProjectEvent: Option[SelectionBuilder[AddedToProjectEvent, A]]                                                       = None,
    onApp: Option[SelectionBuilder[App, A]]                                                                                       = None,
    onAssignedEvent: Option[SelectionBuilder[AssignedEvent, A]]                                                                   = None,
    onAutoMergeDisabledEvent: Option[SelectionBuilder[AutoMergeDisabledEvent, A]]                                                 = None,
    onAutoMergeEnabledEvent: Option[SelectionBuilder[AutoMergeEnabledEvent, A]]                                                   = None,
    onAutoRebaseEnabledEvent: Option[SelectionBuilder[AutoRebaseEnabledEvent, A]]                                                 = None,
    onAutoSquashEnabledEvent: Option[SelectionBuilder[AutoSquashEnabledEvent, A]]                                                 = None,
    onAutomaticBaseChangeFailedEvent: Option[SelectionBuilder[AutomaticBaseChangeFailedEvent, A]]                                 = None,
    onAutomaticBaseChangeSucceededEvent: Option[SelectionBuilder[AutomaticBaseChangeSucceededEvent, A]]                           = None,
    onBaseRefChangedEvent: Option[SelectionBuilder[BaseRefChangedEvent, A]]                                                       = None,
    onBaseRefDeletedEvent: Option[SelectionBuilder[BaseRefDeletedEvent, A]]                                                       = None,
    onBaseRefForcePushedEvent: Option[SelectionBuilder[BaseRefForcePushedEvent, A]]                                               = None,
    onBlob: Option[SelectionBuilder[Blob, A]]                                                                                     = None,
    onBot: Option[SelectionBuilder[Bot, A]]                                                                                       = None,
    onBranchProtectionRule: Option[SelectionBuilder[BranchProtectionRule, A]]                                                     = None,
    onCWE: Option[SelectionBuilder[CWE, A]]                                                                                       = None,
    onCheckRun: Option[SelectionBuilder[CheckRun, A]]                                                                             = None,
    onCheckSuite: Option[SelectionBuilder[CheckSuite, A]]                                                                         = None,
    onClosedEvent: Option[SelectionBuilder[ClosedEvent, A]]                                                                       = None,
    onCodeOfConduct: Option[SelectionBuilder[CodeOfConduct, A]]                                                                   = None,
    onCommentDeletedEvent: Option[SelectionBuilder[CommentDeletedEvent, A]]                                                       = None,
    onCommit: Option[SelectionBuilder[Commit, A]]                                                                                 = None,
    onCommitComment: Option[SelectionBuilder[CommitComment, A]]                                                                   = None,
    onCommitCommentThread: Option[SelectionBuilder[CommitCommentThread, A]]                                                       = None,
    onConnectedEvent: Option[SelectionBuilder[ConnectedEvent, A]]                                                                 = None,
    onConvertToDraftEvent: Option[SelectionBuilder[ConvertToDraftEvent, A]]                                                       = None,
    onConvertedNoteToIssueEvent: Option[SelectionBuilder[ConvertedNoteToIssueEvent, A]]                                           = None,
    onCrossReferencedEvent: Option[SelectionBuilder[CrossReferencedEvent, A]]                                                     = None,
    onDemilestonedEvent: Option[SelectionBuilder[DemilestonedEvent, A]]                                                           = None,
    onDependencyGraphManifest: Option[SelectionBuilder[DependencyGraphManifest, A]]                                               = None,
    onDeployKey: Option[SelectionBuilder[DeployKey, A]]                                                                           = None,
    onDeployedEvent: Option[SelectionBuilder[DeployedEvent, A]]                                                                   = None,
    onDeployment: Option[SelectionBuilder[Deployment, A]]                                                                         = None,
    onDeploymentEnvironmentChangedEvent: Option[SelectionBuilder[DeploymentEnvironmentChangedEvent, A]]                           = None,
    onDeploymentReview: Option[SelectionBuilder[DeploymentReview, A]]                                                             = None,
    onDeploymentStatus: Option[SelectionBuilder[DeploymentStatus, A]]                                                             = None,
    onDisconnectedEvent: Option[SelectionBuilder[DisconnectedEvent, A]]                                                           = None,
    onDiscussion: Option[SelectionBuilder[Discussion, A]]                                                                         = None,
    onDiscussionCategory: Option[SelectionBuilder[DiscussionCategory, A]]                                                         = None,
    onDiscussionComment: Option[SelectionBuilder[DiscussionComment, A]]                                                           = None,
    onEnterprise: Option[SelectionBuilder[Enterprise, A]]                                                                         = None,
    onEnterpriseAdministratorInvitation: Option[SelectionBuilder[EnterpriseAdministratorInvitation, A]]                           = None,
    onEnterpriseIdentityProvider: Option[SelectionBuilder[EnterpriseIdentityProvider, A]]                                         = None,
    onEnterpriseRepositoryInfo: Option[SelectionBuilder[EnterpriseRepositoryInfo, A]]                                             = None,
    onEnterpriseServerInstallation: Option[SelectionBuilder[EnterpriseServerInstallation, A]]                                     = None,
    onEnterpriseServerUserAccount: Option[SelectionBuilder[EnterpriseServerUserAccount, A]]                                       = None,
    onEnterpriseServerUserAccountEmail: Option[SelectionBuilder[EnterpriseServerUserAccountEmail, A]]                             = None,
    onEnterpriseServerUserAccountsUpload: Option[SelectionBuilder[EnterpriseServerUserAccountsUpload, A]]                         = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]]                                                   = None,
    onEnvironment: Option[SelectionBuilder[Environment, A]]                                                                       = None,
    onExternalIdentity: Option[SelectionBuilder[ExternalIdentity, A]]                                                             = None,
    onGist: Option[SelectionBuilder[Gist, A]]                                                                                     = None,
    onGistComment: Option[SelectionBuilder[GistComment, A]]                                                                       = None,
    onHeadRefDeletedEvent: Option[SelectionBuilder[HeadRefDeletedEvent, A]]                                                       = None,
    onHeadRefForcePushedEvent: Option[SelectionBuilder[HeadRefForcePushedEvent, A]]                                               = None,
    onHeadRefRestoredEvent: Option[SelectionBuilder[HeadRefRestoredEvent, A]]                                                     = None,
    onIpAllowListEntry: Option[SelectionBuilder[IpAllowListEntry, A]]                                                             = None,
    onIssue: Option[SelectionBuilder[Issue, A]]                                                                                   = None,
    onIssueComment: Option[SelectionBuilder[IssueComment, A]]                                                                     = None,
    onLabel: Option[SelectionBuilder[Label, A]]                                                                                   = None,
    onLabeledEvent: Option[SelectionBuilder[LabeledEvent, A]]                                                                     = None,
    onLanguage: Option[SelectionBuilder[Language, A]]                                                                             = None,
    onLicense: Option[SelectionBuilder[License, A]]                                                                               = None,
    onLockedEvent: Option[SelectionBuilder[LockedEvent, A]]                                                                       = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                                                                           = None,
    onMarkedAsDuplicateEvent: Option[SelectionBuilder[MarkedAsDuplicateEvent, A]]                                                 = None,
    onMarketplaceCategory: Option[SelectionBuilder[MarketplaceCategory, A]]                                                       = None,
    onMarketplaceListing: Option[SelectionBuilder[MarketplaceListing, A]]                                                         = None,
    onMembersCanDeleteReposClearAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposClearAuditEntry, A]]                     = None,
    onMembersCanDeleteReposDisableAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposDisableAuditEntry, A]]                 = None,
    onMembersCanDeleteReposEnableAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposEnableAuditEntry, A]]                   = None,
    onMentionedEvent: Option[SelectionBuilder[MentionedEvent, A]]                                                                 = None,
    onMergedEvent: Option[SelectionBuilder[MergedEvent, A]]                                                                       = None,
    onMilestone: Option[SelectionBuilder[Milestone, A]]                                                                           = None,
    onMilestonedEvent: Option[SelectionBuilder[MilestonedEvent, A]]                                                               = None,
    onMovedColumnsInProjectEvent: Option[SelectionBuilder[MovedColumnsInProjectEvent, A]]                                         = None,
    onOIDCProvider: Option[SelectionBuilder[OIDCProvider, A]]                                                                     = None,
    onOauthApplicationCreateAuditEntry: Option[SelectionBuilder[OauthApplicationCreateAuditEntry, A]]                             = None,
    onOrgAddBillingManagerAuditEntry: Option[SelectionBuilder[OrgAddBillingManagerAuditEntry, A]]                                 = None,
    onOrgAddMemberAuditEntry: Option[SelectionBuilder[OrgAddMemberAuditEntry, A]]                                                 = None,
    onOrgBlockUserAuditEntry: Option[SelectionBuilder[OrgBlockUserAuditEntry, A]]                                                 = None,
    onOrgConfigDisableCollaboratorsOnlyAuditEntry: Option[SelectionBuilder[OrgConfigDisableCollaboratorsOnlyAuditEntry, A]]       = None,
    onOrgConfigEnableCollaboratorsOnlyAuditEntry: Option[SelectionBuilder[OrgConfigEnableCollaboratorsOnlyAuditEntry, A]]         = None,
    onOrgCreateAuditEntry: Option[SelectionBuilder[OrgCreateAuditEntry, A]]                                                       = None,
    onOrgDisableOauthAppRestrictionsAuditEntry: Option[SelectionBuilder[OrgDisableOauthAppRestrictionsAuditEntry, A]]             = None,
    onOrgDisableSamlAuditEntry: Option[SelectionBuilder[OrgDisableSamlAuditEntry, A]]                                             = None,
    onOrgDisableTwoFactorRequirementAuditEntry: Option[SelectionBuilder[OrgDisableTwoFactorRequirementAuditEntry, A]]             = None,
    onOrgEnableOauthAppRestrictionsAuditEntry: Option[SelectionBuilder[OrgEnableOauthAppRestrictionsAuditEntry, A]]               = None,
    onOrgEnableSamlAuditEntry: Option[SelectionBuilder[OrgEnableSamlAuditEntry, A]]                                               = None,
    onOrgEnableTwoFactorRequirementAuditEntry: Option[SelectionBuilder[OrgEnableTwoFactorRequirementAuditEntry, A]]               = None,
    onOrgInviteMemberAuditEntry: Option[SelectionBuilder[OrgInviteMemberAuditEntry, A]]                                           = None,
    onOrgInviteToBusinessAuditEntry: Option[SelectionBuilder[OrgInviteToBusinessAuditEntry, A]]                                   = None,
    onOrgOauthAppAccessApprovedAuditEntry: Option[SelectionBuilder[OrgOauthAppAccessApprovedAuditEntry, A]]                       = None,
    onOrgOauthAppAccessDeniedAuditEntry: Option[SelectionBuilder[OrgOauthAppAccessDeniedAuditEntry, A]]                           = None,
    onOrgOauthAppAccessRequestedAuditEntry: Option[SelectionBuilder[OrgOauthAppAccessRequestedAuditEntry, A]]                     = None,
    onOrgRemoveBillingManagerAuditEntry: Option[SelectionBuilder[OrgRemoveBillingManagerAuditEntry, A]]                           = None,
    onOrgRemoveMemberAuditEntry: Option[SelectionBuilder[OrgRemoveMemberAuditEntry, A]]                                           = None,
    onOrgRemoveOutsideCollaboratorAuditEntry: Option[SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, A]]                 = None,
    onOrgRestoreMemberAuditEntry: Option[SelectionBuilder[OrgRestoreMemberAuditEntry, A]]                                         = None,
    onOrgUnblockUserAuditEntry: Option[SelectionBuilder[OrgUnblockUserAuditEntry, A]]                                             = None,
    onOrgUpdateDefaultRepositoryPermissionAuditEntry: Option[SelectionBuilder[OrgUpdateDefaultRepositoryPermissionAuditEntry, A]] = None,
    onOrgUpdateMemberAuditEntry: Option[SelectionBuilder[OrgUpdateMemberAuditEntry, A]]                                           = None,
    onOrgUpdateMemberRepositoryCreationPermissionAuditEntry: Option[SelectionBuilder[OrgUpdateMemberRepositoryCreationPermissionAuditEntry, A]] =
      None,
    onOrgUpdateMemberRepositoryInvitationPermissionAuditEntry: Option[SelectionBuilder[OrgUpdateMemberRepositoryInvitationPermissionAuditEntry, A]] =
      None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                                                                       = None,
    onOrganizationIdentityProvider: Option[SelectionBuilder[OrganizationIdentityProvider, A]]                                       = None,
    onOrganizationInvitation: Option[SelectionBuilder[OrganizationInvitation, A]]                                                   = None,
    onPackage: Option[SelectionBuilder[Package_1, A]]                                                                               = None,
    onPackageFile: Option[SelectionBuilder[PackageFile, A]]                                                                         = None,
    onPackageTag: Option[SelectionBuilder[PackageTag, A]]                                                                           = None,
    onPackageVersion: Option[SelectionBuilder[PackageVersion, A]]                                                                   = None,
    onPinnedDiscussion: Option[SelectionBuilder[PinnedDiscussion, A]]                                                               = None,
    onPinnedEvent: Option[SelectionBuilder[PinnedEvent, A]]                                                                         = None,
    onPinnedIssue: Option[SelectionBuilder[PinnedIssue, A]]                                                                         = None,
    onPrivateRepositoryForkingDisableAuditEntry: Option[SelectionBuilder[PrivateRepositoryForkingDisableAuditEntry, A]]             = None,
    onPrivateRepositoryForkingEnableAuditEntry: Option[SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, A]]               = None,
    onProject: Option[SelectionBuilder[Project, A]]                                                                                 = None,
    onProjectCard: Option[SelectionBuilder[ProjectCard, A]]                                                                         = None,
    onProjectColumn: Option[SelectionBuilder[ProjectColumn, A]]                                                                     = None,
    onProjectNext: Option[SelectionBuilder[ProjectNext, A]]                                                                         = None,
    onProjectNextItem: Option[SelectionBuilder[ProjectNextItem, A]]                                                                 = None,
    onProjectNextItemFieldValue: Option[SelectionBuilder[ProjectNextItemFieldValue, A]]                                             = None,
    onPublicKey: Option[SelectionBuilder[PublicKey, A]]                                                                             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]]                                                                         = None,
    onPullRequestCommit: Option[SelectionBuilder[PullRequestCommit, A]]                                                             = None,
    onPullRequestCommitCommentThread: Option[SelectionBuilder[PullRequestCommitCommentThread, A]]                                   = None,
    onPullRequestReview: Option[SelectionBuilder[PullRequestReview, A]]                                                             = None,
    onPullRequestReviewComment: Option[SelectionBuilder[PullRequestReviewComment, A]]                                               = None,
    onPullRequestReviewThread: Option[SelectionBuilder[PullRequestReviewThread, A]]                                                 = None,
    onPush: Option[SelectionBuilder[Push, A]]                                                                                       = None,
    onPushAllowance: Option[SelectionBuilder[PushAllowance, A]]                                                                     = None,
    onReaction: Option[SelectionBuilder[Reaction, A]]                                                                               = None,
    onReadyForReviewEvent: Option[SelectionBuilder[ReadyForReviewEvent, A]]                                                         = None,
    onRef: Option[SelectionBuilder[Ref, A]]                                                                                         = None,
    onReferencedEvent: Option[SelectionBuilder[ReferencedEvent, A]]                                                                 = None,
    onRelease: Option[SelectionBuilder[Release, A]]                                                                                 = None,
    onReleaseAsset: Option[SelectionBuilder[ReleaseAsset, A]]                                                                       = None,
    onRemovedFromProjectEvent: Option[SelectionBuilder[RemovedFromProjectEvent, A]]                                                 = None,
    onRenamedTitleEvent: Option[SelectionBuilder[RenamedTitleEvent, A]]                                                             = None,
    onReopenedEvent: Option[SelectionBuilder[ReopenedEvent, A]]                                                                     = None,
    onRepoAccessAuditEntry: Option[SelectionBuilder[RepoAccessAuditEntry, A]]                                                       = None,
    onRepoAddMemberAuditEntry: Option[SelectionBuilder[RepoAddMemberAuditEntry, A]]                                                 = None,
    onRepoAddTopicAuditEntry: Option[SelectionBuilder[RepoAddTopicAuditEntry, A]]                                                   = None,
    onRepoArchivedAuditEntry: Option[SelectionBuilder[RepoArchivedAuditEntry, A]]                                                   = None,
    onRepoChangeMergeSettingAuditEntry: Option[SelectionBuilder[RepoChangeMergeSettingAuditEntry, A]]                               = None,
    onRepoConfigDisableAnonymousGitAccessAuditEntry: Option[SelectionBuilder[RepoConfigDisableAnonymousGitAccessAuditEntry, A]]     = None,
    onRepoConfigDisableCollaboratorsOnlyAuditEntry: Option[SelectionBuilder[RepoConfigDisableCollaboratorsOnlyAuditEntry, A]]       = None,
    onRepoConfigDisableContributorsOnlyAuditEntry: Option[SelectionBuilder[RepoConfigDisableContributorsOnlyAuditEntry, A]]         = None,
    onRepoConfigDisableSockpuppetDisallowedAuditEntry: Option[SelectionBuilder[RepoConfigDisableSockpuppetDisallowedAuditEntry, A]] = None,
    onRepoConfigEnableAnonymousGitAccessAuditEntry: Option[SelectionBuilder[RepoConfigEnableAnonymousGitAccessAuditEntry, A]]       = None,
    onRepoConfigEnableCollaboratorsOnlyAuditEntry: Option[SelectionBuilder[RepoConfigEnableCollaboratorsOnlyAuditEntry, A]]         = None,
    onRepoConfigEnableContributorsOnlyAuditEntry: Option[SelectionBuilder[RepoConfigEnableContributorsOnlyAuditEntry, A]]           = None,
    onRepoConfigEnableSockpuppetDisallowedAuditEntry: Option[SelectionBuilder[RepoConfigEnableSockpuppetDisallowedAuditEntry, A]]   = None,
    onRepoConfigLockAnonymousGitAccessAuditEntry: Option[SelectionBuilder[RepoConfigLockAnonymousGitAccessAuditEntry, A]]           = None,
    onRepoConfigUnlockAnonymousGitAccessAuditEntry: Option[SelectionBuilder[RepoConfigUnlockAnonymousGitAccessAuditEntry, A]]       = None,
    onRepoCreateAuditEntry: Option[SelectionBuilder[RepoCreateAuditEntry, A]]                                                       = None,
    onRepoDestroyAuditEntry: Option[SelectionBuilder[RepoDestroyAuditEntry, A]]                                                     = None,
    onRepoRemoveMemberAuditEntry: Option[SelectionBuilder[RepoRemoveMemberAuditEntry, A]]                                           = None,
    onRepoRemoveTopicAuditEntry: Option[SelectionBuilder[RepoRemoveTopicAuditEntry, A]]                                             = None,
    onRepository: Option[SelectionBuilder[Repository, A]]                                                                           = None,
    onRepositoryInvitation: Option[SelectionBuilder[RepositoryInvitation, A]]                                                       = None,
    onRepositoryTopic: Option[SelectionBuilder[RepositoryTopic, A]]                                                                 = None,
    onRepositoryVisibilityChangeDisableAuditEntry: Option[SelectionBuilder[RepositoryVisibilityChangeDisableAuditEntry, A]]         = None,
    onRepositoryVisibilityChangeEnableAuditEntry: Option[SelectionBuilder[RepositoryVisibilityChangeEnableAuditEntry, A]]           = None,
    onRepositoryVulnerabilityAlert: Option[SelectionBuilder[RepositoryVulnerabilityAlert, A]]                                       = None,
    onReviewDismissalAllowance: Option[SelectionBuilder[ReviewDismissalAllowance, A]]                                               = None,
    onReviewDismissedEvent: Option[SelectionBuilder[ReviewDismissedEvent, A]]                                                       = None,
    onReviewRequest: Option[SelectionBuilder[ReviewRequest, A]]                                                                     = None,
    onReviewRequestRemovedEvent: Option[SelectionBuilder[ReviewRequestRemovedEvent, A]]                                             = None,
    onReviewRequestedEvent: Option[SelectionBuilder[ReviewRequestedEvent, A]]                                                       = None,
    onSavedReply: Option[SelectionBuilder[SavedReply, A]]                                                                           = None,
    onSecurityAdvisory: Option[SelectionBuilder[SecurityAdvisory, A]]                                                               = None,
    onSponsorsActivity: Option[SelectionBuilder[SponsorsActivity, A]]                                                               = None,
    onSponsorsListing: Option[SelectionBuilder[SponsorsListing, A]]                                                                 = None,
    onSponsorsTier: Option[SelectionBuilder[SponsorsTier, A]]                                                                       = None,
    onSponsorship: Option[SelectionBuilder[Sponsorship, A]]                                                                         = None,
    onSponsorshipNewsletter: Option[SelectionBuilder[SponsorshipNewsletter, A]]                                                     = None,
    onStatus: Option[SelectionBuilder[Status, A]]                                                                                   = None,
    onStatusCheckRollup: Option[SelectionBuilder[StatusCheckRollup, A]]                                                             = None,
    onStatusContext: Option[SelectionBuilder[StatusContext, A]]                                                                     = None,
    onSubscribedEvent: Option[SelectionBuilder[SubscribedEvent, A]]                                                                 = None,
    onTag: Option[SelectionBuilder[Tag, A]]                                                                                         = None,
    onTeam: Option[SelectionBuilder[Team, A]]                                                                                       = None,
    onTeamAddMemberAuditEntry: Option[SelectionBuilder[TeamAddMemberAuditEntry, A]]                                                 = None,
    onTeamAddRepositoryAuditEntry: Option[SelectionBuilder[TeamAddRepositoryAuditEntry, A]]                                         = None,
    onTeamChangeParentTeamAuditEntry: Option[SelectionBuilder[TeamChangeParentTeamAuditEntry, A]]                                   = None,
    onTeamDiscussion: Option[SelectionBuilder[TeamDiscussion, A]]                                                                   = None,
    onTeamDiscussionComment: Option[SelectionBuilder[TeamDiscussionComment, A]]                                                     = None,
    onTeamRemoveMemberAuditEntry: Option[SelectionBuilder[TeamRemoveMemberAuditEntry, A]]                                           = None,
    onTeamRemoveRepositoryAuditEntry: Option[SelectionBuilder[TeamRemoveRepositoryAuditEntry, A]]                                   = None,
    onTopic: Option[SelectionBuilder[Topic, A]]                                                                                     = None,
    onTransferredEvent: Option[SelectionBuilder[TransferredEvent, A]]                                                               = None,
    onTree: Option[SelectionBuilder[Tree, A]]                                                                                       = None,
    onUnassignedEvent: Option[SelectionBuilder[UnassignedEvent, A]]                                                                 = None,
    onUnlabeledEvent: Option[SelectionBuilder[UnlabeledEvent, A]]                                                                   = None,
    onUnlockedEvent: Option[SelectionBuilder[UnlockedEvent, A]]                                                                     = None,
    onUnmarkedAsDuplicateEvent: Option[SelectionBuilder[UnmarkedAsDuplicateEvent, A]]                                               = None,
    onUnpinnedEvent: Option[SelectionBuilder[UnpinnedEvent, A]]                                                                     = None,
    onUnsubscribedEvent: Option[SelectionBuilder[UnsubscribedEvent, A]]                                                             = None,
    onUser: Option[SelectionBuilder[User, A]]                                                                                       = None,
    onUserBlockedEvent: Option[SelectionBuilder[UserBlockedEvent, A]]                                                               = None,
    onUserContentEdit: Option[SelectionBuilder[UserContentEdit, A]]                                                                 = None,
    onUserStatus: Option[SelectionBuilder[UserStatus, A]]                                                                           = None,
    onVerifiableDomain: Option[SelectionBuilder[VerifiableDomain, A]]                                                               = None,
    onWorkflow: Option[SelectionBuilder[Workflow, A]]                                                                               = None,
    onWorkflowRun: Option[SelectionBuilder[WorkflowRun, A]]                                                                         = None
  )(implicit encoder0: ArgEncoder[List[String]]): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, List[Option[A]]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "nodes",
      ListOf(
        OptionOf(
          ChoiceOf(
            Map(
              "AddedToProjectEvent"                                     -> onAddedToProjectEvent,
              "App"                                                     -> onApp,
              "AssignedEvent"                                           -> onAssignedEvent,
              "AutoMergeDisabledEvent"                                  -> onAutoMergeDisabledEvent,
              "AutoMergeEnabledEvent"                                   -> onAutoMergeEnabledEvent,
              "AutoRebaseEnabledEvent"                                  -> onAutoRebaseEnabledEvent,
              "AutoSquashEnabledEvent"                                  -> onAutoSquashEnabledEvent,
              "AutomaticBaseChangeFailedEvent"                          -> onAutomaticBaseChangeFailedEvent,
              "AutomaticBaseChangeSucceededEvent"                       -> onAutomaticBaseChangeSucceededEvent,
              "BaseRefChangedEvent"                                     -> onBaseRefChangedEvent,
              "BaseRefDeletedEvent"                                     -> onBaseRefDeletedEvent,
              "BaseRefForcePushedEvent"                                 -> onBaseRefForcePushedEvent,
              "Blob"                                                    -> onBlob,
              "Bot"                                                     -> onBot,
              "BranchProtectionRule"                                    -> onBranchProtectionRule,
              "CWE"                                                     -> onCWE,
              "CheckRun"                                                -> onCheckRun,
              "CheckSuite"                                              -> onCheckSuite,
              "ClosedEvent"                                             -> onClosedEvent,
              "CodeOfConduct"                                           -> onCodeOfConduct,
              "CommentDeletedEvent"                                     -> onCommentDeletedEvent,
              "Commit"                                                  -> onCommit,
              "CommitComment"                                           -> onCommitComment,
              "CommitCommentThread"                                     -> onCommitCommentThread,
              "ConnectedEvent"                                          -> onConnectedEvent,
              "ConvertToDraftEvent"                                     -> onConvertToDraftEvent,
              "ConvertedNoteToIssueEvent"                               -> onConvertedNoteToIssueEvent,
              "CrossReferencedEvent"                                    -> onCrossReferencedEvent,
              "DemilestonedEvent"                                       -> onDemilestonedEvent,
              "DependencyGraphManifest"                                 -> onDependencyGraphManifest,
              "DeployKey"                                               -> onDeployKey,
              "DeployedEvent"                                           -> onDeployedEvent,
              "Deployment"                                              -> onDeployment,
              "DeploymentEnvironmentChangedEvent"                       -> onDeploymentEnvironmentChangedEvent,
              "DeploymentReview"                                        -> onDeploymentReview,
              "DeploymentStatus"                                        -> onDeploymentStatus,
              "DisconnectedEvent"                                       -> onDisconnectedEvent,
              "Discussion"                                              -> onDiscussion,
              "DiscussionCategory"                                      -> onDiscussionCategory,
              "DiscussionComment"                                       -> onDiscussionComment,
              "Enterprise"                                              -> onEnterprise,
              "EnterpriseAdministratorInvitation"                       -> onEnterpriseAdministratorInvitation,
              "EnterpriseIdentityProvider"                              -> onEnterpriseIdentityProvider,
              "EnterpriseRepositoryInfo"                                -> onEnterpriseRepositoryInfo,
              "EnterpriseServerInstallation"                            -> onEnterpriseServerInstallation,
              "EnterpriseServerUserAccount"                             -> onEnterpriseServerUserAccount,
              "EnterpriseServerUserAccountEmail"                        -> onEnterpriseServerUserAccountEmail,
              "EnterpriseServerUserAccountsUpload"                      -> onEnterpriseServerUserAccountsUpload,
              "EnterpriseUserAccount"                                   -> onEnterpriseUserAccount,
              "Environment"                                             -> onEnvironment,
              "ExternalIdentity"                                        -> onExternalIdentity,
              "Gist"                                                    -> onGist,
              "GistComment"                                             -> onGistComment,
              "HeadRefDeletedEvent"                                     -> onHeadRefDeletedEvent,
              "HeadRefForcePushedEvent"                                 -> onHeadRefForcePushedEvent,
              "HeadRefRestoredEvent"                                    -> onHeadRefRestoredEvent,
              "IpAllowListEntry"                                        -> onIpAllowListEntry,
              "Issue"                                                   -> onIssue,
              "IssueComment"                                            -> onIssueComment,
              "Label"                                                   -> onLabel,
              "LabeledEvent"                                            -> onLabeledEvent,
              "Language"                                                -> onLanguage,
              "License"                                                 -> onLicense,
              "LockedEvent"                                             -> onLockedEvent,
              "Mannequin"                                               -> onMannequin,
              "MarkedAsDuplicateEvent"                                  -> onMarkedAsDuplicateEvent,
              "MarketplaceCategory"                                     -> onMarketplaceCategory,
              "MarketplaceListing"                                      -> onMarketplaceListing,
              "MembersCanDeleteReposClearAuditEntry"                    -> onMembersCanDeleteReposClearAuditEntry,
              "MembersCanDeleteReposDisableAuditEntry"                  -> onMembersCanDeleteReposDisableAuditEntry,
              "MembersCanDeleteReposEnableAuditEntry"                   -> onMembersCanDeleteReposEnableAuditEntry,
              "MentionedEvent"                                          -> onMentionedEvent,
              "MergedEvent"                                             -> onMergedEvent,
              "Milestone"                                               -> onMilestone,
              "MilestonedEvent"                                         -> onMilestonedEvent,
              "MovedColumnsInProjectEvent"                              -> onMovedColumnsInProjectEvent,
              "OIDCProvider"                                            -> onOIDCProvider,
              "OauthApplicationCreateAuditEntry"                        -> onOauthApplicationCreateAuditEntry,
              "OrgAddBillingManagerAuditEntry"                          -> onOrgAddBillingManagerAuditEntry,
              "OrgAddMemberAuditEntry"                                  -> onOrgAddMemberAuditEntry,
              "OrgBlockUserAuditEntry"                                  -> onOrgBlockUserAuditEntry,
              "OrgConfigDisableCollaboratorsOnlyAuditEntry"             -> onOrgConfigDisableCollaboratorsOnlyAuditEntry,
              "OrgConfigEnableCollaboratorsOnlyAuditEntry"              -> onOrgConfigEnableCollaboratorsOnlyAuditEntry,
              "OrgCreateAuditEntry"                                     -> onOrgCreateAuditEntry,
              "OrgDisableOauthAppRestrictionsAuditEntry"                -> onOrgDisableOauthAppRestrictionsAuditEntry,
              "OrgDisableSamlAuditEntry"                                -> onOrgDisableSamlAuditEntry,
              "OrgDisableTwoFactorRequirementAuditEntry"                -> onOrgDisableTwoFactorRequirementAuditEntry,
              "OrgEnableOauthAppRestrictionsAuditEntry"                 -> onOrgEnableOauthAppRestrictionsAuditEntry,
              "OrgEnableSamlAuditEntry"                                 -> onOrgEnableSamlAuditEntry,
              "OrgEnableTwoFactorRequirementAuditEntry"                 -> onOrgEnableTwoFactorRequirementAuditEntry,
              "OrgInviteMemberAuditEntry"                               -> onOrgInviteMemberAuditEntry,
              "OrgInviteToBusinessAuditEntry"                           -> onOrgInviteToBusinessAuditEntry,
              "OrgOauthAppAccessApprovedAuditEntry"                     -> onOrgOauthAppAccessApprovedAuditEntry,
              "OrgOauthAppAccessDeniedAuditEntry"                       -> onOrgOauthAppAccessDeniedAuditEntry,
              "OrgOauthAppAccessRequestedAuditEntry"                    -> onOrgOauthAppAccessRequestedAuditEntry,
              "OrgRemoveBillingManagerAuditEntry"                       -> onOrgRemoveBillingManagerAuditEntry,
              "OrgRemoveMemberAuditEntry"                               -> onOrgRemoveMemberAuditEntry,
              "OrgRemoveOutsideCollaboratorAuditEntry"                  -> onOrgRemoveOutsideCollaboratorAuditEntry,
              "OrgRestoreMemberAuditEntry"                              -> onOrgRestoreMemberAuditEntry,
              "OrgUnblockUserAuditEntry"                                -> onOrgUnblockUserAuditEntry,
              "OrgUpdateDefaultRepositoryPermissionAuditEntry"          -> onOrgUpdateDefaultRepositoryPermissionAuditEntry,
              "OrgUpdateMemberAuditEntry"                               -> onOrgUpdateMemberAuditEntry,
              "OrgUpdateMemberRepositoryCreationPermissionAuditEntry"   -> onOrgUpdateMemberRepositoryCreationPermissionAuditEntry,
              "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry" -> onOrgUpdateMemberRepositoryInvitationPermissionAuditEntry,
              "Organization"                                            -> onOrganization,
              "OrganizationIdentityProvider"                            -> onOrganizationIdentityProvider,
              "OrganizationInvitation"                                  -> onOrganizationInvitation,
              "Package"                                                 -> onPackage,
              "PackageFile"                                             -> onPackageFile,
              "PackageTag"                                              -> onPackageTag,
              "PackageVersion"                                          -> onPackageVersion,
              "PinnedDiscussion"                                        -> onPinnedDiscussion,
              "PinnedEvent"                                             -> onPinnedEvent,
              "PinnedIssue"                                             -> onPinnedIssue,
              "PrivateRepositoryForkingDisableAuditEntry"               -> onPrivateRepositoryForkingDisableAuditEntry,
              "PrivateRepositoryForkingEnableAuditEntry"                -> onPrivateRepositoryForkingEnableAuditEntry,
              "Project"                                                 -> onProject,
              "ProjectCard"                                             -> onProjectCard,
              "ProjectColumn"                                           -> onProjectColumn,
              "ProjectNext"                                             -> onProjectNext,
              "ProjectNextItem"                                         -> onProjectNextItem,
              "ProjectNextItemFieldValue"                               -> onProjectNextItemFieldValue,
              "PublicKey"                                               -> onPublicKey,
              "PullRequest"                                             -> onPullRequest,
              "PullRequestCommit"                                       -> onPullRequestCommit,
              "PullRequestCommitCommentThread"                          -> onPullRequestCommitCommentThread,
              "PullRequestReview"                                       -> onPullRequestReview,
              "PullRequestReviewComment"                                -> onPullRequestReviewComment,
              "PullRequestReviewThread"                                 -> onPullRequestReviewThread,
              "Push"                                                    -> onPush,
              "PushAllowance"                                           -> onPushAllowance,
              "Reaction"                                                -> onReaction,
              "ReadyForReviewEvent"                                     -> onReadyForReviewEvent,
              "Ref"                                                     -> onRef,
              "ReferencedEvent"                                         -> onReferencedEvent,
              "Release"                                                 -> onRelease,
              "ReleaseAsset"                                            -> onReleaseAsset,
              "RemovedFromProjectEvent"                                 -> onRemovedFromProjectEvent,
              "RenamedTitleEvent"                                       -> onRenamedTitleEvent,
              "ReopenedEvent"                                           -> onReopenedEvent,
              "RepoAccessAuditEntry"                                    -> onRepoAccessAuditEntry,
              "RepoAddMemberAuditEntry"                                 -> onRepoAddMemberAuditEntry,
              "RepoAddTopicAuditEntry"                                  -> onRepoAddTopicAuditEntry,
              "RepoArchivedAuditEntry"                                  -> onRepoArchivedAuditEntry,
              "RepoChangeMergeSettingAuditEntry"                        -> onRepoChangeMergeSettingAuditEntry,
              "RepoConfigDisableAnonymousGitAccessAuditEntry"           -> onRepoConfigDisableAnonymousGitAccessAuditEntry,
              "RepoConfigDisableCollaboratorsOnlyAuditEntry"            -> onRepoConfigDisableCollaboratorsOnlyAuditEntry,
              "RepoConfigDisableContributorsOnlyAuditEntry"             -> onRepoConfigDisableContributorsOnlyAuditEntry,
              "RepoConfigDisableSockpuppetDisallowedAuditEntry"         -> onRepoConfigDisableSockpuppetDisallowedAuditEntry,
              "RepoConfigEnableAnonymousGitAccessAuditEntry"            -> onRepoConfigEnableAnonymousGitAccessAuditEntry,
              "RepoConfigEnableCollaboratorsOnlyAuditEntry"             -> onRepoConfigEnableCollaboratorsOnlyAuditEntry,
              "RepoConfigEnableContributorsOnlyAuditEntry"              -> onRepoConfigEnableContributorsOnlyAuditEntry,
              "RepoConfigEnableSockpuppetDisallowedAuditEntry"          -> onRepoConfigEnableSockpuppetDisallowedAuditEntry,
              "RepoConfigLockAnonymousGitAccessAuditEntry"              -> onRepoConfigLockAnonymousGitAccessAuditEntry,
              "RepoConfigUnlockAnonymousGitAccessAuditEntry"            -> onRepoConfigUnlockAnonymousGitAccessAuditEntry,
              "RepoCreateAuditEntry"                                    -> onRepoCreateAuditEntry,
              "RepoDestroyAuditEntry"                                   -> onRepoDestroyAuditEntry,
              "RepoRemoveMemberAuditEntry"                              -> onRepoRemoveMemberAuditEntry,
              "RepoRemoveTopicAuditEntry"                               -> onRepoRemoveTopicAuditEntry,
              "Repository"                                              -> onRepository,
              "RepositoryInvitation"                                    -> onRepositoryInvitation,
              "RepositoryTopic"                                         -> onRepositoryTopic,
              "RepositoryVisibilityChangeDisableAuditEntry"             -> onRepositoryVisibilityChangeDisableAuditEntry,
              "RepositoryVisibilityChangeEnableAuditEntry"              -> onRepositoryVisibilityChangeEnableAuditEntry,
              "RepositoryVulnerabilityAlert"                            -> onRepositoryVulnerabilityAlert,
              "ReviewDismissalAllowance"                                -> onReviewDismissalAllowance,
              "ReviewDismissedEvent"                                    -> onReviewDismissedEvent,
              "ReviewRequest"                                           -> onReviewRequest,
              "ReviewRequestRemovedEvent"                               -> onReviewRequestRemovedEvent,
              "ReviewRequestedEvent"                                    -> onReviewRequestedEvent,
              "SavedReply"                                              -> onSavedReply,
              "SecurityAdvisory"                                        -> onSecurityAdvisory,
              "SponsorsActivity"                                        -> onSponsorsActivity,
              "SponsorsListing"                                         -> onSponsorsListing,
              "SponsorsTier"                                            -> onSponsorsTier,
              "Sponsorship"                                             -> onSponsorship,
              "SponsorshipNewsletter"                                   -> onSponsorshipNewsletter,
              "Status"                                                  -> onStatus,
              "StatusCheckRollup"                                       -> onStatusCheckRollup,
              "StatusContext"                                           -> onStatusContext,
              "SubscribedEvent"                                         -> onSubscribedEvent,
              "Tag"                                                     -> onTag,
              "Team"                                                    -> onTeam,
              "TeamAddMemberAuditEntry"                                 -> onTeamAddMemberAuditEntry,
              "TeamAddRepositoryAuditEntry"                             -> onTeamAddRepositoryAuditEntry,
              "TeamChangeParentTeamAuditEntry"                          -> onTeamChangeParentTeamAuditEntry,
              "TeamDiscussion"                                          -> onTeamDiscussion,
              "TeamDiscussionComment"                                   -> onTeamDiscussionComment,
              "TeamRemoveMemberAuditEntry"                              -> onTeamRemoveMemberAuditEntry,
              "TeamRemoveRepositoryAuditEntry"                          -> onTeamRemoveRepositoryAuditEntry,
              "Topic"                                                   -> onTopic,
              "TransferredEvent"                                        -> onTransferredEvent,
              "Tree"                                                    -> onTree,
              "UnassignedEvent"                                         -> onUnassignedEvent,
              "UnlabeledEvent"                                          -> onUnlabeledEvent,
              "UnlockedEvent"                                           -> onUnlockedEvent,
              "UnmarkedAsDuplicateEvent"                                -> onUnmarkedAsDuplicateEvent,
              "UnpinnedEvent"                                           -> onUnpinnedEvent,
              "UnsubscribedEvent"                                       -> onUnsubscribedEvent,
              "User"                                                    -> onUser,
              "UserBlockedEvent"                                        -> onUserBlockedEvent,
              "UserContentEdit"                                         -> onUserContentEdit,
              "UserStatus"                                              -> onUserStatus,
              "VerifiableDomain"                                        -> onVerifiableDomain,
              "Workflow"                                                -> onWorkflow,
              "WorkflowRun"                                             -> onWorkflowRun
            ).collect { case (k, Some(v)) => k -> Obj(v) }
          )
        )
      ),
      arguments = List(Argument("ids", ids, "[ID!]!")(encoder0))
    )

  /** Lookup a organization by login.
    */
  def organization[A](login: String)(innerSelection: SelectionBuilder[Organization, A])(implicit
    encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("organization", OptionOf(Obj(innerSelection)), arguments = List(Argument("login", login, "String!")(encoder0)))

  /** The client's rate limit information.
    */
  def rateLimit[A](dryRun: Option[Boolean] = None)(innerSelection: SelectionBuilder[RateLimit, A])(implicit
    encoder0: ArgEncoder[Option[Boolean]]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("rateLimit", OptionOf(Obj(innerSelection)), arguments = List(Argument("dryRun", dryRun, "Boolean")(encoder0)))

  /** Hack to workaround https://github.com/facebook/relay/issues/112 re-exposing the root query object
    */
  def relay[A](innerSelection: SelectionBuilder[Query, A]): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, A] =
    _root_.caliban.client.SelectionBuilder.Field("relay", Obj(innerSelection))

  /** Lookup a given repository by the owner and repository name.
    */
  def repository[A](followRenames: Option[Boolean] = None, name: String, owner: String)(innerSelection: SelectionBuilder[Repository, A])(implicit
    encoder0: ArgEncoder[Option[Boolean]],
    encoder1: ArgEncoder[String],
    encoder2: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "repository",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("followRenames", followRenames, "Boolean")(encoder0),
      Argument("name", name, "String!")(encoder1),
      Argument("owner", owner, "String!")(encoder2)
    )
  )

  /** Lookup a repository owner (ie. either a User or an Organization) by login.
    */
  def repositoryOwner[A](
    login: String
  )(onOrganization: Option[SelectionBuilder[Organization, A]] = None, onUser: Option[SelectionBuilder[User, A]] = None)(implicit
    encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "repositoryOwner",
    OptionOf(ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) })),
    arguments = List(Argument("login", login, "String!")(encoder0))
  )

  /** Lookup resource by a URL.
    */
  def resource[A](url: URI)(
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onCheckRun: Option[SelectionBuilder[CheckRun, A]]                           = None,
    onClosedEvent: Option[SelectionBuilder[ClosedEvent, A]]                     = None,
    onCommit: Option[SelectionBuilder[Commit, A]]                               = None,
    onConvertToDraftEvent: Option[SelectionBuilder[ConvertToDraftEvent, A]]     = None,
    onCrossReferencedEvent: Option[SelectionBuilder[CrossReferencedEvent, A]]   = None,
    onGist: Option[SelectionBuilder[Gist, A]]                                   = None,
    onIssue: Option[SelectionBuilder[Issue, A]]                                 = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onMergedEvent: Option[SelectionBuilder[MergedEvent, A]]                     = None,
    onMilestone: Option[SelectionBuilder[Milestone, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]]                     = None,
    onPullRequestCommit: Option[SelectionBuilder[PullRequestCommit, A]]         = None,
    onReadyForReviewEvent: Option[SelectionBuilder[ReadyForReviewEvent, A]]     = None,
    onRelease: Option[SelectionBuilder[Release, A]]                             = None,
    onRepository: Option[SelectionBuilder[Repository, A]]                       = None,
    onRepositoryTopic: Option[SelectionBuilder[RepositoryTopic, A]]             = None,
    onReviewDismissedEvent: Option[SelectionBuilder[ReviewDismissedEvent, A]]   = None,
    onTeamDiscussion: Option[SelectionBuilder[TeamDiscussion, A]]               = None,
    onTeamDiscussionComment: Option[SelectionBuilder[TeamDiscussionComment, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  )(implicit encoder0: ArgEncoder[URI]): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "resource",
      OptionOf(
        ChoiceOf(
          Map(
            "Bot"                   -> onBot,
            "CheckRun"              -> onCheckRun,
            "ClosedEvent"           -> onClosedEvent,
            "Commit"                -> onCommit,
            "ConvertToDraftEvent"   -> onConvertToDraftEvent,
            "CrossReferencedEvent"  -> onCrossReferencedEvent,
            "Gist"                  -> onGist,
            "Issue"                 -> onIssue,
            "Mannequin"             -> onMannequin,
            "MergedEvent"           -> onMergedEvent,
            "Milestone"             -> onMilestone,
            "Organization"          -> onOrganization,
            "PullRequest"           -> onPullRequest,
            "PullRequestCommit"     -> onPullRequestCommit,
            "ReadyForReviewEvent"   -> onReadyForReviewEvent,
            "Release"               -> onRelease,
            "Repository"            -> onRepository,
            "RepositoryTopic"       -> onRepositoryTopic,
            "ReviewDismissedEvent"  -> onReviewDismissedEvent,
            "TeamDiscussion"        -> onTeamDiscussion,
            "TeamDiscussionComment" -> onTeamDiscussionComment,
            "User"                  -> onUser
          ).collect { case (k, Some(v)) => k -> Obj(v) }
        )
      ),
      arguments = List(Argument("url", url, "URI!")(encoder0))
    )

  /** Perform a search across resources.
    */
  def search[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    query: String,
    `type`: SearchType
  )(innerSelection: SelectionBuilder[SearchResultItemConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[String],
    encoder5: ArgEncoder[SearchType]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, A] = _root_.caliban.client.SelectionBuilder.Field(
    "search",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("query", query, "String!")(encoder4),
      Argument("type", `type`, "SearchType!")(encoder5)
    )
  )

  /** GitHub Security Advisories
    */
  def securityAdvisories[A](
    after: Option[String]                                = None,
    before: Option[String]                               = None,
    first: Option[Int]                                   = None,
    identifier: Option[SecurityAdvisoryIdentifierFilter] = None,
    last: Option[Int]                                    = None,
    orderBy: Option[SecurityAdvisoryOrder]               = None,
    publishedSince: Option[DateTime]                     = None,
    updatedSince: Option[DateTime]                       = None
  )(innerSelection: SelectionBuilder[SecurityAdvisoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[SecurityAdvisoryIdentifierFilter]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[SecurityAdvisoryOrder]],
    encoder6: ArgEncoder[Option[DateTime]],
    encoder7: ArgEncoder[Option[DateTime]]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, A] = _root_.caliban.client.SelectionBuilder.Field(
    "securityAdvisories",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("identifier", identifier, "SecurityAdvisoryIdentifierFilter")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "SecurityAdvisoryOrder")(encoder5),
      Argument("publishedSince", publishedSince, "DateTime")(encoder6),
      Argument("updatedSince", updatedSince, "DateTime")(encoder7)
    )
  )

  /** Fetch a Security Advisory by its GHSA ID
    */
  def securityAdvisory[A](ghsaId: String)(innerSelection: SelectionBuilder[SecurityAdvisory, A])(implicit
    encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("securityAdvisory", OptionOf(Obj(innerSelection)), arguments = List(Argument("ghsaId", ghsaId, "String!")(encoder0)))

  /** Software Vulnerabilities documented by GitHub Security Advisories
    */
  def securityVulnerabilities[A](
    after: Option[String]                              = None,
    before: Option[String]                             = None,
    ecosystem: Option[SecurityAdvisoryEcosystem]       = None,
    first: Option[Int]                                 = None,
    last: Option[Int]                                  = None,
    orderBy: Option[SecurityVulnerabilityOrder]        = None,
    `package`: Option[String]                          = None,
    severities: Option[List[SecurityAdvisorySeverity]] = None
  )(innerSelection: SelectionBuilder[SecurityVulnerabilityConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[SecurityAdvisoryEcosystem]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[SecurityVulnerabilityOrder]],
    encoder6: ArgEncoder[Option[String]],
    encoder7: ArgEncoder[Option[List[SecurityAdvisorySeverity]]]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, A] = _root_.caliban.client.SelectionBuilder.Field(
    "securityVulnerabilities",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("ecosystem", ecosystem, "SecurityAdvisoryEcosystem")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "SecurityVulnerabilityOrder")(encoder5),
      Argument("package", `package`, "String")(encoder6),
      Argument("severities", severities, "[SecurityAdvisorySeverity!]")(encoder7)
    )
  )

  /** Users and organizations who can be sponsored via GitHub Sponsors.
    */
  def sponsorables[A](
    after: Option[String]                                  = None,
    before: Option[String]                                 = None,
    dependencyEcosystem: Option[SecurityAdvisoryEcosystem] = None,
    first: Option[Int]                                     = None,
    last: Option[Int]                                      = None,
    onlyDependencies: Option[Boolean]                      = None,
    orderBy: Option[SponsorableOrder]                      = None,
    orgLoginForDependencies: Option[String]                = None
  )(innerSelection: SelectionBuilder[SponsorableItemConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[SecurityAdvisoryEcosystem]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[Boolean]],
    encoder6: ArgEncoder[Option[SponsorableOrder]],
    encoder7: ArgEncoder[Option[String]]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, A] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsorables",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("dependencyEcosystem", dependencyEcosystem, "SecurityAdvisoryEcosystem")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("onlyDependencies", onlyDependencies, "Boolean")(encoder5),
      Argument("orderBy", orderBy, "SponsorableOrder")(encoder6),
      Argument("orgLoginForDependencies", orgLoginForDependencies, "String")(encoder7)
    )
  )

  /** Look up a topic by name.
    */
  def topic[A](name: String)(innerSelection: SelectionBuilder[Topic, A])(implicit
    encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("topic", OptionOf(Obj(innerSelection)), arguments = List(Argument("name", name, "String!")(encoder0)))

  /** Lookup a user by login.
    */
  def user[A](login: String)(innerSelection: SelectionBuilder[User, A])(implicit
    encoder0: ArgEncoder[String]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("user", OptionOf(Obj(innerSelection)), arguments = List(Argument("login", login, "String!")(encoder0)))

  /** The currently authenticated user.
    */
  def viewer[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[_root_.caliban.client.Operations.RootQuery, A] =
    _root_.caliban.client.SelectionBuilder.Field("viewer", Obj(innerSelection))
}

