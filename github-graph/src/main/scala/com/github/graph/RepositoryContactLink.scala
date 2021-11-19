package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RepositoryContactLink {

  /** The contact link purpose.
    */
  def about: SelectionBuilder[RepositoryContactLink, String] = _root_.caliban.client.SelectionBuilder.Field("about", Scalar())

  /** The contact link name.
    */
  def name: SelectionBuilder[RepositoryContactLink, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The contact link URL.
    */
  def url: SelectionBuilder[RepositoryContactLink, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

