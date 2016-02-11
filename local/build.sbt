name := "My Project"
 
version := "1.0"
 
scalaVersion := "2.11.7"
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "latest.integration" 
libraryDependencies += "com.typesafe.akka" % "akka-remote_2.11" % "latest.integration"