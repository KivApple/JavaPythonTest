#include <stdio.h>
#include <Python.h>
#include "jni.h"

JNIEXPORT void JNICALL Java_com_eternal_1search_java_1python_1test_Main_initPython(JNIEnv *env, jclass cls) {
    Py_Initialize();
}

JNIEXPORT void JNICALL Java_com_eternal_1search_java_1python_1test_Main_deinitPython(JNIEnv *env, jclass cls) {
    Py_FinalizeEx();
}

JNIEXPORT void JNICALL Java_com_eternal_1search_java_1python_1test_Main_callPython(JNIEnv *env, jclass cls,
        jstring code) {
    const char *str = (*env)->GetStringUTFChars(env, code, 0);
	PyRun_SimpleString(str);
	(*env)->ReleaseStringUTFChars(env, code, str);
}
