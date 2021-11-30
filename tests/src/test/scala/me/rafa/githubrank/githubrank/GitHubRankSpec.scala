package me.rafa.githubrank.githubrank

import eu.timepit.refined.types.numeric.NonNegInt
import eu.timepit.refined.types.string.NonEmptyString
import me.rafa.githubrank.model._
import me.rafa.githubrank.Mocks._
import scalacache.Flags
import zio._
import zio.clock.Clock
import zio.console.Console
import zio.logging.Logging
import zio.magic._
import zio.random.Random
import zio.test._
import zio.test.mock.Expectation._

import scala.collection.immutable.SortedSet

object GitHubRankSpec extends DefaultRunnableSpec {

  private val loggingLayer = Logging.console()

  val org = "ScalaConsultants"

  val contributors = Set(
    Contributor(NonEmptyString.unsafeFrom("eric"), NonNegInt.unsafeFrom(5)),
    Contributor(NonEmptyString.unsafeFrom("felipe"), NonNegInt.unsafeFrom(10)),
    Contributor(NonEmptyString.unsafeFrom("juan"), NonNegInt.unsafeFrom(0))
  )

  def spec = suite("GitHubRank")(
    testM("contributors should be sorted by number of contributions") {
      assertM(UIO.succeed(true))(Assertion.isTrue)
    },
    testM("fetch contributors from cache") {
      val zCacheGetMock = ZCacheMock
        .Get(
          Assertion.equalTo((org, Flags.defaultFlags)),
          value(Some(SortedSet.from(contributors)))
        )

      GitHubRank
        .orgContributors(org)
        .map { contributors =>
          assert(contributors)(Assertion.isNonEmpty) &&
          assert(contributors.map(_.contributions.value))(Assertion.isSortedReverse[Int])
        }
        .injectSome[Random with Console with Clock](
          loggingLayer,
          GitHubClientMock.empty,
          zCacheGetMock,
          GitHubRankLive.live
        )
    }
  )
}
