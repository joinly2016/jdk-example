package com.llp.patterns.proxy;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： ${todo}.
 */
public class UserDaoImpl implements UserDao {

    public void add(String name) {
        System.out.println("添加用户=======" + name);
    }

    public void get(String name) {
        System.out.println("获取用户=======" + name);
    }
}
