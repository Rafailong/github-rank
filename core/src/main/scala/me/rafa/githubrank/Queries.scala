package me.rafa.githubrank

import caliban.client.Operations.RootQuery
import caliban.client.SelectionBuilder
import com.github.graph._
import me.rafa.githubrank.model._

object Queries {

  /** @param org Organization login `"ScalaConsultants"`
    * @param take Number of element to take. Default `100`
    * @param paging Optional paging controls. Check '''model.Paging''' for more information.
    * @return
    */
  def contributorsOf(
    org: String,
    take: Int              = 100,
    paging: Option[Paging] = None
  ): SelectionBuilder[RootQuery, Contributors] = {

    val first  = if (paging.isEmpty) Some(take) else None
    val before = paging.flatMap(_.end)
    val after  = paging.flatMap(_.start)

    Query
      .organization(login = org) {
        Organization.membersWithRole(first = first, after = after, before = before) {
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
