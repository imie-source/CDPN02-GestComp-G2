package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utilisateur_projet database table.
 * 
 */
@Entity
@Table(name="utilisateur_projet")
public class UtilisateurProjet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtilisateurProjetPK id;

	public UtilisateurProjet() {
	}

	public UtilisateurProjetPK getId() {
		return this.id;
	}

	public void setId(UtilisateurProjetPK id) {
		this.id = id;
	}

}