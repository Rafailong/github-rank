package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SecurityAdvisoryIdentifierFilter(`type`: SecurityAdvisoryIdentifierType, value: String)

object SecurityAdvisoryIdentifierFilter {

  implicit val encoder: ArgEncoder[SecurityAdvisoryIdentifierFilter] = new ArgEncoder[SecurityAdvisoryIdentifierFilter] {

    override def encode(value: SecurityAdvisoryIdentifierFilter): __Value =
      __ObjectValue(
        List(
          "type"  -> implicitly[ArgEncoder[SecurityAdvisoryIdentifierType]].encode(value.`type`),
          "value" -> implicitly[ArgEncoder[String]].encode(value.value)
        )
      )
  }
}

