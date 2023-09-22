package osc.greenlive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osc.greenlive.model.Data;
import osc.greenlive.service.DataServiceImpl;

@RestController
@RequestMapping("/data")
public class DataController {
	
	private DataServiceImpl data_service;
	
	public DataController(DataServiceImpl data_service)
	{
		this.data_service = data_service;
	}
	
	@PostMapping("/save")
	public ResponseEntity<Data> DataSave(@RequestBody Data Data) {
		
		Data DataExist = this.data_service.saveData(Data);
		return new ResponseEntity<Data>(DataExist,HttpStatus.CREATED);
	}
	
	@PostMapping("/delete/{id}")
	public void deleteData(@PathVariable Long id) {
		this.data_service.deleteData(id);
		}
	
	@PostMapping("/update/{id}")
	public void updateData(@RequestBody Data data ,@PathVariable Long id)
	{
		this.data_service.updateData(id, data);
	}
	
}
