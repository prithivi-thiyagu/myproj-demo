package com.star.ig.api.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.star.ig.api.digilock.exp.factory.DigiLockFactoryImpl;
import com.star.ig.api.digilock.exp.factory.config.DigiLockRequestConfig;
import com.star.ig.api.digilock.sys.service.DigiLockService;
import com.star.ig.base.core.util.FreeMarkerConvertor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FactoryTestClass.class)
class FactoryTestClass {
	
	
	@InjectMocks
	private DigiLockFactoryImpl factory;

	@Mock
	DigiLockService service;

	@Mock
	private FreeMarkerConvertor freeMarkerConverter;

	@Mock
	private DigiLockRequestConfig digiLockRequestConfig;

	@Mock
	ObjectMapper objectMapper;
	

}
