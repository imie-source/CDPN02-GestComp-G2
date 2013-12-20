package fr.imie.skills.dao.impl;

import fr.imie.skills.dao.interfaces.ICompetenceDAO;
import fr.imie.skills.dto.CompetenceDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompetenceDAO implements ICompetenceDAO {

	private Connection connection;
	
	public CompetenceDAO(Connection connection)
	{
		this.connection = connection;
	}

	@Override
	public int deleteCompetence(int idCompetence) {
		PreparedStatement deletePS = null;
		String query = "DELETE FROM competence WHERE id_competence = ?";
		int i = 0;
		try 
		{
			deletePS = this.connection.prepareStatement(query);
			deletePS.setInt(1, idCompetence);
			i = deletePS.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int insertCompetence(String libelle, int competencePere) {
		PreparedStatement insertPS = null;
		String query = "INSERT INTO competence(libelle_competence) VALUES(?, ?)";
		int i = 0;
		try
		{
			insertPS = this.connection.prepareStatement(query);
			insertPS.setString(1, libelle);
			insertPS.setInt(2, competencePere);
			i = insertPS.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<CompetenceDTO> getAllCompetence() {
		String query = "SELECT id_competence, libelle_competence FROM competence";
		List<CompetenceDTO> competences = new ArrayList<CompetenceDTO>();
		try
		{
			Statement stt = this.connection.createStatement();
			ResultSet rs = stt.executeQuery(query);
			while(rs.next())
			{
				CompetenceDTO competence = new CompetenceDTO();
				competence.setIdCompetence(rs.getInt("id_competence"));
				competence.setLibelleCompetence(rs.getString("libelle_competence"));
				competence.setCompetencePere(rs.getInt("id_competence_pere"));
				competences.add(competence);
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return competences;
	}

	@Override
	public CompetenceDTO getCompetenceByID(int idCompetence) {
		PreparedStatement readPS = null;
		String query = "SELECT id_competence, libelle_competence, id_competence_pere FROM competence WHERE id_competence = ? LIMIT 0,1";
		CompetenceDTO competence = new CompetenceDTO();
		
		try
		{
			readPS = this.connection.prepareStatement(query);
			readPS.setInt(1, idCompetence);
			ResultSet rs = readPS.executeQuery(query);
			competence.setIdCompetence(rs.getInt("id_competence"));
			competence.setLibelleCompetence(rs.getString("libelle_competence"));
			competence.setCompetencePere(rs.getInt("id_competence_pere"));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return competence;
	}

	@Override
	public int updateCompetence(CompetenceDTO competence) {
		String libelle = competence.getLibelleCompetence();
		int competencePere = competence.getCompetencePere();
		
		PreparedStatement updatePS = null;
		String query = "UPDATE competence SET libelle_competence = ?, id_competence_pere= ?";
		int i = 0;
		try
		{
			updatePS  =this.connection.prepareStatement(query);
			updatePS.setString(1, libelle);
			updatePS.setInt(2, competencePere);
			i = updatePS.executeUpdate(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return i;
	}

	
	
}