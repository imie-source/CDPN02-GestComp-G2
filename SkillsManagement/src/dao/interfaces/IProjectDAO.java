package dao.interfaces;

import java.util.List;
import dto.ProjectDTO;

public interface IProjectDAO {

	public int updateProject(ProjectDTO project);
	
	public int insertProject(ProjectDTO project);
	
	public int deleteProject(ProjectDTO project);
	
	public ProjectDTO getProjectById(ProjectDTO project);

    public ProjectDTO getProjectByLibelle(ProjectDTO project);
	
	public List<ProjectDTO> getAllProject();

}
