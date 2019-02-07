package com.swoval

import akka.actor.ActorSystem
import scala.concurrent.Await
import scala.concurrent.duration._

object AkkaTest {
  def main(args: Array[String]): Unit = {
    val now = System.nanoTime
    val system = ActorSystem("akka")
    Await.result(system.terminate(), 5.seconds)
    val elapsed = System.nanoTime - now
    println(s"Took ${elapsed / 1.0e6} ms to run main")
  }
}
