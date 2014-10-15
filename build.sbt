name := "medication"

organization := "com.rosales"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.1"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

seq(webSettings :_*)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.6-RC1"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile",
    "net.liftmodules" %% "lift-jquery-module_2.6" % "2.8",
    "org.specs2" %% "specs2" % "2.3.12" % "test",
    "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % 
      "container,test",
    "org.eclipse.jetty" % "jetty-plus" % "8.1.7.v20120910"  % "container,test", // For Jetty Config
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % 
      "container,compile" artifacts Artifact("javax.servlet", "jar", "jar"),
    "com.h2database" % "h2" % "1.3.167",
    "ch.qos.logback" % "logback-classic" % "1.0.6"
  )
}


