package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CodeOfConduct {

  /** The body of the Code of Conduct
    */
  def body: SelectionBuilder[CodeOfConduct, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("body", OptionOf(Scalar()))
  def id: SelectionBuilder[CodeOfConduct, String]           = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The key for the Code of Conduct
    */
  def key: SelectionBuilder[CodeOfConduct, String] = _root_.caliban.client.SelectionBuilder.Field("key", Scalar())

  /** The formal name of the Code of Conduct
    */
  def name: SelectionBuilder[CodeOfConduct, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The HTTP path for this Code of Conduct
    */
  def resourcePath: SelectionBuilder[CodeOfConduct, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", OptionOf(Scalar()))

  /** The HTTP URL for this Code of Conduct
    */
  def url: SelectionBuilder[CodeOfConduct, Option[URI]] = _root_.caliban.client.SelectionBuilder.Field("url", OptionOf(Scalar()))
}

