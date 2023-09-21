package osc.greenlive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osc.greenlive.model.Kit;
import osc.greenlive.service.KitServiceImpl;

@RestController
@RequestMapping("/kit")
public class kitController {
	
	private KitServiceImpl kit_service ;
	
	public kitController(KitServiceImpl kit_service)
	{
		this.kit_service = kit_service;
	}
	
	@PostMapping("/save")
	public ResponseEntity<Kit> userSave(@RequestBody Kit kit) {
		
		Kit kitExist = this.kit_service.saveKit(kit);
		return new ResponseEntity<Kit>(kitExist,HttpStatus.CREATED);
	}
	
}
