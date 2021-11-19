package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Blob {

  /** An abbreviated version of the Git object ID
    */
  def abbreviatedOid: SelectionBuilder[Blob, String] = _root_.caliban.client.SelectionBuilder.Field("abbreviatedOid", Scalar())

  /** Byte size of Blob object
    */
  def byteSize: SelectionBuilder[Blob, Int] = _root_.caliban.client.SelectionBuilder.Field("byteSize", Scalar())

  /** The HTTP path for this Git object
    */
  def commitResourcePath: SelectionBuilder[Blob, URI] = _root_.caliban.client.SelectionBuilder.Field("commitResourcePath", Scalar())

  /** The HTTP URL for this Git object
    */
  def commitUrl: SelectionBuilder[Blob, URI] = _root_.caliban.client.SelectionBuilder.Field("commitUrl", Scalar())
  def id: SelectionBuilder[Blob, String]     = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Indicates whether the Blob is binary or text. Returns null if unable to determine the encoding.
    */
  def isBinary: SelectionBuilder[Blob, Option[Boolean]] = _root_.caliban.client.SelectionBuilder.Field("isBinary", OptionOf(Scalar()))

  /** Indicates whether the contents is truncated
    */
  def isTruncated: SelectionBuilder[Blob, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isTruncated", Scalar())

  /** The Git object ID
    */
  def oid: SelectionBuilder[Blob, GitObjectID] = _root_.caliban.client.SelectionBuilder.Field("oid", Scalar())

  /** The Repository the Git object belongs to
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Blob, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** UTF8 text data or null if the Blob is binary
    */
  def text: SelectionBuilder[Blob, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("text", OptionOf(Scalar()))
}

