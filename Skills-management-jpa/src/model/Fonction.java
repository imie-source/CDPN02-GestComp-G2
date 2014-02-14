package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fonction database table.
 * 
 */
@Entity
public class Fonction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_fonction")
	private Integer idFonction;

	@Column(name="nom_fonction")
	private String nomFonction;

	public Fonction() {
	}

	public Integer getIdFonction() {
		return this.idFonction;
	}

	public void setIdFonction(Integer idFonction) {
		this.idFonction = idFonction;
	}

	public String getNomFonction() {
		return this.nomFonction;
	}

	public void setNomFonction(String nomFonction) {
		this.nomFonction = nomFonction;
	}

}