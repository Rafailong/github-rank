package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object SearchResultItemEdge {

  /** A cursor for use in pagination.
    */
  def cursor: SelectionBuilder[SearchResultItemEdge, String] = _root_.caliban.client.SelectionBuilder.Field("cursor", Scalar())

  /** The item at the end of the edge.
    */
  def node[A](
    onApp: SelectionBuilder[App, A],
    onDiscussion: SelectionBuilder[Discussion, A],
    onIssue: SelectionBuilder[Issue, A],
    onMarketplaceListing: SelectionBuilder[MarketplaceListing, A],
    onOrganization: SelectionBuilder[Organization, A],
    onPullRequest: SelectionBuilder[PullRequest, A],
    onRepository: SelectionBuilder[Repository, A],
    onUser: SelectionBuilder[User, A]
  ): SelectionBuilder[SearchResultItemEdge, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
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

  /** Text matches on the result found.
    */
  def textMatches[A](innerSelection: SelectionBuilder[TextMatch, A]): SelectionBuilder[SearchResultItemEdge, Option[List[Option[A]]]] =
    _root_.caliban.client.SelectionBuilder.Field("textMatches", OptionOf(ListOf(OptionOf(Obj(innerSelection)))))

  /** The item at the end of the edge.
    */
  def nodeOption[A](
    onApp: Option[SelectionBuilder[App, A]]                               = None,
    onDiscussion: Option[SelectionBuilder[Discussion, A]]                 = None,
    onIssue: Option[SelectionBuilder[Issue, A]]                           = None,
    onMarketplaceListing: Option[SelectionBuilder[MarketplaceListing, A]] = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]             = None,
    onPullRequest: Option[SelectionBuilder[PullRequest, A]]               = None,
    onRepository: Option[SelectionBuilder[Repository, A]]                 = None,
    onUser: Option[SelectionBuilder[User, A]]                             = None
  ): SelectionBuilder[SearchResultItemEdge, Option[Option[A]]] = _root_.caliban.client.SelectionBuilder.Field(
    "node",
    OptionOf(
      ChoiceOf(
        Map(
          "App"                -> onApp.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Discussion"         -> onDiscussion.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Issue"              -> onIssue.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "MarketplaceListing" -> onMarketplaceListing.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Organization"       -> onOrganization.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "PullRequest"        -> onPullRequest.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "Repository"         -> onRepository.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a))),
          "User"               -> onUser.fold[FieldBuilder[Option[A]]](NullField)(a => OptionOf(Obj(a)))
        )
      )
    )
  )
}

