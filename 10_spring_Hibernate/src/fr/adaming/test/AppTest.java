package fr.adaming.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.adaming.model.Employe;
import fr.adaming.service.EmployeServiceImpl;


/**
 * 
 * @author INTI0261
 *
 */
public class AppTest {

	public static void main(String[] args) {
		
		//context 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
		
		//recup du bean service 
		EmployeServiceImpl employeManager = (EmployeServiceImpl) 
				context.getBean("employeServiceBean");
		
		//def des employes a ajouter
		Employe empl1 = new Employe("ALAIN", "jean", "developpeur", "technique", 3000);
		Employe empl2 = new Employe("BERNARD", "jimmy", "developpeur", "technique", 3000);
		Employe empl3 = new Employe("DELARUE", "philippe", "developpeur", "technique", 3000);
		Employe empl4 = new Employe("VIGNON", "fabien", "developpeur", "technique", 3000);
		
		//Ajout des employes 
		employeManager.addEmploye(empl1);
		employeManager.addEmploye(empl2);
		employeManager.addEmploye(empl3);
		employeManager.addEmploye(empl4);
		
		//recup un employe par id 
		System.out.println("============= RECUP EMPLOYE BY ID =========");
		Employe emp = employeManager.getEmployeById(1);
		System.out.println("\t- " + emp.getPrenom());
		
		//recup des employes 
		System.out.println("============= LISTE DES EMPLOYES =========");
		List<Employe> employeList = employeManager.getAllEmployes();
		for (Employe empl : employeList) {
			System.out.println("\t- " + empl.getPrenom());
		}
		
		//update 
		System.out.println("============= UPDATE EMPLOYE =========");
		emp = employeManager.getEmployeById(1);
		System.out.println("\t- avant update : " + emp.getFonction());
		emp.setFonction("chef de projet");
		employeManager.updateEmploye(emp);
		System.out.println("\t- apres update : " + employeManager.getEmployeById(1).getFonction());

		//delete 
		System.out.println("============= DELETE EMPLOYE =========");
		emp = employeManager.getEmployeById(4);
		employeManager.deleteEmploye(emp);
		
	}
	
	
	
	
	
	
	
	

}
