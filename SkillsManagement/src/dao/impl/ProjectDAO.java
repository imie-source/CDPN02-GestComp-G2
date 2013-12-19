package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IProjectDAO;
import dto.ProjectDTO;

public class ProjectDAO implements IProjectDAO{

	private Connection conn = null;
	
	public ProjectDAO(FactoryDAO instance)
	{
		this.conn = instance.getConn();
	}
	
	@Override
	public int updateProject(ProjectDTO project) {
		int id = project.getIdProject();
		String libelle = project.getLibelleProject();
		PreparedStatement updatePS = null;
		String query = "UPDATE Project SET libelle_Project = ? where id_Project = ?";
		
		int i = 0;
		try {
			updatePS = this.conn.prepareStatement(query);
			updatePS.setInt(1, id);
			updatePS.setString(2, libelle);
			i = updatePS.executeUpdate(query);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertProject(ProjectDTO project) {
		int id = project.getIdProject();
		String libelle = project.getLibelleProject();
		PreparedStatement insertPS = null;
		String query = "INSERT INTO Project(id_Project, libelle_Project) VALUES(?, ?)";
		int i = 0;
		try
		{
			insertPS = this.conn.prepareStatement(query);
			insertPS.setInt(1, id);
			insertPS.setString(2, libelle);
			i = insertPS.executeUpdate(query);
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
		PreparedStatement deletePS = null;
		String query = "DELETE FROM Project WHERE id_Project = ?";
		int i = 0;
		
		try {
			deletePS = this.conn.prepareStatement(query);
			deletePS.setInt(1, id);
			i = deletePS.executeUpdate(query);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public ProjectDTO getProjectById(ProjectDTO project) {
		int id = project.getIdProject();
		PreparedStatement readPS = null;
		String query = "SELECT id_Project, libelle_Project FROM Project WHERE id_Project = ? LIMIT 0,1";
		ProjectDTO newProject = new ProjectDTO();

		try {
			readPS = this.conn.prepareStatement(query);
			readPS.setInt(1, id);
			ResultSet rs = readPS.executeQuery(query);
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
        String query = "SELECT id_Porject, libelle_Project FROM Project WHERE id_Project = ? LIMIT 0,1";
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
