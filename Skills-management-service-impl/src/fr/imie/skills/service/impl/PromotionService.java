package fr.imie.skills.service.impl;

import java.util.List;

import fr.imie.skills.dao.interfaces.factory.AbstractDAOFactory;
import fr.imie.skills.dto.PromotionDTO;
import fr.imie.skills.service.interfaces.IPromotionService;


public class PromotionService implements IPromotionService
{
	@Override
	public List<PromotionDTO> getAllPromotions()
	{
		List<PromotionDTO> listePromo = AbstractDAOFactory.getDAOFactory().getPromotionDAO().getAllPromotion();
		return listePromo;
	}

	@Override
	public int createPromotion(PromotionDTO promo)
	{
		int i = AbstractDAOFactory.getDAOFactory().getPromotionDAO().insertPromotion(promo);
		return i;
	}

	@Override
	public int deletePromotion(PromotionDTO promo) {
		int i = AbstractDAOFactory.getDAOFactory().getPromotionDAO().deletePromotion(promo);
		return i;
	}

	@Override
	public int updatePromotion(PromotionDTO promo) {
		int i = AbstractDAOFactory.getDAOFactory().getPromotionDAO().updatePromotion(promo);
		return i;
	}

	@Override
	public PromotionDTO getPromotionById(PromotionDTO promo) {
		PromotionDTO promotion = AbstractDAOFactory.getDAOFactory().getPromotionDAO().getPromotionById(promo);
		return promotion;
	}
}
