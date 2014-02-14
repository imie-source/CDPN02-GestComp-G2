package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the profil_fonction_nature database table.
 * 
 */
@Embeddable
public class ProfilFonctionNaturePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_profil")
	private Integer idProfil;

	@Column(name="id_fonction")
	private Integer idFonction;

	@Column(name="id_nature")
	private Integer idNature;

	public ProfilFonctionNaturePK() {
	}
	public Integer getIdProfil() {
		return this.idProfil;
	}
	public void setIdProfil(Integer idProfil) {
		this.idProfil = idProfil;
	}
	public Integer getIdFonction() {
		return this.idFonction;
	}
	public void setIdFonction(Integer idFonction) {
		this.idFonction = idFonction;
	}
	public Integer getIdNature() {
		return this.idNature;
	}
	public void setIdNature(Integer idNature) {
		this.idNature = idNature;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProfilFonctionNaturePK)) {
			return false;
		}
		ProfilFonctionNaturePK castOther = (ProfilFonctionNaturePK)other;
		return 
			this.idProfil.equals(castOther.idProfil)
			&& this.idFonction.equals(castOther.idFonction)
			&& this.idNature.equals(castOther.idNature);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idProfil.hashCode();
		hash = hash * prime + this.idFonction.hashCode();
		hash = hash * prime + this.idNature.hashCode();
		
		return hash;
	}
}