package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Data														// getter ve setter gibi metodları oluşturur
@AllArgsConstructor											// parametreli constructor oluşturur
@NoArgsConstructor											// parametresiz constructor oluşturur
@Entity
public class Brand {
	
	@Id 													// veritabanında primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)		// ID si otomatik artan demek
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	// lombak için sildik
//	public Brand() {
//	}
//
//	public Brand(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

}
