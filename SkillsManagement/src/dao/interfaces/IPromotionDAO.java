package dao.interfaces;

import java.util.List;
import dto.PromotionDTO;

public interface IPromotionDAO {

	public int updatePromotion(PromotionDTO promo);
	
	public int insertPromotion(PromotionDTO promo);
	
	public int deletePromotion(PromotionDTO promo);
	
	public PromotionDTO getPromotionById(PromotionDTO promo);
	
	public List<PromotionDTO> getAllPromotion();

	public List<PromotionDTO> getPromotionByAnnee(PromotionDTO promo);
}
