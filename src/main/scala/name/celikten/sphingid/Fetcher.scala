package name.celikten.sphingid

import spray.http.{HttpRequest, Uri, HttpResponse}
import spray.can.Http
import akka.io.IO
import scala.concurrent.Future
import spray.http.HttpMethods._
import akka.pattern.ask

/**
 * User: emre (11/20/13 - 1:46 AM)
 */

object Fetcher {
  import Concurrency.actorSystem
  import Concurrency.defaultTimeout

  def fetch(uri: String): Future[HttpResponse] = (IO(Http) ? HttpRequest(GET, Uri(uri))).mapTo[HttpResponse]
}
