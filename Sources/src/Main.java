import dao.factory.FactoryDAO;
import dao.interfaces.ICompetenceDAO;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ICompetenceDAO skill = FactoryDAO.getCompetenceDAO();


	}

}
