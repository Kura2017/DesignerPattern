package com.pat.status;
/**
 * 状态3：下午的状态
 * @author Administrator
 *
 */
public class AfternoonStatus implements Status{

	@Override
	public void writeProgram(Work work) {
		if(work==null) {return;}
		if(work.getHour()<=18) {//小于18点
			System.out.println("当前"+work.getHour()+"点，下午工作");
		}else {//大于18点进入中午的状态
			System.out.println("干毛线，下班了还干");
			
		}
		
	}
}
