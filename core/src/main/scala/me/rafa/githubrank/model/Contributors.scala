package me.rafa.githubrank.model

import io.circe._
import io.circe.generic.semiauto._
import me.rafa.githubrank.model.PagingControls.Paging

object Contributors {

  def apply(paging: Paging, total: Int, contributors: List[Contributor]): Contributors =
    Page[Contributor](paging, total, contributors)

  val empty: Contributors = Page[Contributor](Paging.empty, total = 0, elem = List.empty)

  implicit val contributorsEncoder: Encoder[Contributors] = deriveEncoder[Contributors]
  implicit val contributorsDecoder: Decoder[Contributors] = deriveDecoder[Contributors]
}
