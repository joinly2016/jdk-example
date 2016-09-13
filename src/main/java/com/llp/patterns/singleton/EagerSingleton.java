package com.llp.patterns.singleton;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： 饿汉式.
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
