package com.llp.thread.base.lesson3;

/**
 * 作者： Joinly
 * 时间： 2016/8/16
 * 描述： ${todo}.
 */
public class User {

    private int cash;

    public User(int cash) {
        this.cash = cash;
    }

  /*  public synchronized void operation(int x) throws InterruptedException {
        Thread.sleep(100);
        this.cash += x;
        System.out.println(Thread.currentThread().getName() + "运行结束，增加“" + x + "”，当前用户账户余额为：" + cash);
        Thread.sleep(100);
    }*/

    public void operation(int x) throws InterruptedException {
        Thread.sleep(100);
        synchronized (this) {
            this.cash += x;
            System.out.println(Thread.currentThread().getName() + "运行结束，增加“" + x + "”，当前用户账户余额为：" + cash);
        }
        Thread.sleep(100);
    }
}
