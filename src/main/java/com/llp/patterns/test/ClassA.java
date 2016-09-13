package com.llp.patterns.test;

/**
 * 作者： Joinly
 * 时间： 2016/8/4
 * 描述： ${todo}.
 */
public class ClassA {

    public ClassA() {
        System.out.println("hello A");
    }

    {
        System.out.println("Im class A");
    }

    static {
        System.out.println("class A");
    }
}
