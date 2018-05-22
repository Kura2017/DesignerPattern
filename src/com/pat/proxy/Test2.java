package com.pat.proxy;

import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * 测试类：
 * 补充，非空判断这么用比较装逼：
 * People p2=null;
 * Objects.requireNonNull(p2,"第二个对象不能为空");
 */
public class Test2 {
    public static void main(String[] args) {
        //动态代理有JDK和CGLIB两种工具，cglib是更底层的写法，所以效率会高一些
        People p = new Peopleimpl();
        //真正的代理者。
        MyInv my = new MyInv(p);
        //第一个参数是类加载器，第二个参数是这个代理者实现哪些接口(与被代理者实现的是相同的接口)
        People pp= (People)Proxy.newProxyInstance(p.getClass().getClassLoader(),p.getClass().getInterfaces(),my);
        System.out.println(pp.getNum());




    }
}
