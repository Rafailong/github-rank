package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object GitActor {

  /** A URL pointing to the author's public avatar.
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[GitActor, URI] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", Scalar(), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** The timestamp of the Git action (authoring or committing).
    */
  def date: SelectionBuilder[GitActor, Option[GitTimestamp]] = _root_.caliban.client.SelectionBuilder.Field("date", OptionOf(Scalar()))

  /** The email in the Git commit.
    */
  def email: SelectionBuilder[GitActor, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("email", OptionOf(Scalar()))

  /** The name in the Git commit.
    */
  def name: SelectionBuilder[GitActor, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("name", OptionOf(Scalar()))

  /** The GitHub user corresponding to the email field. Null if no such user exists.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[GitActor, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("user", OptionOf(Obj(innerSelection)))
}

