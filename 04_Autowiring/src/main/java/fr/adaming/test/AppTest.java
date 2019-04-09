package fr.adaming.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.adaming.bean.Client;



public class AppTest {

	public static void main(String[] args) {
		
		//context
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("client-beans.xml");
		
		//recup du bean client 
		Client client = (Client) context.getBean("clientBean");
		Client client2 = (Client) context.getBean("clientBean2");
		Client client3 = (Client) context.getBean("clientBean3");
		
		//--
		System.out.println(client);
		System.out.println(client2);
		System.out.println(client3);
	}
}
