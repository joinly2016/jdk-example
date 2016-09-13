package com.llp.patterns.test;

/**
 * 作者： Joinly
 * 时间： 2016/7/29
 * 描述： ${todo}.
 */
public class StaticTest {

    public static void main(String[] args) {
        staticFunction();
    }

    static StaticTest st = new StaticTest();

    {
        System.out.println("2");
    }

    static {
        System.out.println("1");
    }

    StaticTest() {
        System.out.println("3");
        System.out.println("a = " + a +" , b = " + b);
    }

    public static void staticFunction() {
        System.out.println("4");
    }

    int a = 110;

    static int b = 112;
}
