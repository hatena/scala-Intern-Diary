package interndiary.cli

import scala.sys.process

object DiaryCLI {
  def main(args: Array[String]): Unit = {
    val exitStatus = run(args)
    sys.exit(exitStatus)
  }

  def run(args: Array[String]): Int = {
    // TODO: implement
    help()
  }

  def help(): Int = {
    process.stderr.println(
      """
        | usage:
        |   run add url [comment]
        |   run list
        |   run delete url
      """.stripMargin)
    1
  }
}
