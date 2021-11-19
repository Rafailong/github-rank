package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Sponsorship {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Sponsorship, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[Sponsorship, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether this sponsorship represents a one-time payment versus a recurring sponsorship.
    */
  def isOneTimePayment: SelectionBuilder[Sponsorship, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isOneTimePayment", Scalar())

  /** Check if the sponsor has chosen to receive sponsorship update emails sent from
    * the sponsorable. Only returns a non-null value when the viewer has permission to know this.
    */
  def isSponsorOptedIntoEmail: SelectionBuilder[Sponsorship, Option[Boolean]] =
    _root_.caliban.client.SelectionBuilder.Field("isSponsorOptedIntoEmail", OptionOf(Scalar()))

  /** The entity that is being sponsored
    */
  @deprecated("`Sponsorship.maintainer` will be removed. Use `Sponsorship.sponsorable` instead. Removal on 2020-04-01 UTC.", "")
  def maintainer[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[Sponsorship, A] =
    _root_.caliban.client.SelectionBuilder.Field("maintainer", Obj(innerSelection))

  /** The privacy level for this sponsorship.
    */
  def privacyLevel: SelectionBuilder[Sponsorship, SponsorshipPrivacy] = _root_.caliban.client.SelectionBuilder.Field("privacyLevel", Scalar())

  /** The user that is sponsoring. Returns null if the sponsorship is private or if sponsor is not a user.
    */
  @deprecated("`Sponsorship.sponsor` will be removed. Use `Sponsorship.sponsorEntity` instead. Removal on 2020-10-01 UTC.", "")
  def sponsor[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[Sponsorship, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("sponsor", OptionOf(Obj(innerSelection)))

  /** The user or organization that is sponsoring, if you have permission to view them.
    */
  def sponsorEntity[A](
    onOrganization: SelectionBuilder[Organization, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[Sponsorship, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("sponsorEntity", OptionOf(ChoiceOf(Map("Organization" -> Obj(onOrganization), "User" -> Obj(onUser)))))

  /** The entity that is being sponsored
    */
  def sponsorable[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[Sponsorship, A] = _root_.caliban.client.SelectionBuilder
    .Field("sponsorable", ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) }))

  /** The associated sponsorship tier
    */
  def tier[A](innerSelection: SelectionBuilder[SponsorsTier, A]): SelectionBuilder[Sponsorship, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("tier", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the current tier was chosen for this sponsorship.
    */
  def tierSelectedAt: SelectionBuilder[Sponsorship, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("tierSelectedAt", OptionOf(Scalar()))

  /** The user or organization that is sponsoring, if you have permission to view them.
    */
  def sponsorEntityOption[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[Sponsorship, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsorEntity",
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

