package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Bot {

  /** A URL pointing to the GitHub App's public avatar.
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[Bot, URI] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", Scalar(), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Bot, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Bot, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))
  def id: SelectionBuilder[Bot, String]              = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The username of the actor.
    */
  def login: SelectionBuilder[Bot, String] = _root_.caliban.client.SelectionBuilder.Field("login", Scalar())

  /** The HTTP path for this bot
    */
  def resourcePath: SelectionBuilder[Bot, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Bot, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The HTTP URL for this bot
    */
  def url: SelectionBuilder[Bot, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

