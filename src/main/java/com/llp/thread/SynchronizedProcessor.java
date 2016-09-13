package com.llp.thread;

/**
 * 作者： Joinly
 * 时间： 2016/8/5
 * 描述： 1、线程获取同步锁，获取失败则阻塞等待
 * 适用场景:同步获取序列号生成器，当有其他线程获取序列号时，其他线程等待.
 */
public class SynchronizedProcessor implements Processor {

    public void process(String name) {
        System.out.println(String.format("%s--开始处理,当前时间是--%d", name, System.currentTimeMillis()));
        synchronized (this) {
            System.out.println(String.format("%s--获得锁--%s", name, this.toString()));
            try {
                System.out.println(String.format("%s--开始sleep", name));
                Thread.sleep(1000);
                System.out.println(String.format("%s--结束sleep", name));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("%s--释放锁-- %s", name, this.toString()));
        System.out.println(String.format("%s--结束处理,当前时间是--%d", name, System.currentTimeMillis()));
    }

    public void handler(String name) {
        System.out.println(String.format("%s--处理中", name));
    }

}
