package com.llp.patterns.singleton;

/**
 * ���ߣ� Joinly
 * ʱ�䣺 2016/7/28
 * ������ ����ʽ.
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
