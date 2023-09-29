package osc.greenlive.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
	
	@GetMapping("/delete/{id}")
	public void deleteKit(@PathVariable Long id)
	{
		this.kit_service.deleteKit(id) ;
	}
	
	@GetMapping("/display_data/{id_kit}")
	public Map<String, Object> gettingData(@PathVariable Long id)
	{
		String apiUrl = "https://example.com/api/values";
		RestTemplate restTemplate = new RestTemplate();
		
		String jsonResponse = restTemplate.getForObject(apiUrl, String.class);
		
		
		Map<String, Object> response = new HashMap<>();
		
		return response ;
	}
}
