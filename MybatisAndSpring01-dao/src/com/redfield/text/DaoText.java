package com.redfield.text;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.redfield.dao.ItemsDao;

class DaoText {

	@Test
	public void test() {
		
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ItemsDao id = (ItemsDao) ac.getBean("itemsDao"); 
		id.getAllItems();
		
	}

}
