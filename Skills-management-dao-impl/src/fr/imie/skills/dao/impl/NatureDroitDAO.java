package fr.imie.skills.dao.impl;

import fr.imie.skills.dao.interfaces.INatureDroitDAO;
import fr.imie.skills.dto.NatureDroitDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NatureDroitDAO implements INatureDroitDAO {
	private Connection conn;
	
	public NatureDroitDAO(Connection connection)
	{
		this.conn = connection;
	}

	public int deleteNatureDroit(NatureDroitDTO natureDroit) {
		int idNatureDroit = natureDroit.getIdNature();
		PreparedStatement deletePS = null;
		String query = "DELETE FROM nature_droit WHERE id_nature = ?";
		int i = 0;
		
		try 
		{
			deletePS = this.conn.prepareStatement(query);
			deletePS.setInt(1, idNatureDroit);
			i = deletePS.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertNatureDroit(NatureDroitDTO natureDroit) {
		int idNatureDroit = natureDroit.getIdNature();
		String nomNature = natureDroit.getNomNature();
		PreparedStatement insertPS = null;
		String query = "INSERT INTO nature_droit(nom_nature) VALUES(?)";
		int i = 0;
		try
		{
			insertPS = this.conn.prepareStatement(query);
			insertPS.setInt(1, idNatureDroit);
			insertPS.setString(2, nomNature);
			i = insertPS.executeUpdate(query);
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
	public NatureDroitDTO getNatureDroitByID(NatureDroitDTO natureDroit) {
		String query = "SELECT id_nature, nom_nature FROM nature_droit WHERE id_nature = ? LIMIT 0,1";
		NatureDroitDTO newNatureDroit = new NatureDroitDTO();
		
		try
		{
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			newNatureDroit.setIdNature(rs.getInt("id_nature"));
			newNatureDroit.setNomNature(rs.getString("nom_nature"));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return newNatureDroit;
	}

	@Override
	public int updateNatureDroit(NatureDroitDTO natureDroit) {
		int idNature = natureDroit.getIdNature();
		String nomNature = natureDroit.getNomNature();
		PreparedStatement updatePS = null;
		String query = "UPDATE nature_droit SET nom_nature = ? where id = ?";
		int i = 0;
		
		try
		{
			updatePS = this.conn.prepareStatement(query);
			updatePS.setInt(1, idNature);
			updatePS.setString(2, nomNature);
			i = updatePS.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}
}
