package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreatedIssueContribution {

  /** Whether this contribution is associated with a record you do not have access to. For
    * example, your own 'first issue' contribution may have been made on a repository you can no
    * longer access.
    */
  def isRestricted: SelectionBuilder[CreatedIssueContribution, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isRestricted", Scalar())

  /** The issue that was opened.
    */
  def issue[A](innerSelection: SelectionBuilder[Issue, A]): SelectionBuilder[CreatedIssueContribution, A] =
    _root_.caliban.client.SelectionBuilder.Field("issue", Obj(innerSelection))

  /** When this contribution was made.
    */
  def occurredAt: SelectionBuilder[CreatedIssueContribution, DateTime] = _root_.caliban.client.SelectionBuilder.Field("occurredAt", Scalar())

  /** The HTTP path for this contribution.
    */
  def resourcePath: SelectionBuilder[CreatedIssueContribution, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP URL for this contribution.
    */
  def url: SelectionBuilder[CreatedIssueContribution, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** The user who made this contribution.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[CreatedIssueContribution, A] =
    _root_.caliban.client.SelectionBuilder.Field("user", Obj(innerSelection))
}

