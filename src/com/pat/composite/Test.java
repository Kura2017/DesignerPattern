package com.pat.composite;

public class Test {
	public static void main(String[] args) {
		System.out.println("===========================");
		Composite green = new GreenLeaf();
		green.operation();
		System.out.println("===========================");
		Composite yellow = new YellowLeaf();
		yellow.operation();
		System.out.println("===========================");
		Composite branch = new Branch();
		branch.operation();
		System.out.println("===========================");
	}
}
