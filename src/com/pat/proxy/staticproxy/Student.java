package com.pat.proxy.staticproxy;
/**
 * 统一接口
 * @author ZX
 *
 */
public interface Student {
	void exam();
}
/**
 * 被代理类-学生王小虎
 * @author ZX
 *
 */
class BadStudent implements Student{
	private String name="王小虎";

	@Override
	public void exam() {
		System.out.println(name+"参加考试");
		
	}
	public BadStudent(){
	}
	public BadStudent(String name){
		this.name=name;
	}
}
/**
 * 代理类-替考的骗子
 * 静态代理只代理固定的类
 * @author ZX
 *
 */
class Swindler implements Student{
	private String name;
	private BadStudent badStudent;
	
	@Override
	public void exam() {
		//非重点，前后可以添加某些操作
		System.out.println(name+"进入考场");
		badStudent= new BadStudent(name);
		badStudent.exam();
		System.out.println(name+"没交试卷");
		
	}
	public Swindler(String name){
		this.name=name;
	}
}