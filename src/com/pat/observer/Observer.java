package com.pat.observer;
/**
 * 观察者
 * @author Administrator
 *
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
