package osc.greenlive.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osc.greenlive.model.Cultures;
import osc.greenlive.service.CultureServiceImpl;

@RestController
@RequestMapping("/culture")
public class CulturesController {
	
	private CultureServiceImpl culture_service;
	
	public CulturesController(CultureServiceImpl culture_service)
	{
		this.culture_service = culture_service;
	}
	
	@PostMapping("/save")
	 public Cultures cultureSave(Cultures culture)
	 {
		 return this.culture_service.saveCulture(culture);
	 }
}
