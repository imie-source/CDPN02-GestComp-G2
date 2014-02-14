package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the utilisateur_projet database table.
 * 
 */
@Embeddable
public class UtilisateurProjetPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_utilisateur")
	private Integer idUtilisateur;

	@Column(name="id_projet")
	private Integer idProjet;

	public UtilisateurProjetPK() {
	}
	public Integer getIdUtilisateur() {
		return this.idUtilisateur;
	}
	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public Integer getIdProjet() {
		return this.idProjet;
	}
	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtilisateurProjetPK)) {
			return false;
		}
		UtilisateurProjetPK castOther = (UtilisateurProjetPK)other;
		return 
			this.idUtilisateur.equals(castOther.idUtilisateur)
			&& this.idProjet.equals(castOther.idProjet);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUtilisateur.hashCode();
		hash = hash * prime + this.idProjet.hashCode();
		
		return hash;
	}
}