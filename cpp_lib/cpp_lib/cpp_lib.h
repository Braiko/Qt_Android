#ifndef CPP_LIB_H
#define CPP_LIB_H

#include "cpp_lib_global.h"
#include <jni.h>
#include <QString>

class CPP_LIBSHARED_EXPORT Cpp_lib
{

public:
    Cpp_lib();
    QString say(QString subject);
};

#ifdef __cplusplus
extern "C" {
#endif
    JNIEXPORT jstring JNICALL Java_penguin_in_flight_qttests_utils_JavaNatives_sayHello(JNIEnv *env, jobject obj);
#ifdef __cplusplus
}
#endif

#endif // CPP_LIB_H
