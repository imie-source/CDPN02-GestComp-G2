package fr.imie.skills.dao.interfaces;

import java.util.List;

import fr.imie.skills.dto.ProfilDTO;

public interface IProfilDAO {

	public int updateProfil(ProfilDTO profil);
	
	public int insertProfil(ProfilDTO profil);
	
	public int deleteProfil(ProfilDTO profil);
	
	public ProfilDTO getProfilById(ProfilDTO profil);
	
	public List<ProfilDTO> getAllProfil();

}
