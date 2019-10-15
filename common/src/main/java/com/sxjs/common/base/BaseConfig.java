package com.sxjs.common.base;


import com.sxjs.common.base.rxjava.Environment;

/**
 * BaseConfig
 */
public class BaseConfig {
    public static int ENV = Environment.DEV;


    public static boolean isDEV() {
        return ENV == Environment.DEV;
    }

    public static boolean isProduct() {
        return ENV == Environment.PRODUCT || ENV == Environment.BAOLEI;
    }
}
