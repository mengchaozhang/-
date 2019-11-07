package com.qf.util;
/**
 * 数据库操作工具类
 * @author chris
 *
 */

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbUtil<T> {
	static ComboPooledDataSource ds = new ComboPooledDataSource();
	
	
	/**
	 * 更新数据
	 * @return
	 * @throws SQLException 
	 */
	public int updateData(String sql,Object...params) {
		QueryRunner qr = new QueryRunner(ds);
		int i = 0;
		try {
			i = qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public T querySingle(String sql,Class clazz,Object... params) {
		QueryRunner qr = new QueryRunner(ds);
		try {
			return qr.query(sql, new BeanHandler<T>(clazz),params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<T> queryList(String sql,Class clazz,Object... params){
		QueryRunner qr = new QueryRunner(ds);
		try {
			return qr.query(sql, new BeanListHandler<T>(clazz),params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public int queryCount(String sql,Object...params) {
		QueryRunner qr = new QueryRunner(ds);
		try {
			Long count = qr.query(sql, new ScalarHandler<Long>(),params);
			return Integer.parseInt(count.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public double querySum(String sql,Object...params) {
		QueryRunner qr = new QueryRunner(ds);
		try {
			Double sum = qr.query(sql, new ScalarHandler<Double>(),params);
			
			return Double.parseDouble(sum.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
}
