package com.pat.status;
/**
 * 工作类
 * @author ZX
 *
 */
public class Work {
	private int hour;
	private boolean isFinshed;
	private Status currerntStatus;
	
	
	//constructor
	public Work() {
		//设置初始状态-早上的状态
		this.currerntStatus= new MorningStatus();
	}
	public void doWork() {
		currerntStatus.writeProgram(this);
	}
	
	
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public boolean isFinshed() {
		return isFinshed;
	}
	public void setFinshed(boolean isFinshed) {
		this.isFinshed = isFinshed;
	}
	public Status getCurrerntStatus() {
		return currerntStatus;
	}
	public void setCurrerntStatus(Status currerntStatus) {
		this.currerntStatus = currerntStatus;
	}
	
	
	
	
	
	
}
