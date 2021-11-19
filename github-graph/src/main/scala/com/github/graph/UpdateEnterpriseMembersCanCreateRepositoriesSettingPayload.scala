package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseMembersCanCreateRepositoriesSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseMembersCanCreateRepositoriesSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated members can create repositories setting.
    */
  def enterprise[A](
    innerSelection: SelectionBuilder[Enterprise, A]
  ): SelectionBuilder[UpdateEnterpriseMembersCanCreateRepositoriesSettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the members can create repositories setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseMembersCanCreateRepositoriesSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

