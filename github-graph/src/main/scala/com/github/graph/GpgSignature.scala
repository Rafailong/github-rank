package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object GpgSignature {

  /** Email used to sign this object.
    */
  def email: SelectionBuilder[GpgSignature, String] = _root_.caliban.client.SelectionBuilder.Field("email", Scalar())

  /** True if the signature is valid and verified by GitHub.
    */
  def isValid: SelectionBuilder[GpgSignature, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isValid", Scalar())

  /** Hex-encoded ID of the key that signed this object.
    */
  def keyId: SelectionBuilder[GpgSignature, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("keyId", OptionOf(Scalar()))

  /** Payload for GPG signing object. Raw ODB object without the signature header.
    */
  def payload: SelectionBuilder[GpgSignature, String] = _root_.caliban.client.SelectionBuilder.Field("payload", Scalar())

  /** ASCII-armored signature header from object.
    */
  def signature: SelectionBuilder[GpgSignature, String] = _root_.caliban.client.SelectionBuilder.Field("signature", Scalar())

  /** GitHub user corresponding to the email signing this commit.
    */
  def signer[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[GpgSignature, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("signer", OptionOf(Obj(innerSelection)))

  /** The state of this signature. `VALID` if signature is valid and verified by
    * GitHub, otherwise represents reason why signature is considered invalid.
    */
  def state: SelectionBuilder[GpgSignature, GitSignatureState] = _root_.caliban.client.SelectionBuilder.Field("state", Scalar())

  /** True if the signature was made with GitHub's signing key.
    */
  def wasSignedByGitHub: SelectionBuilder[GpgSignature, Boolean] = _root_.caliban.client.SelectionBuilder.Field("wasSignedByGitHub", Scalar())
}

