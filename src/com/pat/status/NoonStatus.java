package com.pat.status;
/**
 * 状态2：中午的状态
 * @author Administrator
 *
 */
public class NoonStatus implements Status{

	@Override
	public void writeProgram(Work work) {
		if(work==null) {return;}
		if(work.getHour()<=13) {//小于1点
			System.out.println("当前"+work.getHour()+"点，休息");
		}else {//大于1点进入中午的状态
			work.setCurrerntStatus(new AfternoonStatus());
			work.doWork();
			
		}
		
	}

}
