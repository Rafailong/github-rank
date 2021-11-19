package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CancelEnterpriseAdminInvitationPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CancelEnterpriseAdminInvitationPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The invitation that was canceled.
    */
  def invitation[A](
    innerSelection: SelectionBuilder[EnterpriseAdministratorInvitation, A]
  ): SelectionBuilder[CancelEnterpriseAdminInvitationPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("invitation", OptionOf(Obj(innerSelection)))

  /** A message confirming the result of canceling an administrator invitation.
    */
  def message: SelectionBuilder[CancelEnterpriseAdminInvitationPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))
}

