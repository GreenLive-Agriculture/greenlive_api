package osc.greenlive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osc.greenlive.model.Ressource;
import osc.greenlive.service.RessourceServiceImpl;

@RestController
@RequestMapping("/ressource")
public class RessourceController {
	
	private RessourceServiceImpl ressource_service;
	
	public RessourceController(RessourceServiceImpl ressource_service)
	{
		this.ressource_service = ressource_service;
	}
	
	@PostMapping("/save")
	public ResponseEntity<Ressource> userRessource(@RequestBody Ressource user) {
		
		Ressource ressourceExist = this.ressource_service.saveRessource(user);
		return new ResponseEntity<Ressource>(ressourceExist,HttpStatus.CREATED);
	}
}
