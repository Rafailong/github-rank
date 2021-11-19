package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorsActivity {

  /** What action this activity indicates took place.
    */
  def action: SelectionBuilder[SponsorsActivity, SponsorsActivityAction] = _root_.caliban.client.SelectionBuilder.Field("action", Scalar())
  def id: SelectionBuilder[SponsorsActivity, String]                     = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The tier that the sponsorship used to use, for tier change events.
    */
  def previousSponsorsTier[A](innerSelection: SelectionBuilder[SponsorsTier, A]): SelectionBuilder[SponsorsActivity, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("previousSponsorsTier", OptionOf(Obj(innerSelection)))

  /** The user or organization who triggered this activity and was/is sponsoring the sponsorable.
    */
  def sponsor[A](
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[SponsorsActivity, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsor", OptionOf(ChoiceOf(Map("Organization" -> Obj(onOrganization), "User" -> Obj(onUser)))))

  /** The user or organization that is being sponsored, the maintainer.
    */
  def sponsorable[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[SponsorsActivity, A] = _root_.caliban.client.SelectionBuilder
    .Field("sponsorable", ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) }))

  /** The associated sponsorship tier.
    */
  def sponsorsTier[A](innerSelection: SelectionBuilder[SponsorsTier, A]): SelectionBuilder[SponsorsActivity, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsorsTier", OptionOf(Obj(innerSelection)))

  /** The timestamp of this event.
    */
  def timestamp: SelectionBuilder[SponsorsActivity, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("timestamp", OptionOf(Scalar()))

  /** The user or organization who triggered this activity and was/is sponsoring the sponsorable.
    */
  def sponsorOption[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[SponsorsActivity, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsor",
    OptionOf(
      ChoiceOf(
        Map(
          "Organization" -> onOrganization.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User"         -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

