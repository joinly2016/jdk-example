package com.llp.thread;

/**
 * 作者： Joinly
 * 时间： 2016/8/5
 * 描述： 线程获取同步锁后，因为其他资源不满足结束线程
 * 适用场景: 即使通讯中，接收者获取同步锁发现队列无数据时，释放锁结束线程.
 */
public class SynchronizedWaitReadProcessor implements Processor {

    public void process(String name) {
        System.out.println(String.format("%s开始处理,当前时间是%d", name, System.currentTimeMillis()));
        synchronized (SynchronizedWaitWriteProcessor.content) {
            System.out.println(String.format("%s获得锁%s", name, this.toString()));

            if (SynchronizedWaitWriteProcessor.content.size() != 0) {
                System.out.println(String.format("%s开始读出信息", name));

                for (int i = 0; i < SynchronizedWaitWriteProcessor.content.size(); i++) {
                    System.out.println("读出信息:" + SynchronizedWaitWriteProcessor.content.get(i));
                }
                System.out.println(String.format("%s结束读出信息", name));
            }
            SynchronizedWaitWriteProcessor.content.notify();
        }
        System.out.println(String.format("%s释放锁%s", name, this.toString()));
        System.out.println(String.format("%s结束处理,当前时间是%d", name, System.currentTimeMillis()));
    }

    public void handler(String name) {
    }
}
