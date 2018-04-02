name := """play-java-jpa-example"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"
Common.settings

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean).
  aggregate(`identity`).
  dependsOn(`identity`)



lazy val `nova` =  (project in file("src/nova")).enablePlugins(PlayJava).
  aggregate(`common`).
  dependsOn(`common`).
  settings(publishArtifact in (Compile,packageDoc) :=false,
    publishArtifact in packageDoc :=false,
    sources in (Compile,doc) :=Seq.empty
  )

lazy val `identity` =  (project in file("src/identity")).enablePlugins(PlayJava).
  aggregate(`common`).
  dependsOn(`common`).
  settings(publishArtifact in (Compile,packageDoc) :=false,
    publishArtifact in packageDoc :=false,
    sources in (Compile,doc) :=Seq.empty
  )

val `common` =  (project in file("src/common")).enablePlugins(PlayJava,PlayEbean)

libraryDependencies ++= Common.play_dependencies

RjsKeys.baseUrl:="javascripts/app"
/*
libraryDependencies += "org.hibernate" % "hibernate-core" % "5.2.5.Final"
libraryDependencies += "mysql" %"mysql-connector-java"%"5.1.43"
libraryDependencies += "org.hibernate"%"hibernate-entitymanager"%"5.2.5.Final"
libraryDependencies +="org.hibernate"%"hibernate-java8"%"5.2.5.Final"
libraryDependencies +="org.hibernate"%"hibernate-jpamodelgen"%"5.2.5.Final"
libraryDependencies +="com.typesafe.play"%"play_2.11"%"2.5.18"
libraryDependencies += "org.scala-lang.modules"%"scala-java8-compat_2.11"%"0.7.0"
libraryDependencies += "javax.inject" %"javax.inject"%"1"
libraryDependencies += "com.google.inject" %"guice" %"4.0"
libraryDependencies += "org.slf4j" %"slf4j-api"%"1.7.12"
libraryDependencies += filters

libraryDependencies += "org.webjars" % "angularjs" %"1.4.1"
libraryDependencies += "org.webjars" % "bootstrap" %"3.3.5"
libraryDependencies += "org.webjars" % "requirejs" %"2.1.18"
libraryDependencies += "org.webjars" % "angular-ui-bootstrap" %"0.13.0"
libraryDependencies += "org.webjars" % "angular-dragdrop"%"1.0.8"
libraryDependencies += "org.webjars" % "jquery-i18n-properties"%"1.0.9"
libraryDependencies += "org.webjars" % "typescript"%"1.5.3"


libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % "test"
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % "test"
libraryDependencies += "org.mockito" % "mockito-core" % "2.1.0" % "test"
testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
*/
