package com.llp.thread.base.lesson4;

/**
 * 作者： Joinly
 * 时间： 2016/8/17
 * 描述： 仓库.
 */
public class WareHouse {

    //当前库存量
    private int number;
    //最大库存
    private static final int maxNumber = 20;

    public WareHouse(int number) {
        this.number = number;
    }

    public synchronized void produce(int neednum) {
        //测试是否需要生产
        while (neednum + number > maxNumber) {
            System.out.println(Thread.currentThread().getName() + "   要生产的产品数量" + neednum + "    超过剩余库存量" + (maxNumber - number) + "，  暂时不能执行生产任务!");
            try {
                //当前的生产线程等待
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //满足生产条件，则进行生产，这里简单的更改当前库存量
        number += neednum;
        System.out.println(Thread.currentThread().getName() + "   已经生产了" + neednum + "个产品， 现仓储量为" + number);
        //唤醒在此对象监视器上等待的所有线程
        notifyAll();
    }

    /**
     * 消费指定数量的产品
     *
     * @param neednum
     */
    public synchronized void consume(int neednum) {
        //测试是否可消费
        while (number < neednum) {
            try {
                //当前的生产线程等待
                System.out.println(Thread.currentThread().getName() + "   现仓储量为" + number + "    要消费了" + neednum + "个产品，所以不够，还差"+ (neednum - number) + "个, 暂时不能执行生产任务!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //满足消费条件，则进行消费，这里简单的更改当前库存量
        number -= neednum;
        System.out.println(Thread.currentThread().getName() + "   已经消费了" + neednum + "个产品，  现仓储量为" + number);
        //唤醒在此对象监视器上等待的所有线程
        notifyAll();
    }
}
