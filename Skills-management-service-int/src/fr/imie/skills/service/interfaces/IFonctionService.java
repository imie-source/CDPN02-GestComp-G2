package fr.imie.skills.service.interfaces;

import java.util.List;

import fr.imie.skills.dto.FonctionDTO;

public interface IFonctionService {

	void updateFonction(FonctionDTO fonction);

	void insertFonction(FonctionDTO fonction);

	void deleteFonction(FonctionDTO fonction);

	FonctionDTO getFonctionById(FonctionDTO fonction);

	List<FonctionDTO> getAllFonction();
}
