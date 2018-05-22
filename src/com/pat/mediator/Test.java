package com.pat.mediator;

public class Test {
	public static void main(String[] args) {
		User tom = new User("tom");
		User jack = new User("jack");
		User rose = new User("rose");
		
		tom.sendMsg("rose!marry me!");
		jack.sendMsg("marry me!");
		rose.sendMsg("get out!");
		
	}
}
