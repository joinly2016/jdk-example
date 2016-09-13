package com.llp.thread.base.lesson1;

/**
 * 作者： Joinly
 * 时间： 2016/8/15
 * 描述： ${todo}.
 */
public class DoThread extends Thread {

    private String name;

    public DoThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 100000000; j++);
            System.out.println(name + "-----" + i);
        }
    }

}
