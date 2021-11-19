package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SearchResultItemConnection {

  /** The number of pieces of code that matched the search query.
    */
  def codeCount: SelectionBuilder[SearchResultItemConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("codeCount", Scalar())

  /** The number of discussions that matched the search query.
    */
  def discussionCount: SelectionBuilder[SearchResultItemConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("discussionCount", Scalar())

  /** A list of edges.
    */
  def edges[A](innerSelection: SelectionBuilder[SearchResultItemEdge, A]): SelectionBuilder[SearchResultItemConnection, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("edges", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** The number of issues that matched the search query.
    */
  def issueCount: SelectionBuilder[SearchResultItemConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("issueCount", Scalar())

  /** A list of nodes.
    */
  def nodes[A](
    onApp: SelectionBuilder[App, A],
    onDiscussion: SelectionBuilder[Discussion, A],
    onIssue: SelectionBuilder[Issue, A],
    onMarketplaceListing: SelectionBuilder[MarketplaceListing, A],
    onOrganization: SelectionBuilder[Organization, A],
    onPullRequest: SelectionBuilder[PullRequest, A],
    onRepository: SelectionBuilder[Repository, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[SearchResultItemConnection, Option[List[Option[A]]]] = _root_.caliban.client.SelectionBuilder.Field(
    "nodes",
    OptionOf(
      ListOf(
        OptionOf(
          ChoiceOf(
            Map(
              "App"                -> Obj(onApp),
              "Discussion"         -> Obj(onDiscussion),
              "Issue"              -> Obj(onIssue),
              "MarketplaceListing" -> Obj(onMarketplaceListing),
              "Organization"       -> Obj(onOrganization),
              "PullRequest"        -> Obj(onPullRequest),
              "Repository"         -> Obj(onRepository),
              "User"               -> Obj(onUser)
            )
          )
        )
      )
    )
  )

  /** Information to aid in pagination.
    */
  def pageInfo[A](innerSelection: SelectionBuilder[PageInfo, A]): SelectionBuilder[SearchResultItemConnection, A] =
    _root_.caliban.client.SelectionBuilder.Field("pageInfo", Obj(innerSelection))

  /** The number of repositories that matched the search query.
    */
  def repositoryCount: SelectionBuilder[SearchResultItemConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("repositoryCount", Scalar())

  /** The number of users that matched the search query.
    */
  def userCount: SelectionBuilder[SearchResultItemConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("userCount", Scalar())

  /** The number of wiki pages that matched the search query.
    */
  def wikiCount: SelectionBuilder[SearchResultItemConnection, Int] = _root_.caliban.client.SelectionBuilder.Field("wikiCount", Scalar())
}

