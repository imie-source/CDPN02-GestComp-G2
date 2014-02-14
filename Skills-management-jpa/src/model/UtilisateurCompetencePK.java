package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the utilisateur_competence database table.
 * 
 */
@Embeddable
public class UtilisateurCompetencePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_utilisateur")
	private String idUtilisateur;

	@Column(name="id_competence")
	private Integer idCompetence;

	public UtilisateurCompetencePK() {
	}
	public String getIdUtilisateur() {
		return this.idUtilisateur;
	}
	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public Integer getIdCompetence() {
		return this.idCompetence;
	}
	public void setIdCompetence(Integer idCompetence) {
		this.idCompetence = idCompetence;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtilisateurCompetencePK)) {
			return false;
		}
		UtilisateurCompetencePK castOther = (UtilisateurCompetencePK)other;
		return 
			this.idUtilisateur.equals(castOther.idUtilisateur)
			&& this.idCompetence.equals(castOther.idCompetence);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUtilisateur.hashCode();
		hash = hash * prime + this.idCompetence.hashCode();
		
		return hash;
	}
}