package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait OperationType extends scala.Product with scala.Serializable { def value: String }

object OperationType {
  case object ACCESS extends OperationType { val value: String = "ACCESS" }
  case object AUTHENTICATION extends OperationType { val value: String = "AUTHENTICATION" }
  case object CREATE extends OperationType { val value: String = "CREATE" }
  case object MODIFY extends OperationType { val value: String = "MODIFY" }
  case object REMOVE extends OperationType { val value: String = "REMOVE" }
  case object RESTORE extends OperationType { val value: String = "RESTORE" }
  case object TRANSFER extends OperationType { val value: String = "TRANSFER" }

  implicit val decoder: ScalarDecoder[OperationType] = {
    case __StringValue("ACCESS")         => Right(OperationType.ACCESS)
    case __StringValue("AUTHENTICATION") => Right(OperationType.AUTHENTICATION)
    case __StringValue("CREATE")         => Right(OperationType.CREATE)
    case __StringValue("MODIFY")         => Right(OperationType.MODIFY)
    case __StringValue("REMOVE")         => Right(OperationType.REMOVE)
    case __StringValue("RESTORE")        => Right(OperationType.RESTORE)
    case __StringValue("TRANSFER")       => Right(OperationType.TRANSFER)
    case other                           => Left(DecodingError(s"Can't build OperationType from input $other"))
  }

  implicit val encoder: ArgEncoder[OperationType] = {
    case OperationType.ACCESS         => __EnumValue("ACCESS")
    case OperationType.AUTHENTICATION => __EnumValue("AUTHENTICATION")
    case OperationType.CREATE         => __EnumValue("CREATE")
    case OperationType.MODIFY         => __EnumValue("MODIFY")
    case OperationType.REMOVE         => __EnumValue("REMOVE")
    case OperationType.RESTORE        => __EnumValue("RESTORE")
    case OperationType.TRANSFER       => __EnumValue("TRANSFER")
  }

  val values: Vector[OperationType] = Vector(ACCESS, AUTHENTICATION, CREATE, MODIFY, REMOVE, RESTORE, TRANSFER)
}

