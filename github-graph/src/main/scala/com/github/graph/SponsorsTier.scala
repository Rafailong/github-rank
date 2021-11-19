package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorsTier {

  /** SponsorsTier information only visible to users that can administer the associated Sponsors listing.
    */
  def adminInfo[A](innerSelection: SelectionBuilder[SponsorsTierAdminInfo, A]): SelectionBuilder[SponsorsTier, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("adminInfo", OptionOf(Obj(innerSelection)))

  /** Get a different tier for this tier's maintainer that is at the same frequency
    * as this tier but with an equal or lesser cost. Returns the published tier with
    * the monthly price closest to this tier's without going over.
    */
  def closestLesserValueTier[A](innerSelection: SelectionBuilder[SponsorsTier, A]): SelectionBuilder[SponsorsTier, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("closestLesserValueTier", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[SponsorsTier, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The description of the tier.
    */
  def description: SelectionBuilder[SponsorsTier, String] = _root_.caliban.client.SelectionBuilder.Field("description", Scalar())

  /** The tier description rendered to HTML
    */
  def descriptionHTML: SelectionBuilder[SponsorsTier, HTML] = _root_.caliban.client.SelectionBuilder.Field("descriptionHTML", Scalar())
  def id: SelectionBuilder[SponsorsTier, String]            = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether this tier was chosen at checkout time by the sponsor rather than
    * defined ahead of time by the maintainer who manages the Sponsors listing.
    */
  def isCustomAmount: SelectionBuilder[SponsorsTier, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isCustomAmount", Scalar())

  /** Whether this tier is only for use with one-time sponsorships.
    */
  def isOneTime: SelectionBuilder[SponsorsTier, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isOneTime", Scalar())

  /** How much this tier costs per month in cents.
    */
  def monthlyPriceInCents: SelectionBuilder[SponsorsTier, Int] = _root_.caliban.client.SelectionBuilder.Field("monthlyPriceInCents", Scalar())

  /** How much this tier costs per month in USD.
    */
  def monthlyPriceInDollars: SelectionBuilder[SponsorsTier, Int] = _root_.caliban.client.SelectionBuilder.Field("monthlyPriceInDollars", Scalar())

  /** The name of the tier.
    */
  def name: SelectionBuilder[SponsorsTier, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The sponsors listing that this tier belongs to.
    */
  def sponsorsListing[A](innerSelection: SelectionBuilder[SponsorsListing, A]): SelectionBuilder[SponsorsTier, A] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorsListing", Obj(innerSelection))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[SponsorsTier, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

