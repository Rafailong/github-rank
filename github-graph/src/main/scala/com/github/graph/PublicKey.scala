package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PublicKey {

  /** The last time this authorization was used to perform an action. Values will be null for keys not owned by the user.
    */
  def accessedAt: SelectionBuilder[PublicKey, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("accessedAt", OptionOf(Scalar()))

  /** Identifies the date and time when the key was created. Keys created before
    * March 5th, 2014 have inaccurate values. Values will be null for keys not owned by the user.
    */
  def createdAt: SelectionBuilder[PublicKey, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("createdAt", OptionOf(Scalar()))

  /** The fingerprint for this PublicKey.
    */
  def fingerprint: SelectionBuilder[PublicKey, String] = _root_.caliban.client.SelectionBuilder.Field("fingerprint", Scalar())
  def id: SelectionBuilder[PublicKey, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether this PublicKey is read-only or not. Values will be null for keys not owned by the user.
    */
  def isReadOnly: SelectionBuilder[PublicKey, Option[Boolean]] = _root_.caliban.client.SelectionBuilder.Field("isReadOnly", OptionOf(Scalar()))

  /** The public key string.
    */
  def key: SelectionBuilder[PublicKey, String] = _root_.caliban.client.SelectionBuilder.Field("key", Scalar())

  /** Identifies the date and time when the key was updated. Keys created before
    * March 5th, 2014 may have inaccurate values. Values will be null for keys not
    * owned by the user.
    */
  def updatedAt: SelectionBuilder[PublicKey, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", OptionOf(Scalar()))
}

