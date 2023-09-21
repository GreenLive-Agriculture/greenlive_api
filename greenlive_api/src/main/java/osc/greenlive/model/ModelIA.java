package osc.greenlive.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class ModelIA {
	private String name_IA;
	private String IA_caracteristic;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id_IA;
	
	@ManyToOne
	private User modelIA_user;
}
