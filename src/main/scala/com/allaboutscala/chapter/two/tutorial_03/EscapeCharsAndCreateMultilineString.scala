package com.allaboutscala.chapter.two.tutorial_03

// http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-escape-characters-create-multi-line-string/

object EscapeCharsAndCreateMultilineString extends App {
  println("Step 1: How to escape a Json String\nStep 2: Using backslash to escape quotes")
  val donutJson: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very tasty\",\"price\":2.50}"
  println(s"donutJson = $donutJson")

  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJsonTriple: String = """{"donut_name":"Glazed Donut","taste_level":"Verrrrry tasty","price":2.50}"""
  println(s"donutJsonTriple = $donutJsonTriple")

  println("\nStep 4:  Creating multi-line text using stripMargin")
  val donutJsonStripMargin: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """
      .stripMargin
  println(s"donutJsonStripMargin = $donutJsonStripMargin")
}
