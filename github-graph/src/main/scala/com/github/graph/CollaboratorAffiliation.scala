package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait CollaboratorAffiliation extends scala.Product with scala.Serializable { def value: String }

object CollaboratorAffiliation {
  case object ALL extends CollaboratorAffiliation { val value: String = "ALL" }
  case object DIRECT extends CollaboratorAffiliation { val value: String = "DIRECT" }
  case object OUTSIDE extends CollaboratorAffiliation { val value: String = "OUTSIDE" }

  implicit val decoder: ScalarDecoder[CollaboratorAffiliation] = {
    case __StringValue("ALL")     => Right(CollaboratorAffiliation.ALL)
    case __StringValue("DIRECT")  => Right(CollaboratorAffiliation.DIRECT)
    case __StringValue("OUTSIDE") => Right(CollaboratorAffiliation.OUTSIDE)
    case other                    => Left(DecodingError(s"Can't build CollaboratorAffiliation from input $other"))
  }

  implicit val encoder: ArgEncoder[CollaboratorAffiliation] = {
    case CollaboratorAffiliation.ALL     => __EnumValue("ALL")
    case CollaboratorAffiliation.DIRECT  => __EnumValue("DIRECT")
    case CollaboratorAffiliation.OUTSIDE => __EnumValue("OUTSIDE")
  }

  val values: Vector[CollaboratorAffiliation] = Vector(ALL, DIRECT, OUTSIDE)
}

