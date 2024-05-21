package com.star.ig.api.controller;

import com.star.ig.api.digilock.exp.controller.DigiLockController;
import com.star.ig.api.digilock.exp.factory.DigiLockFactory;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ControllerTestClass.class)
class ControllerTestClass {
	
	
	@InjectMocks
	private DigiLockController controller;

	@Mock
    DigiLockFactory factory;
	

}
