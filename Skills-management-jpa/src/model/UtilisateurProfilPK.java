package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the utilisateur_profil database table.
 * 
 */
@Embeddable
public class UtilisateurProfilPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_utilisateur")
	private String idUtilisateur;

	@Column(name="id_profil")
	private Integer idProfil;

	public UtilisateurProfilPK() {
	}
	public String getIdUtilisateur() {
		return this.idUtilisateur;
	}
	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public Integer getIdProfil() {
		return this.idProfil;
	}
	public void setIdProfil(Integer idProfil) {
		this.idProfil = idProfil;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtilisateurProfilPK)) {
			return false;
		}
		UtilisateurProfilPK castOther = (UtilisateurProfilPK)other;
		return 
			this.idUtilisateur.equals(castOther.idUtilisateur)
			&& this.idProfil.equals(castOther.idProfil);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUtilisateur.hashCode();
		hash = hash * prime + this.idProfil.hashCode();
		
		return hash;
	}
}