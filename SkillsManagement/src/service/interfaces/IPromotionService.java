package service.interfaces;

import java.util.List;

import dto.PromotionDTO;

public interface IPromotionService
{
	public List<PromotionDTO> getAllPromotions();
	
	public int createPromotion(PromotionDTO promo);
	
	public int deletePromotion(PromotionDTO promo);
}
