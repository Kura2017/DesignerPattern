package com.pat.command;

public class Test {
	public static void main(String[] args) {
		//指挥中心执行A命令
		CommandCenter APlan = new CommandCenter(new CommandA(new Receiver()));
		APlan.call();
		//指挥中心执行B命令
		CommandCenter BPlan= new CommandCenter(new CommandB(new Receiver()));
		BPlan.call();
	}
}
