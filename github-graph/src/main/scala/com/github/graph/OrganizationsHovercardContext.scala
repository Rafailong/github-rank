package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrganizationsHovercardContext {

  /** A string describing this context
    */
  def message: SelectionBuilder[OrganizationsHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("message", Scalar())

  /** An octicon to accompany this context
    */
  def octicon: SelectionBuilder[OrganizationsHovercardContext, String] = _root_.caliban.client.SelectionBuilder.Field("octicon", Scalar())

  /** Organizations this user is a member of that are relevant
    */
  def relevantOrganizations[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[OrganizationConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[OrganizationsHovercardContext, A] = _root_.caliban.client.SelectionBuilder.Field(
    "relevantOrganizations",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** The total number of organizations this user is in
    */
  def totalOrganizationCount: SelectionBuilder[OrganizationsHovercardContext, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalOrganizationCount", Scalar())
}

