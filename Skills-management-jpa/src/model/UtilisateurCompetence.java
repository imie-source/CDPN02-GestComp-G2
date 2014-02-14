package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utilisateur_competence database table.
 * 
 */
@Entity
@Table(name="utilisateur_competence")
public class UtilisateurCompetence implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtilisateurCompetencePK id;

	@Column(name="niveau_competence")
	private String niveauCompetence;

	public UtilisateurCompetence() {
	}

	public UtilisateurCompetencePK getId() {
		return this.id;
	}

	public void setId(UtilisateurCompetencePK id) {
		this.id = id;
	}

	public String getNiveauCompetence() {
		return this.niveauCompetence;
	}

	public void setNiveauCompetence(String niveauCompetence) {
		this.niveauCompetence = niveauCompetence;
	}

}