package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profil_fonction_nature database table.
 * 
 */
@Entity
@Table(name="profil_fonction_nature")
public class ProfilFonctionNature implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProfilFonctionNaturePK id;

	public ProfilFonctionNature() {
	}

	public ProfilFonctionNaturePK getId() {
		return this.id;
	}

	public void setId(ProfilFonctionNaturePK id) {
		this.id = id;
	}

}