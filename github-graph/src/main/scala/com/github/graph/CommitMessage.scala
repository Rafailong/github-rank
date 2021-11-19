package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CommitMessage(body: Option[String] = None, headline: String)

object CommitMessage {

  implicit val encoder: ArgEncoder[CommitMessage] = new ArgEncoder[CommitMessage] {

    override def encode(value: CommitMessage): __Value =
      __ObjectValue(
        List(
          "body"     -> value.body.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "headline" -> implicitly[ArgEncoder[String]].encode(value.headline)
        )
      )
  }
}

