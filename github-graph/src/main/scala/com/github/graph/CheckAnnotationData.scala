package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CheckAnnotationData(
  annotationLevel: CheckAnnotationLevel,
  location: CheckAnnotationRange,
  message: String,
  path: String,
  rawDetails: Option[String] = None,
  title: Option[String]      = None
)

object CheckAnnotationData {

  implicit val encoder: ArgEncoder[CheckAnnotationData] = new ArgEncoder[CheckAnnotationData] {

    override def encode(value: CheckAnnotationData): __Value =
      __ObjectValue(
        List(
          "annotationLevel" -> implicitly[ArgEncoder[CheckAnnotationLevel]].encode(value.annotationLevel),
          "location"        -> implicitly[ArgEncoder[CheckAnnotationRange]].encode(value.location),
          "message"         -> implicitly[ArgEncoder[String]].encode(value.message),
          "path"            -> implicitly[ArgEncoder[String]].encode(value.path),
          "rawDetails"      -> value.rawDetails.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "title"           -> value.title.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

