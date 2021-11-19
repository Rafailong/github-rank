package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ReleaseAsset {

  /** The asset's content-type
    */
  def contentType: SelectionBuilder[ReleaseAsset, String] = _root_.caliban.client.SelectionBuilder.Field("contentType", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[ReleaseAsset, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** The number of times this asset was downloaded
    */
  def downloadCount: SelectionBuilder[ReleaseAsset, Int] = _root_.caliban.client.SelectionBuilder.Field("downloadCount", Scalar())

  /** Identifies the URL where you can download the release asset via the browser.
    */
  def downloadUrl: SelectionBuilder[ReleaseAsset, URI] = _root_.caliban.client.SelectionBuilder.Field("downloadUrl", Scalar())
  def id: SelectionBuilder[ReleaseAsset, String]       = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Identifies the title of the release asset.
    */
  def name: SelectionBuilder[ReleaseAsset, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** Release that the asset is associated with
    */
  def release[A](innerSelection: SelectionBuilder[Release, A]): SelectionBuilder[ReleaseAsset, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("release", OptionOf(Obj(innerSelection)))

  /** The size (in bytes) of the asset
    */
  def size: SelectionBuilder[ReleaseAsset, Int] = _root_.caliban.client.SelectionBuilder.Field("size", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[ReleaseAsset, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The user that performed the upload
    */
  def uploadedBy[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[ReleaseAsset, A] =
    _root_.caliban.client.SelectionBuilder.Field("uploadedBy", Obj(innerSelection))

  /** Identifies the URL of the release asset.
    */
  def url: SelectionBuilder[ReleaseAsset, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

