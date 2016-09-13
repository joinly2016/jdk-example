package com.llp.thread.base.lesson1;

/**
 * 作者： Joinly
 * 时间： 2016/8/15
 * 描述： ${todo}.
 */
public class DoRunnable implements Runnable {

    private String name;

    public DoRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            for (int j = 0; j < 100000000; j++);
            System.out.println(name + "-----" + i);
        }
    }
}
