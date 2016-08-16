package com.zys.ndkjnitest;

/**
 * Created by zhuys on 2016/8/16 0016.
 */

public class NdkJniUtils {
    static {
        System.loadLibrary("NdkJniUtils");   //defaultConfig.ndk.moduleName
    }

    public native String getCLanguageString();
}
