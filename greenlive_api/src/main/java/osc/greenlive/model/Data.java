package osc.greenlive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Data {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_data;
	
	private String name_data;
	private String path_file;
	private String data_type_content ;
	
	@ManyToOne
	private Kit data_kit;
}
