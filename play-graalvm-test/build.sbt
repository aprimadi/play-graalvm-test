name := """play-graalvm-test"""
organization := "com.dexcode"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.5"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.3.7" % "provided"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.dexcode.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.dexcode.binders._"
