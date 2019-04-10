package fr.adaming.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import fr.adaming.service.Ibanque;

public class ClassTest {
	public static void main(String[] args) {

		// recuperation du bean developpeur a partir du conteneur
		// IoC de spring
		// le contaxt de spring
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-beans.xml");

		//recup des beans proxy  
				Ibanque banque = 
						(Ibanque) context.getBean("banqueBean");
		
		


		System.err.println("******la methode est en execution et le rsultat: "+banque.retrait(100));
	
	}
}
