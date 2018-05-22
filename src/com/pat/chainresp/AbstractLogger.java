package com.pat.chainresp;
/**
 * 责任链模式
 * @author Administrator
 *
 */
public abstract class AbstractLogger {
	public static int INFO=1;
	public static int DEBUG=2;
	public static int ERROR=3;
	
	protected int level;
	//下一个对象
	protected AbstractLogger nextLogger;
	//
	public void setNextLogger(AbstractLogger  nextLogger ){
		this.nextLogger=nextLogger;
	}
	//责任传递
	public void logMessage(int logLevel,String message) {
		if(this.level==logLevel) {
			write(message);
		}
		if(nextLogger!=null) {
			nextLogger.logMessage(logLevel, message);
		}
	}
	abstract protected void write(String message);
	
}
