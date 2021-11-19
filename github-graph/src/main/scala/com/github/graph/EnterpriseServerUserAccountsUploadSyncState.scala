package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait EnterpriseServerUserAccountsUploadSyncState extends scala.Product with scala.Serializable { def value: String }

object EnterpriseServerUserAccountsUploadSyncState {
  case object FAILURE extends EnterpriseServerUserAccountsUploadSyncState { val value: String = "FAILURE" }
  case object PENDING extends EnterpriseServerUserAccountsUploadSyncState { val value: String = "PENDING" }
  case object SUCCESS extends EnterpriseServerUserAccountsUploadSyncState { val value: String = "SUCCESS" }

  implicit val decoder: ScalarDecoder[EnterpriseServerUserAccountsUploadSyncState] = {
    case __StringValue("FAILURE") => Right(EnterpriseServerUserAccountsUploadSyncState.FAILURE)
    case __StringValue("PENDING") => Right(EnterpriseServerUserAccountsUploadSyncState.PENDING)
    case __StringValue("SUCCESS") => Right(EnterpriseServerUserAccountsUploadSyncState.SUCCESS)
    case other                    => Left(DecodingError(s"Can't build EnterpriseServerUserAccountsUploadSyncState from input $other"))
  }

  implicit val encoder: ArgEncoder[EnterpriseServerUserAccountsUploadSyncState] = {
    case EnterpriseServerUserAccountsUploadSyncState.FAILURE => __EnumValue("FAILURE")
    case EnterpriseServerUserAccountsUploadSyncState.PENDING => __EnumValue("PENDING")
    case EnterpriseServerUserAccountsUploadSyncState.SUCCESS => __EnumValue("SUCCESS")
  }

  val values: Vector[EnterpriseServerUserAccountsUploadSyncState] = Vector(FAILURE, PENDING, SUCCESS)
}

