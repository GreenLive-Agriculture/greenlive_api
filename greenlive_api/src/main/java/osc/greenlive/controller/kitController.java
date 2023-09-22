package osc.greenlive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<Kit> kitSave(@RequestBody Kit kit) {
		
		Kit kitExist = this.kit_service.saveKit(kit);
		return new ResponseEntity<Kit>(kitExist,HttpStatus.CREATED);
	}
	@GetMapping("/update/{id}")
	public ResponseEntity<Kit> updateKit(@PathVariable Long id ,@RequestBody Kit kit)
	{
		Kit deleteKit = this.kit_service.updateKit(id, kit) ;
		
		return new ResponseEntity<Kit>(deleteKit,HttpStatus.CREATED);
	}
	
	@GetMapping("/update/{id}")
	public void deleteKit(@PathVariable Long id)
	{
		this.kit_service.deleteKit(id) ;
	}
}
