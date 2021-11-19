package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CheckAnnotation {

  /** The annotation's severity level.
    */
  def annotationLevel: SelectionBuilder[CheckAnnotation, Option[CheckAnnotationLevel]] =
    _root_.caliban.client.SelectionBuilder.Field("annotationLevel", OptionOf(Scalar()))

  /** The path to the file that this annotation was made on.
    */
  def blobUrl: SelectionBuilder[CheckAnnotation, URI] = _root_.caliban.client.SelectionBuilder.Field("blobUrl", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[CheckAnnotation, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The position of this annotation.
    */
  def location[A](innerSelection: SelectionBuilder[CheckAnnotationSpan, A]): SelectionBuilder[CheckAnnotation, A] =
    _root_.caliban.client.SelectionBuilder.Field("location", Obj(innerSelection))

  /** The annotation's message.
    */
  def message: SelectionBuilder[CheckAnnotation, String] = _root_.caliban.client.SelectionBuilder.Field("message", Scalar())

  /** The path that this annotation was made on.
    */
  def path: SelectionBuilder[CheckAnnotation, String] = _root_.caliban.client.SelectionBuilder.Field("path", Scalar())

  /** Additional information about the annotation.
    */
  def rawDetails: SelectionBuilder[CheckAnnotation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("rawDetails", OptionOf(Scalar()))

  /** The annotation's title
    */
  def title: SelectionBuilder[CheckAnnotation, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("title", OptionOf(Scalar()))
}

