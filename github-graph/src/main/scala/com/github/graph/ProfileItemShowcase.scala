package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object ProfileItemShowcase {

  /** Whether or not the owner has pinned any repositories or gists.
    */
  def hasPinnedItems: SelectionBuilder[ProfileItemShowcase, Boolean] = _root_.caliban.client.SelectionBuilder.Field("hasPinnedItems", Scalar())

  /** The repositories and gists in the showcase. If the profile owner has any
    * pinned items, those will be returned. Otherwise, the profile owner's popular
    * repositories will be returned.
    */
  def items[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[PinnableItemConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[ProfileItemShowcase, A] = _root_.caliban.client.SelectionBuilder.Field(
    "items",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )
}

