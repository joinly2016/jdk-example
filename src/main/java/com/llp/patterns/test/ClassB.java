package com.llp.patterns.test;

/**
 * 作者： Joinly
 * 时间： 2016/8/4
 * 描述： ${todo}.
 */
public class ClassB extends ClassA {

    public ClassB() {
        System.out.println("hello B");
    }

    {
        System.out.println("Im class B");
    }

    static {
        System.out.println("class B");
    }

    public static void main(String[] args) {
        new ClassB();
    }
}
