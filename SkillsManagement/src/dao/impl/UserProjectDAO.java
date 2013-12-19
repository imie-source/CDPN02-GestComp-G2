package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.factory.FactoryDAO;
import dao.interfaces.IUserProjectDAO;
import dto.UserProjectDTO;

public class UserProjectDAO implements IUserProjectDAO {
private Connection conn = null;
	
	public UserProjectDAO(FactoryDAO instance)
	{
		this.conn = instance.getConn();
	}


	@Override
	public int deleteUserProject(UserProjectDTO userProject) {
		int id = userProject.getIdProject();
		String query = "DELETE FROM Project WHERE id_projet = ?";
		int i = 0;
		try {
			PreparedStatement stt = this.conn.prepareStatement(query);
			stt.setInt(1, id);
			i = stt.executeUpdate(query);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public UserProjectDTO getUserProjectById(UserProjectDTO userProject) {
		int idProject = userProject.getIdProject();
		int idUser = userProject.getIdUtilisateur();
		String query = "SELECT id_project, id_utilisateur FROM utilisateur_projet WHERE id_projet = ?, AND id_utilisateur = ? LIMIT 0,1";
		UserProjectDTO userProjectDTO = new UserProjectDTO();

		try {
			PreparedStatement stt = conn.prepareStatement(query);
			stt.setInt(1, idProject);
			stt.setInt(1, idUser);
			ResultSet rs = stt.executeQuery(query);
			userProjectDTO.setIdProject(rs.getInt("id_projet"));
			userProjectDTO.setIdUtilisateur((rs.getInt("id_utilisateur")));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

		return userProject;
	}

	
	@Override
	public List<UserProjectDTO> getAllUserProject() {
		String query = "SELECT id_Project, id_utilisateur FROM utilisateur_projet";
		List<UserProjectDTO> listUsersProjects = new ArrayList<UserProjectDTO>();

		try {
			Statement stt = conn.createStatement();
			ResultSet rs = stt.executeQuery(query);
			
			while(rs.next())
			{
				UserProjectDTO userProject = new UserProjectDTO();
				userProject.setIdProject(rs.getInt("id_project"));
				userProject.setIdProject(rs.getInt("id_utilisateur"));
				listUsersProjects.add(userProject);
			}

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listUsersProjects;
	}
}
