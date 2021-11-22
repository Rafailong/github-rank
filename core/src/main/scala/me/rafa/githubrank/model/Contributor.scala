package me.rafa.githubrank.model

import com.github.graph._
import eu.timepit.refined.types.numeric.NonNegInt
import eu.timepit.refined.types.string.NonEmptyString
import io.circe.Codec
import io.circe.generic.semiauto._
import io.circe.refined._

case class Contributor(name: NonEmptyString, contributions: NonNegInt)

object Contributor {

  implicit val contributorCodec: Codec.AsObject[Contributor] = deriveCodec[Contributor]

  implicit val contributorOrdering: Ordering[Contributor] =
    Ordering.by[Contributor, Int](_.contributions.value).reverse

  val Selector = {
    User.login ~
    User.contributionsCollection() {
      ContributionsCollection.contributionCalendar {
        ContributionCalendar.totalContributions
      }
    }
  }.mapEither { case (login, totalContributions) =>
    import cats.implicits._
    import eu.timepit.refined.cats.syntax._
    import caliban.client.CalibanClientError.DecodingError

    (
      NonEmptyString.validateNel(login),
      NonNegInt.validateNel(totalContributions)
    ).mapN(Contributor.apply).leftMap { nel => DecodingError(nel.mkString_(",")) }.toEither

  }
}
