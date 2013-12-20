package fr.imie.skills.dao.interfaces.factory;

import fr.imie.skills.dao.interfaces.exception.DAOException;

/**
 * Mise en oeuvre du Design Pattern "Abstract Factory".
 */
public abstract class AbstractDAOFactory
{
	
	private static DAOFamily defaultStrategy = DAOFamily.POSTGRES; 
	
	public static final DAOFactory getDAOFactory() {
		return getDAOFactory(defaultStrategy);
	}

	public static final DAOFactory getDAOFactory(DAOFamily strategy) {
		try {
			switch (strategy) {
				case POSTGRES:
					return (DAOFactory) Class.forName("fr.imie.skills.dao.impl.PostgresDAOFactory").newInstance();
				default:
					throw new IllegalArgumentException("Unknown DAO strategy : " + strategy);
			}
		} catch (ClassNotFoundException e) {
			throw new DAOException(e);
		} catch (InstantiationException e) {
			throw new DAOException(e);
		} catch (IllegalAccessException e) {
			throw new DAOException(e);
		}
	}
	
	public enum DAOFamily {
		POSTGRES
	}
	
	public AbstractDAOFactory()
	{
		
	}
}
