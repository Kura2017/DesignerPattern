package com.pat.observer;

public class ObserverB extends Observer{

	@Override
	public void update() {
		System.out.println("观察者B查看订阅的Subject公众号>>>"+subject.getArticles());
		
	}
	public ObserverB(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

}
