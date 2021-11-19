package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object CreatedCommitContribution {

  /** How many commits were made on this day to this repository by the user.
    */
  def commitCount: SelectionBuilder[CreatedCommitContribution, Int] = _root_.caliban.client.SelectionBuilder.Field("commitCount", Scalar())

  /** Whether this contribution is associated with a record you do not have access to. For
    * example, your own 'first issue' contribution may have been made on a repository you can no
    * longer access.
    */
  def isRestricted: SelectionBuilder[CreatedCommitContribution, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isRestricted", Scalar())

  /** When this contribution was made.
    */
  def occurredAt: SelectionBuilder[CreatedCommitContribution, DateTime] = _root_.caliban.client.SelectionBuilder.Field("occurredAt", Scalar())

  /** The repository the user made a commit in.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[CreatedCommitContribution, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The HTTP path for this contribution.
    */
  def resourcePath: SelectionBuilder[CreatedCommitContribution, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The HTTP URL for this contribution.
    */
  def url: SelectionBuilder[CreatedCommitContribution, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** The user who made this contribution.
    */
  def user[A](innerSelection: SelectionBuilder[User, A]): SelectionBuilder[CreatedCommitContribution, A] =
    _root_.caliban.client.SelectionBuilder.Field("user", Obj(innerSelection))
}

