package fr.imie.skills.dao.interfaces;

import java.util.List;

import fr.imie.skills.dto.NatureDroitDTO;

public interface INatureDroitDAO {

	public int deleteNatureDroit (NatureDroitDTO natureDroit);

	public int insertNatureDroit(NatureDroitDTO natureDroit);
	
	public List<NatureDroitDTO> getAllNatureDroit();

	public NatureDroitDTO getNatureDroitByID (NatureDroitDTO natureDroit);

	public int updateNatureDroit(NatureDroitDTO natureDroit);
	
}
