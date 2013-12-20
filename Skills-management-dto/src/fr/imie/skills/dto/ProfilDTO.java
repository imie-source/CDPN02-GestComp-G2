package fr.imie.skills.dto;

public class ProfilDTO {

	private int profil_id;
	private String nom_profil;
	private int profil_pere_id;
	
	public ProfilDTO()
	{
		
	}
	
	public void setProfil_pere_id(int profil_pere_id) {
		this.profil_pere_id = profil_pere_id;
	}
	public int getProfil_pere_id() {
		return profil_pere_id;
	}
	public void setNom_profil(String nom_profil) {
		this.nom_profil = nom_profil;
	}
	public String getNom_profil() {
		return nom_profil;
	}
	public void setProfil_id(int profil_id) {
		this.profil_id = profil_id;
	}
	public int getProfil_id() {
		return profil_id;
	}
}
