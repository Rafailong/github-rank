package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class FileAddition(contents: Base64String, path: String)

object FileAddition {

  implicit val encoder: ArgEncoder[FileAddition] = new ArgEncoder[FileAddition] {

    override def encode(value: FileAddition): __Value =
      __ObjectValue(
        List("contents" -> implicitly[ArgEncoder[Base64String]].encode(value.contents), "path" -> implicitly[ArgEncoder[String]].encode(value.path))
      )
  }
}

