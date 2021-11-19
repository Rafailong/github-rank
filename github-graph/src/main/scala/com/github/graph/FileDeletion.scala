package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class FileDeletion(path: String)

object FileDeletion {

  implicit val encoder: ArgEncoder[FileDeletion] = new ArgEncoder[FileDeletion] {

    override def encode(value: FileDeletion): __Value =
      __ObjectValue(List("path" -> implicitly[ArgEncoder[String]].encode(value.path)))
  }
}

