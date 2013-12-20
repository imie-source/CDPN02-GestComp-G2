package fr.imie.skills.service.impl;

import java.util.List;

import fr.imie.skills.dao.interfaces.ICompetenceDAO;
import fr.imie.skills.dao.interfaces.factory.AbstractDAOFactory;
import fr.imie.skills.dto.CompetenceDTO;
import fr.imie.skills.service.interfaces.ICompetenceService;

public class CompetenceService implements ICompetenceService{

private ICompetenceDAO competenceDAO = AbstractDAOFactory.getDAOFactory().getCompetenceDAO();
	
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
