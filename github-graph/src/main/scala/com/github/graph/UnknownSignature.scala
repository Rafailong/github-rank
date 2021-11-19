package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UnknownSignature {

  /** Email used to sign this object.
    */
  def email: SelectionBuilder[UnknownSignature, String] = _root_.caliban.client.SelectionBuilder.Field("email", Scalar())

  /** True if the signature is valid and verified by GitHub.
    */
  def isValid: SelectionBuilder[UnknownSignature, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isValid", Scalar())

  /** Payload for GPG signing object. Raw ODB object without the signature header.
    */
  def payload: SelectionBuilder[UnknownSignature, String] = _root_.caliban.client.SelectionBuilder.Field("payload", Scalar())

  /** ASCII-armored signature header from object.
    */
  def signature: SelectionBuilder[UnknownSignature, String] = _root_.caliban.client.SelectionBuilder.Field("signature", Scalar())

  /** GitHub user corresponding to the email signing this commit.
    */
  def signer[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[UnknownSignature, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("signer", OptionOf(Obj(innerSelection)))

  /** The state of this signature. `VALID` if signature is valid and verified by
    * GitHub, otherwise represents reason why signature is considered invalid.
    */
  def state: SelectionBuilder[UnknownSignature, GitSignatureState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** True if the signature was made with GitHub's signing key.
    */
  def wasSignedByGitHub: SelectionBuilder[UnknownSignature, Boolean] = _root_.caliban.client.SelectionBuilder.Field("wasSignedByGitHub", Scalar())
}

