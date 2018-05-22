package com.pat.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝，上面有很多树叶
 * @author ZX
 *
 */
public class Branch implements Composite{
	//树枝上所有的叶子集合
	List<Composite> leafs = new ArrayList<>();
	@Override
	public void operation() {
		operateAll();	
	}
	@Override
	public void add(Composite leaf) {
	}
	@Override
	public void remove() {
	}
	public void operateAll() {
		for(Composite leaf:leafs) {
			leaf.operation();
		}
		
	}
	//后早方法
	public Branch() {
		//这里我简单添加了一些树叶类，未使用传入参数，核心不在于此
		leafs.add(new GreenLeaf());
		leafs.add(new GreenLeaf());
		leafs.add(new GreenLeaf());
		leafs.add(new YellowLeaf());
		leafs.add(new YellowLeaf());
		leafs.add(new YellowLeaf());
	}

}
