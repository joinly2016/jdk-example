package com.llp.patterns.singleton;

/**
 * ���ߣ� Joinly
 * ʱ�䣺 2016/7/28
 * ������ վλ��ʽ.
 */
public class PlaceholderSingleton {

    private PlaceholderSingleton() {

    }

    private static class SingletonHolder {
        private static final PlaceholderSingleton placeholderSingleton = new PlaceholderSingleton();
    }

    public static PlaceholderSingleton getInstance() {
        return SingletonHolder.placeholderSingleton;
    }
}
