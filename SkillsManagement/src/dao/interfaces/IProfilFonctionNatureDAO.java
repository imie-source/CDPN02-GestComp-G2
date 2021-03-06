package dao.interfaces;

import java.util.List;

import dto.ProfilFonctionNatureDTO;

public interface IProfilFonctionNatureDAO {

	public int insertProfilFonctionNature(ProfilFonctionNatureDTO unDTO);
	
	public int deleteProfilFonctionNature(ProfilFonctionNatureDTO unDTO);
	
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByProfil(ProfilFonctionNatureDTO unDTO);
	
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByFonction(ProfilFonctionNatureDTO unDTO);
	
	public List<ProfilFonctionNatureDTO> getProfilFonctionNatureByNature(ProfilFonctionNatureDTO unDTO);
}
