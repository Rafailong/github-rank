package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ProjectCardImport(number: Int, repository: String)

object ProjectCardImport {

  implicit val encoder: ArgEncoder[ProjectCardImport] = new ArgEncoder[ProjectCardImport] {

    override def encode(value: ProjectCardImport): __Value =
      __ObjectValue(
        List("number" -> implicitly[ArgEncoder[Int]].encode(value.number), "repository" -> implicitly[ArgEncoder[String]].encode(value.repository))
      )
  }
}

