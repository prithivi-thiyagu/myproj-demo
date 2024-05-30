package com.star.ig.api.digilock.exp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("ig-digi-lock/api/v4/digi")
//@Api("DigiLock Services")

@Validated
public class DigiLockController {


@Value("mytest.value")
String val;


	//@ApiOperation(httpMethod = "GET", response = String.class, value = "This API is used to create check heart beat")
	@GetMapping(value = "/heartbeat")
	public ResponseEntity<String> heartBeat() {
	String value = 	val+"digilock-service-svc service is running";
	return ResponseEntity.ok(value);
	}


}
