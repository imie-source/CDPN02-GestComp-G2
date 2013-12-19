package service.impl;

import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IPromotionDAO;
import dto.PromotionDTO;
import service.interfaces.IPromotionService;

public class PromotionService implements IPromotionService
{
	@Override
	public List<PromotionDTO> listerPromotions()
	{
		IPromotionDAO TTTTT = new FactoryDAO().getPromotionDAO();
		return null;
	}

}
