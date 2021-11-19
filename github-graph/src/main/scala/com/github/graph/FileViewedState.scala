package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait FileViewedState extends scala.Product with scala.Serializable { def value: String }

object FileViewedState {
  case object DISMISSED extends FileViewedState { val value: String = "DISMISSED" }
  case object UNVIEWED extends FileViewedState { val value: String = "UNVIEWED" }
  case object VIEWED extends FileViewedState { val value: String = "VIEWED" }

  implicit val decoder: ScalarDecoder[FileViewedState] = {
    case __StringValue("DISMISSED") => Right(FileViewedState.DISMISSED)
    case __StringValue("UNVIEWED")  => Right(FileViewedState.UNVIEWED)
    case __StringValue("VIEWED")    => Right(FileViewedState.VIEWED)
    case other                      => Left(DecodingError(s"Can't build FileViewedState from input $other"))
  }

  implicit val encoder: ArgEncoder[FileViewedState] = {
    case FileViewedState.DISMISSED => __EnumValue("DISMISSED")
    case FileViewedState.UNVIEWED  => __EnumValue("UNVIEWED")
    case FileViewedState.VIEWED    => __EnumValue("VIEWED")
  }

  val values: Vector[FileViewedState] = Vector(DISMISSED, UNVIEWED, VIEWED)
}

