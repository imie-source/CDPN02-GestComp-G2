package fr.imie.skills.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.imie.skills.dao.interfaces.ITacheDAO;
import fr.imie.skills.dto.TacheDTO;

public class TacheDAO implements ITacheDAO
{

	private Connection conn;
	
	public TacheDAO(Connection connection)
	{
		this.conn = connection;
	}
	
	@Override
	public int updateTache(TacheDTO tache) 
	{
		int idTache = tache.getIdTache();
		String libelleTache = tache.getLibelleTache();
		int dureeEstimee = tache.getDureeEstimeeTache();
		String statutTache = tache.getStatutTache();
		int idProjet = tache.getIdProjet();
		int idCompetence = tache.getIdCompetence();
		String query = "UPDATE tache SET libelle_tache = ?, duree_estimee_tache = ?, statut_tache = ?, id_projet = ?, id_competence = ? WHERE id_tache = ?";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setString(1, libelleTache);
			stt.setInt(2, dureeEstimee);
			stt.setString(3, statutTache);
			stt.setInt(4, idProjet);
			stt.setInt(5, idCompetence);
			stt.setInt(6, idTache);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertTache(TacheDTO tache) 
	{
		String libelleTache = tache.getLibelleTache();
		int dureeEstimee = tache.getDureeEstimeeTache();
		String statutTache = tache.getStatutTache();
		int idProjet = tache.getIdProjet();
		int idCompetence = tache.getIdCompetence();
		String query = "INSERT INTO tache(libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence) VALUES(?, ?, ?, ?, ?)";
		int i = 0;
		
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setString(1, libelleTache);
			stt.setInt(2, dureeEstimee);
			stt.setString(3, statutTache);
			stt.setInt(4, idProjet);
			stt.setInt(5, idCompetence);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteTache(TacheDTO tache) 
	{
		int idTache = tache.getIdTache();
		String query = "DELETE FROM tache WHERE id_tache = ?";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idTache);
			i = stt.executeUpdate(query);			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<TacheDTO> getTacheByProjet(TacheDTO tache) 
	{
		int idProjet = tache.getIdProjet();
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache WHERE id_projet = ?";
		ResultSet rs = null;
		List<TacheDTO> listeTache = new ArrayList<TacheDTO>();
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idProjet);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				TacheDTO newTache = new TacheDTO();
				newTache.setIdTache(rs.getInt("id_tache"));
				newTache.setLibelleTache(rs.getString("libelle_tache"));
				newTache.setDureeEstimeeTache(rs.getInt("duree_estimee_tache"));
				newTache.setStatutTache(rs.getString("statut_tache"));
				newTache.setIdProjet(rs.getInt("id_projet"));
				newTache.setIdCompetence(rs.getInt("id_competence"));
				listeTache.add(newTache);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listeTache;
	}

	@Override
	public List<TacheDTO> getTacheByCompetence(TacheDTO tache) 
	{
		int idCompetence = tache.getIdCompetence();
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache WHERE id_competence = ?";
		ResultSet rs = null;
		List<TacheDTO> listeTache = new ArrayList<TacheDTO>();
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idCompetence);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				TacheDTO newTache = new TacheDTO();
				newTache.setIdTache(rs.getInt("id_tache"));
				newTache.setLibelleTache(rs.getString("libelle_tache"));
				newTache.setDureeEstimeeTache(rs.getInt("duree_estimee_tache"));
				newTache.setStatutTache(rs.getString("statut_tache"));
				newTache.setIdProjet(rs.getInt("id_projet"));
				newTache.setIdCompetence(rs.getInt("id_competence"));
				listeTache.add(newTache);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listeTache;
	}

	@Override
	public TacheDTO getTacheById(TacheDTO tache)
	{
		int idTache = tache.getIdTache();
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache WHERE id_tache = ?";
		ResultSet rs = null;
		TacheDTO newTache = new TacheDTO();
		try
		{
			
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idTache);
			rs = stt.executeQuery(query);
			newTache.setIdTache(rs.getInt("id_tache"));
			newTache.setLibelleTache(rs.getString("libelle_tache"));
			newTache.setDureeEstimeeTache(rs.getInt("duree_estimee_tache"));
			newTache.setStatutTache(rs.getString("statut_tache"));
			newTache.setIdProjet(rs.getInt("id_projet"));
			newTache.setIdCompetence(rs.getInt("id_competence"));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return newTache;
	}

	@Override
	public List<TacheDTO> getTacheByDuree(TacheDTO tache) 
	{
		int dureeEstimee = tache.getDureeEstimeeTache();
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache WHERE duree_estimee_tache = ?";
		ResultSet rs = null;
		List<TacheDTO> listeTache = new ArrayList<TacheDTO>();
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, dureeEstimee);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				TacheDTO newTache = new TacheDTO();
				newTache.setIdTache(rs.getInt("id_tache"));
				newTache.setLibelleTache(rs.getString("libelle_tache"));
				newTache.setDureeEstimeeTache(rs.getInt("duree_estimee_tache"));
				newTache.setStatutTache(rs.getString("statut_tache"));
				newTache.setIdProjet(rs.getInt("id_projet"));
				newTache.setIdCompetence(rs.getInt("id_competence"));
				listeTache.add(newTache);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listeTache;
	}

	@Override
	public List<TacheDTO> getAllTache() 
	{
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache";
		ResultSet rs = null;
		List<TacheDTO> listeTache = new ArrayList<TacheDTO>();
		try
		{
			Statement stt = this.conn.createStatement();
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				TacheDTO newTache = new TacheDTO();
				newTache.setIdTache(rs.getInt("id_tache"));
				newTache.setLibelleTache(rs.getString("libelle_tache"));
				newTache.setDureeEstimeeTache(rs.getInt("duree_estimee_tache"));
				newTache.setStatutTache(rs.getString("statut_tache"));
				newTache.setIdProjet(rs.getInt("id_projet"));
				newTache.setIdCompetence(rs.getInt("id_competence"));
				listeTache.add(newTache);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listeTache;
	}

}
