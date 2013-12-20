package service.impl;

import java.util.List;

import service.interfaces.ICompetenceService;
import dao.interfaces.ICompetenceDAO;
import dto.CompetenceDTO;

public class CompetenceService implements ICompetenceService{

	private ICompetenceDAO competenceDAO;
	
	@Override
	public void deleteCompetence(int idCompetence) {
		competenceDAO.deleteCompetence(idCompetence);
	}

	@Override
	public void insertCompetence(CompetenceDTO competenceDTO) {
		competenceDAO.insertCompetence(competenceDTO.getLibelleCompetence(), competenceDTO.getIdCompetence());
	}

	@Override
	public List<CompetenceDTO> getAllCompetence() {
		List<CompetenceDTO> competences = competenceDAO.getAllCompetence();
		return competences;
	}

	@Override
	public CompetenceDTO getCompetence(int idCompetence) {
		CompetenceDTO competence = competenceDAO.getCompetenceByID(idCompetence);
		return competence;
	}

	@Override
	public void updateCompetence(CompetenceDTO competenceDTO) {
		competenceDAO.updateCompetence(competenceDTO);
	}

}
