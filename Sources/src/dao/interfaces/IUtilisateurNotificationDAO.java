package dao.interfaces;

import java.util.List;

import dto.UtilisateurNotificationDTO;

public interface IUtilisateurNotificationDAO {

	public int insertUtilisateurNotification(UtilisateurNotificationDTO unDTO);
	
	public int deleteUtilisateurNotification(UtilisateurNotificationDTO unDTO);
	
	public int updateUtilisateurNotification(UtilisateurNotificationDTO unDTO);
	
	public List<UtilisateurNotificationDTO> getAllUtilisateurNotification();
	
	public List<UtilisateurNotificationDTO> getUtilisateurNotificationByIdUtilisateur(UtilisateurNotificationDTO unDTO);
	
	public List<UtilisateurNotificationDTO> getUtilisateurNotificationByIdNotification(UtilisateurNotificationDTO unDTO);
	
	public List<UtilisateurNotificationDTO> getUtilisateurNotificationByIdNotificationPere(UtilisateurNotificationDTO unDTO);
}

