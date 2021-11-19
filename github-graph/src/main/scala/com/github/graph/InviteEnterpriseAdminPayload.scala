package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object InviteEnterpriseAdminPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[InviteEnterpriseAdminPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The created enterprise administrator invitation.
    */
  def invitation[A](
    innerSelection: SelectionBuilder[EnterpriseAdministratorInvitation, A]
  ): SelectionBuilder[InviteEnterpriseAdminPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("invitation", OptionOf(Obj(innerSelection)))
}

