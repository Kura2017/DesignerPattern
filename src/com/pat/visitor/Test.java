package com.pat.visitor;

public class Test {
	public static void main(String[] args) {
		SystemCenter sc = new SystemCenter();
		
		
		Systems s1= new Systems("windows7");
		Systems s2= new Systems("ubuntu14");
		Systems s3= new Systems("centOS7");
		Systems s4= new Systems("redHat");
		Systems s5= new Systems("windows10");
		
		sc.add(s1);
		sc.add(s2);
		sc.add(s3);
		sc.add(s4);
		sc.add(s5);
		
		
		Visitor admin= new AdminVisitor();
		Visitor usual= new UsualVisitor();
		//管理员用户访问所有系统
		//sc.show(admin);
		//普通用户访问所有系统
		sc.show(usual);
	}
}
