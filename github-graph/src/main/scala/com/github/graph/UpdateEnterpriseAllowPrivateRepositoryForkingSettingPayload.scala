package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseAllowPrivateRepositoryForkingSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseAllowPrivateRepositoryForkingSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated allow private repository forking setting.
    */
  def enterprise[A](
    innerSelection: SelectionBuilder[Enterprise, A]
  ): SelectionBuilder[UpdateEnterpriseAllowPrivateRepositoryForkingSettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the allow private repository forking setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseAllowPrivateRepositoryForkingSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

