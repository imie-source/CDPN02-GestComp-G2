package dao.interfaces;

import dto.FonctionDTO;
import java.util.List;

public interface IFonctionDAO {

    public int updateFonction(FonctionDTO fonction);

    public int insertFonction(FonctionDTO fonction);

    public int deleteFonction(FonctionDTO fonction);

    public FonctionDTO getFonctionById(FonctionDTO fonction);

    public List<FonctionDTO> getAllFonction();
}
