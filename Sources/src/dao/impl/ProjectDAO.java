package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IProjectDAO;
import dto.ProjectDTO;

/* TABLE Project (id_Project, libelle_Project, annee_date)
 */
public class ProjectDAO implements IProjectDAO{

	private Connection conn = null;
	
	public ProjectDAO(FactoryDAO instance)
	{
		this.conn = instance.getConn();
	}
	
	@Override
	public int updateProject(ProjectDTO project) {
		String libelle = project.getLibelleProject();
		int id = project.getIdProject();
		String query = "UPDATE Project SET id_Project = '"+id+"' libelle_Project = '"+libelle+"')";
		int i = 0;
		try {
			Statement stmt = this.conn.createStatement();
			i = stmt.executeUpdate(query);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertProject(ProjectDTO project) {
        String libelle = project.getLibelleProject();
        int id = project.getIdProject();
		String query = "INSERT INTO Project(id_Project, libelle_Project) VALUES('"+id+"', '"+libelle+"')";
		int i = 0;
		try
		{
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteProject(ProjectDTO project) {
		int id = project.getIdProject();
		String query = "DELETE FROM Project WHERE id_Project = '"+id+"'";
		int i = 0;
		try {
			Statement stt = this.conn.createStatement();
			i = stt.executeUpdate(query);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public ProjectDTO getProjectById(ProjectDTO project) {
		int id = project.getIdProject();
		String query = "SELECT id_Porject, libelle_Project FROM Project WHERE id_Project = '"+id+"' LIMIT 0,1";
		ProjectDTO newProject = new ProjectDTO();

		try {
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			newProject.setIdProject(rs.getInt("id_Project"));
			newProject.setLibelleProject(rs.getString("libelle_Project"));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		return newProject;
	}

	@Override
	public ProjectDTO getProjectByLibelle(ProjectDTO project) {
        String libelle = project.getLibelleProject();
        String query = "SELECT id_Porject, libelle_Project FROM Project WHERE id_Project = '"+libelle+"' LIMIT 0,1";
        ProjectDTO newProject = new ProjectDTO();

        try {
            Statement stt = this.conn.createStatement();
            ResultSet rs = stt.executeQuery(query);
            newProject.setIdProject(rs.getInt("id_Project"));
            newProject.setLibelleProject(rs.getString("libelle_Project"));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return newProject;
	}

	@Override
	public List<ProjectDTO> getAllProject() {
		String query = "SELECT id_Project, libelle_Project FROM Project";
		List<ProjectDTO> listProject = new ArrayList<ProjectDTO>();

		try {
			Statement stt = this.conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			while(rs.next())
			{
                ProjectDTO project = new ProjectDTO();
				project.setIdProject(rs.getInt("id_Project"));
				project.setLibelleProject(rs.getString("libelle_Project"));
				listProject.add(project);
			}

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listProject;
	}
}
