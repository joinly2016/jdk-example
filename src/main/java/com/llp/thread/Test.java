package com.llp.thread;

/**
 * 作者： Joinly
 * 时间： 2016/8/5
 * 描述： ${todo}.
 */
public class Test {

    public static void main(String[] args) {
        Processor processor = new SynchronizedProcessor();
        for (int i = 0; i < 5; i++) {
            processor.handler("test ......");
        }
    }
}
