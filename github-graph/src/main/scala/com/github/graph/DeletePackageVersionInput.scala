package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class DeletePackageVersionInput(clientMutationId: Option[String] = None, packageVersionId: String)

object DeletePackageVersionInput {

  implicit val encoder: ArgEncoder[DeletePackageVersionInput] = new ArgEncoder[DeletePackageVersionInput] {

    override def encode(value: DeletePackageVersionInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "packageVersionId" -> implicitly[ArgEncoder[String]].encode(value.packageVersionId)
        )
      )
  }
}

