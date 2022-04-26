package cn.mmooo

import cn.mmooo.verticle.*
import io.vertx.core.*


suspend fun main() {
  val vertx = Vertx.vertx()
  vertx.deployVerticle(
    StompBridgeVerticle::class.java.name,
    DeploymentOptions().apply {
      instances = 8
    })

}
