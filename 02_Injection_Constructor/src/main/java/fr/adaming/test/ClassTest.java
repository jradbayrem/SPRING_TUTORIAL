package fr.adaming.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import fr.adaming.bean.Utilisateur;

public class ClassTest {

	public static void main(String[] args) {
		// recuperer le context  du conteneur leger Spring

		BeanFactory cxt=new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		
		// recuperation des beans: 
		
		Utilisateur user1=(Utilisateur) cxt.getBean("userBean1");
		System.out.println("------- user1------");
		System.out.println(user1);
		
		
		Utilisateur user2=(Utilisateur) cxt.getBean("userBean2");
		System.out.println("\n------- user2------");
		System.out.println(user2);
		
	}

}
