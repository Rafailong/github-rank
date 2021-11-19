package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TeamMemberEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[TeamMemberEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The HTTP path to the organization's member access page.
    */
  def memberAccessResourcePath: SelectionBuilder[TeamMemberEdge, URI] =
    _root_.caliban.client.SelectionBuilder.Field("memberAccessResourcePath", Scalar())

  /** The HTTP URL to the organization's member access page.
    */
  def memberAccessUrl: SelectionBuilder[TeamMemberEdge, URI] = _root_.caliban.client.SelectionBuilder.Field("memberAccessUrl", Scalar())

  def node[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[TeamMemberEdge, A] =
    _root_.caliban.client.SelectionBuilder.Field("node", Obj(innerSelection))

  /** The role the member has on the team.
    */
  def role: SelectionBuilder[TeamMemberEdge, TeamMemberRole] = _root_.caliban.client.SelectionBuilder.Field("role", Scalar())
}

