package com.llp.thread.base.lesson4;

/**
 * 作者： Joinly
 * 时间： 2016/8/5
 * 描述： ${todo}.
 */
public class Test {

    public static void main(String[] args) {

        WareHouse wareHouse = new WareHouse(18);
        Producer producer1 = new Producer(wareHouse, 6);
        Producer producer2 = new Producer(wareHouse, 5);

        Consumer consumer1 = new Consumer(wareHouse, 22);
        Consumer consumer2 = new Consumer(wareHouse, 6);

        Thread t1 = new Thread(producer1, "第一个生产者");
        Thread t2 = new Thread(producer2, "第二个生产者");

        Thread t3 = new Thread(consumer1, "第一个消费者");
        Thread t4 = new Thread(consumer2, "第二个消费者");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
