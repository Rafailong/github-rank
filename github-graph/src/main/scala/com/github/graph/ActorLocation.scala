package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ActorLocation {

  /** City
    */
  def city: SelectionBuilder[ActorLocation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("city", OptionOf(Scalar()))

  /** Country name
    */
  def country: SelectionBuilder[ActorLocation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("country", OptionOf(Scalar()))

  /** Country code
    */
  def countryCode: SelectionBuilder[ActorLocation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("countryCode", OptionOf(Scalar()))

  /** Region name
    */
  def region: SelectionBuilder[ActorLocation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("region", OptionOf(Scalar()))

  /** Region or state code
    */
  def regionCode: SelectionBuilder[ActorLocation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("regionCode", OptionOf(Scalar()))
}

