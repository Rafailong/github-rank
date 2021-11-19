package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PageInfo {

  /** When paginating forwards, the cursor to continue.
    */
  def endCursor: SelectionBuilder[PageInfo, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("endCursor", OptionOf(Scalar()))

  /** When paginating forwards, are there more items?
    */
  def hasNextPage: SelectionBuilder[PageInfo, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasNextPage", Scalar())

  /** When paginating backwards, are there more items?
    */
  def hasPreviousPage: SelectionBuilder[PageInfo, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasPreviousPage", Scalar())

  /** When paginating backwards, the cursor to continue.
    */
  def startCursor: SelectionBuilder[PageInfo, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("startCursor", OptionOf(Scalar()))
}

