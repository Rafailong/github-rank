package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseTwoFactorAuthenticationRequiredSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseTwoFactorAuthenticationRequiredSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated two factor authentication required setting.
    */
  def enterprise[A](
    innerSelection: SelectionBuilder[Enterprise, A]
  ): SelectionBuilder[UpdateEnterpriseTwoFactorAuthenticationRequiredSettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the two factor authentication required setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseTwoFactorAuthenticationRequiredSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

