import play.Project._

name := "PatchR_Dev"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

play.Project.playScalaSettings

play.Keys.lessEntryPoints <<= baseDirectory(_/"app" / "assets" / "stylesheets"**"main.less")
