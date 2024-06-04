addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Typesafe Ivy releases" at "https://repo.typesafe.com/typesafe/ivy-releases",
  "Java.net Maven2 Repository" at "https://download.java.net/maven/2/",
  "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases",
  "AWS Bintray repo" at "https://dl.bintray.com/dwhjames/maven",
  "com-mvn" at "https://dl.bintray.com/lightbend/commercial-releases/",
  "artifactory" at "https://scala.jfrog.io/ui/native/sbt-plugin-releases/com.eed3si9n/sbt-assembly",
)
