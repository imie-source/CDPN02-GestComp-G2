package dao.factory;

public class AbstractDAOFactory
{
	public static final FactoryDAO getFactoryDAO()
	{
		return getFactoryDAO(defaultStrategy);
	}
	
	public static final FactoryDAO getFactoryDAO(DAOFamily strategy)
	{
		try
		{
			switch(strategy)
			{
				case POSTGRES:
					return 
				default:
					throw new IllegalArgumentException("Unknown DAO strategy : " + strategy);
			}
		}
		catch(ClassNotFoundException e)
		{
			throw new DAOException(e);
		}
		catch(InstantiationException e)
		{
			throw new DAOException(e);
		}
	}
	
	public enum DAOFamily
	{
		POSTGRES
	}
}
