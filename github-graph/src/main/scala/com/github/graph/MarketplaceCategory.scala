package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MarketplaceCategory {

  /** The category's description.
    */
  def description: SelectionBuilder[MarketplaceCategory, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** The technical description of how apps listed in this category work with GitHub.
    */
  def howItWorks: SelectionBuilder[MarketplaceCategory, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("howItWorks", OptionOf(Scalar()))
  def id: SelectionBuilder[MarketplaceCategory, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The category's name.
    */
  def name: SelectionBuilder[MarketplaceCategory, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** How many Marketplace listings have this as their primary category.
    */
  def primaryListingCount: SelectionBuilder[MarketplaceCategory, Int] = _root_.caliban.client.SelectionBuilder.Field("primaryListingCount", Scalar())

  /** The HTTP path for this Marketplace category.
    */
  def resourcePath: SelectionBuilder[MarketplaceCategory, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** How many Marketplace listings have this as their secondary category.
    */
  def secondaryListingCount: SelectionBuilder[MarketplaceCategory, Int] =
    _root_.caliban.client.SelectionBuilder.Field("secondaryListingCount", Scalar())

  /** The short name of the category used in its URL.
    */
  def slug: SelectionBuilder[MarketplaceCategory, String] = _root_.caliban.client.SelectionBuilder.Field("slug", Scalar())

  /** The HTTP URL for this Marketplace category.
    */
  def url: SelectionBuilder[MarketplaceCategory, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

