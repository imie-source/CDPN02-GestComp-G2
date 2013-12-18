package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IProfilDAO;
import dto.ProfilDTO;

/* TABLE Profil (id_Profil, nom_profil, profil_pere)
 */
public class ProfilDAO implements IProfilDAO{

	private Connection conn = null;
	
	public ProfilDAO(FactoryDAO instance)
	{
		this.conn = instance.getConn();
	}
	
	@Override
	public int updateProfil(ProfilDTO profil) {
		// TODO Auto-generated method stub
		String profilNom = profil.getNom_profil();
		int profil_pere = profil.getProfil_pere_id();
		String query = "UPDATE Profil SET nom_profil = '" + profilNom + "', id_profil_pere = '" + profil_pere + "'";
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
	public int insertProfil(ProfilDTO profil) {
		// TODO Auto-generated method stub
		String profil_nom = profil.getNom_profil();
		int profil_pere = profil.getProfil_pere_id();
		String query = "INSERT INTO Profil(nom_profil, id_profil_pere) VALUES('"+profil_nom+"', '"+profil_pere+"')";
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
	public int deleteProfil(ProfilDTO profil) {
		// TODO Auto-generated method stub
		int id_Profil = profil.getProfil_id();
		String query = "DELETE FROM Profil WHERE id_Profil = '"+id_Profil+"'";
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
	public ProfilDTO getProfilById(ProfilDTO profil) {
		// TODO Auto-generated method stub
		int id_Profil = profil.getProfil_id();
		String query = "SELECT id_Profil, nom_profil, id_profil_pere FROM Profil WHERE id_Profil = '"+id_Profil+"' LIMIT 0,1";
		ProfilDTO newprofil = new ProfilDTO();
		
		try
		{
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			newprofil.setProfil_id(rs.getInt("id_Profil"));
			newprofil.setNom_profil(rs.getString("nom_profil"));
			newprofil.setProfil_pere_id(rs.getInt("id_profil_pere"));
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newprofil;
	}


	@Override
	public List<ProfilDTO> getAllProfil() {
		// TODO Auto-generated method stub
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeprofil;
	}
}
