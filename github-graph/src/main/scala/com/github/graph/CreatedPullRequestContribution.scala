package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreatedPullRequestContribution {

  /** Whether this contribution is associated with a record you do not have access to. For
    * example, your own 'first issue' contribution may have been made on a repository you can no
    * longer access.
    */
  def isRestricted: SelectionBuilder[CreatedPullRequestContribution, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isRestricted", Scalar())

  /** When this contribution was made.
    */
  def occurredAt: SelectionBuilder[CreatedPullRequestContribution, DateTime] = _root_.caliban.client.SelectionBuilder.Field("occurredAt", Scalar())

  /** The pull request that was opened.
    */
  def pullRequest[A](innerSelection: SelectionBuilder[PullRequest, A]): SelectionBuilder[CreatedPullRequestContribution, A] =
    _root_.caliban.client.SelectionBuilder.Field("pullRequest", Obj(innerSelection))

  /** The HTTP path for this contribution.
    */
  def resourcePath: SelectionBuilder[CreatedPullRequestContribution, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP URL for this contribution.
    */
  def url: SelectionBuilder[CreatedPullRequestContribution, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** The user who made this contribution.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[CreatedPullRequestContribution, A] =
    _root_.caliban.client.SelectionBuilder.Field("user", Obj(innerSelection))
}

