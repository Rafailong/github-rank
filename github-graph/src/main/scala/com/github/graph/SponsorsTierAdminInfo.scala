package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SponsorsTierAdminInfo {

  /** The sponsorships associated with this tier.
    */
  def sponsorships[A](
    after: Option[String]             = None,
    before: Option[String]            = None,
    first: Option[Int]                = None,
    includePrivate: Option[Boolean]   = None,
    last: Option[Int]                 = None,
    orderBy: Option[SponsorshipOrder] = None
  )(innerSelection: SelectionBuilder[SponsorshipConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Boolean]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[SponsorshipOrder]]
  ): SelectionBuilder[SponsorsTierAdminInfo, A] = _root_.caliban.client.SelectionBuilder.Field(
    "sponsorships",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("includePrivate", includePrivate, "Boolean")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "SponsorshipOrder")(encoder5)
    )
  )
}

