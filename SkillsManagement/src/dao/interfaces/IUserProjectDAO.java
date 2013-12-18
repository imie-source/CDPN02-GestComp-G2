package dao.interfaces;

import java.util.List;

import dto.UserProjectDTO;

public interface IUserProjectDAO {

	public int deleteUserProject(UserProjectDTO userProject);

	public UserProjectDTO getUserProjectById(UserProjectDTO userProject);

	public List<UserProjectDTO> getAllUserProject();
}
