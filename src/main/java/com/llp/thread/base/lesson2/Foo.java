package com.llp.thread.base.lesson2;

/**
 * 作者： Joinly
 * 时间： 2016/8/16
 * 描述： ${todo}.
 */
public class Foo {

    private int x = 100;

    public int getX() {
        return x;
    }
/*
    public void fix(int y) {
        x = x - y;
    }
    */


    public synchronized void fix(int y) {
        for (int i = 0; i < 3; i++) {
            x = x - y;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": 当前foo对象的x值 = " + getX());
        }
    }

}
