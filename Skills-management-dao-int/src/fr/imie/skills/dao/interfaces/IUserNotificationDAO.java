package fr.imie.skills.dao.interfaces;

import java.util.List;

import fr.imie.skills.dto.UserNotificationDTO;

public interface IUserNotificationDAO {

	public int insertUtilisateurNotification(UserNotificationDTO unDTO);
	
	public int deleteUtilisateurNotification(UserNotificationDTO unDTO);
	
	public int updateUtilisateurNotification(UserNotificationDTO unDTO);
	
	public List<UserNotificationDTO> getAllUtilisateurNotification();
	
	public List<UserNotificationDTO> getUtilisateurNotificationByIdUtilisateur(UserNotificationDTO unDTO);
	
	public List<UserNotificationDTO> getUtilisateurNotificationByIdNotification(UserNotificationDTO unDTO);
	
	public List<UserNotificationDTO> getUtilisateurNotificationByIdNotificationPere(UserNotificationDTO unDTO);
}

