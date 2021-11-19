package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TeamChangeParentTeamAuditEntry {

  /** The action name
    */
  def action: SelectionBuilder[TeamChangeParentTeamAuditEntry, String] = _root_.caliban.client.SelectionBuilder.Field("action", Scalar())

  /** The user who initiated the action
    */
  def actor[A](
    onBot: SelectionBuilder[Bot, A],
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("actor", OptionOf(ChoiceOf(Map("Bot" -> Obj(onBot), "Organization" -> Obj(onOrganization), "User" -> Obj(onUser)))))

  /** The IP address of the actor
    */
  def actorIp: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("actorIp", OptionOf(Scalar()))

  /** A readable representation of the actor's location
    */
  def actorLocation[A](innerSelection: SelectionBuilder[ActorLocation, A]): SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("actorLocation", OptionOf(Obj(innerSelection)))

  /** The username of the user who initiated the action
    */
  def actorLogin: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("actorLogin", OptionOf(Scalar()))

  /** The HTTP path for the actor.
    */
  def actorResourcePath: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("actorResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the actor.
    */
  def actorUrl: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("actorUrl", OptionOf(Scalar()))

  /** The time the action was initiated
    */
  def createdAt: SelectionBuilder[TeamChangeParentTeamAuditEntry, PreciseDateTime] =
    _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[TeamChangeParentTeamAuditEntry, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether the team was mapped to an LDAP Group.
    */
  def isLdapMapped: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("isLdapMapped", OptionOf(Scalar()))

  /** The corresponding operation type for the action
    */
  def operationType: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[OperationType]] =
    _root_.caliban.client.SelectionBuilder.Field("operationType", OptionOf(Scalar()))

  /** The Organization associated with the Audit Entry.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))

  /** The name of the Organization.
    */
  def organizationName: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationName", OptionOf(Scalar()))

  /** The HTTP path for the organization
    */
  def organizationResourcePath: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the organization
    */
  def organizationUrl: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationUrl", OptionOf(Scalar()))

  /** The new parent team.
    */
  def parentTeam[A](innerSelection: SelectionBuilder[Team, A]): SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeam", OptionOf(Obj(innerSelection)))

  /** The name of the new parent team
    */
  def parentTeamName: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeamName", OptionOf(Scalar()))

  /** The name of the former parent team
    */
  def parentTeamNameWas: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeamNameWas", OptionOf(Scalar()))

  /** The HTTP path for the parent team
    */
  def parentTeamResourcePath: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeamResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the parent team
    */
  def parentTeamUrl: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeamUrl", OptionOf(Scalar()))

  /** The former parent team.
    */
  def parentTeamWas[A](innerSelection: SelectionBuilder[Team, A]): SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeamWas", OptionOf(Obj(innerSelection)))

  /** The HTTP path for the previous parent team
    */
  def parentTeamWasResourcePath: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeamWasResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the previous parent team
    */
  def parentTeamWasUrl: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeamWasUrl", OptionOf(Scalar()))

  /** The team associated with the action
    */
  def team[A](innerSelection: SelectionBuilder[Team, A]): SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("team", OptionOf(Obj(innerSelection)))

  /** The name of the team
    */
  def teamName: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("teamName", OptionOf(Scalar()))

  /** The HTTP path for this team
    */
  def teamResourcePath: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("teamResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for this team
    */
  def teamUrl: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("teamUrl", OptionOf(Scalar()))

  /** The user affected by the action
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))

  /** For actions involving two users, the actor is the initiator and the user is the affected user.
    */
  def userLogin: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("userLogin", OptionOf(Scalar()))

  /** The HTTP path for the user.
    */
  def userResourcePath: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("userResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the user.
    */
  def userUrl: SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("userUrl", OptionOf(Scalar()))

  /** The user who initiated the action
    */
  def actorOption[A](
    onBot: Option[SelectionBuilder[Bot, A]]                   = None,
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[TeamChangeParentTeamAuditEntry, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
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

