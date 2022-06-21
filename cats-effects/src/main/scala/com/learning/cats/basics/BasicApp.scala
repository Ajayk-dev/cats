package com.learning.cats.basics

import cats.effect.{ExitCode, IO, IOApp}

/**
 * Created by Ajay on Jun 21, 2022.
 */
object BasicApp extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = {
    val io = IO(println("This is cat-effect app"))
    io.map(_ => ExitCode.Success)
  }
}
