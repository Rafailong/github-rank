package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object JoinedGitHubContribution {

  /** Whether this contribution is associated with a record you do not have access to. For
    * example, your own 'first issue' contribution may have been made on a repository you can no
    * longer access.
    */
  def isRestricted: SelectionBuilder[JoinedGitHubContribution, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isRestricted", Scalar())

  /** When this contribution was made.
    */
  def occurredAt: SelectionBuilder[JoinedGitHubContribution, DateTime] = _root_.caliban.client.SelectionBuilder.Field("occurredAt", Scalar())

  /** The HTTP path for this contribution.
    */
  def resourcePath: SelectionBuilder[JoinedGitHubContribution, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP URL for this contribution.
    */
  def url: SelectionBuilder[JoinedGitHubContribution, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** The user who made this contribution.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[JoinedGitHubContribution, A] =
    _root_.caliban.client.SelectionBuilder.Field("user", Obj(innerSelection))
}

