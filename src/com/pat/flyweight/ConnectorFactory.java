package com.pat.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 链接工厂-生产链接
 * @author ZX
 */
public class ConnectorFactory {
	//为方便演示结果，采用简单的数据结构
	private Map<String, Connector> pool = new HashMap<>();
	
	/**
	 * 获得一个Mysql链接
	 * @return
	 */
	public Connector getMySqlConnector() {
		Connector mySql = pool.get("mysql");
		if(pool.get("mysql")==null) {
			mySql = new MySqlConnector();
			pool.put("mysql", mySql);
		}
		return mySql;
	}
	/**
	 * 获取一个oracle链接
	 * @return
	 */
	public Connector getOracleConnector() {
		Connector mySql = pool.get("oracle");
		if(pool.get("oracle")==null) {
			mySql = new MySqlConnector();
			pool.put("oracle", mySql);
		}
		return mySql;
	}
}
