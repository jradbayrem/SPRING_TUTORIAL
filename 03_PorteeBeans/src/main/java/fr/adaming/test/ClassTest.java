package fr.adaming.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.adaming.service.ClientService;

public class ClassTest {

	public static void main(String[] args) {

		// recuperer le context d'application
		ApplicationContext cxt = new ClassPathXmlApplicationContext("application-context.xml");

		// recuperations des beans

		ClientService cl1 = (ClientService) cxt.getBean("clientServiceBean");
		cl1.setMessage("Bonjour Tout le monde, vous etes tous beaux et inteligents!");
		System.out.println("Message cl1 :" + cl1.getMessage());

		ClientService cl2 = (ClientService) cxt.getBean("clientServiceBean");
		System.out.println("\nMessage cl2 :" + cl2.getMessage());
	}

}
