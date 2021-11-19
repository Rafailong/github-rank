package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object OrgRestoreMemberMembershipTeamAuditEntryData {

  /** The team associated with the action
    */
  def team[A](innerSelection: SelectionBuilder[Team, A]): SelectionBuilder[OrgRestoreMemberMembershipTeamAuditEntryData, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("team", OptionOf(Obj(innerSelection)))

  /** The name of the team
    */
  def teamName: SelectionBuilder[OrgRestoreMemberMembershipTeamAuditEntryData, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("teamName", OptionOf(Scalar()))

  /** The HTTP path for this team
    */
  def teamResourcePath: SelectionBuilder[OrgRestoreMemberMembershipTeamAuditEntryData, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("teamResourcePath", OptionOf(Scalar()))

  /** The HTTP URL for this team
    */
  def teamUrl: SelectionBuilder[OrgRestoreMemberMembershipTeamAuditEntryData, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("teamUrl", OptionOf(Scalar()))
}

