package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object MarketplaceListing {

  /** The GitHub App this listing represents.
    */
  def app[A](innerSelection: SelectionBuilder[App, A]): SelectionBuilder[MarketplaceListing, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("app", OptionOf(Obj(innerSelection)))

  /** URL to the listing owner's company site.
    */
  def companyUrl: SelectionBuilder[MarketplaceListing, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("companyUrl", OptionOf(Scalar()))

  /** The HTTP path for configuring access to the listing's integration or OAuth app
    */
  def configurationResourcePath: SelectionBuilder[MarketplaceListing, URI] =
    _root_.caliban.client.SelectionBuilder.Field("configurationResourcePath", Scalar())

  /** The HTTP URL for configuring access to the listing's integration or OAuth app
    */
  def configurationUrl: SelectionBuilder[MarketplaceListing, URI] = _root_.caliban.client.SelectionBuilder.Field("configurationUrl", Scalar())

  /** URL to the listing's documentation.
    */
  def documentationUrl: SelectionBuilder[MarketplaceListing, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("documentationUrl", OptionOf(Scalar()))

  /** The listing's detailed description.
    */
  def extendedDescription: SelectionBuilder[MarketplaceListing, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("extendedDescription", OptionOf(Scalar()))

  /** The listing's detailed description rendered to HTML.
    */
  def extendedDescriptionHTML: SelectionBuilder[MarketplaceListing, HTML] =
    _root_.caliban.client.SelectionBuilder.Field("extendedDescriptionHTML", Scalar())

  /** The listing's introductory description.
    */
  def fullDescription: SelectionBuilder[MarketplaceListing, String] = _root_.caliban.client.SelectionBuilder.Field("fullDescription", Scalar())

  /** The listing's introductory description rendered to HTML.
    */
  def fullDescriptionHTML: SelectionBuilder[MarketplaceListing, HTML] = _root_.caliban.client.SelectionBuilder.Field("fullDescriptionHTML", Scalar())

  /** Does this listing have any plans with a free trial?
    */
  def hasPublishedFreeTrialPlans: SelectionBuilder[MarketplaceListing, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("hasPublishedFreeTrialPlans", Scalar())

  /** Does this listing have a terms of service link?
    */
  def hasTermsOfService: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasTermsOfService", Scalar())

  /** Whether the creator of the app is a verified org
    */
  def hasVerifiedOwner: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasVerifiedOwner", Scalar())

  /** A technical description of how this app works with GitHub.
    */
  def howItWorks: SelectionBuilder[MarketplaceListing, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("howItWorks", OptionOf(Scalar()))

  /** The listing's technical description rendered to HTML.
    */
  def howItWorksHTML: SelectionBuilder[MarketplaceListing, HTML] = _root_.caliban.client.SelectionBuilder.Field("howItWorksHTML", Scalar())
  def id: SelectionBuilder[MarketplaceListing, String]           = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** URL to install the product to the viewer's account or organization.
    */
  def installationUrl: SelectionBuilder[MarketplaceListing, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("installationUrl", OptionOf(Scalar()))

  /** Whether this listing's app has been installed for the current viewer
    */
  def installedForViewer: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("installedForViewer", Scalar())

  /** Whether this listing has been removed from the Marketplace.
    */
  def isArchived: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isArchived", Scalar())

  /** Whether this listing is still an editable draft that has not been submitted
    * for review and is not publicly visible in the Marketplace.
    */
  def isDraft: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isDraft", Scalar())

  /** Whether the product this listing represents is available as part of a paid plan.
    */
  def isPaid: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPaid", Scalar())

  /** Whether this listing has been approved for display in the Marketplace.
    */
  def isPublic: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isPublic", Scalar())

  /** Whether this listing has been rejected by GitHub for display in the Marketplace.
    */
  def isRejected: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isRejected", Scalar())

  /** Whether this listing has been approved for unverified display in the Marketplace.
    */
  def isUnverified: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isUnverified", Scalar())

  /** Whether this draft listing has been submitted for review for approval to be unverified in the Marketplace.
    */
  def isUnverifiedPending: SelectionBuilder[MarketplaceListing, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isUnverifiedPending", Scalar())

  /** Whether this draft listing has been submitted for review from GitHub for approval to be verified in the Marketplace.
    */
  def isVerificationPendingFromDraft: SelectionBuilder[MarketplaceListing, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isVerificationPendingFromDraft", Scalar())

  /** Whether this unverified listing has been submitted for review from GitHub for approval to be verified in the Marketplace.
    */
  def isVerificationPendingFromUnverified: SelectionBuilder[MarketplaceListing, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isVerificationPendingFromUnverified", Scalar())

  /** Whether this listing has been approved for verified display in the Marketplace.
    */
  def isVerified: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isVerified", Scalar())

  /** The hex color code, without the leading '#', for the logo background.
    */
  def logoBackgroundColor: SelectionBuilder[MarketplaceListing, String] =
    _root_.caliban.client.SelectionBuilder.Field("logoBackgroundColor", Scalar())

  /** URL for the listing's logo image.
    */
  def logoUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[MarketplaceListing, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("logoUrl", OptionOf(Scalar()), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** The listing's full name.
    */
  def name: SelectionBuilder[MarketplaceListing, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The listing's very short description without a trailing period or ampersands.
    */
  def normalizedShortDescription: SelectionBuilder[MarketplaceListing, String] =
    _root_.caliban.client.SelectionBuilder.Field("normalizedShortDescription", Scalar())

  /** URL to the listing's detailed pricing.
    */
  def pricingUrl: SelectionBuilder[MarketplaceListing, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("pricingUrl", OptionOf(Scalar()))

  /** The category that best describes the listing.
    */
  def primaryCategory[A](innerSelection: SelectionBuilder[MarketplaceCategory, A]): SelectionBuilder[MarketplaceListing, A] =
    _root_.caliban.client.SelectionBuilder.Field("primaryCategory", Obj(innerSelection))

  /** URL to the listing's privacy policy, may return an empty string for listings that do not require a privacy policy URL.
    */
  def privacyPolicyUrl: SelectionBuilder[MarketplaceListing, URI] = _root_.caliban.client.SelectionBuilder.Field("privacyPolicyUrl", Scalar())

  /** The HTTP path for the Marketplace listing.
    */
  def resourcePath: SelectionBuilder[MarketplaceListing, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The URLs for the listing's screenshots.
    */
  def screenshotUrls: SelectionBuilder[MarketplaceListing, List[Option[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("screenshotUrls", ListOf(OptionOf(Scalar())))

  /** An alternate category that describes the listing.
    */
  def secondaryCategory[A](innerSelection: SelectionBuilder[MarketplaceCategory, A]): SelectionBuilder[MarketplaceListing, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("secondaryCategory", OptionOf(Obj(innerSelection)))

  /** The listing's very short description.
    */
  def shortDescription: SelectionBuilder[MarketplaceListing, String] = _root_.caliban.client.SelectionBuilder.Field("shortDescription", Scalar())

  /** The short name of the listing used in its URL.
    */
  def slug: SelectionBuilder[MarketplaceListing, String] = _root_.caliban.client.SelectionBuilder.Field("slug", Scalar())

  /** URL to the listing's status page.
    */
  def statusUrl: SelectionBuilder[MarketplaceListing, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("statusUrl", OptionOf(Scalar()))

  /** An email address for support for this listing's app.
    */
  def supportEmail: SelectionBuilder[MarketplaceListing, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("supportEmail", OptionOf(Scalar()))

  /** Either a URL or an email address for support for this listing's app, may
    * return an empty string for listings that do not require a support URL.
    */
  def supportUrl: SelectionBuilder[MarketplaceListing, URI] = _root_.caliban.client.SelectionBuilder.Field("supportUrl", Scalar())

  /** URL to the listing's terms of service.
    */
  def termsOfServiceUrl: SelectionBuilder[MarketplaceListing, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("termsOfServiceUrl", OptionOf(Scalar()))

  /** The HTTP URL for the Marketplace listing.
    */
  def url: SelectionBuilder[MarketplaceListing, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** Can the current viewer add plans for this Marketplace listing.
    */
  def viewerCanAddPlans: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanAddPlans", Scalar())

  /** Can the current viewer approve this Marketplace listing.
    */
  def viewerCanApprove: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanApprove", Scalar())

  /** Can the current viewer delist this Marketplace listing.
    */
  def viewerCanDelist: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanDelist", Scalar())

  /** Can the current viewer edit this Marketplace listing.
    */
  def viewerCanEdit: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanEdit", Scalar())

  /** Can the current viewer edit the primary and secondary category of this
    * Marketplace listing.
    */
  def viewerCanEditCategories: SelectionBuilder[MarketplaceListing, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanEditCategories", Scalar())

  /** Can the current viewer edit the plans for this Marketplace listing.
    */
  def viewerCanEditPlans: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanEditPlans", Scalar())

  /** Can the current viewer return this Marketplace listing to draft state
    * so it becomes editable again.
    */
  def viewerCanRedraft: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanRedraft", Scalar())

  /** Can the current viewer reject this Marketplace listing by returning it to
    * an editable draft state or rejecting it entirely.
    */
  def viewerCanReject: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReject", Scalar())

  /** Can the current viewer request this listing be reviewed for display in
    * the Marketplace as verified.
    */
  def viewerCanRequestApproval: SelectionBuilder[MarketplaceListing, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerCanRequestApproval", Scalar())

  /** Indicates whether the current user has an active subscription to this Marketplace listing.
    */
  def viewerHasPurchased: SelectionBuilder[MarketplaceListing, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerHasPurchased", Scalar())

  /** Indicates if the current user has purchased a subscription to this Marketplace listing
    * for all of the organizations the user owns.
    */
  def viewerHasPurchasedForAllOrganizations: SelectionBuilder[MarketplaceListing, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerHasPurchasedForAllOrganizations", Scalar())

  /** Does the current viewer role allow them to administer this Marketplace listing.
    */
  def viewerIsListingAdmin: SelectionBuilder[MarketplaceListing, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("viewerIsListingAdmin", Scalar())
}

