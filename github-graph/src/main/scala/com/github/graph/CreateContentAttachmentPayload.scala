package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreateContentAttachmentPayload {

  /** A unique identifier for the client performing the mutation.
    */
  def clientMutationId: SelectionBuilder[CreateContentAttachmentPayload, Option[String]] =
    _root_.caliban.client.SelectionBuilder.Field("clientMutationId", OptionOf(Scalar()))

  /** The newly created content attachment.
    */
  def contentAttachment[A](innerSelection: SelectionBuilder[ContentAttachment, A]): SelectionBuilder[CreateContentAttachmentPayload, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("contentAttachment", OptionOf(Obj(innerSelection)))
}

