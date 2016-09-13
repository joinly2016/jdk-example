package com.llp.patterns.singleton;

/**
 * ���ߣ� Joinly
 * ʱ�䣺 2016/7/28
 * ������ ����ʽ.
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
