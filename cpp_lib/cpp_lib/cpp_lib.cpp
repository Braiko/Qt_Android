#include "cpp_lib.h"


Cpp_lib::Cpp_lib()
{
}

QString Cpp_lib::say(QString subject)
{
    QString result = QString("Qt say \" %1 \"").arg(subject);
    return result;
}

JNIEXPORT jstring JNICALL Java_penguin_in_flight_qttests_utils_JavaNatives_sayHello(JNIEnv *env, jobject obj){
    Cpp_lib *lib = new Cpp_lib();
    return  env->NewStringUTF(lib->say("Hello android!!!").toLatin1().data());
}
