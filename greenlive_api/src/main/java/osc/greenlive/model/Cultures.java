package osc.greenlive.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Cultures")
@Getter
@Setter
@AllArgsConstructor
public class Cultures {
	
		public Cultures()
		{
			
		}

		private String type_culture;
		
		private Date date_plantation;
		private Long superficie;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id_culture;
		
		@ManyToOne
		private User culture_user;
		
		@OneToMany(mappedBy="kit_culture",fetch=FetchType.EAGER)
		private List<Kit> culture_kit = new ArrayList<>();
}