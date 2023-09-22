package osc.greenlive.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osc.greenlive.model.Cultures;
import osc.greenlive.model.Kit;
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
	
	@GetMapping("/list/kit/{id}")
	public ResponseEntity<List<Kit>> listKit(@PathVariable Long id)
	{
		List<Kit> listkit = this.culture_service.listKitCultures(id) ;
		return new ResponseEntity<List<Kit>>(listkit,HttpStatus.CREATED);
	}
	
}
