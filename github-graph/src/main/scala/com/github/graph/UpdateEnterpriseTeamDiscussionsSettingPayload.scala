package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseTeamDiscussionsSettingPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseTeamDiscussionsSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The enterprise with the updated team discussions setting.
    */
  def enterprise[A](innerSelection: SelectionBuilder[Enterprise, A]): SelectionBuilder[UpdateEnterpriseTeamDiscussionsSettingPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("enterprise", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of updating the team discussions setting.
    */
  def message: SelectionBuilder[UpdateEnterpriseTeamDiscussionsSettingPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

