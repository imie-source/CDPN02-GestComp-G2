package fr.imie.skills.service.impl;

import java.util.List;

import dao.factory.FactoryDAO;

import fr.imie.skills.dto.PromotionDTO;
import fr.imie.skills.service.interfaces.IPromotionService;


public class PromotionService implements IPromotionService
{
	@Override
	public List<PromotionDTO> getAllPromotions()
	{
		List<PromotionDTO> listePromo = FactoryDAO.getPromotionDAO().getAllPromotion();
		return listePromo;
	}

	@Override
	public int createPromotion(PromotionDTO promo)
	{
		int i = FactoryDAO.getPromotionDAO().insertPromotion(promo);
		return i;
	}

	@Override
	public int deletePromotion(PromotionDTO promo) {
		int i = FactoryDAO.getPromotionDAO().deletePromotion(promo);
		return i;
	}
}
