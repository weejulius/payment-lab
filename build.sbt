organization := "com.thenetcircle.services"

name := "payment"

version := "3.0.0"

scalaVersion := "2.10.0-RC1"
 
 resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

 resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                     "releases" at "http://oss.sonatype.org/content/repositories/releases")

externalResolvers ++= Seq("local repository" at "file:///home/wee/.m2/repository")

 libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.13-SNAPSHOT" % "test"
    )

 libraryDependencies +=
 "com.typesafe.akka" %% "akka-actor" % "2.1.0-RC1" cross CrossVersion.full

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.M4" % "test" cross CrossVersion.full

libraryDependencies += "info.cukes" % "cucumber-core" % "1.1.1" % "test" 

libraryDependencies += "info.cukes" % "cucumber-junit" % "1.1.1" % "test" 

libraryDependencies += "info.cukes" % "cucumber-scala" % "1.1.1" % "test" 

libraryDependencies += "junit" % "junit" % "4.10" % "test" 

libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.10.0-RC1" % "test"  

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.0-RC1" % "test" 

 seq(cucumberSettings : _*)

 cucumberStepsBasePackage := "test"

 cucumberHtmlReport := true
