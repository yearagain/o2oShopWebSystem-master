package com.yearagain.o2o.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yearagain.o2o.BaseTest;
import com.yearagain.o2o.dto.ShopExecution;
import com.yearagain.o2o.entity.Area;
import com.yearagain.o2o.entity.PersonInfo;
import com.yearagain.o2o.entity.Shop;
import com.yearagain.o2o.entity.ShopCategory;
import com.yearagain.o2o.enums.ShopStateEnum;
import com.yearagain.o2o.exceptions.ShopOperationException;

public class ShopServiceTest extends BaseTest {
	@Autowired
	private ShopService shopService;
	
	@Test
	public void testAddShop() throws ShopOperationException,FileNotFoundException {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试的店铺3");
		shop.setShopDesc("test3");
		shop.setShopAddr("test3");
		shop.setPhone("test3");
		shop.setShopImg("//test3");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("审核中");
		File shopImg=new File("C:\\Users\\Administrator\\Desktop\\111.jpg");
		InputStream is=new FileInputStream(shopImg);
		
		ShopExecution se=shopService.addShop(shop, is,shopImg.getName());
		assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
	}
}
