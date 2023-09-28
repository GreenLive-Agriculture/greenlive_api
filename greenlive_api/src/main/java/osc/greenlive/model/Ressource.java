package osc.greenlive.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Ressource {
	
	public Ressource()
	{
		
	}
	private String name_ressource;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_ressource;
	
	private String type_ressource;
	
	@OneToMany(mappedBy="kit_ressource",fetch=FetchType.EAGER)
	private List<Kit> ressource_kit = new ArrayList<>();
}
