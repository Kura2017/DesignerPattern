package com.pat.stratage;
/**
 * 策略消费者
 * @author Administrator
 *
 */
public class Context {
	//策略对象
	private Stratage stratage;
	
	public void calculate() {
		//调用策略类中的具体策略
		stratage.algo();
	}
	
	//构造方法
	public Context() {}
	public Context(Stratage stratage) {
		this.stratage=stratage;
	}
		
}
