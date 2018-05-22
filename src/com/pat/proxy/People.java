package com.pat.proxy;
/**
 * 本类中
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 被代理类接口
 */
public interface People {
    public int getNum() ;
}

/**
 * 被代理类实现类
 */
class Peopleimpl implements People{
     private int num=100;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
/**
 *代理类，需要实现InvocationHandler接口
 */
class MyInv implements InvocationHandler{
    //被代理对象
    Object obj;

    public  MyInv(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        return result;
    }
}