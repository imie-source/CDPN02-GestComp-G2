package fr.imie.skills.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
import fr.imie.skills.dao.interfaces.factory.DAOFactory;

public class PostgresDAOFactory implements DAOFactory
{

	private Connection conn;
	
    public Connection getConn() {
        return conn;
    }
	
	public PostgresDAOFactory()
	{
		try
		{
			this.conn = DriverManager.getConnection("jdbc:postgresql://localhost/imie", "postgres", "postgres");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public IPromotionDAO getPromotionDAO() {
		return new PromotionDAO(conn);
	}

	@Override
	public ICompetenceDAO getCompetenceDAO() {
		return new CompetenceDAO(conn);
	}

	@Override
	public IFonctionDAO getFonctionDAO() {
		return new FonctionDAO(conn);
	}

	@Override
	public INatureDroitDAO getNatureDroitDAO() {
		return new NatureDroitDAO(conn);
	}

	@Override
	public INotificationDAO getNotificationDAO() {
		return new NotificationDAO(conn);
	}

	@Override
	public IProfilDAO getProfilDAO() {
		return new ProfilDAO(conn);
	}

	@Override
	public IProjectDAO getProjectDAO() {
		return new ProjectDAO(conn);
	}

	@Override
	public ITacheDAO getTacheDAO() {
		return new TacheDAO(conn);
	}

	@Override
	public IUserDAO getUserDAO() {
		return new UserDAO(conn);
	}

	@Override
	public IUserProfilDAO getUserProfilDAO() {
		return new UserProfilDAO(conn);
	}

	@Override
	public IUserProjectDAO getUserProjectDAO() {
		return new UserProjectDAO(conn);
	}

	@Override
	public IUserNotificationDAO getUserNotificationDAO() {
		return new UserNotificationDAO(conn);
	}

	@Override
	public IProfilFonctionNatureDAO getProfilFonctionNatureDAO() {
		return new ProfilFonctionNatureDAO(conn);
	}

	@Override
	public IUserCompetenceDAO getUserCompetenceDAO() {
		return new UserCompetenceDAO(conn);
	}

}
