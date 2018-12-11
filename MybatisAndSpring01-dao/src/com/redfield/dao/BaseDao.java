package com.redfield.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author Redfield
 *
 */
public class BaseDao {
	public static SqlSessionFactory sqlSessionFactory;

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public static void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		BaseDao.sqlSessionFactory = sqlSessionFactory;
	}

	public SqlSession getSqlSession() {

		return sqlSessionFactory.openSession();

	}

}
