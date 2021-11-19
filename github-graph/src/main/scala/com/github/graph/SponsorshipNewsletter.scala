package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorshipNewsletter {

  /** The contents of the newsletter, the message the sponsorable wanted to give.
    */
  def body: SelectionBuilder[SponsorshipNewsletter, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[SponsorshipNewsletter, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[SponsorshipNewsletter, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Indicates if the newsletter has been made available to sponsors.
    */
  def isPublished: SelectionBuilder[SponsorshipNewsletter, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPublished", Scalar())

  /** The user or organization this newsletter is from.
    */
  def sponsorable[A](
    onOrganization: Option[SelectionBuilder[Organization, A]] = None,
    onUser: Option[SelectionBuilder[User, A]]                 = None
  ): SelectionBuilder[SponsorshipNewsletter, A] = _root_.caliban.client.SelectionBuilder
    .Field("sponsorable", ChoiceOf(Map("Organization" -> onOrganization, "User" -> onUser).collect { case (k, Some(v)) => k -> Obj(v) }))

  /** The subject of the newsletter, what it's about.
    */
  def subject: SelectionBuilder[SponsorshipNewsletter, String] = _root_.caliban.client.SelectionBuilder.Field("subject", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[SponsorshipNewsletter, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

