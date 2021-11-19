package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrgRestoreMemberAuditEntry {

  /** The action name
    */
  def action: SelectionBuilder[OrgRestoreMemberAuditEntry, String] = _root_.caliban.client.SelectionBuilder.Field("action", Scalar())

  /** The user who initiated the action
    */
  def actor[A](
    onBot: SelectionBuilder[Bot, A],
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[OrgRestoreMemberAuditEntry, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("actor", OptionOf(ChoiceOf(Map("Bot" -> Obj(onBot), "Organization" -> Obj(onOrganization), "User" -> Obj(onUser)))))

  /** The IP address of the actor
    */
  def actorIp: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("actorIp", OptionOf(Scalar()))

  /** A readable representation of the actor's location
    */
  def actorLocation[A](innerSelection: SelectionBuilder[ActorLocation, A]): SelectionBuilder[OrgRestoreMemberAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("actorLocation", OptionOf(Obj(innerSelection)))

  /** The username of the user who initiated the action
    */
  def actorLogin: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("actorLogin", OptionOf(Scalar()))

  /** The HTTP path for the actor.
    */
  def actorResourcePath: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("actorResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the actor.
    */
  def actorUrl: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("actorUrl", OptionOf(Scalar()))

  /** The time the action was initiated
    */
  def createdAt: SelectionBuilder[OrgRestoreMemberAuditEntry, PreciseDateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[OrgRestoreMemberAuditEntry, String]                 = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The corresponding operation type for the action
    */
  def operationType: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[OperationType]] =
    _root_.caliban.client.SelectionBuilder.Field("operationType", OptionOf(Scalar()))

  /** The Organization associated with the Audit Entry.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[OrgRestoreMemberAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))

  /** The name of the Organization.
    */
  def organizationName: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationName", OptionOf(Scalar()))

  /** The HTTP path for the organization
    */
  def organizationResourcePath: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the organization
    */
  def organizationUrl: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationUrl", OptionOf(Scalar()))

  /** The number of custom email routings for the restored member.
    */
  def restoredCustomEmailRoutingsCount: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("restoredCustomEmailRoutingsCount", OptionOf(Scalar()))

  /** The number of issue assignments for the restored member.
    */
  def restoredIssueAssignmentsCount: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("restoredIssueAssignmentsCount", OptionOf(Scalar()))

  /** Restored organization membership objects.
    */
  def restoredMemberships[A](
    onOrgRestoreMemberMembershipOrganizationAuditEntryData: SelectionBuilder[OrgRestoreMemberMembershipOrganizationAuditEntryData, A],
    onOrgRestoreMemberMembershipRepositoryAuditEntryData: SelectionBuilder[OrgRestoreMemberMembershipRepositoryAuditEntryData, A],
    onOrgRestoreMemberMembershipTeamAuditEntryData: SelectionBuilder[OrgRestoreMemberMembershipTeamAuditEntryData, A]
  ): SelectionBuilder[OrgRestoreMemberAuditEntry, Option[List[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "restoredMemberships",
    OptionOf(
      ListOf(
        ChoiceOf(
          Map(
            "OrgRestoreMemberMembershipOrganizationAuditEntryData" -> Obj(onOrgRestoreMemberMembershipOrganizationAuditEntryData),
            "OrgRestoreMemberMembershipRepositoryAuditEntryData"   -> Obj(onOrgRestoreMemberMembershipRepositoryAuditEntryData),
            "OrgRestoreMemberMembershipTeamAuditEntryData"         -> Obj(onOrgRestoreMemberMembershipTeamAuditEntryData)
          )
        )
      )
    )
  )

  /** The number of restored memberships.
    */
  def restoredMembershipsCount: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("restoredMembershipsCount", OptionOf(Scalar()))

  /** The number of repositories of the restored member.
    */
  def restoredRepositoriesCount: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("restoredRepositoriesCount", OptionOf(Scalar()))

  /** The number of starred repositories for the restored member.
    */
  def restoredRepositoryStarsCount: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("restoredRepositoryStarsCount", OptionOf(Scalar()))

  /** The number of watched repositories for the restored member.
    */
  def restoredRepositoryWatchesCount: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("restoredRepositoryWatchesCount", OptionOf(Scalar()))

  /** The user affected by the action
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[OrgRestoreMemberAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))

  /** For actions involving two users, the actor is the initiator and the user is the affected user.
    */
  def userLogin: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("userLogin", OptionOf(Scalar()))

  /** The HTTP path for the user.
    */
  def userResourcePath: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("userResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the user.
    */
  def userUrl: SelectionBuilder[OrgRestoreMemberAuditEntry, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("userUrl", OptionOf(Scalar()))

  /** The user who initiated the action
    */
  def actorOption[A](
    onBot: Option[SelectionBuilder[Bot, A]]                   = None,
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[OrgRestoreMemberAuditEntry, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "actor",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"          -> onBot.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Organization" -> onOrganization.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User"         -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

