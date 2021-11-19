package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class FileChanges(additions: Option[List[FileAddition]] = None, deletions: Option[List[FileDeletion]] = None)

object FileChanges {

  implicit val encoder: ArgEncoder[FileChanges] = new ArgEncoder[FileChanges] {

    override def encode(value: FileChanges): __Value =
      __ObjectValue(
        List(
          "additions" -> value.additions.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[FileAddition]].encode(value)))
          ),
          "deletions" -> value.deletions.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[FileDeletion]].encode(value)))
          )
        )
      )
  }
}

