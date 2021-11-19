package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class CommitAuthor(emails: Option[List[String]] = None, id: Option[String] = None)

object CommitAuthor {

  implicit val encoder: ArgEncoder[CommitAuthor] = new ArgEncoder[CommitAuthor] {

    override def encode(value: CommitAuthor): __Value =
      __ObjectValue(
        List(
          "emails" -> value.emails.fold(__NullValue: __Value)(value => __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))),
          "id"     -> value.id.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value))
        )
      )
  }
}

