package com.pat.observer;

public class Test {
	public static void main(String[] args) {
		Subject sub = new Subject();
		new  ObserverA(sub);
		new  ObserverB(sub);
		new  ObserverC(sub);
		
		sub.setArticles("Subject更新文章《如何高效装逼》");
	}
}
