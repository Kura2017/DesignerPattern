package com.pat.visitor;
/**
 * 被访问者
 * @author ZX
 *
 */
public class Systems {
	private String sysType;
	
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public void login() {
		System.out.println(sysType+"登录");
	}
	public void rr() {
		System.out.println(sysType+"读");
	}
	public void ww() {
		System.out.println(sysType+"写");
	}
	public void xx() {
		System.out.println(sysType+"执行");
	}
	
	
	public Systems(String sysType){
		this.sysType=sysType;
	}
}
