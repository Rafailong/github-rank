val CirceVersion            = "0.14.1"
val ZioVersion              = "1.0.12"
val ZioLoggingVersion       = "0.5.14"
val ZioMagicVersion         = "0.3.10"
val ZioHttpVersion          = "1.0.0.0-RC17"
val Sttp3Version            = "3.3.16"
val PureconfigVersion       = "0.17.0"
val TapirVersion            = "0.19.0"
val KindProjectorVersion    = "0.13.2"
val BetterMonadicForVersion = "0.3.1"
val ScalaCacheVersion       = "0.28.0"
val LogBackVersion          = "1.2.7"
val RefinedVersion          = "0.9.27"

lazy val commonSetting = Seq(
  organization := "me.rafa",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.13.6"
)

lazy val zioBaseBundle = Seq(
  "dev.zio" %% "zio" % ZioVersion,
  "dev.zio" %% "zio-streams" % ZioVersion,
  "dev.zio" %% "zio-logging" % ZioLoggingVersion,
  "dev.zio" %% "zio-logging-slf4j" % ZioLoggingVersion,
  "dev.zio" %% "zio-test" % ZioVersion % Test,
  "dev.zio" %% "zio-test-sbt" % ZioVersion % Test,
  "dev.zio" %% "zio-test-magnolia" % ZioVersion % Test,
  "io.github.kitlangton" %% "zio-magic" % ZioMagicVersion,
  "dev.zio" %% "zio-interop-cats" % "3.1.1.0"
)

lazy val sttpBundle = Seq(
  "com.softwaremill.sttp.client3" %% "async-http-client-backend-zio" % Sttp3Version,
  "com.softwaremill.sttp.client3" %% "core" % Sttp3Version,
  "com.softwaremill.sttp.client3" %% "circe" % Sttp3Version
)

lazy val pureconfigBundle = Seq(
  "com.github.pureconfig" %% "pureconfig" % PureconfigVersion,
  "com.github.pureconfig" %% "pureconfig-sttp" % PureconfigVersion
)

lazy val tapirBundle = Seq(
  "com.softwaremill.sttp.tapir" %% "tapir-core" % TapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-zio" % TapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-zio-http4s-server" % TapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % TapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-openapi-docs" % TapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-openapi-circe-yaml" % TapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-redoc" % TapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-redoc-bundle" % TapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-refined" % TapirVersion
)

lazy val ScalaCacheBundle = Seq(
  "com.github.cb372" %% "scalacache-core" % ScalaCacheVersion,
  "com.github.cb372" %% "scalacache-caffeine" % ScalaCacheVersion
)

lazy val CirceBundle = Seq(
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-refined" % CirceVersion
)

lazy val RefinedBundle = Seq(
  "eu.timepit" %% "refined" % RefinedVersion,
  "eu.timepit" %% "refined-cats" % RefinedVersion
)

lazy val `github-graph` = (project in file("github-graph"))
  .enablePlugins(CalibanPlugin)
  .settings(
    commonSetting,
    name := "github-graph",
    libraryDependencies ++= Seq(
      "com.github.ghostdogpr" %% "caliban-client" % "1.2.4"
    )
  )

lazy val core = (project in file("core"))
  .enablePlugins(CalibanPlugin)
  .settings(
    commonSetting,
    name := "core",
    libraryDependencies ++= zioBaseBundle ++ sttpBundle ++ pureconfigBundle ++ ScalaCacheBundle ++ RefinedBundle ++ CirceBundle,
    addCompilerPlugin(
      "org.typelevel" % "kind-projector" % KindProjectorVersion cross CrossVersion.full
    ),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % BetterMonadicForVersion)
  )
  .dependsOn(`github-graph` % "compile->compile")

lazy val cli = (project in file("cli"))
  .settings(
    commonSetting,
    name := "cli",
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % LogBackVersion
    ),
    addCompilerPlugin(
      "org.typelevel" % "kind-projector" % KindProjectorVersion cross CrossVersion.full
    ),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % BetterMonadicForVersion)
  )
  .dependsOn(core % "compile->compile;test->test")

addCommandAlias("assemblyApi", ";api/assembly")

lazy val api = (project in file("api"))
  .settings(
    commonSetting,
    name := "api",
    Compile / mainClass := Some("me.rafa.githubrank.api.Main"),
    Compile / run / mainClass := Some("me.rafa.githubrank.api.Main"),
    libraryDependencies ++= zioBaseBundle ++ tapirBundle ++ CirceBundle ++ RefinedBundle ++ Seq(
      "ch.qos.logback" % "logback-classic" % LogBackVersion
    ),
    addCompilerPlugin(
      "org.typelevel" % "kind-projector" % KindProjectorVersion cross CrossVersion.full
    ),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % BetterMonadicForVersion),
    assembly / mainClass := Some("me.rafa.githubrank.api.Main"),
    assembly / assemblyJarName := "github_rank_api.jar",
    assembly / assemblyMergeStrategy := {
      case x if x.contains("io.netty.versions.properties") => MergeStrategy.discard
      case x =>
        val oldStrategy = (assembly / assemblyMergeStrategy).value
        oldStrategy(x)
    }
  )
  .dependsOn(core % "compile->compile;test->test")
