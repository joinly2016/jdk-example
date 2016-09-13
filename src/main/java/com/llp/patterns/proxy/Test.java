package com.llp.patterns.proxy;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： ${todo}.
 */
public class Test {

    public static void main(String[] args) {
        //staticProxy();
        namicProxy();
    }

    /**静态代理**/
    public static void staticProxy() {
        UserDao userDao = new UserDaoStaticProxyImpl(new UserDaoImpl());
        userDao.add("李连平");
        userDao.get("八路");
    }

    /**动态代理**/
    public static void namicProxy() {
        UserDaoNamicProxy userDaoNamicProxy = new UserDaoNamicProxy();
        UserDao userDao = (UserDao) userDaoNamicProxy.createObject(new UserDaoImpl());
        userDao.add("李连平");
        //userDao.get("红军");
    }
}
