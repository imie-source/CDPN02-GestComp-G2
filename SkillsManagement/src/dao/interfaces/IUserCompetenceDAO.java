package dao.interfaces;

import java.util.List;

import dto.UserCompetenceDTO;

public interface IUserCompetenceDAO
{
	public int updateUtilisateurCompetence(UserCompetenceDTO unDTO);
	
	public int insertUtilisateurCompetence(UserCompetenceDTO unDTO);
	
	public int deleteUtilisateurCompetence(UserCompetenceDTO unDTO);
	
	public List<UserCompetenceDTO> getAllUtilisateurCompetence();
	
	public List<UserCompetenceDTO> getUtilisateurCompetenceByIdUser(UserCompetenceDTO unDTO);
	
	public List<UserCompetenceDTO> getUtilisateurCompetenceByNiveau(UserCompetenceDTO unDTO);
	
	public List<UserCompetenceDTO> getUtilisateurCompetenceByIdComp(UserCompetenceDTO unDTO);	
}
