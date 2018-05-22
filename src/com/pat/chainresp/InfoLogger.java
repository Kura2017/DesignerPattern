package com.pat.chainresp;


public class InfoLogger extends AbstractLogger{
	protected int level;
	protected AbstractLogger nextLogger;
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
	@Override
	protected void write(String message) {
		System.out.println("InfoLog>>>"+message);
		
	}
	public InfoLogger(int level){
		this.level=level;
	}
}
