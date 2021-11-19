package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ImportProjectInput(
  body: Option[String]                     = None,
  clientMutationId: Option[String]         = None,
  columnImports: List[ProjectColumnImport] = Nil,
  name: String,
  ownerName: String,
  public: Option[Boolean] = None
)

object ImportProjectInput {

  implicit val encoder: ArgEncoder[ImportProjectInput] = new ArgEncoder[ImportProjectInput] {

    override def encode(value: ImportProjectInput): __Value =
      __ObjectValue(
        List(
          "body"             -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "columnImports"    -> __ListValue(value.columnImports.map(value => implicitly[ArgEncoder[ProjectColumnImport]].encode(value))),
          "name"             -> implicitly[ArgEncoder[String]].encode(value.name),
          "ownerName"        -> implicitly[ArgEncoder[String]].encode(value.ownerName),
          "public"           -> value.public.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value))
        )
      )
  }
}

