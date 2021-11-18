lazy val commonSetting = Seq(
  organization := "me.rafa",
  name := "github-rank",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.13.6"
)

lazy val `github-client` = (project in file("github-client"))
  .enablePlugins(CalibanPlugin)
  .settings(
    commonSetting
  )

lazy val cli = (project in file("cli"))
  .enablePlugins(CalibanPlugin)
  .settings(
    commonSetting
  )

lazy val api = (project in file("api"))
  .enablePlugins(CalibanPlugin)
  .settings(
    commonSetting
  )