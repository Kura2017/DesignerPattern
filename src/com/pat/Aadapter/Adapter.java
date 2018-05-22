package com.pat.Aadapter;
/**
 * 适配器，继承了220v电源，并且实现了110v中的转换方法
 * @author ZX
 *
 */
public class Adapter extends PowerSource220V implements PowerSource110V{

	@Override
	public int convert() {
		//调用父类方法
		int outPutPower = outPut();
		int convertPower =outPutPower/2;
		return convertPower;
		
	}

}
