package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the promotion database table.
 * 
 */
@Entity
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_promotion")
	private Integer idPromotion;

	@Temporal(TemporalType.DATE)
	@Column(name="annee_promotion")
	private Date anneePromotion;

	@Column(name="libelle_promotion")
	private String libellePromotion;

	public Promotion() {
	}

	public Integer getIdPromotion() {
		return this.idPromotion;
	}

	public void setIdPromotion(Integer idPromotion) {
		this.idPromotion = idPromotion;
	}

	public Date getAnneePromotion() {
		return this.anneePromotion;
	}

	public void setAnneePromotion(Date anneePromotion) {
		this.anneePromotion = anneePromotion;
	}

	public String getLibellePromotion() {
		return this.libellePromotion;
	}

	public void setLibellePromotion(String libellePromotion) {
		this.libellePromotion = libellePromotion;
	}

}