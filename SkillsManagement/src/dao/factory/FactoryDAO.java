package dao.factory;

import dao.impl.*;
import dao.interfaces.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryDAO
{
	private static FactoryDAO instance = null;
	
    public Connection getConn() {
        return conn;
    }

    public Connection conn;
	
	public FactoryDAO()
	{

	}
	
	public FactoryDAO getInstance()
	{
		if(instance == null)
		{
			instance = new FactoryDAO();
		}
		return instance;
	}
	
	public void ConnectJdbc() throws SQLException
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
	
	public void CloseJdbc() throws SQLException
	{
		try
		{
			this.conn.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static IPromotionDAO getPromotionDAO() {
		return new PromotionDAO(instance);
	}

    public static ICompetenceDAO getCompetenceDAO() {
        return new CompetenceDAO(instance);
    }

    public static IFonctionDAO getFonctionDAO() {
        return new FonctionDAO(instance);
    }

    public static INatureDroitDAO getNatureDroitDAO() {
        return new NatureDroitDAO(instance);
    }

    public static INotificationDAO getNotificationDAO() {
        return new NotificationDAO(instance);
    }

    public static IProfilDAO getProfilDAO() {
        return new ProfilDAO(instance);
    }

    public static IProjectDAO getProjectDAO() {
        return new ProjectDAO(instance);
    }

    public static ITacheDAO getTacheDAO() {
        return new TacheDAO(instance);
    }

    public static IUserDAO getUserDAO() {
        return new UserDAO(instance);
    }

    public static IUserProfilDAO getUserProfilDAO() {
        return new UserProfilDAO(instance);
    }

    public static IUserProjectDAO getUserProjectDAO() {
        return new UserProjectDAO(instance);
    }

    public static IUserNotificationDAO getUserNotificationDAO() {
        return new UserNotificationDAO(instance);
    }
	
	public static IProfilFonctionNatureDAO getProfilFonctionNatureDAO() {
		return new ProfilFonctionNatureDAO(instance);
	}
	
	public static IUserCompetenceDAO getUserCompetenceDAO() {
		return new UserCompetenceDAO(instance);
	}
}
