package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PrivateRepositoryForkingEnableAuditEntry {

  /** The action name
    */
  def action: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, String] = _root_.caliban.client.SelectionBuilder.Field("action", Scalar())

  /** The user who initiated the action
    */
  def actor[A](
    onBot: SelectionBuilder[Bot, A],
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("actor", OptionOf(ChoiceOf(Map("Bot" -> Obj(onBot), "Organization" -> Obj(onOrganization), "User" -> Obj(onUser)))))

  /** The IP address of the actor
    */
  def actorIp: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("actorIp", OptionOf(Scalar()))

  /** A readable representation of the actor's location
    */
  def actorLocation[A](innerSelection: SelectionBuilder[ActorLocation, A]): SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("actorLocation", OptionOf(Obj(innerSelection)))

  /** The username of the user who initiated the action
    */
  def actorLogin: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("actorLogin", OptionOf(Scalar()))

  /** The HTTP path for the actor.
    */
  def actorResourcePath: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("actorResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the actor.
    */
  def actorUrl: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("actorUrl", OptionOf(Scalar()))

  /** The time the action was initiated
    */
  def createdAt: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, PreciseDateTime] =
    _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The HTTP path for this enterprise.
    */
  def enterpriseResourcePath: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("enterpriseResourcePath", OptionOf(Scalar()))

  /** The slug of the enterprise.
    */
  def enterpriseSlug: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("enterpriseSlug", OptionOf(Scalar()))

  /** The HTTP URL for this enterprise.
    */
  def enterpriseUrl: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("enterpriseUrl", OptionOf(Scalar()))
  def id: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The corresponding operation type for the action
    */
  def operationType: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[OperationType]] =
    _root_.caliban.client.SelectionBuilder.Field("operationType", OptionOf(Scalar()))

  /** The Organization associated with the Audit Entry.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("organization", OptionOf(Obj(innerSelection)))

  /** The name of the Organization.
    */
  def organizationName: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationName", OptionOf(Scalar()))

  /** The HTTP path for the organization
    */
  def organizationResourcePath: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the organization
    */
  def organizationUrl: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("organizationUrl", OptionOf(Scalar()))

  /** The repository associated with the action
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("repository", OptionOf(Obj(innerSelection)))

  /** The name of the repository
    */
  def repositoryName: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("repositoryName", OptionOf(Scalar()))

  /** The HTTP path for the repository
    */
  def repositoryResourcePath: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("repositoryResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the repository
    */
  def repositoryUrl: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("repositoryUrl", OptionOf(Scalar()))

  /** The user affected by the action
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))

  /** For actions involving two users, the actor is the initiator and the user is the affected user.
    */
  def userLogin: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("userLogin", OptionOf(Scalar()))

  /** The HTTP path for the user.
    */
  def userResourcePath: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("userResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for the user.
    */
  def userUrl: SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("userUrl", OptionOf(Scalar()))

  /** The user who initiated the action
    */
  def actorOption[A](
    onBot: Option[SelectionBuilder[Bot, A]]                   = None,
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[PrivateRepositoryForkingEnableAuditEntry, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
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

