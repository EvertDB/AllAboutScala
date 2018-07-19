package com.allaboutscala.chapter.one.tutorial_10

// http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/getting-started-sbt-import-dependencies-build-sbt/
import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLogging extends App with LazyLogging {
  logger.info("Hello World from Scala Logging!")
}
