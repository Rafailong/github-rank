package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrganizationTeamsHovercardContext {

  /** A string describing this context
    */
  def message: SelectionBuilder[OrganizationTeamsHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("message", Scalar())

  /** An octicon to accompany this context
    */
  def octicon: SelectionBuilder[OrganizationTeamsHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("octicon", Scalar())

  /** Teams in this organization the user is a member of that are relevant
    */
  def relevantTeams[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[TeamConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[OrganizationTeamsHovercardContext, A] = _root_.caliban.client.SelectionBuilder.Field(
    "relevantTeams",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The path for the full team list for this user
    */
  def teamsResourcePath: SelectionBuilder[OrganizationTeamsHovercardContext, URI] =
    _root_.caliban.client.SelectionBuilder.Field("teamsResourcePath", Scalar())

  /** The URL for the full team list for this user
    */
  def teamsUrl: SelectionBuilder[OrganizationTeamsHovercardContext, URI] = _root_.caliban.client.SelectionBuilder.Field("teamsUrl", Scalar())

  /** The total number of teams the user is on in the organization
    */
  def totalTeamCount: SelectionBuilder[OrganizationTeamsHovercardContext, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalTeamCount", Scalar())
}

