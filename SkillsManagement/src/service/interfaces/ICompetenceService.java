package service.interfaces;

import java.util.List;

import dto.CompetenceDTO;

public interface ICompetenceService {

	
	void deleteCompetence(int idCompetence);
	
	void insertCompetence(CompetenceDTO competenceDTO);
	
	List<CompetenceDTO> getAllCompetence();
	
	CompetenceDTO getCompetence(int idCompetence);
	
	void updateCompetence(CompetenceDTO competenceDTO);
	
}
