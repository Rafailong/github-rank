package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object UserEmailMetadata {

  /** Boolean to identify primary emails
    */
  def primary: SelectionBuilder[UserEmailMetadata, Option[Boolean]] = _root_.caliban.client.SelectionBuilder.Field("primary", OptionOf(Scalar()))

  /** Type of email
    */
  def `type`: SelectionBuilder[UserEmailMetadata, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("type", OptionOf(Scalar()))

  /** Email id
    */
  def value: SelectionBuilder[UserEmailMetadata, String] = _root_.caliban.client.SelectionBuilder.Field("value", Scalar())
}

