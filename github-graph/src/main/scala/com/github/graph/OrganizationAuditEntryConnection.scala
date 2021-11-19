package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrganizationAuditEntryConnection {

  /** A list of edges.
    */
  def edges[A](
    innerSelection: SelectionBuilder[OrganizationAuditEntryEdge, A]
  ): SelectionBuilder[OrganizationAuditEntryConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** A list of nodes.
    */
  def nodes[A](
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
  ): SelectionBuilder[OrganizationAuditEntryConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder.Field(
    "nodes",
    OptionOf(
      ListOf(
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
    )
  )

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[OrganizationAuditEntryConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** Identifies the total count of items in the connection.
    */
  def totalCount: SelectionBuilder[OrganizationAuditEntryConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("totalCount", Scalar())
}

