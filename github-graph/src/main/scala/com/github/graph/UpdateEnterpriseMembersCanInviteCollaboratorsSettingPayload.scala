package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseMembersCanInviteCollaboratorsSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseMembersCanInviteCollaboratorsSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated members can invite collaborators setting.
    */
  def enterprise[A](
    innerSelection: SelectionBuilder[Enterprise, A]
  ): SelectionBuilder[UpdateEnterpriseMembersCanInviteCollaboratorsSettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the members can invite collaborators setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseMembersCanInviteCollaboratorsSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

