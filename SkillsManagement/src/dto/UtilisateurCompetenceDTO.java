package dto;

public class UtilisateurCompetenceDTO
{
	private int idUser;
	private int idComp;
	private String niveauComp;
	
	public UtilisateurCompetenceDTO()
	{
		
	}
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdComp(int idComp) {
		this.idComp = idComp;
	}
	public int getIdComp() {
		return idComp;
	}
	public void setNiveauComp(String niveauComp) {
		this.niveauComp = niveauComp;
	}
	public String getNiveauComp() {
		return niveauComp;
	}
}
