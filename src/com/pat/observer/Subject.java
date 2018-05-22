package com.pat.observer;
/**
 * 被观察者-模仿公众号
 * @author Administrator
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Subject {
	//即将更新的头条文章
	private String articles;
	//持有观察者集合
	private List<Observer> observers=new ArrayList<>();
	
	
	public String getArticles() {
		return articles;
	}
	public void setArticles(String articles) {
		this.articles = articles;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for(Observer obs:observers) {
			obs.update();
		}
	}
}
