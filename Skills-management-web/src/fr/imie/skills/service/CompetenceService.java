package fr.imie.skills.service;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Competence;

/**
 * Servlet implementation class CompetenceService
 */
@WebServlet("/CompetenceService")
public class CompetenceService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@PersistenceUnit(unitName = "Skills-management-jpa")
	private EntityManagerFactory emf;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompetenceService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CompetenceService cpt = new CompetenceService();
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			
			tx.begin();
			//em.persist(todo);
			//tx.commit();
			
			Competence comp = em.find(Competence.class, 1);
			
			response.getWriter().println(comp.getLibelleCompetence());
			
			//String libelle = em.find(Todo.class, 58).getLibelle();
			//response.getWriter().println(libelle);
			/*
			Query query = em.createQuery("SELECT t FROM Todo t");
			List<Todo> results = query.getResultList();
			
			for(int i =0; i < results.size(); i++) {
				
				Todo result = results.get(i);
				response.getWriter().println(result.getId() + " : " + result.getLibelle());
			}
			*/
		} catch (Exception e) {
			
			response.getWriter().println(e);
			
		} finally {
			
			em.close();
			emf.close();
		}
		
		response.getWriter().println("\nJob done !");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
