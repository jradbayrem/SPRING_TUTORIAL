package com.adaming.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adaming.bean.Client;

public class AppTest {

	public static void main(String[] args) {
		
		//context
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("client-beans.xml");
		
		//recup du bean client 
		Client client = (Client) context.getBean("clientBean");
		
		//--
		System.out.println(client);
	}
}
