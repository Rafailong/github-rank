package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PackageStatistics {

  /** Number of times the package was downloaded since it was created.
    */
  def downloadsTotalCount: SelectionBuilder[PackageStatistics, Int] = _root_.caliban.client.SelectionBuilder.Field("downloadsTotalCount", Scalar())
}

