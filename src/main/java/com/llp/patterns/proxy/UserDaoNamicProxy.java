package com.llp.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： 动态代理.
 */
public class UserDaoNamicProxy implements InvocationHandler {

    /**目标对象**/
    private Object targetObject;

    public Object createObject(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        try {
            beforeLog();
            //obj： 目标对象--->代理对象的返回值--->返回给调用者的信息
            //this.invoke("目标对象","代理对象给目标对象传递参数");
            //调用目标对象中方法
            obj = method.invoke(targetObject, args);
            afterLog();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void beforeLog() {
        System.out.println("==========aaa===============");
    }

    public void afterLog() {
        System.out.println("==========bbb===============");
    }
}
