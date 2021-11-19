package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DeployKey {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[DeployKey, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[DeployKey, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The deploy key.
    */
  def key: SelectionBuilder[DeployKey, String] = _root_.caliban.client.SelectionBuilder.Field("key", Scalar())

  /** Whether or not the deploy key is read only.
    */
  def readOnly: SelectionBuilder[DeployKey, Boolean] = _root_.caliban.client.SelectionBuilder.Field("readOnly", Scalar())

  /** The deploy key title.
    */
  def title: SelectionBuilder[DeployKey, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())

  /** Whether or not the deploy key has been verified.
    */
  def verified: SelectionBuilder[DeployKey, Boolean] = _root_.caliban.client.SelectionBuilder.Field("verified", Scalar())
}

