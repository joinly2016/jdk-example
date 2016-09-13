package com.llp.thread.base.lesson2;

/**
 * 作者： Joinly
 * 时间： 2016/8/16
 * 描述： ${todo}.
 */
public class Test {

    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my, "Thread-A");
        Thread t2 = new Thread(my, "Thread-B");
        t1.start();
        t2.start();
    }
}
