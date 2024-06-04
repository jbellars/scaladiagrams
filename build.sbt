
organization := "net.invalidkeyword"

name := "scaladiagrams"

version := "1.1"

scalaVersion := "2.13.13"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0",
  "org.scalatest" % "scalatest_2.13" % "3.2.18" % "test",
  "org.rogach" %% "scallop" % "5.1.0"
)

test in assembly := {}

jarName in assembly := "scaladiagrams-assembly-1.1.jar"

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Typesafe Ivy releases" at "https://repo.typesafe.com/typesafe/ivy-releases",
  "Java.net Maven2 Repository" at "https://download.java.net/maven/2/",
  "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases",
  "AWS Bintray repo" at "https://dl.bintray.com/dwhjames/maven",
  "com-mvn" at "https://dl.bintray.com/lightbend/commercial-releases/",
)

