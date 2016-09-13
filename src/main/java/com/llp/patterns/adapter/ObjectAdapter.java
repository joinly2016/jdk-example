package com.llp.patterns.adapter;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： 对象适配.
 */
public class ObjectAdapter implements Target {

    private Adaptee source;

    public ObjectAdapter(Adaptee source) {
        this.source = source;
    }

    public void operate() {
        source.doSomthing();
    }
}
