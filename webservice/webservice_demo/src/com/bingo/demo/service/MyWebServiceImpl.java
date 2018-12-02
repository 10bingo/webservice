package com.bingo.demo.service;

import javax.jws.WebService;

@WebService
public class MyWebServiceImpl implements MyWebService{

	@Override
	public String sayHello(String name) {		
		return name+"[service]";
	}

}
