package dao.impl;


import dao.factory.FactoryDAO;
import dao.interfaces.INatureDroitDAO;
import dto.NatureDroitDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NatureDroitDAO implements INatureDroitDAO {
	private Connection conn = null;
	
	public NatureDroitDAO(FactoryDAO instance)
	{
//		this.conn = instance.get
	}

	@Override
	public int deleteNatureDroit(int idNatureDroit) {
		String query = "DELETE FROM nature_droit WHERE id_nature = '"+idNatureDroit+"'";
		int i = 0;
		try 
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertNatureDroit(String nom) {
		String query = "INSERT INTO nature_droit(nom_nature) VALUES('"+nom+"')";
		int i = 0;
		try
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<NatureDroitDTO> getAllNatureDroit() {
		String query = "SELECT id_nature, nom_nature FROM nature_droit";
		List<NatureDroitDTO> natureDroits = new ArrayList<NatureDroitDTO>();
		try
		{
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			while(rs.next())
			{
				NatureDroitDTO natureDroit = new NatureDroitDTO();
				natureDroit.setIdNature(rs.getInt("id_nature"));
				natureDroit.setNomNature(rs.getString("nom_nature"));
				natureDroits.add(natureDroit);
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return natureDroits;
	}

	@Override
	public NatureDroitDTO getNatureDroitByID(int idNatureDroit) {
		String query = "SELECT id_nature, nom_nature FROM nature_droit WHERE id_nature = '"+idNatureDroit+"' LIMIT 0,1";
		NatureDroitDTO competence = new NatureDroitDTO();
		
		try
		{
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			competence.setIdNature(rs.getInt("id_nature"));
			competence.setNomNature(rs.getString("nom_nature"));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return competence;
	}

	@Override
	public int updateNatureDroit(NatureDroitDTO competence) {
		String nom = competence.getNomNature();
		String query = "UPDATE nature_droit SET nom_nature = '"+ nom;
		int i = 0;
		try
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}
}
