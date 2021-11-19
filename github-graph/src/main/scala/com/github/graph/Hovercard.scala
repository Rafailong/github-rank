package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Hovercard {

  /** Each of the contexts for this hovercard
    */
  def contexts[A](
    onGenericHovercardContext: Option[SelectionBuilder[GenericHovercardContext, A]]                     = None,
    onOrganizationTeamsHovercardContext: Option[SelectionBuilder[OrganizationTeamsHovercardContext, A]] = None,
    onOrganizationsHovercardContext: Option[SelectionBuilder[OrganizationsHovercardContext, A]]         = None,
    onReviewStatusHovercardContext: Option[SelectionBuilder[ReviewStatusHovercardContext, A]]           = None,
    onViewerHovercardContext: Option[SelectionBuilder[ViewerHovercardContext, A]]                       = None
  ): SelectionBuilder[Hovercard, List[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "contexts",
    ListOf(
      ChoiceOf(
        Map(
          "GenericHovercardContext"           -> onGenericHovercardContext,
          "OrganizationTeamsHovercardContext" -> onOrganizationTeamsHovercardContext,
          "OrganizationsHovercardContext"     -> onOrganizationsHovercardContext,
          "ReviewStatusHovercardContext"      -> onReviewStatusHovercardContext,
          "ViewerHovercardContext"            -> onViewerHovercardContext
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )
}

