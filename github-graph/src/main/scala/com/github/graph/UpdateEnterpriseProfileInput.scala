package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateEnterpriseProfileInput(
  clientMutationId: Option[String] = None,
  description: Option[String]      = None,
  enterpriseId: String,
  location: Option[String]   = None,
  name: Option[String]       = None,
  websiteUrl: Option[String] = None
)

object UpdateEnterpriseProfileInput {

  implicit val encoder: ArgEncoder[UpdateEnterpriseProfileInput] = new ArgEncoder[UpdateEnterpriseProfileInput] {

    override def encode(value: UpdateEnterpriseProfileInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "description"      -> value.description.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "location"         -> value.location.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "name"             -> value.name.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "websiteUrl"       -> value.websiteUrl.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

