package dao.impl;

import dao.factory.FactoryDAO;
import dao.interfaces.IUserCompetenceDAO;
import dto.UserCompetenceDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserCompetenceDAO implements IUserCompetenceDAO{

	private Connection conn = null;
	
	public UserCompetenceDAO(FactoryDAO instance)
	{
		this.conn = (Connection) instance;
	}

	@Override
	public int updateUtilisateurCompetence(UserCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUser();
		int idComp = unDTO.getIdComp();
		String niveauComp = unDTO.getNiveauComp();
		String query = "UPDATE utilisateur_competence " +
						"SET niveau_competence = ? WHERE id_utilisateur = ? AND id_competence = ?";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setString(1, niveauComp);
			stt.setInt(2, idUser);
			stt.setInt(3, idComp);
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
	public int insertUtilisateurCompetence(UserCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUser();
		int idComp = unDTO.getIdComp();
		String niveauComp = unDTO.getNiveauComp();
		String query = "INSERT INTO utilisateur_competence(id_utilisateur, id_competence, niveau_competence) " +
						"VALUES(?, ?, ?)";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idUser);
			stt.setInt(2, idComp);
			stt.setString(3, niveauComp);
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
	public int deleteUtilisateurCompetence(UserCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUser();
		int idComp = unDTO.getIdComp();
		String query = "DELETE FROM utilisateur_competence WHERE id_utilisateur = ? AND id_competence = ?";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idUser);
			stt.setInt(2, idComp);
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
	public List<UserCompetenceDTO> getAllUtilisateurCompetence(){
		// TODO Auto-generated method stub
		String query = "SELECT id_utilisateur, id_competence, niveau_competence FROM utilisateur_competence";
		ResultSet rs = null;
		List<UserCompetenceDTO> listeDTO = new ArrayList<UserCompetenceDTO>();
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UserCompetenceDTO newDTO = new UserCompetenceDTO();
				newDTO.setIdUser(rs.getInt("id_utilisateur"));
				newDTO.setIdComp(rs.getInt("id_competence"));
				newDTO.setNiveauComp(rs.getString("niveau_competence"));
				listeDTO.add(newDTO);
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
	public List<UserCompetenceDTO> getUtilisateurCompetenceByIdUser(UserCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUser();
		String query = "SELECT id_utilisateur, id_competence, niveau_competence FROM utilisateur_competence WHERE id_utilisateur = ?";
		ResultSet rs = null;
		List<UserCompetenceDTO> listeDTO = new ArrayList<UserCompetenceDTO>();
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idUser);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UserCompetenceDTO newDTO = new UserCompetenceDTO();
				newDTO.setIdUser(rs.getInt("id_utilisateur"));
				newDTO.setIdComp(rs.getInt("id_competence"));
				newDTO.setNiveauComp(rs.getString("niveau_competence"));
				listeDTO.add(newDTO);
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
	public List<UserCompetenceDTO> getUtilisateurCompetenceByNiveau(UserCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		String niveauComp = unDTO.getNiveauComp();
		String query = "SELECT id_utilisateur, id_competence, niveau_competence FROM utilisateur_competence WHERE niveau_competence = ?";
		ResultSet rs = null;
		List<UserCompetenceDTO> listeDTO = new ArrayList<UserCompetenceDTO>();
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setString(1, niveauComp);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UserCompetenceDTO newDTO = new UserCompetenceDTO();
				newDTO.setIdUser(rs.getInt("id_utilisateur"));
				newDTO.setIdComp(rs.getInt("id_competence"));
				newDTO.setNiveauComp(rs.getString("niveau_competence"));
				listeDTO.add(newDTO);
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
	public List<UserCompetenceDTO> getUtilisateurCompetenceByIdComp(UserCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idComp = unDTO.getIdComp();
		String query = "SELECT id_utilisateur, id_competence, niveau_competence FROM utilisateur_competence WHERE id_competence = ?";
		ResultSet rs = null;
		List<UserCompetenceDTO> listeDTO = new ArrayList<UserCompetenceDTO>();
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idComp);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UserCompetenceDTO newDTO = new UserCompetenceDTO();
				newDTO.setIdUser(rs.getInt("id_utilisateur"));
				newDTO.setIdComp(rs.getInt("id_competence"));
				newDTO.setNiveauComp(rs.getString("niveau_competence"));
				listeDTO.add(newDTO);
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
