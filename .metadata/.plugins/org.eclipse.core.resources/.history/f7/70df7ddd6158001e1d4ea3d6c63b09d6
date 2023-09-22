package osc.greenlive.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import osc.greenlive.model.Cultures;
import osc.greenlive.service.CultureService;

@Controller
public class CulturesController {
	
	 @Autowired
	 private CultureService cultureService;
	 
	 @GetMapping("/cultures")
	 public String listerCultures(Model model) {
		 
		 List<Cultures> cultures = cultureService.listerCultures();
	     model.addAttribute("cultures", cultures);
	     return "cultures";
	 }
	 
	 @GetMapping("/cultures/add")
	 public String afficherFormulaireAjoutCulture(Model model) {
	     Cultures culture = new Cultures();
	     model.addAttribute("culture", culture);
	     return "ajouterCulture";
	 }
	 
	 @PostMapping("/cultures/ajouter")
	 public String enregistrerCulture(@ModelAttribute("culture") Cultures culture) {
	     cultureService.enregistrerCulture(culture);
	     return "redirect:/cultures";
	 }
	
}
