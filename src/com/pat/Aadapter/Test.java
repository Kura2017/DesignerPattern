package com.pat.Aadapter;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		//220V电源
		PowerSource220V ps220 = new PowerSource220V();
		int outPut = ps220.outPut();
		System.out.println(outPut);
		//使用适配器
		Adapter ada = new Adapter();
		int adapterOutPut = ada.convert();
		System.out.println(adapterOutPut);
		

	}
}
