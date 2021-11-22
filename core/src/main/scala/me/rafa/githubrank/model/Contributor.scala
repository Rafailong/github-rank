package me.rafa.githubrank.model

import com.github.graph._
import io.circe.Codec
import io.circe.generic.semiauto._

case class Contributor(name: String, contributions: Int)

object Contributor {

  implicit val contributorCodec: Codec.AsObject[Contributor] = deriveCodec[Contributor]

  implicit val contributorOrdering: Ordering[Contributor] =
    Ordering.by[Contributor, Int](_.contributions).reverse

  val Selector = {
    User.login ~
    User.contributionsCollection() {
      ContributionsCollection.contributionCalendar {
        ContributionCalendar.totalContributions
      }
    }
  }.map { case (login, totalContributions) => Contributor(login, totalContributions) }
}
