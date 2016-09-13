package com.llp.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 作者： Joinly
 * 时间： 2016/7/29
 * 描述： ${todo}.
 */
public class ReflectAttack {

    public static void main(String[] args) {
        try {
            Class<?> classType = AttackSingleton.class;

            Constructor c = classType.getDeclaredConstructor(null);
            c.setAccessible(true);
            AttackSingleton attackSingleton = (AttackSingleton) c.newInstance();
            AttackSingleton attackSingleton1 = AttackSingleton.getInstance();

            System.out.println(attackSingleton == attackSingleton1);
            //输出false　说明反射后生成一个新的对象。

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
