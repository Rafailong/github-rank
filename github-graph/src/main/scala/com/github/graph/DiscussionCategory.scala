package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object DiscussionCategory {

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[DiscussionCategory, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** A description of this category.
    */
  def description: SelectionBuilder[DiscussionCategory, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("description", OptionOf(Scalar()))

  /** An emoji representing this category.
    */
  def emoji: SelectionBuilder[DiscussionCategory, String] = _root_.caliban.client.SelectionBuilder.Field("emoji", Scalar())

  /** This category's emoji rendered as HTML.
    */
  def emojiHTML: SelectionBuilder[DiscussionCategory, HTML] = _root_.caliban.client.SelectionBuilder.Field("emojiHTML", Scalar())
  def id: SelectionBuilder[DiscussionCategory, String]      = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether or not discussions in this category support choosing an answer with the markDiscussionCommentAsAnswer mutation.
    */
  def isAnswerable: SelectionBuilder[DiscussionCategory, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isAnswerable", Scalar())

  /** The name of this category.
    */
  def name: SelectionBuilder[DiscussionCategory, String] = _root_.caliban.client.SelectionBuilder.Field("name", Scalar())

  /** The repository associated with this node.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[DiscussionCategory, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[DiscussionCategory, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

