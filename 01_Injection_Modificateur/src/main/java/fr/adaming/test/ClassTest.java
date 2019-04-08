package fr.adaming.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import fr.adaming.beans.Developpeur;
import fr.adaming.beans.Societe;

public class ClassTest {

	public static void main(String[] args) {
		// Etape 1: recuperer le context du Spring
		
		XmlBeanFactory cxt = new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
		
		
//		ApplicationContext cxt= new ClassPathXmlApplicationContext("spring-beans.xml");

		
		// Etape 2: recuperer les beans à partir du context avec la methode getBean
		
		//developpeur
		Developpeur developpeur=(Developpeur) cxt.getBean("devBean");
		
		System.out.println("---------- Developpeur-------------");
		System.out.println(developpeur);
		
		//chef du projet
		Developpeur chefProjet=(Developpeur) cxt.getBean("chefBean");
		System.out.println("\n---------- Chef Du Projet-------------");
		System.out.println(chefProjet);
	
		
		
		// Societé
		Societe sos=(Societe) cxt.getBean("societeBean");
		System.out.println("\n---------- Societé-------------");
		System.out.println(sos);
	}

}
