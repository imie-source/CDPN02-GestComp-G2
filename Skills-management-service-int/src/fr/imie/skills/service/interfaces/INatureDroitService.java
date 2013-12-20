package fr.imie.skills.service.interfaces;

import java.util.List;

import fr.imie.skills.dto.NatureDroitDTO;

public interface INatureDroitService {

	public int deleteNatureDroit (NatureDroitDTO natureDroit);

	public int insertNatureDroit(NatureDroitDTO natureDroit);
	
	public List<NatureDroitDTO> getAllNatureDroit();

	public NatureDroitDTO getNatureDroitByID (NatureDroitDTO natureDroit);

	public int updateNatureDroit(NatureDroitDTO natureDroit);
}
