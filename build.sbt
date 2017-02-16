name := "play-streaming-scala"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice

