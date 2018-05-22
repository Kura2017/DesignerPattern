package com.pat.bridge;

public class Test {
	public static void main(String[] args) {
		Red red = new Red();
		Squre sq = new Squre(red);
		sq.draw();
	}
}
