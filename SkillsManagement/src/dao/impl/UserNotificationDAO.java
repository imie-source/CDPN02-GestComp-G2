package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IUserNotificationDAO;
import dto.UserNotificationDTO;

public class UserNotificationDAO implements IUserNotificationDAO {

	private Connection conn = null;
	
	public UserNotificationDAO(FactoryDAO instance)
	{
		this.conn = instance.getConn();
	}
	@Override
	public int insertUtilisateurNotification(UserNotificationDTO unDTO) {
		// TODO Auto-generated method stub
		int idNot = unDTO.getIdNotification();
		int idUser = unDTO.getIdUtilisateur();
		int idNotPere = unDTO.getIdNotificationPere();
		String query = "INSERT INTO utilisateur_notification(id_notification, id_utilisateur, id_notification_pere)"
						+ "VALUES('"+idNot+"', '"+idUser+"', '"+idNotPere+"')";
		int i = 0;
		try
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteUtilisateurNotification(UserNotificationDTO unDTO) {
		// TODO Auto-generated method stub
		int idNot = unDTO.getIdNotification();
		String query = "DELETE FROM utilisateur_notification WHERE id_notification = '"+idNot+"'";
		int i = 0;
		
		try
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updateUtilisateurNotification(UserNotificationDTO unDTO) {
		// TODO Auto-generated method stub
		int idNot = unDTO.getIdNotification();
		int idUser = unDTO.getIdUtilisateur();
		int idNotPere = unDTO.getIdNotificationPere();
		String query = "UPDATE utilisateur_notification"
						+" SET id_utilisateur = '"+idUser+"', id_notification_pere = '"+idNotPere+"'"
						+" WHERE id_notification = '"+idNot+"'";
		int i = 0;
		try
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<UserNotificationDTO> getAllUtilisateurNotification() {
		// TODO Auto-generated method stub
		String query = "SELECT id_notification, id_utilisateur, id_notificatio_pere FROM utilisateur_notification";
		List<UserNotificationDTO> listeDTO = new ArrayList<UserNotificationDTO>();
		ResultSet rs = null;
		
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UserNotificationDTO unDTO = new UserNotificationDTO();
				unDTO.setIdNotification(rs.getInt("id_notification"));
				unDTO.setIdUtilisateur(rs.getInt("id_utilisateur"));
				unDTO.setIdNotificationPere(rs.getInt("id_notification_pere"));
				listeDTO.add(unDTO);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeDTO;
	}

	@Override
	public List<UserNotificationDTO> getUtilisateurNotificationByIdUtilisateur(UserNotificationDTO unDTO)
	{
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUtilisateur();
		String query = "SELECT id_notification, id_utilisateur, id_notificatio_pere FROM utilisateur_notification WHERE id_utilisateur = '"+idUser+"'";
		List<UserNotificationDTO> listeDTO = new ArrayList<UserNotificationDTO>();
		ResultSet rs = null;
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UserNotificationDTO newUnDTO = new UserNotificationDTO();
				unDTO.setIdNotification(rs.getInt("id_notification"));
				unDTO.setIdUtilisateur(rs.getInt("id_utilisateur"));
				unDTO.setIdNotificationPere(rs.getInt("id_notification_pere"));
				listeDTO.add(newUnDTO);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeDTO;
	}

	@Override
	public List<UserNotificationDTO> getUtilisateurNotificationByIdNotification(UserNotificationDTO unDTO) {
		// TODO Auto-generated method stub
		int idNot = unDTO.getIdNotification();
		String query = "SELECT id_notification, id_utilisateur, id_notificatio_pere FROM utilisateur_notification WHERE id_notification = '"+idNot+"'";
		List<UserNotificationDTO> listeDTO = new ArrayList<UserNotificationDTO>();
		ResultSet rs = null;
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UserNotificationDTO newUnDTO = new UserNotificationDTO();
				unDTO.setIdNotification(rs.getInt("id_notification"));
				unDTO.setIdUtilisateur(rs.getInt("id_utilisateur"));
				unDTO.setIdNotificationPere(rs.getInt("id_notification_pere"));
				listeDTO.add(newUnDTO);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeDTO;
	}
	@Override
	public List<UserNotificationDTO> getUtilisateurNotificationByIdNotificationPere(
			UserNotificationDTO unDTO) {
		// TODO Auto-generated method stub
		int idNotPere = unDTO.getIdNotificationPere();
		String query = "SELECT id_notification, id_utilisateur, id_notificatio_pere FROM utilisateur_notification WHERE id_notification_pere = '"+idNotPere+"'";
		List<UserNotificationDTO> listeDTO = new ArrayList<UserNotificationDTO>();
		ResultSet rs = null;
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UserNotificationDTO newUnDTO = new UserNotificationDTO();
				unDTO.setIdNotification(rs.getInt("id_notification"));
				unDTO.setIdUtilisateur(rs.getInt("id_utilisateur"));
				unDTO.setIdNotificationPere(rs.getInt("id_notification_pere"));
				listeDTO.add(newUnDTO);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeDTO;
	}

}
