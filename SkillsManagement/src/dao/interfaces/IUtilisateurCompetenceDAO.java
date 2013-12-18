package dao.interfaces;

import java.util.List;

import dto.UtilisateurCompetenceDTO;

public interface IUtilisateurCompetenceDAO
{
	public int updateUtilisateurCompetence(UtilisateurCompetenceDTO unDTO);
	
	public int insertUtilisateurCompetence(UtilisateurCompetenceDTO unDTO);
	
	public int deleteUtilisateurCompetence(UtilisateurCompetenceDTO unDTO);
	
	public List<UtilisateurCompetenceDTO> getAllUtilisateurCompetence();
	
	public List<UtilisateurCompetenceDTO> getUtilisateurCompetenceByIdUser(UtilisateurCompetenceDTO unDTO);
	
	public List<UtilisateurCompetenceDTO> getUtilisateurCompetenceByNiveau(UtilisateurCompetenceDTO unDTO);
	
	public List<UtilisateurCompetenceDTO> getUtilisateurCompetenceByIdComp(UtilisateurCompetenceDTO unDTO);	
}
