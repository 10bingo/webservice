package com.bingo.demo.service;

import javax.xml.ws.Endpoint;

public class WebServicePublish {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8888/webservice", new MyWebServiceImpl());
		
		System.out.println("服务发布成功！！！");
	}
}
