package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IProfilFonctionNatureDAO;
import dto.ProfilFonctionNatureDTO;

public class ProfilFonctionNatureDAO implements IProfilFonctionNatureDAO{

	private Connection conn = null;
	
	public ProfilFonctionNatureDAO(FactoryDAO instance)
	{
		this.conn = (Connection) instance;
	}
	@Override
	public int insertProfilFonctionNature(ProfilFonctionNatureDTO unDTO) {
		int idProf = unDTO.getIdProfil();
		int idFonc = unDTO.getIdFonction();
		int idNat = unDTO.getIdNature();
		String query = "INSERT INTO profil_fonction_nature(id_profil, id_fonction, id_nature) " +
						"VALUES(?, ?, ?)";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idProf);
			stt.setInt(2, idFonc);
			stt.setInt(3, idNat);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteProfilFonctionNature(ProfilFonctionNatureDTO unDTO) 
	{
		int idProf = unDTO.getIdProfil();
		int idFonc = unDTO.getIdFonction();
		int idNat = unDTO.getIdNature();
		String query = "DELETE FROM profil_fonction_nature WHERE id_profil = ? AND id_fonction = ? AND id_nature = ?";
		int i = 0;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idProf);
			stt.setInt(2, idFonc);
			stt.setInt(3, idNat);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByProfil(ProfilFonctionNatureDTO unDTO) 
	{
		int idProf = unDTO.getIdProfil();
		String query = "SELECT id_profil, id_fonction, id_nature FROM profil_fonction_nature WHERE id_profil = ?";
		List<ProfilFonctionNatureDTO> listeDTO = new ArrayList<ProfilFonctionNatureDTO>();
		ResultSet rs = null;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idProf);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				ProfilFonctionNatureDTO newDTO = new ProfilFonctionNatureDTO();
				newDTO.setIdProfil(rs.getInt("id_profil"));
				newDTO.setIdFonction(rs.getInt("id_fonction"));
				newDTO.setIdNature(rs.getInt("id_nature"));
				listeDTO.add(newDTO);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listeDTO;
	}

	@Override
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByFonction(ProfilFonctionNatureDTO unDTO)
	{
		int idFonc = unDTO.getIdFonction();
		String query = "SELECT id_profil, id_fonction, id_nature FROM profil_fonction_nature WHERE id_fonction = ?";
		List<ProfilFonctionNatureDTO> listeDTO = new ArrayList<ProfilFonctionNatureDTO>();
		ResultSet rs = null;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idFonc);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				ProfilFonctionNatureDTO newDTO = new ProfilFonctionNatureDTO();
				newDTO.setIdProfil(rs.getInt("id_profil"));
				newDTO.setIdFonction(rs.getInt("id_fonction"));
				newDTO.setIdNature(rs.getInt("id_nature"));
				listeDTO.add(newDTO);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listeDTO;
	}

	@Override
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByNature(ProfilFonctionNatureDTO unDTO) 
	{
		int idNat = unDTO.getIdNature();
		String query = "SELECT id_profil, id_fonction, id_nature FROM profil_fonction_nature WHERE id_nature = ?";
		List<ProfilFonctionNatureDTO> listeDTO = new ArrayList<ProfilFonctionNatureDTO>();
		ResultSet rs = null;
		try
		{
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, idNat);
			rs = stt.executeQuery(query);
			while(rs.next())
			{
				ProfilFonctionNatureDTO newDTO = new ProfilFonctionNatureDTO();
				newDTO.setIdProfil(rs.getInt("id_profil"));
				newDTO.setIdFonction(rs.getInt("id_fonction"));
				newDTO.setIdNature(rs.getInt("id_nature"));
				listeDTO.add(newDTO);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listeDTO;
	}
}
