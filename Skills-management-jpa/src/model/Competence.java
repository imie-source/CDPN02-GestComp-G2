package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the competence database table.
 * 
 */
@Entity
public class Competence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_competence")
	private Integer idCompetence;

	@Column(name="id_competence_pere")
	private Integer idCompetencePere;

	@Column(name="libelle_competence")
	private String libelleCompetence;

	public Competence() {
	}

	public Integer getIdCompetence() {
		return this.idCompetence;
	}

	public void setIdCompetence(Integer idCompetence) {
		this.idCompetence = idCompetence;
	}

	public Integer getIdCompetencePere() {
		return this.idCompetencePere;
	}

	public void setIdCompetencePere(Integer idCompetencePere) {
		this.idCompetencePere = idCompetencePere;
	}

	public String getLibelleCompetence() {
		return this.libelleCompetence;
	}

	public void setLibelleCompetence(String libelleCompetence) {
		this.libelleCompetence = libelleCompetence;
	}

}