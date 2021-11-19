package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SecurityAdvisoryReference {

  /** A publicly accessible reference
    */
  def url: SelectionBuilder[SecurityAdvisoryReference, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

