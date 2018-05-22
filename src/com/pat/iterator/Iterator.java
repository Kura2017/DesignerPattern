package com.pat.iterator;
/**
 * 定义一个迭代器接口
 * @author zx
 *
 */
public interface Iterator {
	//是否有下一个元素
	public boolean hasNext();
	//获取下一个元素
	public Object next();
}
