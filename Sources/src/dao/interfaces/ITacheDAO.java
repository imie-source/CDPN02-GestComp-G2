package dao.interfaces;

import java.util.List;

import dto.TacheDTO;

public interface ITacheDAO {

	public int updateTache(TacheDTO tache);
	
	public int insertTache(TacheDTO tache);
	
	public int deleteTache(TacheDTO tache);
	
	public List<TacheDTO> getTacheByProjet(TacheDTO tache);
	
	public List<TacheDTO> getTacheByCompetence(TacheDTO tache);
	
	public TacheDTO getTacheById(TacheDTO tache);
	
	public List<TacheDTO> getTacheByDuree(TacheDTO tache);
	
	public List<TacheDTO> getAllTache();
}
