package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CheckRunOutputImage(alt: String, caption: Option[String] = None, imageUrl: URI)

object CheckRunOutputImage {

  implicit val encoder: ArgEncoder[CheckRunOutputImage] = new ArgEncoder[CheckRunOutputImage] {

    override def encode(value: CheckRunOutputImage): __Value =
      __ObjectValue(
        List(
          "alt"      -> implicitly[ArgEncoder[String]].encode(value.alt),
          "caption"  -> value.caption.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "imageUrl" -> implicitly[ArgEncoder[URI]].encode(value.imageUrl)
        )
      )
  }
}

