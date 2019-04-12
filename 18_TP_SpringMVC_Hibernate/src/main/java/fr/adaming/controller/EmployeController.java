package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import fr.adaming.model.Employe;
import fr.adaming.service.IEmployeService;

/**
 * 
 * @author INTI0261
 *
 */
@Controller
@RequestMapping(value = "/employe")
public class EmployeController {

	@Autowired
	private IEmployeService employeService;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value ="/index", method = RequestMethod.GET)
	public String welcomeEmploye(ModelMap model) {

		model.addAttribute("name", "APPLICATION DE GESTION DES EMPLOYES");
		model.addAttribute("salutation", "Avec Spring MVC @Author INTI2016");

		// le nom logique de la vue
		return "home";
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/listemployes", method = RequestMethod.GET)
	public String listEmployes(ModelMap model) {

		List<Employe> liste = employeService.getAllEmployes();
		
		model.addAttribute("employeeList", liste);

		return "employes";
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/addEmploye", method = RequestMethod.GET)
	public ModelAndView addEmploye() {

		String viewName = "addEmploye";

		return new ModelAndView(viewName, "employe", new Employe());
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/insererEmploye", method = RequestMethod.POST)
	public String insererEmploye(@ModelAttribute("employe") Employe pEmploye, ModelMap model) {

		if (pEmploye.getId() == 0){
			// ajout de l'employe dans la bdd
			this.employeService.addEmploye(pEmploye);
		}else{
			this.employeService.updateEmploye(pEmploye);;
		
		}

		// recup la liste des amployes
		model.addAttribute("employeeList", employeService.getAllEmployes());

		return "employes";
	}

	/**
	 * @return
	 */
	@RequestMapping(value = "/deleteEmploye/{employeID}", method = RequestMethod.GET)
	public String supprimerEmploye(@PathVariable("employeID") int IdEmploye, ModelMap model) {
/*une autre maniere pour les parametres de la requte:
	dans la vue : deleteEmploye?IdEmploye=${employee.id} et dans la methode on utilise le parametre avec le meme nom
*/
		
		// suppression de l'employe de la bdd
		Employe empl = this.employeService.getEmployeById(IdEmploye);
		this.employeService.deleteEmploye(empl);

		// recup la liste des amployes
		model.addAttribute("employeeList", employeService.getAllEmployes());

		return "employes";
	}
	
	
	@RequestMapping(value = "/editEmploye", method = RequestMethod.GET)
	public ModelAndView editerEmploye(int IdEmploye) {
		Employe empl = this.employeService.getEmployeById(IdEmploye);
		String viewName = "addEmploye";
		return new ModelAndView(viewName, "employe", empl);
	}
	
}
