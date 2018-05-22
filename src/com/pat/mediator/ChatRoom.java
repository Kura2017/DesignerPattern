package com.pat.mediator;
/**
 * 中介者对象
 * 使用此对象封装对象的交互
 * @author ZX
 */
public class ChatRoom {
	public static void sendMsg(User user,String msg) {
		System.out.println(user.getName()+":"+msg);
	}

}
