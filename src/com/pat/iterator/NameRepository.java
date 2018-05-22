package com.pat.iterator;
/**
 * 实际集合，包含一个具体的迭代器
 * @author zx
 *
 */
public class NameRepository implements Containter{
	//名称集合
	public String names[] = {"AA" , "BB" ,"CC" , "DD", "EE"};
	@Override
	public Iterator getIterator() {
		//返回一个迭代器对象
		return new NameIterator();
	}
	/**
	 * 内部类
	 */
	private class NameIterator implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			if(index<names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				//返回下标的数据并且index+1
				return names[index++];
			}
			return null;
		}
		
	}

}
