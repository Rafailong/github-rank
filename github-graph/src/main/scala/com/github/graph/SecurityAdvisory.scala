package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SecurityAdvisory {

  /** The CVSS associated with this advisory
    */
  def cvss[A](innerSelection: SelectionBuilder[CVSS, A]): SelectionBuilder[SecurityAdvisory, A] =
    _root_.caliban.client.SelectionBuilder.Field("cvss", Obj(innerSelection))

  /** CWEs associated with this Advisory
    */
  def cwes[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[CWEConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[SecurityAdvisory, A] = _root_.caliban.client.SelectionBuilder.Field(
    "cwes",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[SecurityAdvisory, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** This is a long plaintext description of the advisory
    */
  def description: SelectionBuilder[SecurityAdvisory, String] = _root_.caliban.client.SelectionBuilder.Field("description", Scalar())

  /** The GitHub Security Advisory ID
    */
  def ghsaId: SelectionBuilder[SecurityAdvisory, String] = _root_.caliban.client.SelectionBuilder.Field("ghsaId", Scalar())
  def id: SelectionBuilder[SecurityAdvisory, String]     = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** A list of identifiers for this advisory
    */
  def identifiers[A](innerSelection: SelectionBuilder[SecurityAdvisoryIdentifier, A]): SelectionBuilder[SecurityAdvisory, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("identifiers", ListOf(Obj(innerSelection)))

  /** The permalink for the advisory's dependabot alerts page
    */
  def notificationsPermalink: SelectionBuilder[SecurityAdvisory, Option[URI]] =
    _root_.caliban.client.SelectionBuilder.Field("notificationsPermalink", OptionOf(Scalar()))

  /** The organization that originated the advisory
    */
  def origin: SelectionBuilder[SecurityAdvisory, String] = _root_.caliban.client.SelectionBuilder.Field("origin", Scalar())

  /** The permalink for the advisory
    */
  def permalink: SelectionBuilder[SecurityAdvisory, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("permalink", OptionOf(Scalar()))

  /** When the advisory was published
    */
  def publishedAt: SelectionBuilder[SecurityAdvisory, DateTime] = _root_.caliban.client.SelectionBuilder.Field("publishedAt", Scalar())

  /** A list of references for this advisory
    */
  def references[A](innerSelection: SelectionBuilder[SecurityAdvisoryReference, A]): SelectionBuilder[SecurityAdvisory, List[A]] =
    _root_.caliban.client.SelectionBuilder.Field("references", ListOf(Obj(innerSelection)))

  /** The severity of the advisory
    */
  def severity: SelectionBuilder[SecurityAdvisory, SecurityAdvisorySeverity] = _root_.caliban.client.SelectionBuilder.Field("severity", Scalar())

  /** A short plaintext summary of the advisory
    */
  def summary: SelectionBuilder[SecurityAdvisory, String] = _root_.caliban.client.SelectionBuilder.Field("summary", Scalar())

  /** When the advisory was last updated
    */
  def updatedAt: SelectionBuilder[SecurityAdvisory, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** Vulnerabilities associated with this Advisory
    */
  def vulnerabilities[A](
    after: Option[String]                              = None,
    before: Option[String]                             = None,
    ecosystem: Option[SecurityAdvisoryEcosystem]       = None,
    first: Option[Int]                                 = None,
    last: Option[Int]                                  = None,
    orderBy: Option[SecurityVulnerabilityOrder]        = None,
    `package`: Option[String]                          = None,
    severities: Option[List[SecurityAdvisorySeverity]] = None
  )(innerSelection: SelectionBuilder[SecurityVulnerabilityConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[SecurityAdvisoryEcosystem]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[SecurityVulnerabilityOrder]],
    encoder6: ArgEncoder[Option[String]],
    encoder7: ArgEncoder[Option[List[SecurityAdvisorySeverity]]]
  ): SelectionBuilder[SecurityAdvisory, A] = _root_.caliban.client.SelectionBuilder.Field(
    "vulnerabilities",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("ecosystem", ecosystem, "SecurityAdvisoryEcosystem")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "SecurityVulnerabilityOrder")(encoder5),
      Argument("package", `package`, "String")(encoder6),
      Argument("severities", severities, "[SecurityAdvisorySeverity!]")(encoder7)
    )
  )

  /** When the advisory was withdrawn, if it has been withdrawn
    */
  def withdrawnAt: SelectionBuilder[SecurityAdvisory, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("withdrawnAt", OptionOf(Scalar()))
}

