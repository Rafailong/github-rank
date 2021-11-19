package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PackageFile {
  def id: SelectionBuilder[PackageFile, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** MD5 hash of the file.
    */
  def md5: SelectionBuilder[PackageFile, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("md5", OptionOf(Scalar()))

  /** Name of the file.
    */
  def name: SelectionBuilder[PackageFile, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The package version this file belongs to.
    */
  def packageVersion[A](innerSelection: SelectionBuilder[PackageVersion, A]): SelectionBuilder[PackageFile, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("packageVersion", OptionOf(Obj(innerSelection)))

  /** SHA1 hash of the file.
    */
  def sha1: SelectionBuilder[PackageFile, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("sha1", OptionOf(Scalar()))

  /** SHA256 hash of the file.
    */
  def sha256: SelectionBuilder[PackageFile, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("sha256", OptionOf(Scalar()))

  /** Size of the file in bytes.
    */
  def size: SelectionBuilder[PackageFile, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("size", OptionOf(Scalar()))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[PackageFile, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** URL to download the asset.
    */
  def url: SelectionBuilder[PackageFile, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("url", OptionOf(Scalar()))
}

