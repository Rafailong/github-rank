package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Tree {

  /** An abbreviated version of the Git object ID
    */
  def abbreviatedOid: SelectionBuilder[Tree, String] = _root_.caliban.client.SelectionBuilder.Field("abbreviatedOid", Scalar())

  /** The HTTP path for this Git object
    */
  def commitResourcePath: SelectionBuilder[Tree, URI] = _root_.caliban.client.SelectionBuilder.Field("commitResourcePath", Scalar())

  /** The HTTP URL for this Git object
    */
  def commitUrl: SelectionBuilder[Tree, URI] = _root_.caliban.client.SelectionBuilder.Field("commitUrl", Scalar())

  /** A list of tree entries.
    */
  def entries[A](innerSelection: SelectionBuilder[TreeEntry, A]): SelectionBuilder[Tree, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("entries", OptionOf(ListOf(Obj(innerSelection))))
  def id: SelectionBuilder[Tree, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The Git object ID
    */
  def oid: SelectionBuilder[Tree, GitObjectID] = _root_.caliban.client.SelectionBuilder.Field("oid", Scalar())

  /** The Repository the Git object belongs to
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Tree, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))
}

