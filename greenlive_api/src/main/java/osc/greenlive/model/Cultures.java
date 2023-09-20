package osc.greenlive.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cultures {

		private Long type_culture;
		private Date date_plantation;
		private Long superficie;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id_culture;
		
		@ManyToOne
		private User culture_user;
		
		@ManyToMany(mappedBy="kit_culture",fetch=FetchType.EAGER)
		private List<Kit> culture_kit = new ArrayList<>();
		
		
		
		
}
