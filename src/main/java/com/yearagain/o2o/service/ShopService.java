package com.yearagain.o2o.service;

import java.io.File;
import java.io.InputStream;

import com.yearagain.o2o.dto.ShopExecution;
import com.yearagain.o2o.entity.Shop;
import com.yearagain.o2o.exceptions.ShopOperationException;

public interface ShopService {
	
	//单元测试时用的File
	//ShopExecution addShop(Shop shop, File shopImg);
	ShopExecution addShop(Shop shop,InputStream shopImgInputStream,String fileName) throws ShopOperationException;
	
}
