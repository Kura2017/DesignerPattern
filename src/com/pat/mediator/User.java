package com.pat.mediator;
/**
 * 中介所关联的对象
 * @author ZX
 */
public class User {
	//用户名称
	private String name;

	
	//发送消息
	public void sendMsg(String msg) {
		ChatRoom.sendMsg(this, msg);
	}
	//getset
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//构造防范
	public User() {
	}
	public User(String name) {
		super();
		this.name = name;
	}
	
	
}
