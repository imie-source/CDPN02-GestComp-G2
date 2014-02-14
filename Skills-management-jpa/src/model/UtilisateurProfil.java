package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utilisateur_profil database table.
 * 
 */
@Entity
@Table(name="utilisateur_profil")
public class UtilisateurProfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtilisateurProfilPK id;

	public UtilisateurProfil() {
	}

	public UtilisateurProfilPK getId() {
		return this.id;
	}

	public void setId(UtilisateurProfilPK id) {
		this.id = id;
	}

}