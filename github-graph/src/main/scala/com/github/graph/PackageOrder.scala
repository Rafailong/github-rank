package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class PackageOrder(direction: Option[OrderDirection] = None, field: Option[PackageOrderField] = None)

object PackageOrder {

  implicit val encoder: ArgEncoder[PackageOrder] = new ArgEncoder[PackageOrder] {

    override def encode(value: PackageOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> value.direction.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[OrderDirection]].encode(value)),
          "field"     -> value.field.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[PackageOrderField]].encode(value))
        )
      )
  }
}

