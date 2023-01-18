import uniffi.math.testUniffi;

fun main(args: Array<String>) {
  println("Hello, world! ${args}")
  val ret = testUniffi(4u, 5u);
  println("Kotline output: ${ret}")
}

