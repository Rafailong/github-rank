package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object GistFile {

  /** The file name encoded to remove characters that are invalid in URL paths.
    */
  def encodedName: SelectionBuilder[GistFile, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("encodedName", OptionOf(Scalar()))

  /** The gist file encoding.
    */
  def encoding: SelectionBuilder[GistFile, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("encoding", OptionOf(Scalar()))

  /** The file extension from the file name.
    */
  def `extension`: SelectionBuilder[GistFile, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("extension", OptionOf(Scalar()))

  /** Indicates if this file is an image.
    */
  def isImage: SelectionBuilder[GistFile, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isImage", Scalar())

  /** Whether the file's contents were truncated.
    */
  def isTruncated: SelectionBuilder[GistFile, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isTruncated", Scalar())

  /** The programming language this file is written in.
    */
  def language[A](innerSelection: SelectionBuilder[Language, A]): SelectionBuilder[GistFile, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("language", OptionOf(Obj(innerSelection)))

  /** The gist file name.
    */
  def name: SelectionBuilder[GistFile, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("name", OptionOf(Scalar()))

  /** The gist file size in bytes.
    */
  def size: SelectionBuilder[GistFile, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("size", OptionOf(Scalar()))

  /** UTF8 text data or null if the file is binary
    */
  def text(truncate: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[GistFile, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("text", OptionOf(Scalar()), arguments = List(Argument("truncate", truncate, "Int")(encoder0)))
}

