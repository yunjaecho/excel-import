name := "excel-import"

version := "0.1"

scalaVersion := "2.12.5"

unmanagedBase := baseDirectory.value / "libs"

unmanagedJars in Compile := (baseDirectory.value ** "*.jar").classpath

libraryDependencies ++= Seq(
  "com.github.ozlerhakan" % "poiji" % "1.11",
  "org.hibernate" % "hibernate-entitymanager" % "5.2.16.Final",
  "com.typesafe" % "config" % "1.3.3",
  "commons-io" % "commons-io" % "2.6",
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
)
