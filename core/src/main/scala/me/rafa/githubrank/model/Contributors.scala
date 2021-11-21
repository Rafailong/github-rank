package me.rafa.githubrank.model

import io.circe.Codec
import io.circe.generic.semiauto._

object Contributors {

  def apply(paging: Paging, total: Int, contributors: List[Contributor]): Contributors =
    Page[Contributor](paging, total, contributors)

  val empty: Contributors = Page[Contributor](Paging.empty, total = 0, elem = List.empty)

  implicit val contributorsCodec: Codec.AsObject[Contributors] =
    deriveCodec[Contributors]
}
