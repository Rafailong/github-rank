package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Team {

  /** A list of teams that are ancestors of this team.
    */
  def ancestors[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[TeamConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Team, A] = _root_.caliban.client.SelectionBuilder.Field(
    "ancestors",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** A URL pointing to the team's avatar.
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[Team, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", OptionOf(Scalar()), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** List of child teams belonging to this team
    */
  def childTeams[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    first: Option[Int]               = None,
    immediateOnly: Option[Boolean]   = None,
    last: Option[Int]                = None,
    orderBy: Option[TeamOrder]       = None,
    userLogins: Option[List[String]] = None
  )(innerSelection: SelectionBuilder[TeamConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Boolean]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[TeamOrder]],
    encoder6: ArgEncoder[Option[List[String]]]
  ): SelectionBuilder[Team, A] = _root_.caliban.client.SelectionBuilder.Field(
    "childTeams",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("immediateOnly", immediateOnly, "Boolean")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "TeamOrder")(encoder5),
      Argument("userLogins", userLogins, "[String!]")(encoder6)
    )
  )

  /** The slug corresponding to the organization and team.
    */
  def combinedSlug: SelectionBuilder[Team, String] = _root_.caliban.client.SelectionBuilder.Field("combinedSlug", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Team, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Team, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The description of the team.
    */
  def description: SelectionBuilder[Team, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** Find a team discussion by its number.
    */
  def discussion[A](number: Int)(
    innerSelection: SelectionBuilder[TeamDiscussion, A]
  )(implicit encoder0: ArgEncoder[Int]): SelectionBuilder[Team, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("discussion", OptionOf(Obj(innerSelection)), arguments = List(Argument("number", number, "Int!")(encoder0)))

  /** A list of team discussions.
    */
  def discussions[A](
    after: Option[String]                = None,
    before: Option[String]               = None,
    first: Option[Int]                   = None,
    isPinned: Option[Boolean]            = None,
    last: Option[Int]                    = None,
    orderBy: Option[TeamDiscussionOrder] = None
  )(innerSelection: SelectionBuilder[TeamDiscussionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Boolean]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[TeamDiscussionOrder]]
  ): SelectionBuilder[Team, A] = _root_.caliban.client.SelectionBuilder.Field(
    "discussions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("isPinned", isPinned, "Boolean")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "TeamDiscussionOrder")(encoder5)
    )
  )

  /** The HTTP path for team discussions
    */
  def discussionsResourcePath: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("discussionsResourcePath", Scalar())

  /** The HTTP URL for team discussions
    */
  def discussionsUrl: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("discussionsUrl", Scalar())

  /** The HTTP path for editing this team
    */
  def editTeamResourcePath: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("editTeamResourcePath", Scalar())

  /** The HTTP URL for editing this team
    */
  def editTeamUrl: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("editTeamUrl", Scalar())
  def id: SelectionBuilder[Team, String]       = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** A list of pending invitations for users to this team
    */
  def invitations[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[OrganizationInvitationConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Team, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "invitations",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

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
  ): SelectionBuilder[Team, A] = _root_.caliban.client.SelectionBuilder.Field(
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

  /** A list of users who are members of this team.
    */
  def members[A](
    after: Option[String]                  = None,
    before: Option[String]                 = None,
    first: Option[Int]                     = None,
    last: Option[Int]                      = None,
    membership: Option[TeamMembershipType] = None,
    orderBy: Option[TeamMemberOrder]       = None,
    query: Option[String]                  = None,
    role: Option[TeamMemberRole]           = None
  )(innerSelection: SelectionBuilder[TeamMemberConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[TeamMembershipType]],
    encoder5: ArgEncoder[Option[TeamMemberOrder]],
    encoder6: ArgEncoder[Option[String]],
    encoder7: ArgEncoder[Option[TeamMemberRole]]
  ): SelectionBuilder[Team, A] = _root_.caliban.client.SelectionBuilder.Field(
    "members",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("membership", membership, "TeamMembershipType")(encoder4),
      Argument("orderBy", orderBy, "TeamMemberOrder")(encoder5),
      Argument("query", query, "String")(encoder6),
      Argument("role", role, "TeamMemberRole")(encoder7)
    )
  )

  /** The HTTP path for the team' members
    */
  def membersResourcePath: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("membersResourcePath", Scalar())

  /** The HTTP URL for the team' members
    */
  def membersUrl: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("membersUrl", Scalar())

  /** The name of the team.
    */
  def name: SelectionBuilder[Team, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The HTTP path creating a new team
    */
  def newTeamResourcePath: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("newTeamResourcePath", Scalar())

  /** The HTTP URL creating a new team
    */
  def newTeamUrl: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("newTeamUrl", Scalar())

  /** The organization that owns this team.
    */
  def organization[A](innerSelection: SelectionBuilder[Organization, A]): SelectionBuilder[Team, A] =
    _root_.caliban.client.SelectionBuilder.Field("organization", Obj(innerSelection))

  /** The parent team of the team.
    */
  def parentTeam[A](innerSelection: SelectionBuilder[Team, A]): SelectionBuilder[Team, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("parentTeam", OptionOf(Obj(innerSelection)))

  /** The level of privacy the team has.
    */
  def privacy: SelectionBuilder[Team, TeamPrivacy] = _root_.caliban.client.SelectionBuilder.Field("privacy", Scalar())

  /** A list of repositories this team has access to.
    */
  def repositories[A](
    after: Option[String]                = None,
    before: Option[String]               = None,
    first: Option[Int]                   = None,
    last: Option[Int]                    = None,
    orderBy: Option[TeamRepositoryOrder] = None,
    query: Option[String]                = None
  )(innerSelection: SelectionBuilder[TeamRepositoryConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[TeamRepositoryOrder]],
    encoder5: ArgEncoder[Option[String]]
  ): SelectionBuilder[Team, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositories",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "TeamRepositoryOrder")(encoder4),
      Argument("query", query, "String")(encoder5)
    )
  )

  /** The HTTP path for this team's repositories
    */
  def repositoriesResourcePath: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("repositoriesResourcePath", Scalar())

  /** The HTTP URL for this team's repositories
    */
  def repositoriesUrl: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("repositoriesUrl", Scalar())

  /** The HTTP path for this team
    */
  def resourcePath: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** What algorithm is used for review assignment for this team
    */
  def reviewRequestDelegationAlgorithm: SelectionBuilder[Team, Option[TeamReviewAssignmentAlgorithm]] =
    _root_.caliban.client.SelectionBuilder.Field("reviewRequestDelegationAlgorithm", OptionOf(Scalar()))

  /** True if review assignment is enabled for this team
    */
  def reviewRequestDelegationEnabled: SelectionBuilder[Team, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("reviewRequestDelegationEnabled", Scalar())

  /** How many team members are required for review assignment for this team
    */
  def reviewRequestDelegationMemberCount: SelectionBuilder[Team, Option[Int]] =
    _root_.caliban.client.SelectionBuilder.Field("reviewRequestDelegationMemberCount", OptionOf(Scalar()))

  /** When assigning team members via delegation, whether the entire team should be notified as well.
    */
  def reviewRequestDelegationNotifyTeam: SelectionBuilder[Team, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("reviewRequestDelegationNotifyTeam", Scalar())

  /** The slug corresponding to the team.
    */
  def slug: SelectionBuilder[Team, String] = _root_.caliban.client.SelectionBuilder.Field("slug", Scalar())

  /** The HTTP path for this team's teams
    */
  def teamsResourcePath: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("teamsResourcePath", Scalar())

  /** The HTTP URL for this team's teams
    */
  def teamsUrl: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("teamsUrl", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Team, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this team
    */
  def url: SelectionBuilder[Team, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Team is adminable by the viewer.
    */
  def viewerCanAdminister: SelectionBuilder[Team, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanAdminister", Scalar())

  /** Check if the viewer is able to change their subscription status for the repository.
    */
  def viewerCanSubscribe: SelectionBuilder[Team, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSubscribe", Scalar())

  /** Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.
    */
  def viewerSubscription: SelectionBuilder[Team, Option[SubscriptionState]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerSubscription", OptionOf(Scalar()))
}

