package com.llp.thread.base.lesson2;

/**
 * 作者： Joinly
 * 时间： 2016/8/16
 * 描述： ${todo}.
 */
public class MyRunnable implements Runnable {

    Foo foo = new Foo();


    public void run() {
        foo.fix(20);
    }

/*
    public void run () {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                foo.fix(20);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": 当前foo对象的x值 = " + foo.getX());
            }
        }
    }
    */
}
