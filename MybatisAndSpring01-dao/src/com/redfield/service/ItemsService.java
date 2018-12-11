package com.redfield.service;

import java.util.List;

import com.redfield.pojo.Items;

/**
 * @author Redfield
 *
 */
public interface ItemsService {

	public List<Items> getAllItems();

	public int insertOneItems(Items items);

	public int deleteOneItemsById(int id);

	public int insertAndDeleteONeItemsById(Items items, int id);

}
