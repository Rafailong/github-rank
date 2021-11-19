package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseOutsideCollaboratorEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[EnterpriseOutsideCollaboratorEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** Whether the outside collaborator does not have a license for the enterprise.
    */
  @deprecated("All outside collaborators consume a license Removal on 2021-01-01 UTC.", "")
  def isUnlicensed: SelectionBuilder[EnterpriseOutsideCollaboratorEdge, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isUnlicensed", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[EnterpriseOutsideCollaboratorEdge, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("node", OptionOf(Obj(innerSelection)))

  /** The enterprise organization repositories this user is a member of.
    */
  def repositories[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None,
    orderBy: Option[RepositoryOrder] = None
  )(innerSelection: SelectionBuilder[EnterpriseRepositoryInfoConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[RepositoryOrder]]
  ): SelectionBuilder[EnterpriseOutsideCollaboratorEdge, A] = _root_.caliban.client.SelectionBuilder.Field(
    "repositories",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "RepositoryOrder")(encoder4)
    )
  )
}

