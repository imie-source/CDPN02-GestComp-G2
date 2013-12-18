package dao.impl;

import dao.factory.FactoryDAO;
import dao.interfaces.IUtilisateurCompetenceDAO;
import dto.UtilisateurCompetenceDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurCompetenceDAO implements IUtilisateurCompetenceDAO{

	private Connection conn = null;
	
	public UtilisateurCompetenceDAO(FactoryDAO instance)
	{
		this.conn = (Connection) instance;
	}

	@Override
	public int updateUtilisateurCompetence(UtilisateurCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUser();
		int idComp = unDTO.getIdComp();
		String niveauComp = unDTO.getNiveauComp();
		String query = "UPDATE utilisateur_competence " +
						"SET niveau_competence = '"+niveauComp+"' WHERE id_utilisateur = '"+idUser+"' AND id_competence = '"+idComp+"'";
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
	public int insertUtilisateurCompetence(UtilisateurCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUser();
		int idComp = unDTO.getIdComp();
		String niveauComp = unDTO.getNiveauComp();
		String query = "INSERT INTO utilisateur_competence(id_utilisateur, id_competence, niveau_competence) " +
						"VALUES('"+idUser+"', '"+idComp+"', '"+niveauComp+"')";
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
	public int deleteUtilisateurCompetence(UtilisateurCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUser();
		int idComp = unDTO.getIdComp();
		String query = "DELETE FROM utilisateur_competence WHERE id_utilisateur = '"+idUser+"' AND id_competence = '"+idComp+"'";
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
	public List<UtilisateurCompetenceDTO> getAllUtilisateurCompetence(){
		// TODO Auto-generated method stub
		String query = "SELECT id_utilisateur, id_competence, niveau_competence FROM utilisateur_competence";
		ResultSet rs = null;
		List<UtilisateurCompetenceDTO> listeDTO = new ArrayList<UtilisateurCompetenceDTO>();
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UtilisateurCompetenceDTO newDTO = new UtilisateurCompetenceDTO();
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
	public List<UtilisateurCompetenceDTO> getUtilisateurCompetenceByIdUser(UtilisateurCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idUser = unDTO.getIdUser();
		String query = "SELECT id_utilisateur, id_competence, niveau_competence FROM utilisateur_competence WHERE id_utilisateur = '"+idUser+"'";
		ResultSet rs = null;
		List<UtilisateurCompetenceDTO> listeDTO = new ArrayList<UtilisateurCompetenceDTO>();
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UtilisateurCompetenceDTO newDTO = new UtilisateurCompetenceDTO();
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
	public List<UtilisateurCompetenceDTO> getUtilisateurCompetenceByNiveau(UtilisateurCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		String niveauComp = unDTO.getNiveauComp();
		String query = "SELECT id_utilisateur, id_competence, niveau_competence FROM utilisateur_competence WHERE niveau_competence = '"+niveauComp+"'";
		ResultSet rs = null;
		List<UtilisateurCompetenceDTO> listeDTO = new ArrayList<UtilisateurCompetenceDTO>();
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UtilisateurCompetenceDTO newDTO = new UtilisateurCompetenceDTO();
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
	public List<UtilisateurCompetenceDTO> getUtilisateurCompetenceByIdComp(UtilisateurCompetenceDTO unDTO) {
		// TODO Auto-generated method stub
		int idComp = unDTO.getIdComp();
		String query = "SELECT id_utilisateur, id_competence, niveau_competence FROM utilisateur_competence WHERE id_competence = '"+idComp+"'";
		ResultSet rs = null;
		List<UtilisateurCompetenceDTO> listeDTO = new ArrayList<UtilisateurCompetenceDTO>();
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				UtilisateurCompetenceDTO newDTO = new UtilisateurCompetenceDTO();
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
