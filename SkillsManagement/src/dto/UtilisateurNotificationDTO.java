package dto;

public class UtilisateurNotificationDTO {

	private int idNotification;
	private int idUtilisateur;
	private int idNotificationPere;
	
	public UtilisateurNotificationDTO()
	{
		
	}

	public void setIdNotification(int idNotification) {
		this.idNotification = idNotification;
	}

	public int getIdNotification() {
		return idNotification;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdNotificationPere(int idNotificationPere) {
		this.idNotificationPere = idNotificationPere;
	}

	public int getIdNotificationPere() {
		return idNotificationPere;
	}
}
