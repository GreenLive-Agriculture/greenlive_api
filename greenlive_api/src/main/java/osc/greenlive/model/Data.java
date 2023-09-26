package osc.greenlive.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Data")
@Getter
@Setter
@AllArgsConstructor
public class Data {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_data;
	
	private String name_data;
	private String path_file;
	private String data_type_content ;
	
	@ManyToOne
	private Kit data_kit;
}
