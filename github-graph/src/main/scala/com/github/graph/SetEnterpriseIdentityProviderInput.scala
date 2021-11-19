package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class SetEnterpriseIdentityProviderInput(
  clientMutationId: Option[String] = None,
  digestMethod: SamlDigestAlgorithm,
  enterpriseId: String,
  idpCertificate: String,
  issuer: Option[String] = None,
  signatureMethod: SamlSignatureAlgorithm,
  ssoUrl: URI
)

object SetEnterpriseIdentityProviderInput {

  implicit val encoder: ArgEncoder[SetEnterpriseIdentityProviderInput] = new ArgEncoder[SetEnterpriseIdentityProviderInput] {

    override def encode(value: SetEnterpriseIdentityProviderInput): __Value =
      __ObjectValue(
        List(
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "digestMethod"     -> implicitly[ArgEncoder[SamlDigestAlgorithm]].encode(value.digestMethod),
          "enterpriseId"     -> implicitly[ArgEncoder[String]].encode(value.enterpriseId),
          "idpCertificate"   -> implicitly[ArgEncoder[String]].encode(value.idpCertificate),
          "issuer"           -> value.issuer.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "signatureMethod"  -> implicitly[ArgEncoder[SamlSignatureAlgorithm]].encode(value.signatureMethod),
          "ssoUrl"           -> implicitly[ArgEncoder[URI]].encode(value.ssoUrl)
        )
      )
  }
}

