package fr.imie.skills.service.impl;

import java.util.List;

import fr.imie.skills.dao.interfaces.INatureDroitDAO;
import fr.imie.skills.dao.interfaces.factory.AbstractDAOFactory;
import fr.imie.skills.dto.NatureDroitDTO;
import fr.imie.skills.service.interfaces.INatureDroitService;

public class NatureDroitService implements INatureDroitService{

	private INatureDroitDAO natureDroitDAO = AbstractDAOFactory.getDAOFactory().getNatureDroitDAO();

	@Override
	public int deleteNatureDroit(NatureDroitDTO natureDroit) {
		natureDroitDAO.deleteNatureDroit(natureDroit);
		return 0;
	}

	@Override
	public int insertNatureDroit(NatureDroitDTO natureDroit) {
		natureDroitDAO.insertNatureDroit(natureDroit);
		return 0;
	}

	@Override
	public List<NatureDroitDTO> getAllNatureDroit() {
		List<NatureDroitDTO> natureDroits = natureDroitDAO.getAllNatureDroit();
		return natureDroits;
	}

	@Override
	public NatureDroitDTO getNatureDroitByID(NatureDroitDTO natureDroit) {
		NatureDroitDTO newNatureDroit = natureDroitDAO.getNatureDroitByID(natureDroit);
		return newNatureDroit;
	}

	@Override
	public int updateNatureDroit(NatureDroitDTO natureDroit) {
		natureDroitDAO.updateNatureDroit(natureDroit);
		return 0;
	}

}
