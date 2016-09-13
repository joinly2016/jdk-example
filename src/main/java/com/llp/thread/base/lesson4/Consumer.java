package com.llp.thread.base.lesson4;

/**
 * 作者： Joinly
 * 时间： 2016/8/17
 * 描述： 消费者.
 */
public class Consumer implements Runnable {

    private int needNumber;

    private WareHouse wareHouse;

    public Consumer(WareHouse wareHouse, int needNumber) {
        this.needNumber = needNumber;
        this.wareHouse = wareHouse;
    }

    public void run() {
        wareHouse.consume(needNumber);
    }
}
