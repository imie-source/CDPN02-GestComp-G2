package fr.imie.skills.dto;

public class ProjectDTO {
	
	private int idProject;
	private String libelleProject;

    public int getIdProject() {
        return idProject;
    }
    
    public String getLibelleProject() {
		return libelleProject;
	}

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }
    
    public void setLibelleProject(String libelleProject) {
		this.libelleProject = libelleProject;
	}
}
