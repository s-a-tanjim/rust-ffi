class RustWrapper {
  external fun testJNIRust(a: Int, b: Int): Int
}

fun main() {
  System.loadLibrary("jni_tutorial")
  val ret = RustWrapper().testJNIRust(4, 5);

  println("Kotline output: ${ret}")
}
