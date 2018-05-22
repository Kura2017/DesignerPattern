package com.pat.observer;

public class ObserverA extends Observer{

	@Override
	public void update() {
		System.out.println("观察者A查看订阅的Subject公众号>>>"+subject.getArticles());
		
	}
	public ObserverA(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

}
