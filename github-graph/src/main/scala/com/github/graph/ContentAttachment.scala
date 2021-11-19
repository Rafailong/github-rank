package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ContentAttachment {

  /** The body text of the content attachment. This parameter supports markdown.
    */
  def body: SelectionBuilder[ContentAttachment, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The content reference that the content attachment is attached to.
    */
  def contentReference[A](innerSelection: SelectionBuilder[ContentReference, A]): SelectionBuilder[ContentAttachment, A] =
    _root_.caliban.client.SelectionBuilder.Field("contentReference", Obj(innerSelection))

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[ContentAttachment, Int] = _root_.caliban.client.SelectionBuilder.Field("databaseId", Scalar())
  def id: SelectionBuilder[ContentAttachment, String]      = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The title of the content attachment.
    */
  def title: SelectionBuilder[ContentAttachment, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())
}

