package com.llp.patterns.adapter;

/**
 * ���ߣ� Joinly
 * ʱ�䣺 2016/7/28
 * ������ ��������.
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
