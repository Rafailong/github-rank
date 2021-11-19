package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class RefUpdate(afterOid: GitObjectID, beforeOid: Option[GitObjectID] = None, force: Option[Boolean] = None, name: GitRefname)

object RefUpdate {

  implicit val encoder: ArgEncoder[RefUpdate] = new ArgEncoder[RefUpdate] {

    override def encode(value: RefUpdate): __Value =
      __ObjectValue(
        List(
          "afterOid"  -> implicitly[ArgEncoder[GitObjectID]].encode(value.afterOid),
          "beforeOid" -> value.beforeOid.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[GitObjectID]].encode(value)),
          "force"     -> value.force.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "name"      -> implicitly[ArgEncoder[GitRefname]].encode(value.name)
        )
      )
  }
}

