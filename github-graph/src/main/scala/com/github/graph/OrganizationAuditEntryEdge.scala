package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrganizationAuditEntryEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[OrganizationAuditEntryEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](
    onMembersCanDeleteReposClearAuditEntry: SelectionBuilder[MembersCanDeleteReposClearAuditEntry, A],
    onMembersCanDeleteReposDisableAuditEntry: SelectionBuilder[MembersCanDeleteReposDisableAuditEntry, A],
    onMembersCanDeleteReposEnableAuditEntry: SelectionBuilder[MembersCanDeleteReposEnableAuditEntry, A],
    onOauthApplicationCreateAuditEntry: SelectionBuilder[OauthApplicationCreateAuditEntry, A],
    onOrgAddBillingManagerAuditEntry: SelectionBuilder[OrgAddBillingManagerAuditEntry, A],
    onOrgAddMemberAuditEntry: SelectionBuilder[OrgAddMemberAuditEntry, A],
    onOrgBlockUserAuditEntry: SelectionBuilder[OrgBlockUserAuditEntry, A],
    onOrgConfigDisableCollaboratorsOnlyAuditEntry: SelectionBuilder[OrgConfigDisableCollaboratorsOnlyAuditEntry, A],
    onOrgConfigEnableCollaboratorsOnlyAuditEntry: SelectionBuilder[OrgConfigEnableCollaboratorsOnlyAuditEntry, A],
    onOrgCreateAuditEntry: SelectionBuilder[OrgCreateAuditEntry, A],
    onOrgDisableOauthAppRestrictionsAuditEntry: SelectionBuilder[OrgDisableOauthAppRestrictionsAuditEntry, A],
    onOrgDisableSamlAuditEntry: SelectionBuilder[OrgDisableSamlAuditEntry, A],
    onOrgDisableTwoFactorRequirementAuditEntry: SelectionBuilder[OrgDisableTwoFactorRequirementAuditEntry, A],
    onOrgEnableOauthAppRestrictionsAuditEntry: SelectionBuilder[OrgEnableOauthAppRestrictionsAuditEntry, A],
    onOrgEnableSamlAuditEntry: SelectionBuilder[OrgEnableSamlAuditEntry, A],
    onOrgEnableTwoFactorRequirementAuditEntry: SelectionBuilder[OrgEnableTwoFactorRequirementAuditEntry, A],
    onOrgInviteMemberAuditEntry: SelectionBuilder[OrgInviteMemberAuditEntry, A],
    onOrgInviteToBusinessAuditEntry: SelectionBuilder[OrgInviteToBusinessAuditEntry, A],
    onOrgOauthAppAccessApprovedAuditEntry: SelectionBuilder[OrgOauthAppAccessApprovedAuditEntry, A],
    onOrgOauthAppAccessDeniedAuditEntry: SelectionBuilder[OrgOauthAppAccessDeniedAuditEntry, A],
    onOrgOauthAppAccessRequestedAuditEntry: SelectionBuilder[OrgOauthAppAccessRequestedAuditEntry, A],
    onOrgRemoveBillingManagerAuditEntry: SelectionBuilder[OrgRemoveBillingManagerAuditEntry, A],
    onOrgRemoveMemberAuditEntry: SelectionBuilder[OrgRemoveMemberAuditEntry, A],
    onOrgRemoveOutsideCollaboratorAuditEntry: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, A],
    onOrgRestoreMemberAuditEntry: SelectionBuilder[OrgRestoreMemberAuditEntry, A],
    onOrgUnblockUserAuditEntry: SelectionBuilder[OrgUnblockUserAuditEntry, A],
    onOrgUpdateDefaultRepositoryPermissionAuditEntry: SelectionBuilder[OrgUpdateDefaultRepositoryPermissionAuditEntry, A],
    onOrgUpdateMemberAuditEntry: SelectionBuilder[OrgUpdateMemberAuditEntry, A],
    onOrgUpdateMemberRepositoryCreationPermissionAuditEntry: SelectionBuilder[OrgUpdateMemberRepositoryCreationPermissionAuditEntry, A],
    onOrgUpdateMemberRepositoryInvitationPermissionAuditEntry: SelectionBuilder[OrgUpdateMemberRepositoryInvitationPermissionAuditEntry, A],
    onPrivateRepositoryForkingDisableAuditEntry: SelectionBuilder[PrivateRepositoryForkingDisableAuditEntry, A],
    onPrivateRepositoryForkingEnableAuditEntry: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, A],
    onRepoAccessAuditEntry: SelectionBuilder[RepoAccessAuditEntry, A],
    onRepoAddMemberAuditEntry: SelectionBuilder[RepoAddMemberAuditEntry, A],
    onRepoAddTopicAuditEntry: SelectionBuilder[RepoAddTopicAuditEntry, A],
    onRepoArchivedAuditEntry: SelectionBuilder[RepoArchivedAuditEntry, A],
    onRepoChangeMergeSettingAuditEntry: SelectionBuilder[RepoChangeMergeSettingAuditEntry, A],
    onRepoConfigDisableAnonymousGitAccessAuditEntry: SelectionBuilder[RepoConfigDisableAnonymousGitAccessAuditEntry, A],
    onRepoConfigDisableCollaboratorsOnlyAuditEntry: SelectionBuilder[RepoConfigDisableCollaboratorsOnlyAuditEntry, A],
    onRepoConfigDisableContributorsOnlyAuditEntry: SelectionBuilder[RepoConfigDisableContributorsOnlyAuditEntry, A],
    onRepoConfigDisableSockpuppetDisallowedAuditEntry: SelectionBuilder[RepoConfigDisableSockpuppetDisallowedAuditEntry, A],
    onRepoConfigEnableAnonymousGitAccessAuditEntry: SelectionBuilder[RepoConfigEnableAnonymousGitAccessAuditEntry, A],
    onRepoConfigEnableCollaboratorsOnlyAuditEntry: SelectionBuilder[RepoConfigEnableCollaboratorsOnlyAuditEntry, A],
    onRepoConfigEnableContributorsOnlyAuditEntry: SelectionBuilder[RepoConfigEnableContributorsOnlyAuditEntry, A],
    onRepoConfigEnableSockpuppetDisallowedAuditEntry: SelectionBuilder[RepoConfigEnableSockpuppetDisallowedAuditEntry, A],
    onRepoConfigLockAnonymousGitAccessAuditEntry: SelectionBuilder[RepoConfigLockAnonymousGitAccessAuditEntry, A],
    onRepoConfigUnlockAnonymousGitAccessAuditEntry: SelectionBuilder[RepoConfigUnlockAnonymousGitAccessAuditEntry, A],
    onRepoCreateAuditEntry: SelectionBuilder[RepoCreateAuditEntry, A],
    onRepoDestroyAuditEntry: SelectionBuilder[RepoDestroyAuditEntry, A],
    onRepoRemoveMemberAuditEntry: SelectionBuilder[RepoRemoveMemberAuditEntry, A],
    onRepoRemoveTopicAuditEntry: SelectionBuilder[RepoRemoveTopicAuditEntry, A],
    onRepositoryVisibilityChangeDisableAuditEntry: SelectionBuilder[RepositoryVisibilityChangeDisableAuditEntry, A],
    onRepositoryVisibilityChangeEnableAuditEntry: SelectionBuilder[RepositoryVisibilityChangeEnableAuditEntry, A],
    onTeamAddMemberAuditEntry: SelectionBuilder[TeamAddMemberAuditEntry, A],
    onTeamAddRepositoryAuditEntry: SelectionBuilder[TeamAddRepositoryAuditEntry, A],
    onTeamChangeParentTeamAuditEntry: SelectionBuilder[TeamChangeParentTeamAuditEntry, A],
    onTeamRemoveMemberAuditEntry: SelectionBuilder[TeamRemoveMemberAuditEntry, A],
    onTeamRemoveRepositoryAuditEntry: SelectionBuilder[TeamRemoveRepositoryAuditEntry, A]
  ): SelectionBuilder[OrganizationAuditEntryEdge, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "MembersCanDeleteReposClearAuditEntry"                    -> Obj(onMembersCanDeleteReposClearAuditEntry),
          "MembersCanDeleteReposDisableAuditEntry"                  -> Obj(onMembersCanDeleteReposDisableAuditEntry),
          "MembersCanDeleteReposEnableAuditEntry"                   -> Obj(onMembersCanDeleteReposEnableAuditEntry),
          "OauthApplicationCreateAuditEntry"                        -> Obj(onOauthApplicationCreateAuditEntry),
          "OrgAddBillingManagerAuditEntry"                          -> Obj(onOrgAddBillingManagerAuditEntry),
          "OrgAddMemberAuditEntry"                                  -> Obj(onOrgAddMemberAuditEntry),
          "OrgBlockUserAuditEntry"                                  -> Obj(onOrgBlockUserAuditEntry),
          "OrgConfigDisableCollaboratorsOnlyAuditEntry"             -> Obj(onOrgConfigDisableCollaboratorsOnlyAuditEntry),
          "OrgConfigEnableCollaboratorsOnlyAuditEntry"              -> Obj(onOrgConfigEnableCollaboratorsOnlyAuditEntry),
          "OrgCreateAuditEntry"                                     -> Obj(onOrgCreateAuditEntry),
          "OrgDisableOauthAppRestrictionsAuditEntry"                -> Obj(onOrgDisableOauthAppRestrictionsAuditEntry),
          "OrgDisableSamlAuditEntry"                                -> Obj(onOrgDisableSamlAuditEntry),
          "OrgDisableTwoFactorRequirementAuditEntry"                -> Obj(onOrgDisableTwoFactorRequirementAuditEntry),
          "OrgEnableOauthAppRestrictionsAuditEntry"                 -> Obj(onOrgEnableOauthAppRestrictionsAuditEntry),
          "OrgEnableSamlAuditEntry"                                 -> Obj(onOrgEnableSamlAuditEntry),
          "OrgEnableTwoFactorRequirementAuditEntry"                 -> Obj(onOrgEnableTwoFactorRequirementAuditEntry),
          "OrgInviteMemberAuditEntry"                               -> Obj(onOrgInviteMemberAuditEntry),
          "OrgInviteToBusinessAuditEntry"                           -> Obj(onOrgInviteToBusinessAuditEntry),
          "OrgOauthAppAccessApprovedAuditEntry"                     -> Obj(onOrgOauthAppAccessApprovedAuditEntry),
          "OrgOauthAppAccessDeniedAuditEntry"                       -> Obj(onOrgOauthAppAccessDeniedAuditEntry),
          "OrgOauthAppAccessRequestedAuditEntry"                    -> Obj(onOrgOauthAppAccessRequestedAuditEntry),
          "OrgRemoveBillingManagerAuditEntry"                       -> Obj(onOrgRemoveBillingManagerAuditEntry),
          "OrgRemoveMemberAuditEntry"                               -> Obj(onOrgRemoveMemberAuditEntry),
          "OrgRemoveOutsideCollaboratorAuditEntry"                  -> Obj(onOrgRemoveOutsideCollaboratorAuditEntry),
          "OrgRestoreMemberAuditEntry"                              -> Obj(onOrgRestoreMemberAuditEntry),
          "OrgUnblockUserAuditEntry"                                -> Obj(onOrgUnblockUserAuditEntry),
          "OrgUpdateDefaultRepositoryPermissionAuditEntry"          -> Obj(onOrgUpdateDefaultRepositoryPermissionAuditEntry),
          "OrgUpdateMemberAuditEntry"                               -> Obj(onOrgUpdateMemberAuditEntry),
          "OrgUpdateMemberRepositoryCreationPermissionAuditEntry"   -> Obj(onOrgUpdateMemberRepositoryCreationPermissionAuditEntry),
          "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry" -> Obj(onOrgUpdateMemberRepositoryInvitationPermissionAuditEntry),
          "PrivateRepositoryForkingDisableAuditEntry"               -> Obj(onPrivateRepositoryForkingDisableAuditEntry),
          "PrivateRepositoryForkingEnableAuditEntry"                -> Obj(onPrivateRepositoryForkingEnableAuditEntry),
          "RepoAccessAuditEntry"                                    -> Obj(onRepoAccessAuditEntry),
          "RepoAddMemberAuditEntry"                                 -> Obj(onRepoAddMemberAuditEntry),
          "RepoAddTopicAuditEntry"                                  -> Obj(onRepoAddTopicAuditEntry),
          "RepoArchivedAuditEntry"                                  -> Obj(onRepoArchivedAuditEntry),
          "RepoChangeMergeSettingAuditEntry"                        -> Obj(onRepoChangeMergeSettingAuditEntry),
          "RepoConfigDisableAnonymousGitAccessAuditEntry"           -> Obj(onRepoConfigDisableAnonymousGitAccessAuditEntry),
          "RepoConfigDisableCollaboratorsOnlyAuditEntry"            -> Obj(onRepoConfigDisableCollaboratorsOnlyAuditEntry),
          "RepoConfigDisableContributorsOnlyAuditEntry"             -> Obj(onRepoConfigDisableContributorsOnlyAuditEntry),
          "RepoConfigDisableSockpuppetDisallowedAuditEntry"         -> Obj(onRepoConfigDisableSockpuppetDisallowedAuditEntry),
          "RepoConfigEnableAnonymousGitAccessAuditEntry"            -> Obj(onRepoConfigEnableAnonymousGitAccessAuditEntry),
          "RepoConfigEnableCollaboratorsOnlyAuditEntry"             -> Obj(onRepoConfigEnableCollaboratorsOnlyAuditEntry),
          "RepoConfigEnableContributorsOnlyAuditEntry"              -> Obj(onRepoConfigEnableContributorsOnlyAuditEntry),
          "RepoConfigEnableSockpuppetDisallowedAuditEntry"          -> Obj(onRepoConfigEnableSockpuppetDisallowedAuditEntry),
          "RepoConfigLockAnonymousGitAccessAuditEntry"              -> Obj(onRepoConfigLockAnonymousGitAccessAuditEntry),
          "RepoConfigUnlockAnonymousGitAccessAuditEntry"            -> Obj(onRepoConfigUnlockAnonymousGitAccessAuditEntry),
          "RepoCreateAuditEntry"                                    -> Obj(onRepoCreateAuditEntry),
          "RepoDestroyAuditEntry"                                   -> Obj(onRepoDestroyAuditEntry),
          "RepoRemoveMemberAuditEntry"                              -> Obj(onRepoRemoveMemberAuditEntry),
          "RepoRemoveTopicAuditEntry"                               -> Obj(onRepoRemoveTopicAuditEntry),
          "RepositoryVisibilityChangeDisableAuditEntry"             -> Obj(onRepositoryVisibilityChangeDisableAuditEntry),
          "RepositoryVisibilityChangeEnableAuditEntry"              -> Obj(onRepositoryVisibilityChangeEnableAuditEntry),
          "TeamAddMemberAuditEntry"                                 -> Obj(onTeamAddMemberAuditEntry),
          "TeamAddRepositoryAuditEntry"                             -> Obj(onTeamAddRepositoryAuditEntry),
          "TeamChangeParentTeamAuditEntry"                          -> Obj(onTeamChangeParentTeamAuditEntry),
          "TeamRemoveMemberAuditEntry"                              -> Obj(onTeamRemoveMemberAuditEntry),
          "TeamRemoveRepositoryAuditEntry"                          -> Obj(onTeamRemoveRepositoryAuditEntry)
        )
      )
    )
  )

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onMembersCanDeleteReposClearAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposClearAuditEntry, A]]                     = None,
    onMembersCanDeleteReposDisableAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposDisableAuditEntry, A]]                 = None,
    onMembersCanDeleteReposEnableAuditEntry: Option[SelectionBuilder[MembersCanDeleteReposEnableAuditEntry, A]]                   = None,
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
    onPrivateRepositoryForkingDisableAuditEntry: Option[SelectionBuilder[PrivateRepositoryForkingDisableAuditEntry, A]]             = None,
    onPrivateRepositoryForkingEnableAuditEntry: Option[SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, A]]               = None,
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
    onRepositoryVisibilityChangeDisableAuditEntry: Option[SelectionBuilder[RepositoryVisibilityChangeDisableAuditEntry, A]]         = None,
    onRepositoryVisibilityChangeEnableAuditEntry: Option[SelectionBuilder[RepositoryVisibilityChangeEnableAuditEntry, A]]           = None,
    onTeamAddMemberAuditEntry: Option[SelectionBuilder[TeamAddMemberAuditEntry, A]]                                                 = None,
    onTeamAddRepositoryAuditEntry: Option[SelectionBuilder[TeamAddRepositoryAuditEntry, A]]                                         = None,
    onTeamChangeParentTeamAuditEntry: Option[SelectionBuilder[TeamChangeParentTeamAuditEntry, A]]                                   = None,
    onTeamRemoveMemberAuditEntry: Option[SelectionBuilder[TeamRemoveMemberAuditEntry, A]]                                           = None,
    onTeamRemoveRepositoryAuditEntry: Option[SelectionBuilder[TeamRemoveRepositoryAuditEntry, A]]                                   = None
  ): SelectionBuilder[OrganizationAuditEntryEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "MembersCanDeleteReposClearAuditEntry" -> onMembersCanDeleteReposClearAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "MembersCanDeleteReposDisableAuditEntry" -> onMembersCanDeleteReposDisableAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "MembersCanDeleteReposEnableAuditEntry" -> onMembersCanDeleteReposEnableAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OauthApplicationCreateAuditEntry" -> onOauthApplicationCreateAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgAddBillingManagerAuditEntry"   -> onOrgAddBillingManagerAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgAddMemberAuditEntry"           -> onOrgAddMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgBlockUserAuditEntry"           -> onOrgBlockUserAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgConfigDisableCollaboratorsOnlyAuditEntry" -> onOrgConfigDisableCollaboratorsOnlyAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgConfigEnableCollaboratorsOnlyAuditEntry" -> onOrgConfigEnableCollaboratorsOnlyAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgCreateAuditEntry" -> onOrgCreateAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgDisableOauthAppRestrictionsAuditEntry" -> onOrgDisableOauthAppRestrictionsAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgDisableSamlAuditEntry" -> onOrgDisableSamlAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgDisableTwoFactorRequirementAuditEntry" -> onOrgDisableTwoFactorRequirementAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgEnableOauthAppRestrictionsAuditEntry" -> onOrgEnableOauthAppRestrictionsAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgEnableSamlAuditEntry" -> onOrgEnableSamlAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgEnableTwoFactorRequirementAuditEntry" -> onOrgEnableTwoFactorRequirementAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgInviteMemberAuditEntry"     -> onOrgInviteMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgInviteToBusinessAuditEntry" -> onOrgInviteToBusinessAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgOauthAppAccessApprovedAuditEntry" -> onOrgOauthAppAccessApprovedAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgOauthAppAccessDeniedAuditEntry" -> onOrgOauthAppAccessDeniedAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgOauthAppAccessRequestedAuditEntry" -> onOrgOauthAppAccessRequestedAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgRemoveBillingManagerAuditEntry" -> onOrgRemoveBillingManagerAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgRemoveMemberAuditEntry"         -> onOrgRemoveMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgRemoveOutsideCollaboratorAuditEntry" -> onOrgRemoveOutsideCollaboratorAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "OrgRestoreMemberAuditEntry" -> onOrgRestoreMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgUnblockUserAuditEntry"   -> onOrgUnblockUserAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgUpdateDefaultRepositoryPermissionAuditEntry" -> onOrgUpdateDefaultRepositoryPermissionAuditEntry
            .fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgUpdateMemberAuditEntry" -> onOrgUpdateMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgUpdateMemberRepositoryCreationPermissionAuditEntry" -> onOrgUpdateMemberRepositoryCreationPermissionAuditEntry
            .fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "OrgUpdateMemberRepositoryInvitationPermissionAuditEntry" -> onOrgUpdateMemberRepositoryInvitationPermissionAuditEntry
            .fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PrivateRepositoryForkingDisableAuditEntry" -> onPrivateRepositoryForkingDisableAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "PrivateRepositoryForkingEnableAuditEntry" -> onPrivateRepositoryForkingEnableAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "RepoAccessAuditEntry"             -> onRepoAccessAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoAddMemberAuditEntry"          -> onRepoAddMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoAddTopicAuditEntry"           -> onRepoAddTopicAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoArchivedAuditEntry"           -> onRepoArchivedAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoChangeMergeSettingAuditEntry" -> onRepoChangeMergeSettingAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoConfigDisableAnonymousGitAccessAuditEntry" -> onRepoConfigDisableAnonymousGitAccessAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(
            a => OptionOf(Obj(a))
          ),
          "RepoConfigDisableCollaboratorsOnlyAuditEntry" -> onRepoConfigDisableCollaboratorsOnlyAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(
            a => OptionOf(Obj(a))
          ),
          "RepoConfigDisableContributorsOnlyAuditEntry" -> onRepoConfigDisableContributorsOnlyAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "RepoConfigDisableSockpuppetDisallowedAuditEntry" -> onRepoConfigDisableSockpuppetDisallowedAuditEntry
            .fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoConfigEnableAnonymousGitAccessAuditEntry" -> onRepoConfigEnableAnonymousGitAccessAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(
            a => OptionOf(Obj(a))
          ),
          "RepoConfigEnableCollaboratorsOnlyAuditEntry" -> onRepoConfigEnableCollaboratorsOnlyAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "RepoConfigEnableContributorsOnlyAuditEntry" -> onRepoConfigEnableContributorsOnlyAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "RepoConfigEnableSockpuppetDisallowedAuditEntry" -> onRepoConfigEnableSockpuppetDisallowedAuditEntry
            .fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoConfigLockAnonymousGitAccessAuditEntry" -> onRepoConfigLockAnonymousGitAccessAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "RepoConfigUnlockAnonymousGitAccessAuditEntry" -> onRepoConfigUnlockAnonymousGitAccessAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(
            a => OptionOf(Obj(a))
          ),
          "RepoCreateAuditEntry"       -> onRepoCreateAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoDestroyAuditEntry"      -> onRepoDestroyAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoRemoveMemberAuditEntry" -> onRepoRemoveMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepoRemoveTopicAuditEntry"  -> onRepoRemoveTopicAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "RepositoryVisibilityChangeDisableAuditEntry" -> onRepositoryVisibilityChangeDisableAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "RepositoryVisibilityChangeEnableAuditEntry" -> onRepositoryVisibilityChangeEnableAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a =>
            OptionOf(Obj(a))
          ),
          "TeamAddMemberAuditEntry"        -> onTeamAddMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "TeamAddRepositoryAuditEntry"    -> onTeamAddRepositoryAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "TeamChangeParentTeamAuditEntry" -> onTeamChangeParentTeamAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "TeamRemoveMemberAuditEntry"     -> onTeamRemoveMemberAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "TeamRemoveRepositoryAuditEntry" -> onTeamRemoveRepositoryAuditEntry.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

