package fr.imie.skills.dto;

import java.util.Date;

public class PromotionDTO {

	private int id_promotion;
	private String libelle_promotion;
	private Date annee_promotion;
	
	public PromotionDTO()
	{
		
	}
	
	public void setAnnee_promotion(Date annee_promotion) {
		this.annee_promotion = annee_promotion;
	}
	public Date getAnnee_promotion() {
		return annee_promotion;
	}
	public void setLibelle_promotion(String libelle_promotion) {
		this.libelle_promotion = libelle_promotion;
	}
	public String getLibelle_promotion() {
		return libelle_promotion;
	}
	public void setId_promotion(int id_promotion) {
		this.id_promotion = id_promotion;
	}
	public int getId_promotion() {
		return id_promotion;
	}
}
