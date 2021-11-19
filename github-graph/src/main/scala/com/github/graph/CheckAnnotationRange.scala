package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CheckAnnotationRange(endColumn: Option[Int] = None, endLine: Int, startColumn: Option[Int] = None, startLine: Int)

object CheckAnnotationRange {

  implicit val encoder: ArgEncoder[CheckAnnotationRange] = new ArgEncoder[CheckAnnotationRange] {

    override def encode(value: CheckAnnotationRange): __Value =
      __ObjectValue(
        List(
          "endColumn"   -> value.endColumn.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value)),
          "endLine"     -> implicitly[ArgEncoder[Int]].encode(value.endLine),
          "startColumn" -> value.startColumn.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Int]].encode(value)),
          "startLine"   -> implicitly[ArgEncoder[Int]].encode(value.startLine)
        )
      )
  }
}

