import java.io.File;

class RustWrapper
{
  public native int testJNIRust(int a, int b);
}

public class Main
{
  static {
    System.loadLibrary("jni_tutorial");
  }

  public static void main(String[] args)
  {
    new Main().init();
  }

  public void init()
  {
    System.out.printf("Java output: %d\n", new RustWrapper().testJNIRust(4, 5));
  }

}
