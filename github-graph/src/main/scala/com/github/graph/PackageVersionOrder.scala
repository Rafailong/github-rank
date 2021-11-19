package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class PackageVersionOrder(direction: Option[OrderDirection] = None, field: Option[PackageVersionOrderField] = None)

object PackageVersionOrder {

  implicit val encoder: ArgEncoder[PackageVersionOrder] = new ArgEncoder[PackageVersionOrder] {

    override def encode(value: PackageVersionOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> value.direction.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[OrderDirection]].encode(value)),
          "field"     -> value.field.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[PackageVersionOrderField]].encode(value))
        )
      )
  }
}

