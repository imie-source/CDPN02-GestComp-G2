package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tache database table.
 * 
 */
@Entity
public class Tache implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tache")
	private Integer idTache;

	@Column(name="duree_estimee_tache")
	private Integer dureeEstimeeTache;

	@Column(name="id_competence")
	private Integer idCompetence;

	@Column(name="id_projet")
	private Integer idProjet;

	@Column(name="libelle_tache")
	private String libelleTache;

	@Column(name="statut_tache")
	private String statutTache;

	public Tache() {
	}

	public Integer getIdTache() {
		return this.idTache;
	}

	public void setIdTache(Integer idTache) {
		this.idTache = idTache;
	}

	public Integer getDureeEstimeeTache() {
		return this.dureeEstimeeTache;
	}

	public void setDureeEstimeeTache(Integer dureeEstimeeTache) {
		this.dureeEstimeeTache = dureeEstimeeTache;
	}

	public Integer getIdCompetence() {
		return this.idCompetence;
	}

	public void setIdCompetence(Integer idCompetence) {
		this.idCompetence = idCompetence;
	}

	public Integer getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}

	public String getLibelleTache() {
		return this.libelleTache;
	}

	public void setLibelleTache(String libelleTache) {
		this.libelleTache = libelleTache;
	}

	public String getStatutTache() {
		return this.statutTache;
	}

	public void setStatutTache(String statutTache) {
		this.statutTache = statutTache;
	}

}