import dao.factory.FactoryDAO;
import dao.interfaces.ICompetenceDAO;

/**
 * Created with IntelliJ IDEA.
 * User: julien.cdpn02
 * Date: 29/11/13
 * Time: 12:00
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args){

        ICompetenceDAO competenceDAO = FactoryDAO.getCompetenceDAO();
    }
}
