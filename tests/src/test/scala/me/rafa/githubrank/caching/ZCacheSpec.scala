package me.rafa.githubrank.caching

import com.typesafe.config.ConfigFactory
import zio.clock.Clock
import zio.console.Console
import zio.logging.Logging
import zio.magic._
import zio.random.Random
import zio.test._
import zio.test.Assertion._
import zio.test.TestAspect.samples
import zio.test.{checkM, DefaultRunnableSpec, Gen}
import zio.{ZIO, ZLayer}

object ZCacheSpec extends DefaultRunnableSpec {

  def spec = suite("ZCache") {
    testM("cache return None for unknown key") {

      val config = ConfigFactory.parseString("""github-rank {
           |cache {
           |  capacity = 100
           |  ttl = 1 second
           |}}
          |""".stripMargin)

      checkM(Gen.alphaNumericString) { str =>
        val testCase = {
          for {
            cache <- ZIO.service[ZCache]
            maybe <- cache.get(str)
          } yield maybe
        }

        val result = testCase.injectSome[Clock with Random with Console](
          ZLayer.succeed(config),
          Logging.console(),
          ZCacheCaffeine.live
        )

        assertM(result)(isNone)
      }
    } @@ samples(10)
  }
}
