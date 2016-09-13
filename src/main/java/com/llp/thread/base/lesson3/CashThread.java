package com.llp.thread.base.lesson3;

/**
 * 作者： Joinly
 * 时间： 2016/8/16
 * 描述： ${todo}.
 */
public class CashThread implements Runnable {

    private User user;

    private int num;

    public CashThread(User user, int num) {
        this.user = user;
        this.num = num;
    }

    public void run() {
        try {
            user.operation(num);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
