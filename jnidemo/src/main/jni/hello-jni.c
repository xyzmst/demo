//
// Created by mst on 15/8/12.
//
#include <jni.h>
#include "hello-jni.h"
#include <string.h>
JNIEXPORT jstring JNICALL Java_org_mst_jnidemo_MainActivity_stringFromJNI
  (JNIEnv * env , jobject object){
  (*env)->NewStringUTF(env,"hello");
}

