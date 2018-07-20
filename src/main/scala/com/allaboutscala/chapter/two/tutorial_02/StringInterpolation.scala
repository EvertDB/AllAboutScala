package com.allaboutscala.chapter.two.tutorial_02

// http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-string-interpolation-print-format-variables/

object StringInterpolation extends App {
  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")

  println("\nStep 2: Using String interpolation on object properties")
  case class Donut(name: String, tasteLevel: String)
  val favDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favDonut2.name}, tasteLevel = ${favDonut2.tasteLevel}")

  println("\nStep 3: Using String interpolation to evaluate expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts = ${qtyDonutsToBuy==10}")

  println("\nStep 4: Using String interpolation for formatting text")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")

  println("\nStep 5: Using s vs f interpolation to format numbers")
  val donutPrice: Double = 2.50
  println(s"s: Donut price = $donutPrice")
  println(f"f: Donut price = $donutPrice%.2f")

  println("\nStep 6: Using raw interpolation")
  println(s"Without raw: Favorite donut\t$donutName")
  println(raw"With    raw: Favorite donut\t$donutName")
}
