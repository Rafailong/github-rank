package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated members can update protected branches setting.
    */
  def enterprise[A](
    innerSelection: SelectionBuilder[Enterprise, A]
  ): SelectionBuilder[UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the members can update protected branches setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

