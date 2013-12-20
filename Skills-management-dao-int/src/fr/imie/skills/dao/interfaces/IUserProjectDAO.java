package fr.imie.skills.dao.interfaces;

import java.util.List;

import fr.imie.skills.dto.UserProjectDTO;

public interface IUserProjectDAO {

	public int deleteUserProject(UserProjectDTO userProject);

	public UserProjectDTO getUserProjectById(UserProjectDTO userProject);

	public List<UserProjectDTO> getAllUserProject();
}
