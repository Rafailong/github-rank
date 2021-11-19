package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CheckRunAction(description: String, identifier: String, label: String)

object CheckRunAction {

  implicit val encoder: ArgEncoder[CheckRunAction] = new ArgEncoder[CheckRunAction] {

    override def encode(value: CheckRunAction): __Value =
      __ObjectValue(
        List(
          "description" -> implicitly[ArgEncoder[String]].encode(value.description),
          "identifier"  -> implicitly[ArgEncoder[String]].encode(value.identifier),
          "label"       -> implicitly[ArgEncoder[String]].encode(value.label)
        )
      )
  }
}

