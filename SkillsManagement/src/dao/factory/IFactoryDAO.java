package dao.factory;

import dao.interfaces.ICompetenceDAO;
import dao.interfaces.IFonctionDAO;
import dao.interfaces.INatureDroitDAO;
import dao.interfaces.INotificationDAO;
import dao.interfaces.IProfilFonctionNatureDAO;
import dao.interfaces.IProjectDAO;
import dao.interfaces.IPromotionDAO;
import dao.interfaces.ITacheDAO;
import dao.interfaces.IUserCompetenceDAO;
import dao.interfaces.IUserDAO;
import dao.interfaces.IUserNotificationDAO;
import dao.interfaces.IUserProfilDAO;
import dao.interfaces.IUserProjectDAO;

public interface IFactoryDAO
{
	public IPromotionDAO getPromotionDAO();
	
	public ICompetenceDAO getCompetenceDAO();
	
	public IFonctionDAO getFonctionDAO();
	
	public INatureDroitDAO getNatureDroitDAO();
	
	public INotificationDAO getNotificationDAO();
	
	public IProjectDAO getProjectDAO();
	
	public ITacheDAO getTacheDAO();
	
	public IUserDAO getUserDAO();
	
	public IUserProfilDAO getUserProfilDAO();
	
	public IUserProjectDAO getUserProjectDAO();
	
	public IUserNotificationDAO getUserNotificationDAO();
	
	public IProfilFonctionNatureDAO getProfilFonctionNatureDAO();
	
	public IUserCompetenceDAO getUserCompetenceDAO();
}
