package com.pat.decorator;
/**
 * 装饰类接口-所有装饰类实现本接口
 * @author ZX
 *
 */
public interface Decorator{
	void decorat();
}

/**
 * 下面是所有的装饰对象，各自持有一个（根据实际情况）装饰对象
 * @author ZX
 * 
 *
 */
class Sofa implements Decorator{
	private Decorator decorator;

	@Override
	public void decorat() {
		if(decorator!=null)
		decorator.decorat();
		System.out.println("装沙发");
		
	}
	public Sofa() {}
	public Sofa(Decorator decorator) {
		this.decorator=decorator;
	}
	
}
class Desk implements Decorator{
	private Decorator decorator;
	@Override
	public void decorat() {
		if(decorator!=null)
		decorator.decorat();
		System.out.println("装桌子");
		
	}
	public Desk() {}
	public Desk(Decorator decorator) {
		this.decorator=decorator;
	}
}

class Computer implements Decorator{
	private Decorator decorator;
	@Override
	public void decorat() {
		if(decorator!=null)
		decorator.decorat();
		System.out.println("装电脑");
		
	}
	public Computer() {}
	public Computer(Decorator decorator) {
		this.decorator=decorator;
	}
}