package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RateLimit {

  /** The point cost for the current query counting against the rate limit.
    */
  def cost: SelectionBuilder[RateLimit, Int] = _root_.caliban.client.SelectionBuilder.Field("cost", Scalar())

  /** The maximum number of points the client is permitted to consume in a 60 minute window.
    */
  def limit: SelectionBuilder[RateLimit, Int] = _root_.caliban.client.SelectionBuilder.Field("limit", Scalar())

  /** The maximum number of nodes this query may return
    */
  def nodeCount: SelectionBuilder[RateLimit, Int] = _root_.caliban.client.SelectionBuilder.Field("nodeCount", Scalar())

  /** The number of points remaining in the current rate limit window.
    */
  def remaining: SelectionBuilder[RateLimit, Int] = _root_.caliban.client.SelectionBuilder.Field("remaining", Scalar())

  /** The time at which the current rate limit window resets in UTC epoch seconds.
    */
  def resetAt: SelectionBuilder[RateLimit, DateTime] = _root_.caliban.client.SelectionBuilder.Field("resetAt", Scalar())

  /** The number of points used in the current rate limit window.
    */
  def used: SelectionBuilder[RateLimit, Int] = _root_.caliban.client.SelectionBuilder.Field("used", Scalar())
}

