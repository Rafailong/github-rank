package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated members can change repository visibility setting.
    */
  def enterprise[A](
    innerSelection: SelectionBuilder[Enterprise, A]
  ): SelectionBuilder[UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the members can change repository visibility setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

