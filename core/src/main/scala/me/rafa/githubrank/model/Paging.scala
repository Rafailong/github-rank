package me.rafa.githubrank.model

import com.github.graph._
import io.circe.Codec
import io.circe.generic.semiauto._

/** @param hasNext When paginating forwards, are there more items?
  * @param end When paginating forwards, the cursor to continue.
  * @param start When paginating backwards, the cursor to continue.
  */
case class Paging(hasNext: Boolean, end: Option[String], start: Option[String])

object Paging {

  val empty = Paging(false, None, None)

  val Selector = {
    PageInfo.hasNextPage ~
    PageInfo.startCursor ~
    PageInfo.endCursor
  }.map { case ((hasNext, start), end) => Paging(hasNext, end, start) }

  implicit val pagingCodec: Codec.AsObject[Paging] =
    deriveCodec[Paging]
}
