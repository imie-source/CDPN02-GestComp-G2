package fr.imie.skills.dao.interfaces;

import java.util.List;

import fr.imie.skills.dto.CompetenceDTO;

public interface ICompetenceDAO {

	public int deleteCompetence (int idCompetence);

	public int insertCompetence(String libelle, int competencePere);
	
	public List<CompetenceDTO> getAllCompetence();

	public CompetenceDTO getCompetenceByID (int idCompetence);

	public int updateCompetence(CompetenceDTO competence);
	
}
