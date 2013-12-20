package fr.imie.skills.dao.interfaces.factory;

import fr.imie.skills.dao.interfaces.ICompetenceDAO;
import fr.imie.skills.dao.interfaces.IFonctionDAO;
import fr.imie.skills.dao.interfaces.INatureDroitDAO;
import fr.imie.skills.dao.interfaces.INotificationDAO;
import fr.imie.skills.dao.interfaces.IProfilDAO;
import fr.imie.skills.dao.interfaces.IProfilFonctionNatureDAO;
import fr.imie.skills.dao.interfaces.IProjectDAO;
import fr.imie.skills.dao.interfaces.IPromotionDAO;
import fr.imie.skills.dao.interfaces.ITacheDAO;
import fr.imie.skills.dao.interfaces.IUserCompetenceDAO;
import fr.imie.skills.dao.interfaces.IUserDAO;
import fr.imie.skills.dao.interfaces.IUserNotificationDAO;
import fr.imie.skills.dao.interfaces.IUserProfilDAO;
import fr.imie.skills.dao.interfaces.IUserProjectDAO;


public interface DAOFactory
{
	public  IPromotionDAO getPromotionDAO();

    public  ICompetenceDAO getCompetenceDAO();

    public  IFonctionDAO getFonctionDAO();

    public  INatureDroitDAO getNatureDroitDAO();

    public  INotificationDAO getNotificationDAO();

    public  IProfilDAO getProfilDAO();

    public  IProjectDAO getProjectDAO();

    public  ITacheDAO getTacheDAO();

    public  IUserDAO getUserDAO();

    public  IUserProfilDAO getUserProfilDAO();

    public  IUserProjectDAO getUserProjectDAO();

    public  IUserNotificationDAO getUserNotificationDAO();
	
	public  IProfilFonctionNatureDAO getProfilFonctionNatureDAO();
	
	public  IUserCompetenceDAO getUserCompetenceDAO();
	
}

