package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class PackageFileOrder(direction: Option[OrderDirection] = None, field: Option[PackageFileOrderField] = None)

object PackageFileOrder {

  implicit val encoder: ArgEncoder[PackageFileOrder] = new ArgEncoder[PackageFileOrder] {

    override def encode(value: PackageFileOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> value.direction.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[OrderDirection]].encode(value)),
          "field"     -> value.field.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[PackageFileOrderField]].encode(value))
        )
      )
  }
}

