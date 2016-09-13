package com.llp.patterns.proxy;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： 代理类.
 */
public class UserDaoStaticProxyImpl implements UserDao {

    // 创建目标对象
    private UserDao userDao;

    public UserDaoStaticProxyImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(String name) {
        beforeLog();
        userDao.add(name);
        afterLog();
    }

    public void get(String name) {
        beforeLog();
        userDao.get(name);
        afterLog();
    }

    public void beforeLog() {
        System.out.println("==========开始执行===============");
    }

    public void afterLog() {
        System.out.println("==========执行结束===============");
    }
}
