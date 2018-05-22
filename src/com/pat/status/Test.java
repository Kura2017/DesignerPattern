package com.pat.status;

public class Test {
	public static void main(String[] args) {
		Work work = new Work();
		//当前9点
		work.setHour(9);
		work.doWork();
		//当前13点
		work.setHour(13);
		work.doWork();
		work.setHour(16);
		work.doWork();
		work.setHour(20);
		work.doWork();
	}
}
