package com.pat.composite;
/**
 * 组合类接口，普通叶子和含有很多叶子的枝干都实现本接口
 * @author ZX
 *
 */
public interface Composite {
	void operation();
	void add(Composite leaf);
	void remove();

}
