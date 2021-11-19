package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object RequiredStatusCheckDescription {

  /** The App that must provide this status in order for it to be accepted.
    */
  def app[A](innerSelection: SelectionBuilder[App, A]): SelectionBuilder[RequiredStatusCheckDescription, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("app", OptionOf(Obj(innerSelection)))

  /** The name of this status.
    */
  def context: SelectionBuilder[RequiredStatusCheckDescription, String] = _root_.caliban.client.SelectionBuilder.Field("context", Scalar())
}

