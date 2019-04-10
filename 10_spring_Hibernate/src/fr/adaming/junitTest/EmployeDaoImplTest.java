package fr.adaming.junitTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.adaming.model.Employe;
import fr.adaming.service.EmployeServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "file:src/application-context.xml" })
//file:src/main/webapp/WEB-INF/application-context.xml"
public class EmployeDaoImplTest {
	
	@Autowired
	//@Qualifier(value="employeServiceBean")
	EmployeServiceImpl employeService;
	
//	private static ApplicationContext context;
//
//	private static EmployeServiceImpl employeService;
	
//	@BeforeClass
//	public static void initHibernate() throws Exception {
//		// context
//		context = new ClassPathXmlApplicationContext("application-context.xml");
//
//		// recup du bean service
//		employeService = (EmployeServiceImpl) context
//				.getBean("employeServiceBean");
//	}

	@Test
	public void testFindAll() {
		List<Employe> liste = employeService.getAllEmployes();
		assertNotNull("null !", liste);
		assertTrue("Rien trouvé", liste.size() > 0);

	}
}