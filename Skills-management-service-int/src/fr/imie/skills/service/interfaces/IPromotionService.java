package fr.imie.skills.service.interfaces;

import java.util.List;

import fr.imie.skills.dto.PromotionDTO;

public interface IPromotionService
{
	public List<PromotionDTO> getAllPromotions();
	
	public PromotionDTO getPromotionById(PromotionDTO promo);
	
	public int createPromotion(PromotionDTO promo);
	
	public int deletePromotion(PromotionDTO promo);
	
	public int updatePromotion(PromotionDTO promo);
}
