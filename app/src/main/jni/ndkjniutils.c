#include "com_zys_ndkjnitest_NdkJniUtils.h"
/*
 * Class:     io_github_yanbober_ndkapplication_NdkJniUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_io_github_yanbober_ndkapplication_NdkJniUtils_getCLanguageString
        (JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
}