package com.bingo.demo.client;

import com.bingo.demo.service.MyWebServiceImpl;
import com.bingo.demo.service.MyWebServiceImplService;

public class ClientTest {
	
	public static void main(String[] args) {
		
		MyWebServiceImplService service = new MyWebServiceImplService();
		
		MyWebServiceImpl serviceImpl = service.getMyWebServiceImplPort();
		
		String string = serviceImpl.sayHello("bingo");
		
		System.out.println("hello "+string);
	}

}
