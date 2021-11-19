package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrgRemoveOutsideCollaboratorAuditEntry {

  /** The action name
    */
  def action: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, String] = _root_.caliban.client.SelectionBuilder.Field("action", Scalar())

  /** The user who initiated the action
    */
  def actor[A](
    onBot: SelectionBuilder[Bot, A],
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("actor", OptionOf(ChoiceOf(Map("Bot" -> Obj(onBot), "Organization" -> Obj(onOrganization), "User" -> Obj(onUser)))))

  /** The IP address of the actor
    */
  def actorIp: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("actorIp", OptionOf(Scalar()))

  /** A readable representation of the actor's location
    */
  def actorLocation[A](innerSelection: SelectionBuilder[ActorLocation, A]): SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("actorLocation", OptionOf(Obj(innerSelection)))

  /** The username of the user who initiated the action
    */
  def actorLogin: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("actorLogin", OptionOf(Scalar()))

  /** The HTTP path for the actor.
    */
  def actorResourcePath: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("actorResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the actor.
    */
  def actorUrl: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("actorUrl", OptionOf(Scalar()))

  /** The time the action was initiated
    */
  def createdAt: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, PreciseDateTime] =
    _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The types of membership the outside collaborator has with the organization.
    */
  def membershipTypes: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[List[OrgRemoveOutsideCollaboratorAuditEntryMembershipType]]] =
    _root_.caliban.client.SelectionBuilder.Field("membershipTypes", OptionOf(ListOf(Scalar())))

  /** The corresponding operation type for the action
    */
  def operationType: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[OperationType]] =
    _root_.caliban.client.SelectionBuilder.Field("operationType", OptionOf(Scalar()))

  /** The Organization associated with the Audit Entry.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))

  /** The name of the Organization.
    */
  def organizationName: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationName", OptionOf(Scalar()))

  /** The HTTP path for the organization
    */
  def organizationResourcePath: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the organization
    */
  def organizationUrl: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationUrl", OptionOf(Scalar()))

  /** The reason for the outside collaborator being removed from the Organization.
    */
  def reason: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[OrgRemoveOutsideCollaboratorAuditEntryReason]] =
    _root_.caliban.client.SelectionBuilder.Field("reason", OptionOf(Scalar()))

  /** The user affected by the action
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))

  /** For actions involving two users, the actor is the initiator and the user is the affected user.
    */
  def userLogin: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("userLogin", OptionOf(Scalar()))

  /** The HTTP path for the user.
    */
  def userResourcePath: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("userResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the user.
    */
  def userUrl: SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("userUrl", OptionOf(Scalar()))

  /** The user who initiated the action
    */
  def actorOption[A](
    onBot: Option[SelectionBuilder[Bot, A]]                   = None,
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[OrgRemoveOutsideCollaboratorAuditEntry, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
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

