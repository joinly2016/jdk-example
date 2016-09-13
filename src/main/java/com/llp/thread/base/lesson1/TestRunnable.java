package com.llp.thread.base.lesson1;

/**
 * 作者： Joinly
 * 时间： 2016/8/15
 * 描述： ${todo}.
 */
public class TestRunnable {

    public static void main(String[] args) {
        DoRunnable do1 = new DoRunnable("刘备");
        DoRunnable do2 = new DoRunnable("关羽");

        Thread t1 = new Thread(do1);
        Thread t2 = new Thread(do2);
        t1.start();
        t2.start();
    }
}
