package com.redfield.dao;

import java.util.List;

import com.redfield.pojo.Items;


/**
 * @author Redfield
 *
 * @date 2018Äê12ÔÂ5ÈÕ
 */
public interface ItemsDao {

	public List<Items> getAllItems();
	
	public int insertOneItems(Items items);
	
	public int deleteOneItemsById(int id);
	
	public int insertAndDeleteONeItemsById(Items items,int id);
	
}
