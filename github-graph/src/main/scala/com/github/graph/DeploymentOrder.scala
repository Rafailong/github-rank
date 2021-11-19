package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeploymentOrder(direction: OrderDirection, field: DeploymentOrderField)

object DeploymentOrder {

  implicit val encoder: ArgEncoder[DeploymentOrder] = new ArgEncoder[DeploymentOrder] {

    override def encode(value: DeploymentOrder): __Value =
      __ObjectValue(
        List(
          "direction" -> implicitly[ArgEncoder[OrderDirection]].encode(value.direction),
          "field"     -> implicitly[ArgEncoder[DeploymentOrderField]].encode(value.field)
        )
      )
  }
}

