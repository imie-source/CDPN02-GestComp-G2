package fr.imie.skills.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.imie.skills.dao.interfaces.IUserNotificationDAO;
import fr.imie.skills.dto.UserNotificationDTO;

public class UserNotificationDAO implements IUserNotificationDAO {

	private Connection conn;
	
	public UserNotificationDAO(Connection connection)
	{
		this.conn = connection;
	}
	@Override
	public int insertUtilisateurNotification(UserNotificationDTO unDTO) {
		// TODO Auto-generated method stub
		int idNot = unDTO.getIdNotification();
		int idUser = unDTO.getIdUtilisateur();
		int idNotPere = unDTO.getIdNotificationPere();
		String query = "INSERT INTO utilisateur_notification(id_notification, id_utilisateur, id_notification_pere)"
						+ "VALUES(?, ?, ?)";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idNot);
			stt.setInt(2, idUser);
			stt.setInt(3, idNotPere);
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
		String query = "DELETE FROM utilisateur_notification WHERE id_notification = ?";
		int i = 0;
		
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idNot);
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
						+" SET id_utilisateur = ?, id_notification_pere = ?"
						+" WHERE id_notification = ?";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idUser);
			stt.setInt(2, idNotPere);
			stt.setInt(3, idNot);
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
		String query = "SELECT id_notification, id_utilisateur, id_notificatio_pere FROM utilisateur_notification WHERE id_utilisateur = ?";
		List<UserNotificationDTO> listeDTO = new ArrayList<UserNotificationDTO>();
		ResultSet rs = null;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idUser);
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
		String query = "SELECT id_notification, id_utilisateur, id_notificatio_pere FROM utilisateur_notification WHERE id_notification = ?";
		List<UserNotificationDTO> listeDTO = new ArrayList<UserNotificationDTO>();
		ResultSet rs = null;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idNot);
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
		String query = "SELECT id_notification, id_utilisateur, id_notificatio_pere FROM utilisateur_notification WHERE id_notification_pere = ?";
		List<UserNotificationDTO> listeDTO = new ArrayList<UserNotificationDTO>();
		ResultSet rs = null;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idNotPere);
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
