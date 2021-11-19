package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class ProjectColumnImport(columnName: String, issues: Option[List[ProjectCardImport]] = None, position: Int)

object ProjectColumnImport {

  implicit val encoder: ArgEncoder[ProjectColumnImport] = new ArgEncoder[ProjectColumnImport] {

    override def encode(value: ProjectColumnImport): __Value =
      __ObjectValue(
        List(
          "columnName" -> implicitly[ArgEncoder[String]].encode(value.columnName),
          "issues" -> value.issues.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[ProjectCardImport]].encode(value)))
          ),
          "position" -> implicitly[ArgEncoder[Int]].encode(value.position)
        )
      )
  }
}

