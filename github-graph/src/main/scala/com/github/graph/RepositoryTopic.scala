package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RepositoryTopic {
  def id: SelectionBuilder[RepositoryTopic, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The HTTP path for this repository-topic.
    */
  def resourcePath: SelectionBuilder[RepositoryTopic, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The topic.
    */
  def topic[A](innerSelection: SelectionBuilder[Topic, A]): SelectionBuilder[RepositoryTopic, A] =
    _root_.caliban.client.SelectionBuilder.Field("topic", Obj(innerSelection))

  /** The HTTP URL for this repository-topic.
    */
  def url: SelectionBuilder[RepositoryTopic, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

