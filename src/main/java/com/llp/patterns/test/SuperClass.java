package com.llp.patterns.test;

/**
 * 作者： Joinly
 * 时间： 2016/7/29
 * 描述： ${todo}.
 */
public class SuperClass extends SSClass{

    static {
        System.out.println("你爹爹");
    }

    public static int aa = 123;

    public SuperClass() {
        System.out.println("你爹的构造方法");
    }
}
