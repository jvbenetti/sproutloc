package com.example.sproutloc

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  val run = SproutlocServer.run[IO]
}
