package com.redfield.dao;

import java.util.List;

import com.redfield.pojo.Items;


/**
 * @author Redfield
 *
 * @date 2018��12��5��
 */
public interface ItemsDao {

	public List<Items> getAllItems();
	
	public int insertOneItems(Items items);
	
	public int deleteOneItemsById(int id);
	
	public int insertAndDeleteONeItemsById(Items items,int id);
	
}
