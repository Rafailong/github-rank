package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object IssueTemplate {

  /** The template purpose.
    */
  def about: SelectionBuilder[IssueTemplate, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("about", OptionOf(Scalar()))

  /** The suggested issue body.
    */
  def body: SelectionBuilder[IssueTemplate, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("body", OptionOf(Scalar()))

  /** The template name.
    */
  def name: SelectionBuilder[IssueTemplate, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The suggested issue title.
    */
  def title: SelectionBuilder[IssueTemplate, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("title", OptionOf(Scalar()))
}

