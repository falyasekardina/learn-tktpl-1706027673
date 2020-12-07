//
// Created by Falya Aqiela Sekardina on 07/12/20.
//

#include <jni.h>
#include <stdlib.h>
#include <time.h>
#include <jni.h>


//jint Jniint() {
//    srand((unsigned int) time(0));
//    int intrandom = (rand() % (990 - 101)) + 101;
//    return intrandom;
//}


JNIEXPORT jint JNICALL
Java_id_ac_ui_cs_mobileprogramming_myapp_MainActivity_Jniint(JNIEnv *env, jobject this, jint count) {
    // TODO: implement Jniint()
    return count;
}


