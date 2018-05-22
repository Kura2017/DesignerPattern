package com.pat.stratage;

public class TestStratage {
	public static void main(String[] args) {
		//生产策略A对象
		Stratage str = new StratageA();
		//构造消费者对象
		Context con = new Context(str);
		//调用方法
		con.calculate();
		
		//生产策略B对象
		Stratage str2 = new StratageB();
		//构造消费者对象
		Context con2 = new Context(str2);
		//调用方法
		con2.calculate();
	}
}
