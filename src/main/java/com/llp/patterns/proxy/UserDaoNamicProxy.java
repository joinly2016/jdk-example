package com.llp.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ���ߣ� Joinly
 * ʱ�䣺 2016/7/28
 * ������ ��̬����.
 */
public class UserDaoNamicProxy implements InvocationHandler {

    /**Ŀ�����**/
    private Object targetObject;

    public Object createObject(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        try {
            beforeLog();
            //obj�� Ŀ�����--->�������ķ���ֵ--->���ظ������ߵ���Ϣ
            //this.invoke("Ŀ�����","��������Ŀ����󴫵ݲ���");
            //����Ŀ������з���
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
