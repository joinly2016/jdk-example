package com.llp.thread.base.lesson1;

/**
 * 作者： Joinly
 * 时间： 2016/8/15
 * 描述： ${todo}.
 */
public class TestThread {

    public static void main(String[] args) {
        DoThread t1 = new DoThread("曹操");
        DoThread t2 = new DoThread("孙权");

        t1.start();
        t2.start();
    }
}
