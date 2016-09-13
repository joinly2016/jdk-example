package com.llp.thread.base.lesson3;

/**
 * 作者： Joinly
 * 时间： 2016/8/16
 * 描述： ${todo}.
 */
public class Test {

    public static void main(String[] args) {
        User u = new User(100);
        Thread t1 = new Thread(new CashThread(u, +50), "Thread-A");
        Thread t2 = new Thread(new CashThread(u, +40), "Thread-B");
        Thread t3 = new Thread(new CashThread(u, +10), "Thread-C");
        Thread t4 = new Thread(new CashThread(u, -20), "Thread-D");
        Thread t5 = new Thread(new CashThread(u, +60), "Thread-E");
        Thread t6 = new Thread(new CashThread(u, -80), "Thread-F");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
