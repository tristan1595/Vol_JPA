package sopra.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "airline_flight")
public class CompagnieAerienneVol {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "flight_number")
	private String numeroVol;
	@Transient
	private CompagnieAerienne compagnieAerienne;
	@Transient
	private Vol vol;

	public CompagnieAerienneVol() {
		super();
	}
	
	public CompagnieAerienneVol(String numeroVol) {
		super();
		this.numeroVol = numeroVol;
	}

	public CompagnieAerienneVol(Long id, String numeroVol) {
		super();
		this.id = id;
		this.numeroVol = numeroVol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroVol() {
		return numeroVol;
	}

	public void setNumeroVol(String numeroVol) {
		this.numeroVol = numeroVol;
	}

	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

}
