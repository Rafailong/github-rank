package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Mannequin {

  /** A URL pointing to the GitHub App's public avatar.
    */
  def avatarUrl(size: Option[Int] = None)(implicit encoder0: ArgEncoder[Option[Int]]): SelectionBuilder[Mannequin, URI] =
    _root_.caliban.client.SelectionBuilder.Field("avatarUrl", Scalar(), arguments = List(Argument("size", size, "Int")(encoder0)))

  /** The user that has claimed the data attributed to this mannequin.
    */
  def claimant[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[Mannequin, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("claimant", OptionOf(Obj(innerSelection)))

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Mannequin, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Mannequin, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The mannequin's email on the source instance.
    */
  def email: SelectionBuilder[Mannequin, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("email", OptionOf(Scalar()))
  def id: SelectionBuilder[Mannequin, String]            = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** The username of the actor.
    */
  def login: SelectionBuilder[Mannequin, String] = _root_.caliban.client.SelectionBuilder.Field("login", Scalar())

  /** The HTML path to this resource.
    */
  def resourcePath: SelectionBuilder[Mannequin, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Mannequin, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** The URL to this resource.
    */
  def url: SelectionBuilder[Mannequin, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())
}

