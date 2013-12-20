package fr.imie.skills.dto;

public class TacheDTO {

	private int idTache;
	private String libelleTache;
	private int dureeEstimeeTache;
	private String statutTache;
	private int idProjet;
	private int idCompetence;
	
	public TacheDTO()
	{
		
	}

	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}

	public int getIdTache() {
		return idTache;
	}

	public void setLibelleTache(String libelleTache) {
		this.libelleTache = libelleTache;
	}

	public String getLibelleTache() {
		return libelleTache;
	}

	public void setDureeEstimeeTache(int dureeEstimeeTache) {
		this.dureeEstimeeTache = dureeEstimeeTache;
	}

	public int getDureeEstimeeTache() {
		return dureeEstimeeTache;
	}

	public void setStatutTache(String statutTache) {
		this.statutTache = statutTache;
	}

	public String getStatutTache() {
		return statutTache;
	}

	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}

	public int getIdProjet() {
		return idProjet;
	}

	public void setIdCompetence(int idCompetence) {
		this.idCompetence = idCompetence;
	}

	public int getIdCompetence() {
		return idCompetence;
	}
}
