package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseOrganizationProjectsSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseOrganizationProjectsSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated organization projects setting.
    */
  def enterprise[A](
    innerSelection: SelectionBuilder[Enterprise, A]
  ): SelectionBuilder[UpdateEnterpriseOrganizationProjectsSettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the organization projects setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseOrganizationProjectsSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

