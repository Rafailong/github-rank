package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseRepositoryProjectsSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseRepositoryProjectsSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated repository projects setting.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[UpdateEnterpriseRepositoryProjectsSettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the repository projects setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseRepositoryProjectsSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

