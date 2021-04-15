package pgt.app

import org.graalvm.polyglot.Context

class GraalTest {
  def run(): Unit = {
    val context = Context.create()
    context.eval("js", "print('Hello JavaScript!')")
  }
}

object GraalTest {
  def main(args: Array[String]): Unit = {
    val test = new GraalTest
    test.run()
  }
}

