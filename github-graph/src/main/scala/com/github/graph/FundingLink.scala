package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object FundingLink {

  /** The funding platform this link is for.
    */
  def platform: SelectionBuilder[FundingLink, FundingPlatform] = _root_.caliban.client.SelectionBuilder.Field("platform", Scalar())

  /** The configured URL for this funding link.
    */
  def url: SelectionBuilder[FundingLink, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

