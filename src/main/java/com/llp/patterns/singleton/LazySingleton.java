package com.llp.patterns.singleton;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： 赖汉式.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
