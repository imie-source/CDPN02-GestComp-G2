package fr.imie.skills.service.impl;

import java.util.List;

import fr.imie.skills.dao.interfaces.IFonctionDAO;
import fr.imie.skills.dao.interfaces.factory.AbstractDAOFactory;
import fr.imie.skills.dto.FonctionDTO;
import fr.imie.skills.service.interfaces.IFonctionService;

public class FonctionService implements IFonctionService {


private IFonctionDAO fonctionDAO = AbstractDAOFactory.getDAOFactory().getFonctionDAO();

@Override
public void updateFonction(FonctionDTO fonction) {
	fonctionDAO.updateFonction(fonction);	
}

@Override
public void insertFonction(FonctionDTO fonction) {
	fonctionDAO.insertFonction(fonction);	
}

@Override
public void deleteFonction(FonctionDTO fonction) {
	fonctionDAO.deleteFonction(fonction);	
}

@Override
public FonctionDTO getFonctionById(FonctionDTO fonction) {
	FonctionDTO function = fonctionDAO.getFonctionById(fonction);
	return function;
}

@Override
public List<FonctionDTO> getAllFonction() {
	List<FonctionDTO> functions = fonctionDAO.getAllFonction();
	return functions;
}

}
