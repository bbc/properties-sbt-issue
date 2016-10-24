lazy val `properties-sbt-issue` = (project in file(".")).enablePlugins(PlayScala)

name := """properties-sbt-issue"""

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq( "org.scalacheck" %% "scalacheck" % "1.12.3" % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  