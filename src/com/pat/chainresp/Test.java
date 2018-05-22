package com.pat.chainresp;

public class Test {
	//组装责任链链条
	public static AbstractLogger chainOfLevel(){
		//创建三个日志级别的对象
		AbstractLogger info = new InfoLogger(AbstractLogger.INFO); 
		AbstractLogger debug= new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger error= new ErrorLogger(AbstractLogger.ERROR);
		//设置责任链顺序
		error.setNextLogger(debug);
		debug.setNextLogger(info);
		return error;
	} 
	public static void main(String[] args) {
		AbstractLogger chainCtrl = chainOfLevel();
		chainCtrl.logMessage(AbstractLogger.INFO, " 日志级别info消息");
		chainCtrl.logMessage(AbstractLogger.DEBUG, "日志级别debug 消息");
		chainCtrl.logMessage(AbstractLogger.ERROR, "日志级别error 消息");
		/*chainCtrl.logMessage(2, "debug 消息");
		chainCtrl.logMessage(3, "err 消息");*/
	}
}
