package com.llp.thread;

/**
 * 作者： Joinly
 * 时间： 2016/8/5
 * 描述： ${todo}.
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        /*
        //测试SynchronizedProcessor
        Processor processor = new SynchronizedProcessor();
        for (int i = 0; i < 5; i++) {
            ProcessorThread threadProcessor = new ProcessorThread("name" + i, processor);
            threadProcessor.start();
        }
        System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
        for (int i = 0; i < 5; i++) {
            processor.handler("test " + i);
        }
        */
/*
        Processor processor = new LockFailCloseProcessor();
        for (int i = 0; i < 3; i++) {
            ProcessorThread threadProcessor = new ProcessorThread("name" + i, processor);
            threadProcessor.start();
        }
*/

        //读content
        Processor readProcessor = new SynchronizedWaitReadProcessor();
      /*
        ProcessorThread readThreadProcessor = new ProcessorThread("read", readProcessor);
        readThreadProcessor.start();*/

        //写content
        Processor writeProcessor = new SynchronizedWaitWriteProcessor();
        ProcessorThread writeThreadProcessor = new ProcessorThread("write", writeProcessor);
        writeThreadProcessor.start();
        Thread.sleep(100);

        //读content
        ProcessorThread read2ThreadProcessor = new ProcessorThread("read2", readProcessor);
        read2ThreadProcessor.start();
    }
}
