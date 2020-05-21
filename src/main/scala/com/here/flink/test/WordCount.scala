package com.here.flink.test

import org.apache.flink.api.scala.ExecutionEnvironment
import org.apache.flink.api.scala._

object WordCount {

    def main(args: Array[String]) {
      val env = ExecutionEnvironment.getExecutionEnvironment
      val text = env.fromElements(
        "Who's there?",
        "I think I hear them. Stand, ho! Who's there?")

      val counts = text.flatMap { _.toLowerCase.split("\\W+") filter { _.nonEmpty } }
        .map { (_, 1) }
        .groupBy(0)
        .sum(1)

      println("Printing result to stdout. Use --output to specify output path.")
      counts.collect()
      println("for testing")

    }
}
