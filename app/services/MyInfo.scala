package services

import javax.inject._

import play.api.Environment

/**
  * for Singleton without super trait, no need to use Guice bind
  *
  * @param env
  */
@Singleton
class MyInfo @Inject()(env: Environment) {

    def getInfo = {
        env.toString
    }
}
