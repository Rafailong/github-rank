val CirceVersion = "0.14.1"

lazy val commonSetting = Seq(
  organization := "me.rafa",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.13.6"
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
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-generic" % CirceVersion
    )
  )
  .dependsOn(`github-graph` % "compile->compile")

lazy val cli = (project in file("cli"))
  .enablePlugins(CalibanPlugin)
  .settings(
    commonSetting,
    name := "cli"
  )
  .dependsOn(core % "compile->compile;test->test")

lazy val api = (project in file("api"))
  .enablePlugins(CalibanPlugin)
  .settings(
    commonSetting,
    name := "api"
  )
