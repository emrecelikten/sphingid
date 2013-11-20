package name.celikten.sphingid

import akka.actor.ActorSystem
import akka.util.Timeout

/**
 * User: emre (11/20/13 - 1:56 AM)
 */

object Concurrency {
  implicit val actorSystem = ActorSystem("main-actor-system")
  implicit val defaultTimeout = Timeout(10000)

}
