package com.pat.decorator;

public class Test {
	public static void main(String[] args) {
		Sofa sofa = new Sofa();
		Desk desk = new Desk(sofa);
		Computer com = new Computer(desk);
		com.decorat();
	}
}
