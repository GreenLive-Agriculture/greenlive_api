package osc.greenlive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osc.greenlive.model.ModelIA;
import osc.greenlive.service.ModelIAServiceImpl;

@RestController
@RequestMapping("/IA_model")
public class ModelIAController {
	private ModelIAServiceImpl modelIA_service ;
	
	public ModelIAController(ModelIAServiceImpl modelIA_service)
	{
		this.modelIA_service = modelIA_service;
	}
	
	@PostMapping("/save")
	public ResponseEntity<ModelIA> modelIASave(@RequestBody ModelIA modelIA) {
		
		ModelIA modelIAExist = this.modelIA_service.saveModelIA(modelIA);
		return new ResponseEntity<ModelIA>(modelIAExist,HttpStatus.CREATED);
	}
}
