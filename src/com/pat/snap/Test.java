package com.pat.snap;
/**
 * 测试类
 * @author ZX
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建历史记录管理类
		CareTaker ct =new CareTaker();
		//记事本编辑文件
		TextEditor td = new TextEditor();
		td.setText("123");
		td.setText("456");
		//创建快照1
		Memento h1 = td.saveHistory();
		ct.add(h1);
		td.setText("789");
		td.setText("10");
		td.setText("11");
		
		//创建快照2
		Memento h2 = td.saveHistory();
		ct.add(h2);
		//获取快照1
		Memento memento1 = ct.get(0);
		System.out.println(memento1.getText());
		//获取快照2
		Memento memento2 = ct.get(1);
		System.out.println(memento2.getText());
		
		
	}
}
