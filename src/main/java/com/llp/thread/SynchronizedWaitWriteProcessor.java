package com.llp.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 作者： Joinly
 * 时间： 2016/8/5
 * 描述： 线程获取同步锁后，因为其他资源不满足暂时释放同步锁，等待唤醒
 * 适用场景: 即使通讯中，发送者获取同步锁发现队列写满时，释放锁等待接收者读取数据.
 */
public class SynchronizedWaitWriteProcessor implements Processor {

    private static int maxSize = 5;
    public static List<String> content = new ArrayList<String>();

    public void process(String name) {
        System.out.println(String.format("%s开始处理,当前时间是%d", name, System.currentTimeMillis()));
        synchronized (content) {
            System.out.println(String.format("%s获得锁%s", name, this.toString()));
            try {
                if (content.size() == maxSize) {
                    System.out.println(String.format("%s临时释放锁%s", name, this.toString()));
                    //等待
                    content.wait();
                }

                System.out.println(String.format("%s开始写入信息", name));
                Random random = new Random();
                for (int i = 0; i < maxSize; i++) {
                    content.add(String.format("%d写入的信息", random.nextInt(100)));
                }
                System.out.println(String.format("%s结束写入信息", name));
            } catch (Exception e) {
                e.printStackTrace();
            }
            //唤醒
            content.notify();
        }
        System.out.println(String.format("%s释放锁%s", name, this.toString()));
        System.out.println(String.format("%s结束处理,当前时间是%d", name, System.currentTimeMillis()));
    }

    public void handler(String name) {

    }
}
