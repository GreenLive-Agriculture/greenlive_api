package osc.greenlive.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Kit {
	
	private String name_kit;
	
	public Kit()
	{
		
	}
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_kit")
	private Long id_kit;
	
	private Long kitAddress ;
	
	private String type_kit ;
	
	@ManyToOne
	private Cultures kit_culture ;
	
	@ManyToOne
	private Ressource kit_ressource;
	
	@OneToOne(mappedBy = "kit", cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@PrimaryKeyJoinColumn
	private Data data;
}
