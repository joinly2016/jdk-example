package com.llp.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 作者： Joinly
 * 时间： 2016/8/5
 * 描述： 线程获取同步锁，获取失败则结束
 * 适用场景: 定时任务，前一个处理线程未完成时，新线程不能获取锁则直接结束.
 */
public class LockFailCloseProcessor implements Processor {

    private static Lock lock = new ReentrantLock();

    public void process(String name) {
        System.out.println(String.format("%s--开始处理,当前时间是--%d", name, System.currentTimeMillis()));

        if (lock.tryLock()) {
            System.out.println(String.format("%s--获得锁--%s", name, this.toString()));
            try {
                System.out.println(String.format("%s--开始sleep", name));
                Thread.sleep(1000);
                System.out.println(String.format("%s--结束sleep", name));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
            System.out.println(String.format("%s--释放锁--%s", name, this.toString()));
        } else {
            System.out.println(String.format("%s--没有获得锁直接退出", name));
        }

        System.out.println(String.format("%s--结束处理,当前时间是--%d", name, System.currentTimeMillis()));

    }

    public void handler(String name) {

    }
}
