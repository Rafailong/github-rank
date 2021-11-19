package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseOwnerInfo {

  /** A list of all of the administrators for this enterprise.
    */
  def admins[A](
    after: Option[String]                     = None,
    before: Option[String]                    = None,
    first: Option[Int]                        = None,
    last: Option[Int]                         = None,
    orderBy: Option[EnterpriseMemberOrder]    = None,
    query: Option[String]                     = None,
    role: Option[EnterpriseAdministratorRole] = None
  )(innerSelection: SelectionBuilder[EnterpriseAdministratorConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[EnterpriseMemberOrder]],
    encoder5: ArgEncoder[Option[String]],
    encoder6: ArgEncoder[Option[EnterpriseAdministratorRole]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "admins",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "EnterpriseMemberOrder")(encoder4),
      Argument("query", query, "String")(encoder5),
      Argument("role", role, "EnterpriseAdministratorRole")(encoder6)
    )
  )

  /** A list of users in the enterprise who currently have two-factor authentication disabled.
    */
  def affiliatedUsersWithTwoFactorDisabled[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None
  )(innerSelection: SelectionBuilder[UserConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "affiliatedUsersWithTwoFactorDisabled",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Whether or not affiliated users with two-factor authentication disabled exist in the enterprise.
    */
  def affiliatedUsersWithTwoFactorDisabledExist: SelectionBuilder[EnterpriseOwnerInfo, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("affiliatedUsersWithTwoFactorDisabledExist", Scalar())

  /** The setting value for whether private repository forking is enabled for repositories in organizations in this enterprise.
    */
  def allowPrivateRepositoryForkingSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("allowPrivateRepositoryForkingSetting", Scalar())

  /** A list of enterprise organizations configured with the provided private repository forking setting value.
    */
  def allowPrivateRepositoryForkingSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "allowPrivateRepositoryForkingSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** The setting value for base repository permissions for organizations in this enterprise.
    */
  def defaultRepositoryPermissionSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseDefaultRepositoryPermissionSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("defaultRepositoryPermissionSetting", Scalar())

  /** A list of enterprise organizations configured with the provided base repository permission.
    */
  def defaultRepositoryPermissionSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: DefaultRepositoryPermissionField
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[DefaultRepositoryPermissionField]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "defaultRepositoryPermissionSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "DefaultRepositoryPermissionField!")(encoder5)
    )
  )

  /** A list of domains owned by the enterprise.
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
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "domains",
    Obj(innerSelection),
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

  /** Enterprise Server installations owned by the enterprise.
    */
  def enterpriseServerInstallations[A](
    after: Option[String]                              = None,
    before: Option[String]                             = None,
    connectedOnly: Option[Boolean]                     = None,
    first: Option[Int]                                 = None,
    last: Option[Int]                                  = None,
    orderBy: Option[EnterpriseServerInstallationOrder] = None
  )(innerSelection: SelectionBuilder[EnterpriseServerInstallationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Boolean]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[EnterpriseServerInstallationOrder]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "enterpriseServerInstallations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("connectedOnly", connectedOnly, "Boolean")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "EnterpriseServerInstallationOrder")(encoder5)
    )
  )

  /** The setting value for whether the enterprise has an IP allow list enabled.
    */
  def ipAllowListEnabledSetting: SelectionBuilder[EnterpriseOwnerInfo, IpAllowListEnabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("ipAllowListEnabledSetting", Scalar())

  /** The IP addresses that are allowed to access resources owned by the enterprise.
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
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** The setting value for whether the enterprise has IP allow list configuration for installed GitHub Apps enabled.
    */
  def ipAllowListForInstalledAppsEnabledSetting: SelectionBuilder[EnterpriseOwnerInfo, IpAllowListForInstalledAppsEnabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("ipAllowListForInstalledAppsEnabledSetting", Scalar())

  /** Whether or not the base repository permission is currently being updated.
    */
  def isUpdatingDefaultRepositoryPermission: SelectionBuilder[EnterpriseOwnerInfo, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isUpdatingDefaultRepositoryPermission", Scalar())

  /** Whether the two-factor authentication requirement is currently being enforced.
    */
  def isUpdatingTwoFactorRequirement: SelectionBuilder[EnterpriseOwnerInfo, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isUpdatingTwoFactorRequirement", Scalar())

  /** The setting value for whether organization members with admin permissions on a
    * repository can change repository visibility.
    */
  def membersCanChangeRepositoryVisibilitySetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanChangeRepositoryVisibilitySetting", Scalar())

  /** A list of enterprise organizations configured with the provided can change repository visibility setting value.
    */
  def membersCanChangeRepositoryVisibilitySettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "membersCanChangeRepositoryVisibilitySettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** The setting value for whether members of organizations in the enterprise can create internal repositories.
    */
  def membersCanCreateInternalRepositoriesSetting: SelectionBuilder[EnterpriseOwnerInfo, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanCreateInternalRepositoriesSetting", OptionOf(Scalar()))

  /** The setting value for whether members of organizations in the enterprise can create private repositories.
    */
  def membersCanCreatePrivateRepositoriesSetting: SelectionBuilder[EnterpriseOwnerInfo, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanCreatePrivateRepositoriesSetting", OptionOf(Scalar()))

  /** The setting value for whether members of organizations in the enterprise can create public repositories.
    */
  def membersCanCreatePublicRepositoriesSetting: SelectionBuilder[EnterpriseOwnerInfo, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanCreatePublicRepositoriesSetting", OptionOf(Scalar()))

  /** The setting value for whether members of organizations in the enterprise can create repositories.
    */
  def membersCanCreateRepositoriesSetting: SelectionBuilder[EnterpriseOwnerInfo, Option[EnterpriseMembersCanCreateRepositoriesSettingValue]] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanCreateRepositoriesSetting", OptionOf(Scalar()))

  /** A list of enterprise organizations configured with the provided repository creation setting value.
    */
  def membersCanCreateRepositoriesSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: OrganizationMembersCanCreateRepositoriesSettingValue
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[OrganizationMembersCanCreateRepositoriesSettingValue]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "membersCanCreateRepositoriesSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "OrganizationMembersCanCreateRepositoriesSettingValue!")(encoder5)
    )
  )

  /** The setting value for whether members with admin permissions for repositories can delete issues.
    */
  def membersCanDeleteIssuesSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanDeleteIssuesSetting", Scalar())

  /** A list of enterprise organizations configured with the provided members can delete issues setting value.
    */
  def membersCanDeleteIssuesSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "membersCanDeleteIssuesSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** The setting value for whether members with admin permissions for repositories can delete or transfer repositories.
    */
  def membersCanDeleteRepositoriesSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanDeleteRepositoriesSetting", Scalar())

  /** A list of enterprise organizations configured with the provided members can delete repositories setting value.
    */
  def membersCanDeleteRepositoriesSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "membersCanDeleteRepositoriesSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** The setting value for whether members of organizations in the enterprise can invite outside collaborators.
    */
  def membersCanInviteCollaboratorsSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanInviteCollaboratorsSetting", Scalar())

  /** A list of enterprise organizations configured with the provided members can invite collaborators setting value.
    */
  def membersCanInviteCollaboratorsSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "membersCanInviteCollaboratorsSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** Indicates whether members of this enterprise's organizations can purchase additional services for those organizations.
    */
  def membersCanMakePurchasesSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseMembersCanMakePurchasesSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanMakePurchasesSetting", Scalar())

  /** The setting value for whether members with admin permissions for repositories can update protected branches.
    */
  def membersCanUpdateProtectedBranchesSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanUpdateProtectedBranchesSetting", Scalar())

  /** A list of enterprise organizations configured with the provided members can update protected branches setting value.
    */
  def membersCanUpdateProtectedBranchesSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "membersCanUpdateProtectedBranchesSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** The setting value for whether members can view dependency insights.
    */
  def membersCanViewDependencyInsightsSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("membersCanViewDependencyInsightsSetting", Scalar())

  /** A list of enterprise organizations configured with the provided members can view dependency insights setting value.
    */
  def membersCanViewDependencyInsightsSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "membersCanViewDependencyInsightsSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** Indicates if email notification delivery for this enterprise is restricted to verified or approved domains.
    */
  def notificationDeliveryRestrictionEnabledSetting: SelectionBuilder[EnterpriseOwnerInfo, NotificationRestrictionSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("notificationDeliveryRestrictionEnabledSetting", Scalar())

  /** The OIDC Identity Provider for the enterprise.
    */
  def oidcProvider[A](innerSelection: SelectionBuilder[OIDCProvider, A]): SelectionBuilder[EnterpriseOwnerInfo, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("oidcProvider", OptionOf(Obj(innerSelection)))

  /** The setting value for whether organization projects are enabled for organizations in this enterprise.
    */
  def organizationProjectsSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("organizationProjectsSetting", Scalar())

  /** A list of enterprise organizations configured with the provided organization projects setting value.
    */
  def organizationProjectsSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "organizationProjectsSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** A list of outside collaborators across the repositories in the enterprise.
    */
  def outsideCollaborators[A](
    after: Option[String]                    = None,
    before: Option[String]                   = None,
    first: Option[Int]                       = None,
    last: Option[Int]                        = None,
    login: Option[String]                    = None,
    orderBy: Option[EnterpriseMemberOrder]   = None,
    query: Option[String]                    = None,
    visibility: Option[RepositoryVisibility] = None
  )(innerSelection: SelectionBuilder[EnterpriseOutsideCollaboratorConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[String]],
    encoder5: ArgEncoder[Option[EnterpriseMemberOrder]],
    encoder6: ArgEncoder[Option[String]],
    encoder7: ArgEncoder[Option[RepositoryVisibility]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "outsideCollaborators",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("login", login, "String")(encoder4),
      Argument("orderBy", orderBy, "EnterpriseMemberOrder")(encoder5),
      Argument("query", query, "String")(encoder6),
      Argument("visibility", visibility, "RepositoryVisibility")(encoder7)
    )
  )

  /** A list of pending administrator invitations for the enterprise.
    */
  def pendingAdminInvitations[A](
    after: Option[String]                                   = None,
    before: Option[String]                                  = None,
    first: Option[Int]                                      = None,
    last: Option[Int]                                       = None,
    orderBy: Option[EnterpriseAdministratorInvitationOrder] = None,
    query: Option[String]                                   = None,
    role: Option[EnterpriseAdministratorRole]               = None
  )(innerSelection: SelectionBuilder[EnterpriseAdministratorInvitationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[EnterpriseAdministratorInvitationOrder]],
    encoder5: ArgEncoder[Option[String]],
    encoder6: ArgEncoder[Option[EnterpriseAdministratorRole]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pendingAdminInvitations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "EnterpriseAdministratorInvitationOrder")(encoder4),
      Argument("query", query, "String")(encoder5),
      Argument("role", role, "EnterpriseAdministratorRole")(encoder6)
    )
  )

  /** A list of pending collaborator invitations across the repositories in the enterprise.
    */
  def pendingCollaboratorInvitations[A](
    after: Option[String]                      = None,
    before: Option[String]                     = None,
    first: Option[Int]                         = None,
    last: Option[Int]                          = None,
    orderBy: Option[RepositoryInvitationOrder] = None,
    query: Option[String]                      = None
  )(innerSelection: SelectionBuilder[RepositoryInvitationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[RepositoryInvitationOrder]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pendingCollaboratorInvitations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "RepositoryInvitationOrder")(encoder4),
      Argument("query", query, "String")(encoder5)
    )
  )

  /** A list of pending collaborators across the repositories in the enterprise.
    */
  @deprecated(
    "Repository invitations can now be associated with an email, not only an invitee. Use the `pendingCollaboratorInvitations` field instead. Removal on 2020-10-01 UTC.",
    ""
  )
  def pendingCollaborators[A](
    after: Option[String]                      = None,
    before: Option[String]                     = None,
    first: Option[Int]                         = None,
    last: Option[Int]                          = None,
    orderBy: Option[RepositoryInvitationOrder] = None,
    query: Option[String]                      = None
  )(innerSelection: SelectionBuilder[EnterprisePendingCollaboratorConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[RepositoryInvitationOrder]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pendingCollaborators",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "RepositoryInvitationOrder")(encoder4),
      Argument("query", query, "String")(encoder5)
    )
  )

  /** A list of pending member invitations for organizations in the enterprise.
    */
  def pendingMemberInvitations[A](
    after: Option[String]  = None,
    before: Option[String] = None,
    first: Option[Int]     = None,
    last: Option[Int]      = None,
    query: Option[String]  = None
  )(innerSelection: SelectionBuilder[EnterprisePendingMemberInvitationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[String]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "pendingMemberInvitations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("query", query, "String")(encoder4)
    )
  )

  /** The setting value for whether repository projects are enabled in this enterprise.
    */
  def repositoryProjectsSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("repositoryProjectsSetting", Scalar())

  /** A list of enterprise organizations configured with the provided repository projects setting value.
    */
  def repositoryProjectsSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositoryProjectsSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** The SAML Identity Provider for the enterprise.
    */
  def samlIdentityProvider[A](innerSelection: SelectionBuilder[EnterpriseIdentityProvider, A]): SelectionBuilder[EnterpriseOwnerInfo, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("samlIdentityProvider", OptionOf(Obj(innerSelection)))

  /** A list of enterprise organizations configured with the SAML single sign-on setting value.
    */
  def samlIdentityProviderSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: IdentityProviderConfigurationState
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[IdentityProviderConfigurationState]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "samlIdentityProviderSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "IdentityProviderConfigurationState!")(encoder5)
    )
  )

  /** A list of members with a support entitlement.
    */
  def supportEntitlements[A](
    after: Option[String]                  = None,
    before: Option[String]                 = None,
    first: Option[Int]                     = None,
    last: Option[Int]                      = None,
    orderBy: Option[EnterpriseMemberOrder] = None
  )(innerSelection: SelectionBuilder[EnterpriseMemberConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[EnterpriseMemberOrder]]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "supportEntitlements",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "EnterpriseMemberOrder")(encoder4)
    )
  )

  /** The setting value for whether team discussions are enabled for organizations in this enterprise.
    */
  def teamDiscussionsSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledDisabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("teamDiscussionsSetting", Scalar())

  /** A list of enterprise organizations configured with the provided team discussions setting value.
    */
  def teamDiscussionsSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "teamDiscussionsSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )

  /** The setting value for whether the enterprise requires two-factor authentication for its organizations and users.
    */
  def twoFactorRequiredSetting: SelectionBuilder[EnterpriseOwnerInfo, EnterpriseEnabledSettingValue] =
    _root_.caliban.client.SelectionBuilder.Field("twoFactorRequiredSetting", Scalar())

  /** A list of enterprise organizations configured with the two-factor authentication setting value.
    */
  def twoFactorRequiredSettingOrganizations[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[OrganizationOrder] = None,
    value: Boolean
  )(innerSelection: SelectionBuilder[OrganizationConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[OrganizationOrder]],
    encoder5: ArgEncoder[Boolean]
  ): SelectionBuilder[EnterpriseOwnerInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "twoFactorRequiredSettingOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "OrganizationOrder")(encoder4),
      Argument("value", value, "Boolean!")(encoder5)
    )
  )
}

