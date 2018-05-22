package com.pat.flyweight;

public class Test {
	public static void main(String[] args) {
		//创建链接工厂
		ConnectorFactory sf =new ConnectorFactory();
		//获取Mysql链接
		Connector mySqlConnector = sf.getMySqlConnector();
		Connector mySqlConnector2 = sf.getMySqlConnector();
		Connector mySqlConnector3 = sf.getMySqlConnector();
		mySqlConnector.connect();
		mySqlConnector2.connect();
		mySqlConnector3.connect();
		
		//获取oracle链接
		Connector oracleConnector = sf.getOracleConnector();
		Connector oracleConnector2 = sf.getOracleConnector();
		Connector oracleConnector3 = sf.getOracleConnector();
		oracleConnector.connect();
		oracleConnector2.connect();
		oracleConnector3.connect();
		
	}
}
