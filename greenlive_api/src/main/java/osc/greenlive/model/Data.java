package osc.greenlive.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
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
	@Column(name = "id_data")
	private Long id_data;
	
	private String name_data;
	private String path_file;
	private String data_type_content ;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kit_key", referencedColumnName = "id_kit")
	@MapsId
    private Kit kit;
}
