package com.adaming.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.adaming.bean.Utilisateur;


public class AppTest {

	public static void main(String[] args) {
		
		//cotext
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-beans.xml");
		
		System.out.println("///////// test Config xml //////////");
		Utilisateur userXml = (Utilisateur)ctx.getBean("userBeanXml");
		System.out.println(userXml);
		
		System.out.println("///////// test Config Annotations //////////");
		
		Utilisateur userAnn = (Utilisateur)ctx.getBean("userAnnBean");
		System.out.println(userAnn);
	

		
	}
}
