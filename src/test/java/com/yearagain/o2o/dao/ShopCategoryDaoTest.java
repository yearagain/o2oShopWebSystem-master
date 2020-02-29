package com.yearagain.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yearagain.o2o.BaseTest;
import com.yearagain.o2o.entity.ShopCategory;

public class ShopCategoryDaoTest extends BaseTest {
	@Autowired
	private ShopCategoryDao shopCategoryDao;

	@Test
	public void testQueryArea() {
		List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(new ShopCategory());
		assertEquals(2, shopCategoryList.size());
		ShopCategory test1=new ShopCategory();
		ShopCategory test2=new ShopCategory();
		test2.setShopCategoryId(1L);
		test1.setParent(test2);
		shopCategoryList=shopCategoryDao.queryShopCategory(test1);
		assertEquals(1,shopCategoryList.size());
		System.out.println(shopCategoryList.get(0).getShopCategoryName());
	}

}
