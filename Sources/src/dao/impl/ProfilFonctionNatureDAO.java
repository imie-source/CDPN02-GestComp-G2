package dao.impl;

import java.sql.Connection;
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
						"VALUES('"+idProf+"', '"+idFonc+"', '"+idNat+"')";
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
	public int deleteProfilFonctionNature(ProfilFonctionNatureDTO unDTO) {
		// TODO Auto-generated method stub
		int idProf = unDTO.getIdProfil();
		int idFonc = unDTO.getIdFonction();
		int idNat = unDTO.getIdNature();
		String query = "DELETE FROM profil_fonction_nature WHERE id_profil = '"+idProf+"' AND id_fonction = '"+idFonc+"' AND id_nature = '"+idNat+"'";
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
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByProfil(
			ProfilFonctionNatureDTO unDTO) {
		// TODO Auto-generated method stub
		int idProf = unDTO.getIdProfil();
		String query = "SELECT id_profil, id_fonction, id_nature FROM profil_fonction_nature WHERE id_profil = '"+idProf+"'";
		List<ProfilFonctionNatureDTO> listeDTO = new ArrayList<ProfilFonctionNatureDTO>();
		ResultSet rs = null;
		try
		{
			Statement stt = this.conn.createStatement();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return listeDTO;
	}

	@Override
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByFonction(
			ProfilFonctionNatureDTO unDTO) {
		// TODO Auto-generated method stub
		int idFonc = unDTO.getIdFonction();
		String query = "SELECT id_profil, id_fonction, id_nature FROM profil_fonction_nature WHERE id_fonction = '"+idFonc+"'";
		List<ProfilFonctionNatureDTO> listeDTO = new ArrayList<ProfilFonctionNatureDTO>();
		ResultSet rs = null;
		try
		{
			Statement stt = this.conn.createStatement();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return listeDTO;
	}

	@Override
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByNature(ProfilFonctionNatureDTO unDTO) {
		// TODO Auto-generated method stub
		int idNat = unDTO.getIdNature();
		String query = "SELECT id_profil, id_fonction, id_nature FROM profil_fonction_nature WHERE id_nature = '"+idNat+"'";
		List<ProfilFonctionNatureDTO> listeDTO = new ArrayList<ProfilFonctionNatureDTO>();
		ResultSet rs = null;
		try
		{
			Statement stt = this.conn.createStatement();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return listeDTO;
	}
	

}
