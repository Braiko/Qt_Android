#include "cpp_lib.h"


Cpp_lib::Cpp_lib()
{
}



JNIEXPORT jstring JNICALL Java_penguin_in_flight_qttests_utils_JavaNatives_sayHello(JNIEnv *env, jobject obj){
    return  env->NewStringUTF("Qt say :\"Hello android!!!\"");
}
