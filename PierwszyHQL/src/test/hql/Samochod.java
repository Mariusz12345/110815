package test.hql;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "Samochod",schema = "test7")
public class Samochod {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSamochodu;
	private String nazwaSamochodu;
	
	
	public Long getIdSamochodu() {
		return idSamochodu;
	}
	public void setIdSamochodu(Long idSamochodu) {
		this.idSamochodu = idSamochodu;
	}
	public String getNazwaSamochodu() {
		return nazwaSamochodu;
	}
	public void setNazwaSamochodu(String nazwaSamochodu) {
		this.nazwaSamochodu = nazwaSamochodu;
	}
}
