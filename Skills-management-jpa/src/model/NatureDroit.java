package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nature_droit database table.
 * 
 */
@Entity
@Table(name="nature_droit")
public class NatureDroit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_nature")
	private Integer idNature;

	@Column(name="nom_nature")
	private String nomNature;

	public NatureDroit() {
	}

	public Integer getIdNature() {
		return this.idNature;
	}

	public void setIdNature(Integer idNature) {
		this.idNature = idNature;
	}

	public String getNomNature() {
		return this.nomNature;
	}

	public void setNomNature(String nomNature) {
		this.nomNature = nomNature;
	}

}