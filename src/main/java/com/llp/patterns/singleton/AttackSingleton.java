package com.llp.patterns.singleton;

/**
 * 作者： Joinly
 * 时间： 2016/7/29
 * 描述： ${todo}.
 */
public class AttackSingleton {

    private static boolean flag = false;

    private AttackSingleton() {
        //防止反射生成新的对象
        synchronized (AttackSingleton.class) {
            if (!flag) {
                flag = !flag;
            } else {
                throw new RuntimeException("单例模式被侵犯！");
            }
        }
    }

    private static class SingletonHolder {
        private static AttackSingleton INSTANCE =  new AttackSingleton();
    }

    public static AttackSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
