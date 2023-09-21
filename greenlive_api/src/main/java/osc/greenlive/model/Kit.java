package osc.greenlive.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Kit {
	
	private String name_kit;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_kit;
	
	private String type_kit ;
	
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Cultures> kit_culture = new ArrayList<>();
	
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Ressource> kit_ressource = new ArrayList<>();
	
	@OneToMany(mappedBy="data_kit",fetch=FetchType.EAGER)
	private List<Data> kit_data = new ArrayList<>();
}
