package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CreateSponsorshipInput(
  amount: Option[Int]                      = None,
  clientMutationId: Option[String]         = None,
  isRecurring: Option[Boolean]             = None,
  privacyLevel: Option[SponsorshipPrivacy] = None,
  receiveEmails: Option[Boolean]           = None,
  sponsorId: Option[String]                = None,
  sponsorLogin: Option[String]             = None,
  sponsorableId: Option[String]            = None,
  sponsorableLogin: Option[String]         = None,
  tierId: Option[String]                   = None
)

object CreateSponsorshipInput {

  implicit val encoder: ArgEncoder[CreateSponsorshipInput] = new ArgEncoder[CreateSponsorshipInput] {

    override def encode(value: CreateSponsorshipInput): __Value =
      __ObjectValue(
        List(
          "amount"           -> value.amount.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "isRecurring"      -> value.isRecurring.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "privacyLevel"     -> value.privacyLevel.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[SponsorshipPrivacy]].encode(value)),
          "receiveEmails"    -> value.receiveEmails.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "sponsorId"        -> value.sponsorId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorLogin"     -> value.sponsorLogin.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorableId"    -> value.sponsorableId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorableLogin" -> value.sponsorableLogin.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "tierId"           -> value.tierId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

