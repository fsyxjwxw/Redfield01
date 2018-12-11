package com.redfield.text;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.redfield.pojo.Items;
import com.redfield.service.ItemsService;

class ServiceText {

	@Test
	public void testService() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ItemsService id = (ItemsService) ac.getBean("itemsService"); 
		id.getAllItems();
		Items items = new Items("XPP", "鸡蛋", "白色", "家禽", "人生难得一只鸡~", 200.22f);
		id.insertOneItems(items);
		id.deleteOneItemsById(10014);
		
	}
	@Test
	public void testAOPService() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ItemsService id = (ItemsService) ac.getBean("itemsService"); 
		id.getAllItems();
		Items items = new Items("XPP", "鸡蛋", "白色", "家禽", "人生难得一只鸡~", 200.22f);
		id.insertAndDeleteONeItemsById(items, 10018);
		
	}

}
