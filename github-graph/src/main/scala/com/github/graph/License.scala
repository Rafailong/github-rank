package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object License {

  /** The full text of the license
    */
  def body: SelectionBuilder[License, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The conditions set by the license
    */
  def conditions[A](innerSelection: SelectionBuilder[LicenseRule, A]): SelectionBuilder[License, List[Option[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("conditions", ListOf(OptionOf(Obj(innerSelection))))

  /** A human-readable description of the license
    */
  def description: SelectionBuilder[License, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** Whether the license should be featured
    */
  def featured: SelectionBuilder[License, Boolean] = _root_.caliban.client.SelectionBuilder.Field("featured", Scalar())

  /** Whether the license should be displayed in license pickers
    */
  def hidden: SelectionBuilder[License, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hidden", Scalar())
  def id: SelectionBuilder[License, String]      = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Instructions on how to implement the license
    */
  def implementation: SelectionBuilder[License, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("implementation", OptionOf(Scalar()))

  /** The lowercased SPDX ID of the license
    */
  def key: SelectionBuilder[License, String] = _root_.caliban.client.SelectionBuilder.Field("key", Scalar())

  /** The limitations set by the license
    */
  def limitations[A](innerSelection: SelectionBuilder[LicenseRule, A]): SelectionBuilder[License, List[Option[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("limitations", ListOf(OptionOf(Obj(innerSelection))))

  /** The license full name specified by <https://spdx.org/licenses>
    */
  def name: SelectionBuilder[License, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** Customary short name if applicable (e.g, GPLv3)
    */
  def nickname: SelectionBuilder[License, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("nickname", OptionOf(Scalar()))

  /** The permissions set by the license
    */
  def permissions[A](innerSelection: SelectionBuilder[LicenseRule, A]): SelectionBuilder[License, List[Option[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("permissions", ListOf(OptionOf(Obj(innerSelection))))

  /** Whether the license is a pseudo-license placeholder (e.g., other, no-license)
    */
  def pseudoLicense: SelectionBuilder[License, Boolean] = _root_.caliban.client.SelectionBuilder.Field("pseudoLicense", Scalar())

  /** Short identifier specified by <https://spdx.org/licenses>
    */
  def spdxId: SelectionBuilder[License, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("spdxId", OptionOf(Scalar()))

  /** URL to the license on <https://choosealicense.com>
    */
  def url: SelectionBuilder[License, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("url", OptionOf(Scalar()))
}

