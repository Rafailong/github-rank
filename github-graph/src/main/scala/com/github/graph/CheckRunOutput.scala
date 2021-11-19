package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CheckRunOutput(
  annotations: Option[List[CheckAnnotationData]] = None,
  images: Option[List[CheckRunOutputImage]]      = None,
  summary: String,
  text: Option[String] = None,
  title: String
)

object CheckRunOutput {

  implicit val encoder: ArgEncoder[CheckRunOutput] = new ArgEncoder[CheckRunOutput] {

    override def encode(value: CheckRunOutput): __Value =
      __ObjectValue(
        List(
          "annotations" -> value.annotations.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[CheckAnnotationData]].encode(value)))
          ),
          "images" -> value.images.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[CheckRunOutputImage]].encode(value)))
          ),
          "summary" -> implicitly[ArgEncoder[String]].encode(value.summary),
          "text"    -> value.text.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "title"   -> implicitly[ArgEncoder[String]].encode(value.title)
        )
      )
  }
}

