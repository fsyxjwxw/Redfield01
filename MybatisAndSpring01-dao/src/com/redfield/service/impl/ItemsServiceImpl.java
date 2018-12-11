package com.redfield.service.impl;

import java.util.List;

import com.redfield.dao.ItemsDao;
import com.redfield.pojo.Items;
import com.redfield.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {

	ItemsDao itemsDao;

	public ItemsDao getItemsDao() {
		return itemsDao;
	}

	public void setItemsDao(ItemsDao itemsDao) {
		this.itemsDao = itemsDao;
	}

	@Override
	public List<Items> getAllItems() {

		return itemsDao.getAllItems();

	}

	@Override
	public int insertOneItems(Items items) {

		return itemsDao.insertOneItems(items);
	}

	@Override
	public int deleteOneItemsById(int id) {

		return itemsDao.deleteOneItemsById(id);
	}

	@Override
	public int insertAndDeleteONeItemsById(Items items, int id) {

		System.out.println("Start~~");
		insertOneItems(items);
		deleteOneItemsById(id);
		System.out.println("End~~");
		return 88;
	}

}
