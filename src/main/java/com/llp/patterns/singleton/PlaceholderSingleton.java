package com.llp.patterns.singleton;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： 站位符式.
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
