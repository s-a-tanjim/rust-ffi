use jni::{JNIEnv, sys::{jobject, jint}};

#[no_mangle]
pub extern fn Java_RustWrapper_testJNIRust(_env: JNIEnv, _caller: jobject, a: jint, b: jint) -> jint
{
  return a*b;
}
