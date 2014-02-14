package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the projet database table.
 * 
 */
@Entity
public class Projet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_projet")
	private Integer idProjet;

	@Column(name="libelle_projet")
	private String libelleProjet;

	public Projet() {
	}

	public Integer getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}

	public String getLibelleProjet() {
		return this.libelleProjet;
	}

	public void setLibelleProjet(String libelleProjet) {
		this.libelleProjet = libelleProjet;
	}

}