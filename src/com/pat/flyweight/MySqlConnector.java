package com.pat.flyweight;
/**
 * 链接实现类-mysql链接
 * @author ZX
 *
 */
public class MySqlConnector implements Connector{

	@Override
	public void connect() {
		System.out.println("链接到MySql数据库"+this.toString());
		
	}

}
