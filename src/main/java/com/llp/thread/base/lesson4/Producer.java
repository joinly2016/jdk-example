package com.llp.thread.base.lesson4;

/**
 * 作者： Joinly
 * 时间： 2016/8/17
 * 描述： 生产者.
 */
public class Producer implements Runnable {

    private int needNumber;

    private WareHouse wareHouse;

    public Producer(WareHouse wareHouse, int needNumber) {
        this.needNumber = needNumber;
        this.wareHouse = wareHouse;
    }

    public void run() {
        wareHouse.produce(needNumber);
    }
}
