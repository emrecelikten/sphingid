package name.celikten.sphingid

import scala.concurrent.Await
import scala.concurrent.duration._

object Main extends App {
  println("Hello. Fetching emre.celikten.name...")
  val future = Fetcher.fetch("http://emre.celikten.name")

  val result = Await.result(future, 10.seconds)

  println("Result: " + result.status)
  println("Content: " + result.entity.asString)

  Concurrency.actorSystem.shutdown()
}
