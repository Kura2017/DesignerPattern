package com.pat.flyweight;
/**
 * 链接子类，Oracle链接
 * @author ZX
 *
 */
public class OracleConnector implements Connector{

	@Override
	public void connect() {
		System.out.println("链接到Oracle数据库"+this.getClass());
		
	}

}
