package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object TreeEntry {

  /** The extension of the file
    */
  def `extension`: SelectionBuilder[TreeEntry, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("extension", OptionOf(Scalar()))

  /** Whether or not this tree entry is generated
    */
  def isGenerated: SelectionBuilder[TreeEntry, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isGenerated", Scalar())

  /** Entry file mode.
    */
  def mode: SelectionBuilder[TreeEntry, Int] = _root_.caliban.client.SelectionBuilder.Field("mode", Scalar())

  /** Entry file name.
    */
  def name: SelectionBuilder[TreeEntry, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** Entry file object.
    */
  def `object`[A](
    onBlob: Option[SelectionBuilder[Blob, A]]     = None,
    onCommit: Option[SelectionBuilder[Commit, A]] = None,
    onTag: Option[SelectionBuilder[Tag, A]]       = None,
    onTree: Option[SelectionBuilder[Tree, A]]     = None
  ): SelectionBuilder[TreeEntry, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "object",
    OptionOf(ChoiceOf(Map("Blob" -> onBlob, "Commit" -> onCommit, "Tag" -> onTag, "Tree" -> onTree).collect { case (k, Some(v)) => k -> Obj(v) }))
  )

  /** Entry file Git object ID.
    */
  def oid: SelectionBuilder[TreeEntry, GitObjectID] = _root_.caliban.client.SelectionBuilder.Field("oid", Scalar())

  /** The full path of the file.
    */
  def path: SelectionBuilder[TreeEntry, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("path", OptionOf(Scalar()))

  /** The Repository the tree entry belongs to
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[TreeEntry, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** If the TreeEntry is for a directory occupied by a submodule project, this returns the corresponding submodule
    */
  def submodule[A](innerSelection: SelectionBuilder[Submodule, A]): SelectionBuilder[TreeEntry, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("submodule", OptionOf(Obj(innerSelection)))

  /** Entry file type.
    */
  def `type`: SelectionBuilder[TreeEntry, String] = _root_.caliban.client.SelectionBuilder.Field("type", Scalar())
}

