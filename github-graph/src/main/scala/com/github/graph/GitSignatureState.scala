package com.github.graph

import caliban.client.CalibanClientError.DecodingError
import caliban.client._
import caliban.client.__Value._

sealed trait GitSignatureState extends scala.Product with scala.Serializable { def value: String }

object GitSignatureState {
  case object BAD_CERT extends GitSignatureState { val value: String = "BAD_CERT" }
  case object BAD_EMAIL extends GitSignatureState { val value: String = "BAD_EMAIL" }
  case object EXPIRED_KEY extends GitSignatureState { val value: String = "EXPIRED_KEY" }
  case object GPGVERIFY_ERROR extends GitSignatureState { val value: String = "GPGVERIFY_ERROR" }
  case object GPGVERIFY_UNAVAILABLE extends GitSignatureState { val value: String = "GPGVERIFY_UNAVAILABLE" }
  case object INVALID extends GitSignatureState { val value: String = "INVALID" }
  case object MALFORMED_SIG extends GitSignatureState { val value: String = "MALFORMED_SIG" }
  case object NOT_SIGNING_KEY extends GitSignatureState { val value: String = "NOT_SIGNING_KEY" }
  case object NO_USER extends GitSignatureState { val value: String = "NO_USER" }
  case object OCSP_ERROR extends GitSignatureState { val value: String = "OCSP_ERROR" }
  case object OCSP_PENDING extends GitSignatureState { val value: String = "OCSP_PENDING" }
  case object OCSP_REVOKED extends GitSignatureState { val value: String = "OCSP_REVOKED" }
  case object UNKNOWN_KEY extends GitSignatureState { val value: String = "UNKNOWN_KEY" }
  case object UNKNOWN_SIG_TYPE extends GitSignatureState { val value: String = "UNKNOWN_SIG_TYPE" }
  case object UNSIGNED extends GitSignatureState { val value: String = "UNSIGNED" }
  case object UNVERIFIED_EMAIL extends GitSignatureState { val value: String = "UNVERIFIED_EMAIL" }
  case object VALID extends GitSignatureState { val value: String = "VALID" }

  implicit val decoder: ScalarDecoder[GitSignatureState] = {
    case __StringValue("BAD_CERT")              => Right(GitSignatureState.BAD_CERT)
    case __StringValue("BAD_EMAIL")             => Right(GitSignatureState.BAD_EMAIL)
    case __StringValue("EXPIRED_KEY")           => Right(GitSignatureState.EXPIRED_KEY)
    case __StringValue("GPGVERIFY_ERROR")       => Right(GitSignatureState.GPGVERIFY_ERROR)
    case __StringValue("GPGVERIFY_UNAVAILABLE") => Right(GitSignatureState.GPGVERIFY_UNAVAILABLE)
    case __StringValue("INVALID")               => Right(GitSignatureState.INVALID)
    case __StringValue("MALFORMED_SIG")         => Right(GitSignatureState.MALFORMED_SIG)
    case __StringValue("NOT_SIGNING_KEY")       => Right(GitSignatureState.NOT_SIGNING_KEY)
    case __StringValue("NO_USER")               => Right(GitSignatureState.NO_USER)
    case __StringValue("OCSP_ERROR")            => Right(GitSignatureState.OCSP_ERROR)
    case __StringValue("OCSP_PENDING")          => Right(GitSignatureState.OCSP_PENDING)
    case __StringValue("OCSP_REVOKED")          => Right(GitSignatureState.OCSP_REVOKED)
    case __StringValue("UNKNOWN_KEY")           => Right(GitSignatureState.UNKNOWN_KEY)
    case __StringValue("UNKNOWN_SIG_TYPE")      => Right(GitSignatureState.UNKNOWN_SIG_TYPE)
    case __StringValue("UNSIGNED")              => Right(GitSignatureState.UNSIGNED)
    case __StringValue("UNVERIFIED_EMAIL")      => Right(GitSignatureState.UNVERIFIED_EMAIL)
    case __StringValue("VALID")                 => Right(GitSignatureState.VALID)
    case other                                  => Left(DecodingError(s"Can't build GitSignatureState from input $other"))
  }

  implicit val encoder: ArgEncoder[GitSignatureState] = {
    case GitSignatureState.BAD_CERT              => __EnumValue("BAD_CERT")
    case GitSignatureState.BAD_EMAIL             => __EnumValue("BAD_EMAIL")
    case GitSignatureState.EXPIRED_KEY           => __EnumValue("EXPIRED_KEY")
    case GitSignatureState.GPGVERIFY_ERROR       => __EnumValue("GPGVERIFY_ERROR")
    case GitSignatureState.GPGVERIFY_UNAVAILABLE => __EnumValue("GPGVERIFY_UNAVAILABLE")
    case GitSignatureState.INVALID               => __EnumValue("INVALID")
    case GitSignatureState.MALFORMED_SIG         => __EnumValue("MALFORMED_SIG")
    case GitSignatureState.NOT_SIGNING_KEY       => __EnumValue("NOT_SIGNING_KEY")
    case GitSignatureState.NO_USER               => __EnumValue("NO_USER")
    case GitSignatureState.OCSP_ERROR            => __EnumValue("OCSP_ERROR")
    case GitSignatureState.OCSP_PENDING          => __EnumValue("OCSP_PENDING")
    case GitSignatureState.OCSP_REVOKED          => __EnumValue("OCSP_REVOKED")
    case GitSignatureState.UNKNOWN_KEY           => __EnumValue("UNKNOWN_KEY")
    case GitSignatureState.UNKNOWN_SIG_TYPE      => __EnumValue("UNKNOWN_SIG_TYPE")
    case GitSignatureState.UNSIGNED              => __EnumValue("UNSIGNED")
    case GitSignatureState.UNVERIFIED_EMAIL      => __EnumValue("UNVERIFIED_EMAIL")
    case GitSignatureState.VALID                 => __EnumValue("VALID")
  }

  val values: Vector[GitSignatureState] = Vector(
    BAD_CERT,
    BAD_EMAIL,
    EXPIRED_KEY,
    GPGVERIFY_ERROR,
    GPGVERIFY_UNAVAILABLE,
    INVALID,
    MALFORMED_SIG,
    NOT_SIGNING_KEY,
    NO_USER,
    OCSP_ERROR,
    OCSP_PENDING,
    OCSP_REVOKED,
    UNKNOWN_KEY,
    UNKNOWN_SIG_TYPE,
    UNSIGNED,
    UNVERIFIED_EMAIL,
    VALID
  )
}

