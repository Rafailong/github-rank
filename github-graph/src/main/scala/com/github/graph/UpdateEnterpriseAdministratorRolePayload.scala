package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UpdateEnterpriseAdministratorRolePayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[UpdateEnterpriseAdministratorRolePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** A message confirming the result of changing the administrator's role.
    */
  def message: SelectionBuilder[UpdateEnterpriseAdministratorRolePayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

