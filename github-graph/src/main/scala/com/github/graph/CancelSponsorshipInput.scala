package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CancelSponsorshipInput(
  clientMutationId: Option[String] = None,
  sponsorId: Option[String]        = None,
  sponsorLogin: Option[String]     = None,
  sponsorableId: Option[String]    = None,
  sponsorableLogin: Option[String] = None
)

object CancelSponsorshipInput {

  implicit val encoder: ArgEncoder[CancelSponsorshipInput] = new ArgEncoder[CancelSponsorshipInput] {

    override def encode(value: CancelSponsorshipInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorId"        -> value.sponsorId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorLogin"     -> value.sponsorLogin.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorableId"    -> value.sponsorableId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "sponsorableLogin" -> value.sponsorableLogin.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

