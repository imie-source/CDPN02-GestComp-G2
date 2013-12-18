package dao.interfaces;

import java.util.List;

import dto.NatureDroitDTO;

public interface INatureDroitDAO {

	public int deleteNatureDroit (int idNatureDroit);

	public int insertNatureDroit(String nomNature);
	
	public List<NatureDroitDTO> getAllNatureDroit();

	public NatureDroitDTO getNatureDroitByID (int idNatureDroit);

	public int updateNatureDroit(NatureDroitDTO natureDroit);
	
}
