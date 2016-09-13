package com.llp.patterns.test;

/**
 * 作者： Joinly
 * 时间： 2016/7/29
 * 描述： ${todo}.
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("你tmd");
    }

    public static int aa;

    public SubClass() {
        System.out.println(" init  你tmd");
    }

    public void operate() {
        System.out.println("操作方法");
    }
}
