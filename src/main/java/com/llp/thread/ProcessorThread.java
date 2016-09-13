package com.llp.thread;

/**
 * 作者： Joinly
 * 时间： 2016/8/5
 * 描述： ${todo}.
 */
public class ProcessorThread extends Thread {

    private String name;

    private Processor processor;

    public ProcessorThread(String name, Processor processor) {
        this.name = name;
        this.processor = processor;
    }

    @Override
    public void run() {
        processor.process(name);
    }
}
