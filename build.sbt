name := "PatchR_Dev"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
//  "jp.t2v" % "play2-auth_2.10" % "0.12.0",
//  "jp.t2v" % "play2-auth-test_2.10" % "0.12.0"
//  "jp.t2v" %% "play2-auth"      % "0.12.0"
  //"jp.t2v" %% "play2-auth-test" % "0.12.0" % "test"
)

play.Project.playScalaSettings

play.Keys.lessEntryPoints <<= baseDirectory(_/"app" / "assets" / "stylesheets"**"main.less")
