package fr.adaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/monde") //devient golab
public class MonController {

	@RequestMapping(method = RequestMethod.GET)//essaie value="/monde",
	   public ModelAndView disBonjour1() {
	      String viewNom="bonjour";
	      return new ModelAndView(viewNom, "message","Bonjour tout le monde!" );
	   }
	
	//1- cas simple:
//	@RequestMapping(method = RequestMethod.GET)//essaie value="/monde",
//	   public String disBonjour(ModelMap model) {
//	      model.addAttribute("message", "Bonjour tout le monde!");
//
//	      return "bonjour";
//	   }
	

	
	//2 l'uri sur la methode
	@RequestMapping(value="/session de Strasbourg",method = RequestMethod.GET)
	   public String disBonjour2(ModelMap model) {
	      model.addAttribute("message", "Bonjour salle de la session de Lyon!");

	      return "bonjour";
	   }
	
	//3 pulsiuers URI sur la methode
	@RequestMapping(value={"/eleve","/formateur"},method = RequestMethod.GET)// essaie post
	   public String disBonjour3(ModelMap model) {
	      model.addAttribute("message", "Bonjour toi!");

	      return "bonjour";
	   }
	
	//4 une URI avec param sur la methode 
		@RequestMapping(value={"/personne/{nom}"},method = RequestMethod.GET)// essaie params={"nom=nomane"}
		   public String disBonjour4(@PathVariable String nom,ModelMap model) {//essaie avec @RequestParam(value="nom",required=false)
		      model.addAttribute("message", "Bonjour "+nom);

		      return "bonjour";
		   }
}
