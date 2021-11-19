package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateSponsorshipPreferencesInput(
  clientMutationId: Option[String]         = None,
  privacyLevel: Option[SponsorshipPrivacy] = None,
  receiveEmails: Option[Boolean]           = None,
  sponsorId: Option[String]                = None,
  sponsorLogin: Option[String]             = None,
  sponsorableId: Option[String]            = None,
  sponsorableLogin: Option[String]         = None
)

object UpdateSponsorshipPreferencesInput {

  implicit val encoder: ArgEncoder[UpdateSponsorshipPreferencesInput] = new ArgEncoder[UpdateSponsorshipPreferencesInput] {

    override def encode(value: UpdateSponsorshipPreferencesInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "privacyLevel"     -> value.privacyLevel.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[SponsorshipPrivacy]].encode(value)),
          "receiveEmails"    -> value.receiveEmails.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "sponsorId"        -> value.sponsorId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorLogin"     -> value.sponsorLogin.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorableId"    -> value.sponsorableId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorableLogin" -> value.sponsorableLogin.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

