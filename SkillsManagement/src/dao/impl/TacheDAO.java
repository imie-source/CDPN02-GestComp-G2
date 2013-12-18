package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.ITacheDAO;
import dto.TacheDTO;

public class TacheDAO implements ITacheDAO
{

	private Connection conn = null;
	
	public TacheDAO(FactoryDAO instance)
	{
		this.conn = instance.getConn();
	}
	
	@Override
	public int updateTache(TacheDTO tache) {
		// TODO Auto-generated method stub
		int idTache = tache.getIdTache();
		String libelleTache = tache.getLibelleTache();
		int dureeEstimee = tache.getDureeEstimeeTache();
		String statutTache = tache.getStatutTache();
		int idProjet = tache.getIdProjet();
		int idCompetence = tache.getIdCompetence();
		String query = "UPDATE tache SET libelle_tache = '"+libelleTache+"', duree_estimee_tache = '"+dureeEstimee+"', statut_tache = '"+statutTache+"', id_projet = '"+idProjet+"', id_competence = '"+idCompetence+"' WHERE id_tache = '"+idTache+"'";
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
	public int insertTache(TacheDTO tache) {
		String libelleTache = tache.getLibelleTache();
		int dureeEstimee = tache.getDureeEstimeeTache();
		String statutTache = tache.getStatutTache();
		int idProjet = tache.getIdProjet();
		int idCompetence = tache.getIdCompetence();
		String query = "INSERT INTO tache(libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence) VALUES('"+libelleTache+"', '"+dureeEstimee+"', '"+statutTache+"', '"+idProjet+"', '"+idCompetence+"')";
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
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public int deleteTache(TacheDTO tache) {
		// TODO Auto-generated method stub
		int idTache = tache.getIdTache();
		String query = "DELETE FROM tache WHERE id_tache = '"+idTache+"'";
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
	public List<TacheDTO> getTacheByProjet(TacheDTO tache) {
		// TODO Auto-generated method stub
		int idProjet = tache.getIdProjet();
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache WHERE id_projet = '"+idProjet+"'";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeTache;
	}

	@Override
	public List<TacheDTO> getTacheByCompetence(TacheDTO tache) {
		// TODO Auto-generated method stub
		int idCompetence = tache.getIdCompetence();
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache WHERE id_competence = '"+idCompetence+"'";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeTache;
	}

	@Override
	public TacheDTO getTacheById(TacheDTO tache) {
		// TODO Auto-generated method stub
		int idTache = tache.getIdTache();
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache WHERE id_tache = '"+idTache+"'";
		ResultSet rs = null;
		TacheDTO newTache = new TacheDTO();
		try
		{
			
			Statement stt = this.conn.createStatement();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newTache;
	}

	@Override
	public List<TacheDTO> getTacheByDuree(TacheDTO tache) {
		// TODO Auto-generated method stub
		int dureeEstimee = tache.getDureeEstimeeTache();
		String query = "SELECT id_tache, libelle_tache, duree_estimee_tache, statut_tache, id_projet, id_competence FROM tache WHERE duree_estimee_tache = '"+dureeEstimee+"'";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeTache;
	}

	@Override
	public List<TacheDTO> getAllTache() {
		// TODO Auto-generated method stub
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeTache;
	}

}
