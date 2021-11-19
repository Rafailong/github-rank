package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object PullRequestTemplate {

  /** The body of the template
    */
  def body: SelectionBuilder[PullRequestTemplate, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("body", OptionOf(Scalar()))

  /** The filename of the template
    */
  def filename: SelectionBuilder[PullRequestTemplate, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("filename", OptionOf(Scalar()))

  /** The repository the template belongs to
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[PullRequestTemplate, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))
}

