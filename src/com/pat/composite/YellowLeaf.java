package com.pat.composite;
/**
 * 黄色的树叶
 * @author ZX
 */
public class YellowLeaf implements Composite{
	@Override
	public void operation() {
		System.out.println("摘一片黄叶");
	}

	@Override
	public void add(Composite leaf) {
	}
	@Override
	public void remove() {
	}
}
