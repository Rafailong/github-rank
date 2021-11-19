package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RegenerateVerifiableDomainTokenPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[RegenerateVerifiableDomainTokenPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The verification token that was generated.
    */
  def verificationToken: SelectionBuilder[RegenerateVerifiableDomainTokenPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("verificationToken", OptionOf(Scalar()))
}

