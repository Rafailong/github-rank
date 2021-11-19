package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorsListing {

  /** The current goal the maintainer is trying to reach with GitHub Sponsors, if any.
    */
  def activeGoal[A](innerSelection: SelectionBuilder[SponsorsGoal, A]): SelectionBuilder[SponsorsListing, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("activeGoal", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[SponsorsListing, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The full description of the listing.
    */
  def fullDescription: SelectionBuilder[SponsorsListing, String] = _root_.caliban.client.SelectionBuilder.Field("fullDescription", Scalar())

  /** The full description of the listing rendered to HTML.
    */
  def fullDescriptionHTML: SelectionBuilder[SponsorsListing, HTML] = _root_.caliban.client.SelectionBuilder.Field("fullDescriptionHTML", Scalar())
  def id: SelectionBuilder[SponsorsListing, String]                = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether this listing is publicly visible.
    */
  def isPublic: SelectionBuilder[SponsorsListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPublic", Scalar())

  /** The listing's full name.
    */
  def name: SelectionBuilder[SponsorsListing, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** A future date on which this listing is eligible to receive a payout.
    */
  def nextPayoutDate: SelectionBuilder[SponsorsListing, Option[Date]] =
    _root_.caliban.client.SelectionBuilder.Field("nextPayoutDate", OptionOf(Scalar()))

  /** The short description of the listing.
    */
  def shortDescription: SelectionBuilder[SponsorsListing, String] = _root_.caliban.client.SelectionBuilder.Field("shortDescription", Scalar())

  /** The short name of the listing.
    */
  def slug: SelectionBuilder[SponsorsListing, String] = _root_.caliban.client.SelectionBuilder.Field("slug", Scalar())

  /** The entity this listing represents who can be sponsored on GitHub Sponsors.
    */
  def sponsorable[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[SponsorsListing, A] = _root_.caliban.client.SelectionBuilder
    .Field("sponsorable", ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) }))

  /** The published tiers for this GitHub Sponsors listing.
    */
  def tiers[A](
    after: Option[String]              = None,
    before: Option[String]             = None,
    first: Option[Int]                 = None,
    last: Option[Int]                  = None,
    orderBy: Option[SponsorsTierOrder] = None
  )(innerSelection: SelectionBuilder[SponsorsTierConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[SponsorsTierOrder]]
  ): SelectionBuilder[SponsorsListing, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "tiers",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "SponsorsTierOrder")(encoder4)
    )
  )
}

