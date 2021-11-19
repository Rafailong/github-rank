package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PackageVersionStatistics {

  /** Number of times the package was downloaded since it was created.
    */
  def downloadsTotalCount: SelectionBuilder[PackageVersionStatistics, Int] =
    _root_.caliban.client.SelectionBuilder.Field("downloadsTotalCount", Scalar())
}

