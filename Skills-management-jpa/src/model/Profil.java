package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profil database table.
 * 
 */
@Entity
public class Profil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_profil")
	private Integer idProfil;

	@Column(name="id_profil_pere")
	private Integer idProfilPere;

	@Column(name="nom_profil")
	private String nomProfil;

	public Profil() {
	}

	public Integer getIdProfil() {
		return this.idProfil;
	}

	public void setIdProfil(Integer idProfil) {
		this.idProfil = idProfil;
	}

	public Integer getIdProfilPere() {
		return this.idProfilPere;
	}

	public void setIdProfilPere(Integer idProfilPere) {
		this.idProfilPere = idProfilPere;
	}

	public String getNomProfil() {
		return this.nomProfil;
	}

	public void setNomProfil(String nomProfil) {
		this.nomProfil = nomProfil;
	}

}