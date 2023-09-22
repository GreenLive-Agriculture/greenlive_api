package osc.greenlive.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	private String name;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_user;
	
	private String fonction;
	private boolean actif;
	private String email;
	private String sexe;
	
	@OneToMany(mappedBy="culture_user",fetch=FetchType.EAGER)
	private List<Cultures> user_culture = new ArrayList<>();
	
	@OneToMany(mappedBy="modelIA_user",fetch=FetchType.EAGER)
	private List<ModelIA> user_modelIA = new ArrayList<>();
}
