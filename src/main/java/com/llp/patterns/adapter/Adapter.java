package com.llp.patterns.adapter;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： 适配类.
 */
public class Adapter extends Adaptee implements Target {

    public void operate() {
        super.doSomthing();
    }
}

