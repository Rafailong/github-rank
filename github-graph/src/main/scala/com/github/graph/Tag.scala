package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Tag {

  /** An abbreviated version of the Git object ID
    */
  def abbreviatedOid: SelectionBuilder[Tag, String] = _root_.caliban.client.SelectionBuilder.Field("abbreviatedOid", Scalar())

  /** The HTTP path for this Git object
    */
  def commitResourcePath: SelectionBuilder[Tag, URI] = _root_.caliban.client.SelectionBuilder.Field("commitResourcePath", Scalar())

  /** The HTTP URL for this Git object
    */
  def commitUrl: SelectionBuilder[Tag, URI] = _root_.caliban.client.SelectionBuilder.Field("commitUrl", Scalar())
  def id: SelectionBuilder[Tag, String]     = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The Git tag message.
    */
  def message: SelectionBuilder[Tag, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("message", OptionOf(Scalar()))

  /** The Git tag name.
    */
  def name: SelectionBuilder[Tag, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The Git object ID
    */
  def oid: SelectionBuilder[Tag, GitObjectID] = _root_.caliban.client.SelectionBuilder.Field("oid", Scalar())

  /** The Repository the Git object belongs to
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Tag, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** Details about the tag author.
    */
  def tagger[A](innerSelection: SelectionBuilder[GitActor, A]): SelectionBuilder[Tag, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("tagger", OptionOf(Obj(innerSelection)))

  /** The Git object the tag points to.
    */
  def target[A](
    onBlob: Option[SelectionBuilder[Blob, A]]     = None,
    onCommit: Option[SelectionBuilder[Commit, A]] = None,
    onTag: Option[SelectionBuilder[Tag, A]]       = None,
    onTree: Option[SelectionBuilder[Tree, A]]     = None
  ): SelectionBuilder[Tag, A] = _root_.caliban.client.SelectionBuilder.Field(
    "target",
    ChoiceOf(Map("Blob" -> onBlob, "Commit" -> onCommit, "Tag" -> onTag, "Tree" -> onTree).collect { case (k, Some(v)) => k -> Obj(v) })
  )
}

