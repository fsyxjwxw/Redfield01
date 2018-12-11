package com.redfield.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.redfield.dao.BaseDao;
import com.redfield.dao.ItemsDao;
import com.redfield.pojo.Items;

public class ItemsDaoImpl extends BaseDao implements ItemsDao {

	@Override
	public List<Items> getAllItems() {

		SqlSession sqlSession = getSqlSession();

		List<Items> list = sqlSession.selectList("itemsmapper.getAllItems");
		
		sqlSession.close();
		
		return list;

	}

	@Override
	public int insertOneItems(Items items) {
		SqlSession sqlSession = getSqlSession();
		int num = sqlSession.insert("itemsmapper.insertOneItems",items);
		sqlSession.close();
		return num;
	}

	@Override
	public int deleteOneItemsById(int id) {
		SqlSession sqlSession = getSqlSession();
		int num = sqlSession.delete("itemsmapper.deleteOneItemsById",id);
		sqlSession.close();
		return num;
	}

	@Override
	public int insertAndDeleteONeItemsById(Items items, int id) {
		
		SqlSession sqlSession = getSqlSession();
		int num1 = sqlSession.insert("itemsmapper.insertOneItems",items);
		int num2 = sqlSession.delete("itemsmapper.deleteOneItemsById",id);
		sqlSession.close();
		return num1+num2;
	}

}
