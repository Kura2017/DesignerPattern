package com.pat.status;
/**
 * 状态1，上午的状态
 * @author Administrator
 *
 */
public class MorningStatus implements Status{

	@Override
	public void writeProgram(Work work) {
		if(work==null) {return;}
		if(work.getHour()<=12) {//小于12点
			System.out.println("当前"+work.getHour()+"点，做上午工作");
		}else {//大于12点进入中午的状态
			work.setCurrerntStatus(new NoonStatus());
			work.doWork();
			
		}
		
	}

}
