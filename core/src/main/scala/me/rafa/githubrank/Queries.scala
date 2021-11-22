package me.rafa.githubrank

import caliban.client.Operations.RootQuery
import caliban.client.SelectionBuilder
import com.github.graph._
import me.rafa.githubrank.model._
import me.rafa.githubrank.model.PagingControls._

object Queries {

  /** @param org Organization login `"ScalaConsultants"`
    * @param take Number of element to take. Default `100`
    * @param paging Optional paging controls. Check '''model.Paging''' for more information.
    * @return
    */
  def contributorsOf(
    org: String,
    pagingDirection: Option[PagingDirection],
    take: Int = 50
  ): SelectionBuilder[RootQuery, Contributors] = {

    val (before, after) = pagingDirection
      .map {
        case PagingDirection.Before(token) => Some(token) -> None
        case PagingDirection.After(token)  => None        -> Some(token)
      }
      .getOrElse(None -> None)

    Query
      .organization(login = org) {
        Organization.membersWithRole(first = Some(take), after = after, before = before) {
          OrganizationMemberConnection.pageInfo(Paging.Selector) ~
          OrganizationMemberConnection.totalCount ~
          OrganizationMemberConnection
            .nodes(Contributor.Selector)
            .map {
              case Some(list) =>
                list.collect { case Some(contributor) =>
                  contributor
                }
              case None => List.empty
            }
        }
      }
      .map {
        case Some(((paging, total), contributors)) =>
          Contributors(paging, total, contributors)
        case None => Contributors.empty
      }
  }
}
