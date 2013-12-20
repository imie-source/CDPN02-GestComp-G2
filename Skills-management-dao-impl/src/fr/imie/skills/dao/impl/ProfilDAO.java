package fr.imie.skills.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.imie.skills.dao.interfaces.IProfilDAO;
import fr.imie.skills.dto.ProfilDTO;

public class ProfilDAO implements IProfilDAO{

	private Connection conn;
	
	public ProfilDAO(Connection connection)
	{
		this.conn = connection;
	}
	
	@Override
	public int updateProfil(ProfilDTO profil) 
	{
		String profilNom = profil.getNom_profil();
		int profil_pere = profil.getProfil_pere_id();
		int idProfil = profil.getProfil_id();
		String query = "UPDATE Profil SET nom_profil = ?, id_profil_pere = ? WHERE id_profil = ?";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setString(1, profilNom);
			stt.setInt(2, profil_pere);
			stt.setInt(3, idProfil);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertProfil(ProfilDTO profil) 
	{
		String profil_nom = profil.getNom_profil();
		int profil_pere = profil.getProfil_pere_id();
		String query = "INSERT INTO Profil(nom_profil, id_profil_pere) VALUES(?, ?)";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setString(1, profil_nom);
			stt.setInt(2, profil_pere);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteProfil(ProfilDTO profil) 
	{
		int id_Profil = profil.getProfil_id();
		String query = "DELETE FROM Profil WHERE id_Profil = ?";
		int i = 0;
		try 
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, id_Profil);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public ProfilDTO getProfilById(ProfilDTO profil)
	{
		int id_Profil = profil.getProfil_id();
		String query = "SELECT id_Profil, nom_profil, id_profil_pere FROM Profil WHERE id_Profil = ? LIMIT 0,1";
		ProfilDTO newprofil = new ProfilDTO();
		
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, id_Profil);
			ResultSet rs = stt.executeQuery(query);
			newprofil.setProfil_id(rs.getInt("id_Profil"));
			newprofil.setNom_profil(rs.getString("nom_profil"));
			newprofil.setProfil_pere_id(rs.getInt("id_profil_pere"));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return newprofil;
	}


	@Override
	public List<ProfilDTO> getAllProfil()
	{
		String query = "SELECT id_Profil, nom_profil, id_profil_pere FROM Profil";
		List<ProfilDTO> listeprofil = new ArrayList<ProfilDTO>();
		ProfilDTO profil = new ProfilDTO();
		try
		{
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			while(rs.next())
			{
				profil.setProfil_id(rs.getInt("id_Profil"));
				profil.setNom_profil(rs.getString("nom_profil"));
				profil.setProfil_pere_id(rs.getInt("id_profil_pere"));
				listeprofil.add(profil);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listeprofil;
	}
}
