package com.swoval

import org.scalatest.{ FlatSpec, Matchers }
import utest._

object AkkaPerfTest extends TestSuite {
  val tests = Tests {
    'run - {
      AkkaTest.main(Array.empty[String])
      1 ==> 1
    }
  }
}
