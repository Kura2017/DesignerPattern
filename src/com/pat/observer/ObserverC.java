package com.pat.observer;

public class ObserverC extends Observer{

	@Override
	public void update() {
		System.out.println("观察者C查看订阅的Subject公众号>>>"+subject.getArticles());
		
	}
	public ObserverC(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}

}
